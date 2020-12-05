package tugasKeduabelas.praktikum;

public class InternshipEmployee extends Employee{
    private int lenght;

    public InternshipEmployee(String name,int lenght){
        this.lenght = lenght;
        this.name = name;
    }

    public int getLenght(){
        return lenght;
    }

    public void setLenght(int lenght){
        this.lenght = lenght;
    }

    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Pendaftan sebagai pegawai internship selama" + lenght + "month/s\n";
        return info;
    }
}
