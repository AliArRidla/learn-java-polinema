package tugasKedua.tugas;

public class game {
    public int id;
    public String nama;
    public String namaGame;
    public int harga;

    public int hargaSewa (int lamaSewa){
        int totalHargaSewa = harga * lamaSewa;
        return totalHargaSewa; 
    }

    public void printDataPeminjam(){
        System.out.println("ID :"+id);
        System.out.println("Nama :" + nama);
        System.out.println("Nama Game :" + namaGame);
        System.out.println("Harga :"+harga);
    }
}
