package section07.src;

public class Car {

    // 5 fields or state of object | 5 access modifiers declared private
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    // not static, because we are accessing instance fields on the class
    public void describeCar() {
        System.out.println(doors + "-Door" +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

}
