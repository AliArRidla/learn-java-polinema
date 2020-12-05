package tugasKesebelas.praktikum;

import tugasKesebelas.praktikum.ICumlaude;
import tugasKesebelas.praktikum.Mahasiswa;
import tugasKesebelas.praktikum.PascaSarjana;
import tugasKesebelas.praktikum.Rektor;
import tugasKesebelas.praktikum.Sarjana;

public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
