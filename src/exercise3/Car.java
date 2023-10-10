package exercise3;

class Car extends Vehicle {
    int passengers;
    double weight;

    public Car(double price, double speed, int year, int passengers, double weight) {
        super(price, speed, year);
        this.passengers = passengers;
        this.weight = weight;
    }
}
