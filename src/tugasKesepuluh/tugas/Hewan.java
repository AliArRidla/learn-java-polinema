package tugasKesepuluh.tugas;

public class Hewan {
    public void Karnivora(IKarnivora kar) {

        kar.displayMakanan();
        kar.displayBinatang();
        kar.displayData();
    }

    public void Herbivora(IHerbivora her) {

        her.displayMakanan();
        her.displayBinatang();
        her.displayData();
    }
}
