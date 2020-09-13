package tugasPertama.pcLaptop;

public class pc {
    private String merek;
    private String tipe;
    private int harga;

    public void setMerek(String namaMerek) {
        merek = namaMerek;
    }

    public void setTipe(String tipeValue) {
        tipe = tipeValue;
    }

    public void setHarga(int hargaValue) {
        harga = hargaValue;
    }

    public void tampil(){
        System.out.println("\nLaptop nya bermerek : " + merek);
        System.out.println("Laptop nya bertipe : " + tipe);
        System.out.println("Laptop nya harganya : " + harga);
    }

}
