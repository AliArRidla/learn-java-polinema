package tugasKeempat.praktikum.ketiga;

public class keretaApi {
    private String nama,kelas;
    private pegawai masinis,asisten;
    public keretaApi(String nama,String kelas,pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    public keretaApi(String nama, String kelas, pegawai masinis,pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas=kelas;
    }

    public pegawai getMasisinis() {
        return masinis;
    }

    public void setMasisinis(pegawai masinis) {
        this.masinis=masinis;
    }

    public pegawai getAsisten() {
        return asisten;
    }

    public void setAsisten(pegawai asisten) {
        this.asisten=asisten;
    }
    public String info(){
        String info = "\n";
        info += "Nama :" + this.nama + "\n";
        info += "Kelas :" + this.kelas + "\n";
        info += "Masinis :" + this.masinis.info() + "\n";
        info += "Asisten :" + this.asisten.info() + "\n";
        return info;
    }
    
}
