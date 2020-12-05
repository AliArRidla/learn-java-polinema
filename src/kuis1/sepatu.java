package kuis1;
public class sepatu {
    private int harga;
    private String merk;
    
    public sepatu(){

    }

    public sepatu(String merk,int harga){
        this.merk = merk;
        this.harga = harga;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    public void info(){
        System.out.println("Merek Sepatu : " + merk);
        System.out.println("Harga : " + harga);
        print();
    }
    public void print(){
        print();
    }
}
