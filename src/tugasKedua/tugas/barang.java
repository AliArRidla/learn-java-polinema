package tugasKedua.tugas;

public class barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = (int) (hargaDasar-diskon*hargaDasar);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode :"+ kode);
        System.out.println("Nama Barang :" + namaBarang);
        System.out.println("Harga Dasar :"+ hargaDasar);
        System.out.println("Diskon :" + (diskon*100)+"%");
        System.out.println("Harga Jual :"+ hitungHargaJual());
    }

    public static void main(String[] args) {
        barang br1 = new barang();

        br1.kode = "inisial";
        br1.namaBarang = "Sabun";
        br1.hargaDasar = 200000;
        br1.diskon = (float) 0.5;
        br1.hitungHargaJual();
        br1.tampilData();
    }
}
