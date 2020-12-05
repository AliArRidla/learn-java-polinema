package tugasKesepuluh.tugas;

public class Main {
    public static void main(String[] args) {
        Hewan he = new Hewan();
        Singa s1 = new Singa("Roarr Roarr", "Coklat", "CingCing", 4);
        Keledai k1 = new Keledai("Tumbuhan", "Abu-Abu", "Kedelai", 4);
        Gorila g1 = new Gorila("Haum Haum", "Hitam Manis", "Gulali", 4);
        he.Herbivora(k1);
        System.out.println("");
        he.Karnivora(g1);
        System.out.println("");
        he.Karnivora(s1);
    }
}
