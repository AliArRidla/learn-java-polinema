package tugasPertama.pcLaptop;

public class mainDemo {
    public static void main(String[] args) {
        laptop lp1 = new laptop();
        pc pc1 = new pc();

        lp1.setMerek("Samsung");
        lp1.setKetebalan(13);
        lp1.setHarga(300000);
        lp1.print();
        
        pc1.setMerek("Razer");
        pc1.setTipe("Rakitan");
        pc1.setHarga(600000);
        pc1.tampil();
    }
}
