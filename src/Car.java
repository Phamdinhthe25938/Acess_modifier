public class Car {
  public static String name;

    public  String engine;


    public static int numberOfCars;

//    public Car(String name){
//       this.name=name;
//    }

    public  Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        Car.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}
