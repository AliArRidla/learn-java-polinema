package tugasKeempat.praktikum.kedua;

public class pelanggan {
    private String nama;
    private int hari;
    private sopir sopir;
    private mobil mobil;
    public pelanggan(){

    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    
    public sopir getSopir() {
        return sopir;
    }

    public void setSopir(sopir sopir) {
        this.sopir=sopir;
    }
    
    public mobil getMobil() {
        return mobil;
    }

    public void setMobil(mobil mobil) {
        this.mobil=mobil;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

}
