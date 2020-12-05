package tugasKeempat.tugas;

public class mainTugas {
   public static void main(String[] args) {
       Film f = new Film("Naruto","Anime");
       Drive d = new Drive(1,f);

       Admin a = new Admin("Ali","04");
       Penyewa p = new Penyewa("Agus","085000000",2);
       System.out.println(">>>> Data Film");
       d.info();

       System.out.println(f.info());
       System.out.println(">>>> Data Admin");
       System.out.println(a.info());
       System.out.println(">>>> Data Penyewa");
       System.out.println(p.info());

   } 
}
