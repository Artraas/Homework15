package exercise6;

public class Printer {
    void print(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        String a = "colour";

        Printer colour = new Printer();
        colour.print(a);
        Printer colour1 = new Blue();
        colour1.print(a);
        Printer colour2 = new Yellow();
        colour2.print(a);
        Printer colour3 = new Green();
        colour3.print(a);
        Printer colour4 = new Red();
        colour4.print(a);
    }
}
class Blue extends Printer{
    void print(String value){
        System.out.println("\u001B[34m" + value);
    }
}
class Yellow extends Printer{
    void print(String value){
        System.out.println("\u001B[33m" + value);
    }
}
class Green extends Printer{
    void print(String value){
        System.out.println("\u001B[32m" + value);
    }
}
class Red extends Printer{
    void print(String value){
        System.out.println("\u001B[31m" + value);
    }
}