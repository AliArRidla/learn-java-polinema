package tugasKeduabelas.praktikum;

public class Main3 {
 public static void main(String[] args) {
     PermanentEmployee PE = new PermanentEmployee("Ali", 5000);
     InternshipEmployee IE = new InternshipEmployee("Bambang", 10);
     ElectricalBill EB = new ElectricalBill(10, "A-1");

     Employee e[] = {PE,IE};
     Payable p[] = {PE,EB};
     Employee e2[] = {PE,IE,EB};
 }   
}
