package exercise3;

public class Vehicle {
    double price;
    double speed;
    int year;

    public Vehicle(double price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public static void main(String[] args) {
        Plane plane = new Plane(1000000, 500, 3, 1500, 30);
        Car car = new Car(10000, 200, 5, 4, 1500);
        Ship ship = new Ship(10000000, 30, 4, 2000, "Monaco");

        System.out.println(plane.price  + " " + plane.speed + " " + plane.year + " " + plane.height + " " + plane.passengers);
        System.out.println(car.price + " " + car.speed + " " + car.year + " " + car.passengers + " " + car.weight);
        System.out.println(ship.price + " " + ship.speed + " " + ship.year + " " + ship.passengers + " " + ship.port);
    }
}
