public class CarService {
    public static void createCar(){
        Car car = new Car("Ertiga","Red","Maruti");
        System.out.println(car);

        car.setBrand("XUV 500");
        car.setColor("Black");
        car.setModel("Mahindra");
        System.out.println(car);
    }
}
