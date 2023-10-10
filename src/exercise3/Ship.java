package exercise3;

class Ship extends Vehicle{
    int passengers;
    String port;

    public Ship(double price, double speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.passengers = passengers;
        this.port = port;
    }
}
