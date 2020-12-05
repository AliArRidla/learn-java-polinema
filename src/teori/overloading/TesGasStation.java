package teori.overloading;

public class TesGasStation {
    public static void main(String[] args) {
        MobilMewah alphard = new MobilMewah();
        MobilKuno carry = new MobilKuno();
        GasStation gas = new GasStation();

        gas.isiBahanBakar(carry, 20000);
        gas.isiBahanBakar(alphard, 30000);
    }
}
