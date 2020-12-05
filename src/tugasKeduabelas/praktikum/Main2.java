package tugasKeduabelas.praktikum;

public class Main2 {
    public static void main(String[] args) {
        PermanentEmployee PE = new PermanentEmployee("Ali", 1000);
        Employee e;
        e = PE;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("----==============----");
        System.out.println(""+PE.getEmployeeInfo());
    }
}
