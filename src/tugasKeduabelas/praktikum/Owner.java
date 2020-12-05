package tugasKeduabelas.praktikum;

public class Owner {
    public void pay(Payable p){
        System.out.println("Total Pembayaran = " + p.getPaymentAmount());
        if (p instanceof ElectricalBill){
            ElectricalBill EB = (ElectricalBill) p;
            System.out.println(""+ EB.getBillInfo());
        }else if (p instanceof PermanentEmployee){
            PermanentEmployee PE = (PermanentEmployee) p;
            PE.getEmployeeInfo();
            System.out.println(""+PE.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee)
            System.out.println("Kamu kudu bayar de e perbulan");
        else
        System.out.println("Ngga usa bayar");
    }
}
