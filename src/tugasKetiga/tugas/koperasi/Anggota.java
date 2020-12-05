package tugasKetiga.tugas.koperasi;

public class Anggota {
    public String id;
    private String nama;
    private String alamat;
    private int simpanan = 0;
    private int limitPinjaman = 0;
    private int pinjaman = 100000000;

    Anggota(String id,String nama,int limitPinjaman){
        this.id = id;
        this.nama = nama;
        this.limitPinjaman = 5000000;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }



    public void setPinjaman(int pinjaman) {
        this.pinjaman = pinjaman;
    }

    public int getJumlahPinjaman(){
        return pinjaman;
    }
    
    public void angsur(int uang) {
        pinjaman += uang;
    }

    public void pinjam(int uang) {
        pinjaman -= uang;
    }
}
