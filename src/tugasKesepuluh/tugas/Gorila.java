package tugasKesepuluh.tugas;

public class Gorila extends Binatang implements IHerbivora,IKarnivora {
    private String suara;
    private String warnaBulu;

    public Gorila(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
    }

    public void displayData() {
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu :" + warnaBulu);
    }
}
