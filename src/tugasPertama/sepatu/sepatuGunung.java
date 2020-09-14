package tugasPertama.sepatu;
public class sepatuGunung extends sepatuKantor {
    private int ketahananSuhu;
    public String alamat,kodeRumah;

    public void setKetahananSuhu(int nilai){
        ketahananSuhu = nilai;
    }

    public void print(){
        super.print();
        System.out.println("Ketahanan nya : " + ketahananSuhu);
    }
}
