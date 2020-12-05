package tugasKeempat.praktikum.pertama;

public class MainPraktikum1 {
    public static void main(String[] args) {
        Processor p = new Processor("intel 15",3);
        Laptop L = new Laptop("Thinkpad",p);
        L.info();

        Processor pl = new Processor();
        pl.setMerk("intel i5");
        pl.setCache(4);
        Laptop ll = new Laptop();
        ll.setMerk("Thinkpad");
        ll.setProc(pl);
        ll.info();
    }
}
