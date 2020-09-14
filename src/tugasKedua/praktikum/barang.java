package tugasKedua.praktikum;

public class barang {
    public String nama;
    public String jenisBarang;
    public int stok;

    public void print(){
        System.out.println("Nama "+ nama);
        System.out.println("JenisBarang " + jenisBarang);
        System.out.println("Stok " + stok);
    }

    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
