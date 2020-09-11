public class sepatuMain {
    public static void main(String[] args) {
        sepatu sepatu1 = new sepatu();
        sepatuGunung sepatu2 = new sepatuGunung();

        sepatu1.setMerek(" VANS");
        sepatu1.setBahan(" KULIT BUAYA");
        sepatu1.setUkuran( 40);
        sepatu1.print();

        sepatu2.setMerek("EIGER");
        sepatu2.setBahan(" KULIT ULAR");
        sepatu2.setKetahananSuhu(20);
        sepatu2.setUkuran( 35);
        sepatu2.print();
    }
}
