public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
//        Car car3= new Car("333");
//        car3.name="the";
//        Car car4= new Car("44444");
//        System.out.println("hello:"+car3.getName());
        System.out.println("hello:"+car2.getName());
        System.out.println("hello:"+car1.getName());
    }
}
