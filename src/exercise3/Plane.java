package exercise3;

class Plane extends Vehicle{
    double height;
    int passengers;

    public Plane(double price, double speed, int year, double height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }
}
