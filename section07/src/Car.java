package section07.src;

// class is just the template
public class Car {

    // 5 fields or state of object | 5 access modifiers declared private
    private String make = "Tesla";
    private String model = "Model x";
    private String color = "Black";
    private int doors = 2;

    // primitive data types that are not assigned values are given default values automatically
    private boolean isConvertible = true;

    // Constructor - empty is default if not are created
    public Car(){
        // calling a constructor within another constructor
        // must be the first line item if you call a constructor from within another constructor
        this("default make", "default model", "default color", 4, true);
    }

    // Constructor overloading - multiple constructors with different formal parameters
    // number of parameters can be different
    // but if they are the same, their types or order of types must differ
    // in constructors, call field, don't use the setter
    public Car(String make, String model, String color, int doors, boolean isConvertible){
        // this wouldn't be required if we had different field names from parameter names
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.isConvertible = isConvertible;
    }

    // constructors do not have to have equal amounts of arguments as fields of the class
    public Car(int doors, boolean isConvertible){
        // default values with this constructor example
        this("make", "model", "color", doors, isConvertible);
    }


    // not static, because we are accessing instance fields on the class
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }

    // not declared static because we are not using static fields
    // and the getter will usually return the field, make in this case
    public String getMake() {
        return make;
    }
    public void setMake(String make){
        if (make == null) {
            make = "Unkown";
        }
        String lowercaseMake = make.toLowerCase();
        // set rule that we only support 3 manufactures
        switch(lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported ";
            }
        }
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }


    public boolean isConvertible() {
        return isConvertible;
    }
    public void setConvertible(boolean isConvertable) {
        this.isConvertible = isConvertable;
    }

}
