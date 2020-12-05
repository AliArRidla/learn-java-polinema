package tugasKeenam.tugas;

public class Dosen extends Pegawai {
    public int jumlahSKS, TARIF_SKS = 500000;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}