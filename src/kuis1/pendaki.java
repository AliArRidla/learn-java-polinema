package kuis1;

public class pendaki  {
    private String nama;
    private String alamat;
    private sepatu Sepatu;
    private tas Tas;


    public pendaki(String nama,String alamat, sepatu sepatu ,tas tas){
        this.nama = nama;
        this.alamat = alamat;
        this.Sepatu = sepatu;
        this.Tas = tas;
    }

    public void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        Sepatu.info();
        Tas.info();
    }
   
}
