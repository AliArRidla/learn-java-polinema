package TugasSembilan.tugas;

public class Segitiga {
    public int sudut;

    public int totalSudut(int sudutA) {
        System.out.println(sudut = 180 - sudutA);
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        System.out.println(sudut = 180 - (sudutA + sudutB));
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        System.out.println(sisiA + sisiB + sisiC);
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        System.out.println(Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
        double keliling = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return keliling;
    }

    public static void main(String[] args) {
        Segitiga tl = new Segitiga();
        Segitiga k = new Segitiga();
        tl.totalSudut(90);
        tl.totalSudut(90, 20);
        k.keliling(5, 6, 7);
        k.keliling(5, 7);
    }
}
