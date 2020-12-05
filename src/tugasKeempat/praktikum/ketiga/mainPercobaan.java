package tugasKeempat.praktikum.ketiga;

public class mainPercobaan {
public static void main(String[] args) {
    pegawai masinis = new pegawai("1234", "Ali");
    pegawai asisten = new pegawai("5678", "Ridla");
    keretaApi keretaKencana = new keretaApi("Gaya baru", "Bisnis", masinis,asisten);
    System.out.println(keretaKencana.info());
    }
}
