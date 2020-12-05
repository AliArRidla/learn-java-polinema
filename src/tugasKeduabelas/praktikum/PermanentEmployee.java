package tugasKeduabelas.praktikum;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(){
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount(){
        return (int) (salary+0.05*salary);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Pendaftan sebagai pegawai internship selama" + salary + "month/s\n";
        return info;
    }
}
