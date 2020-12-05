package tugasKeempat.praktikum.kedua;

public class mainPercobaan {
    public static void main(String[] args) {
        mobil m = new mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);
        sopir s = new sopir();
        s.setNama("John Wick");
        s.setBiaya(200000);
        pelanggan p = new pelanggan();
        p.setNama("John Wick");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = Rp." + p.hitungBiayaTotal());
        System.out.println(p.getMobil().getNama());
    }
}
