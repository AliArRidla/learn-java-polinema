package kuis1;

public class main {
    public static void main(String[] args) {
        sepatuGunung s = new sepatuGunung(1000, "Eiger", 30);
        tasGunung t = new tasGunung("Rei", 200000, "A", "kulit");
        pendaki p = new pendaki("Ali", "Malang", s,t);
        p.tampil();


    }   
}
