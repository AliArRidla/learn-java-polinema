package tugasKedua.praktikum;

public class MainBarang {
    public static void main(String[] args) {
        barang brng1 = new barang();

        brng1.nama = "Buku";
        brng1.jenisBarang = "Padat";
        brng1.stok = 10;
        brng1.print();
        System.out.println("Tambah barang nya" + brng1.tambahStok(12));
    }
}
