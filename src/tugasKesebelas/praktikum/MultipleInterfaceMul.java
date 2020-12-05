package tugasKesebelas.praktikum;

public class MultipleInterfaceMul {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatCumlaude(sarjanaCum);
        pakRektor.beriSertifikatCumlaude(masterCum);
    } 
}
