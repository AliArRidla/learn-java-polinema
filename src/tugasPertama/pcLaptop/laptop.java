package tugasPertama.pcLaptop;

public class laptop {
    private String merek;
    private int ketebalan;
    private int harga;

    public void setMerek(String namaMerek) {
        merek = namaMerek;
    }

    public void setKetebalan(int ketebalanValue){
        ketebalan = ketebalanValue;
    }

    public void setHarga(int hargaValue){
        harga = hargaValue;
    }
    public void print(){
        System.out.println("Laptop nya bermerek : "+ merek);
        System.out.println("Laptop nya ketebalannya : " + ketebalan);
        System.out.println("Laptop nya harganya : " + harga);
    }
}
