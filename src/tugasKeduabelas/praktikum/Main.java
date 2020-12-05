package tugasKeduabelas.praktikum;

public class Main {
    public static void main(String[] args) {
        PermanentEmployee PE1 = new PermanentEmployee("Ali", 1000);
        InternshipEmployee IE1 = new InternshipEmployee("Rido", 10);
        ElectricalBill EB = new ElectricalBill(10, "A-1");
        Employee e;
        Payable p;

        e = PE1;
        e = IE1;
        p = PE1;
        p = EB;
    }
}
