public class sepatu {
    private String merek;
    private String bahan;
    private int ukuran;

    public void setMerek(String namaMerek){
        merek = namaMerek;
    }

    public void setBahan(String namaBahan) {
        bahan = namaBahan;
    }

    public void setUkuran(int setUkuran){
        ukuran = setUkuran;
    }

    public void print (){
        System.out.println("Merek" + merek);
        System.out.println("Bahan" + bahan);
        System.out.println("Ukuran" + ukuran
        );
    }
}
