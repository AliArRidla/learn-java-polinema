package tugasKeempat.praktikum.keempat;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public void setArrayKursi(Kursi[] arrayKursi){
        this.arrayKursi = arrayKursi;
    }

    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++)
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));  
        
    }

    public String info(){
        String info = "";
        info += "Kode :" + kode + "\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
    // awal-awal
    // public void setPenumpang(Penumpang penumpang, int nomor){
    //     this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    // }

    // modifikasi
    public void setPenumpang(Penumpang penumpang,int nomor){
        for (int i = 0; i < arrayKursi.length; i++) {
            if (arrayKursi[nomor-1].getPenumpang() == null) {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            break;
            }else{
                System.out.println("Kursi nomor " + nomor + " Sudah terisi");
            }
        }
    }
}
