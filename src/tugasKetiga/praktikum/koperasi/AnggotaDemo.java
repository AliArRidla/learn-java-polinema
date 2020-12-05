package tugasKetiga.praktikum.koperasi;

public class AnggotaDemo {
    public static void main(String[] args) {
        //cara yang kedua
        Anggota anggota1 = new Anggota("Ali","Madura");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp." + anggota1.getSimpanan());

        // cara yang pertama
        anggota1.setNama("Ali");
        anggota1.setAlamat("Malang");
        anggota1.setor(100000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp." + anggota1.getSimpanan() );

        anggota1.pinjam(50000);
        System.out.println("Simpanan " + anggota1.getNama() +" tersisa "+ ": Rp." + anggota1.getSimpanan());
    }
}
