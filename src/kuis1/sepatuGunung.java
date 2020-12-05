package kuis1;

public class sepatuGunung extends sepatu {
    private int ketahananSuhu;

    public sepatuGunung(int harga,String merk,int tahan) {
        super(merk,harga); 
        this.ketahananSuhu = tahan;
    }

    public void print() {
        System.out.println("Ketahanan suhu nya : " + ketahananSuhu);

    }
}
