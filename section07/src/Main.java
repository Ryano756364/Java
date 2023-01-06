package section07.src;

public class Main {

    // can build object here and base it off of Car class
    public static void main(String[] args) {

        // both state and behavior are a part of this 'car' class -> very powerful
        Car car = new Car("Porsche", "Carrera", "black", 2, true);  // "new Car()" -> assigning object reference to car

        System.out.println("make = " + car.getMake());  // make = Porsche
    }
}
