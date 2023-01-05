package section07.src;

// class is just the template
public class Car {

    // 5 fields or state of object | 5 access modifiers declared private
    private String make = "Tesla";
    private String model = "Model x";
    private String color = "Black";
    private int doors = 2;

    // primitive data types that are not assigned values are given default values automatically
    private boolean convertible = true;

    // not static, because we are accessing instance fields on the class
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

    // not declared static because we are not using static fields
    // and the getter will usually return the field, make in this case
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getDoors() {
        return doors;
    }
    public boolean isConvertible() {
        return convertible;
    }

}
