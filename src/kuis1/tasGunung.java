package kuis1;

public class tasGunung extends tas {
    private String bahan;

    public tasGunung( String merk, int harga, String tipe, String bahan) {
        super(merk, harga,tipe);
        this.bahan = bahan;
    }

    public void print() {
        System.out.println("Tas terbuat dari : " + bahan);

    }
}
