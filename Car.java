package getersandseters;

public class Car {
    //Creating private variables.
    private String name;
    private String model;
    private String colour;
    private int year;

    //Setting up get and set method.
    public void setname(String name){
    this.name = name;

    }
    public String getname(){
    return name;
    }
    public void setmodel(String model){
        this.model=model;
    }
    public String getmodel(){
    return model;
    }
    public void setcolour(String colour){
        this.colour = colour;
    }
    public String getcolour(){
        return colour;
    }
    //Set year with a condition.
    public void setyear(int year){
        if (year >= 1900 && year <= 2030)
        this.year = year;
        else
            System.out.println("Year is not in range.");
    }
    public int getyear(){
        return year;
    }
    //Creating some method with simple print.
    public void moveForward() {
        System.out.println("Moving forward");
    }
    public void moveBackward() {
        System.out.println("Moving backward");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
    public void turnLeft() {
        System.out.println("Car turning left");
    }
    public void turnRight() {
        System.out.println("Car turning right");
    }
    public void honk() {
        System.out.println("Honking the horn");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setname("AMC");
        car.setmodel("Hornet");
        car.setcolour("Black");
        car.setyear(1971);
        System.out.println("My dream car is " +car.name + " and the model is " +car.model + " with " + car.colour + " colour and was build " + car.year);
        car.moveForward();
        car.moveBackward();
        car.stop();
        car.turnLeft();
        car.turnRight();
        car.stop();
        car.honk();
    }










}
