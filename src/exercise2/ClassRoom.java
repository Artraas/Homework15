package exercise2;

public class ClassRoom {
    public static Pupil[] pupils;

    public static void main(String[] args) {
        Pupil John = new ExcelentPupil();
        Pupil Anna = new GoodPupil();
        Pupil Ben = new BadPupil();
        Pupil Kate = new GoodPupil();

        pupils = new Pupil[]{John, Anna, Ben, Kate};

        method(pupils);

    }
    static void method(Pupil[] pupils){
        for (int i = 0; i < pupils.length; i++){
            System.out.println("Student " + (i + 1) + ": ");
            pupils[i].study();
            pupils[i].read();
            pupils[i].wrirte();
            pupils[i].relax();
            System.out.println();
        }
    }
}
class Pupil {
    void study() {
        System.out.println("Normal");
    }
    void read() {
        System.out.println("Normal");
    }
    void wrirte() {
        System.out.println("Normal");
    }
    void relax() {
        System.out.println("Normal");
    }
}