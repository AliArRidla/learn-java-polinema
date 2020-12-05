package tugasKesebelas.praktikum;

public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    public PascaSarjana(String nama){
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }
    
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lenih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah(){
        System.out.println("Saya menertbitkan jurnal International");
    }
}
