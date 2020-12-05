package tugasKeempat.tugas;

public class Penyewa {
    private String nama,nohp;
    private int hari;
    Penyewa(String nama,String nohp,int hari){
        this.nama = nama;
        this.nohp = nohp;
        this.hari = hari;
    }
    Penyewa(){

    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getNohp() {
        return nohp;
    }

    public void setHari(int hari){
        this.hari = hari;
    }
    public int getHari(){
        return hari;
    }

    public String info() {
        String info = "";
        info += "Nama : " + nama + "\n";
        info += "No hp : " + nohp + "\n";
        info += "Lama sewa : " + hari + "\n";
        return info;
    }

}
