package tugasKesebelas.praktikum;

public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi {
    public Sarjana(String nama){
        super(nama);
    }
    
    @Override
    public void lulus(){
        // throw new UnsupportedOperationException("Tidak support bund");
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    
    @Override
    public void meraihIPKTinggi() {
        // throw new UnsupportedOperationException("Tidak support bund");
        System.out.println("IPK-ku lebih dari 3,51");
    }
    
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menertbitkan jurnal International");
    }
}
