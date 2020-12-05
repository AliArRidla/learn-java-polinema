package tugasKeempat.praktikum.ketiga;

public class pegawai {
    private String nip,nama;
    public pegawai(String nip, String nama){
        this.nip= nip;
        this.nama=nama;
    }
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip=nip;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama=nama;
    }
    public String info(){
        String info="";
        info += "Nip :" +this.nip + "\n";
        info += "Nama :" + this.nama + "\n";
        return info;
    }
    
}
