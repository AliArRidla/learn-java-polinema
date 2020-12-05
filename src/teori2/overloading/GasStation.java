public class GasStation {
    protected int pertamax = 10000, pertalite = 5000;

    public void isiBahanBakar(MobilMewah mw, int bayar) {
        int liter = bayar / pertalite;
        System.out.println("Mobil mewah telah diidi sebanyak : " + liter + " liter");

    }

    public void isiBahanBakar(MobilKuno mk, int bayar) {
        int liter = bayar / pertamax;
        System.out.println("Mobil mewah telah diidi sebanyak : " + liter + " liter");
    }
}
