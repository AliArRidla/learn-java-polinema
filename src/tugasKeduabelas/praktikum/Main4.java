package tugasKeduabelas.praktikum;

public class Main4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricalBill EB = new ElectricalBill(10, "R-1");
        ow.pay(EB);
        System.out.println("----------===----------");

        PermanentEmployee PE = new PermanentEmployee("Ali", 1000);
        ow.pay(PE);
        System.out.println("----------===----------");

        InternshipEmployee IE = new InternshipEmployee("Bambang", 10);
        ow.pay(PE);
        System.out.println("----------===----------");
        ow.showMyEmployee(IE);
    }
}
