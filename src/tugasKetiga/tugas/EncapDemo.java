package tugasKetiga.tugas;

public class EncapDemo {
    public static void main(String[] args) {
        Encap cv = new Encap();
        cv.setNama("Ali");
        cv.setAge(35);

        System.out.println("Nama : " + cv.getNama());
        System.out.println("Umur : " + cv.getAge());
    }
}
