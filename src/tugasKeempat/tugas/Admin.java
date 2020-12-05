package tugasKeempat.tugas;

public class Admin {
    private String nama,noadmin;
    Admin(String nama,String noadmin){
        this.nama = nama;
        this.noadmin = noadmin;
    }
    Admin(){

    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void setNoadmin(String noadmin) {
        this.noadmin = noadmin;
    }

    public String getNoadmin() {
        return noadmin;
    }
    public String info(){
        String info = "";
        info += "Nama :" +nama +"\n";
        info += "NoAdmin :" + noadmin + "\n";
        return info;
    }
    
}
