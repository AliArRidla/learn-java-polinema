package tugasKeempat.praktikum.keempat;

public class mainPercobaan {
    public static void main(String[] args) {
        Penumpang b = new Penumpang("5678", "Ali");
        Gerbong gerbong1 = new Gerbong("A",10);
        gerbong1.setPenumpang(b, 1);
        System.out.println(gerbong1.info());

        Penumpang t = new Penumpang("1234", "Ridla");
        gerbong1.setPenumpang(t, 1);
        System.out.println(gerbong1.info());
    }
}
