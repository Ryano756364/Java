package section07.src;

public class Main {

    // can build object here and base it off of Car class
    public static void main(String[] args) {

        // both state and behavior are a part of this 'car' class -> very powerful
        Car car = new Car();  // "new Car()" -> assigning object reference to car

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");

        System.out.println("make = " + car.getMake());
    }
}
