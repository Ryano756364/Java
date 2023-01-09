package section07.src.recordProject;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann",
                "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                "05/11/195", "Java Masterclass");

        System.out.println(pojoStudent);  // Student{id='S923006', name='Ann', dateOfBirth='05/11/1985', classList='Java Masterclass'}
        System.out.println(recordStudent);  //LPAStudent[id=S923007, name=Bill, dateOfBirth=05/11/195, classList=Java Masterclass]

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        // Ann is taking Java Masterclass
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());  // uses implicit naming and no 'getters'
        // Bill is taking Java Masterclass


        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829")     Doesn't work because records are immutable
        // and there are no setters. You must use header or constructors to achieve what was typed here.
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        // Ann is taking Java Masterclass, Java OCP Exam 829
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());  //
        // Bill is taking Java Masterclass


        /***
         * Why is record built to be immutable?
         * Many use cases, however, the overall goal is to protect the data from unintended mutations.
         * If you want to modify data on your class, you won't be using the record.
         * If you're reading a lot of records from a database or file source, the record is a big improvement.
         * The FINAL keyword will use records a lot more. Along with Database and I/O topics.
         */
    }
}
