package tugasKedua.tugas;

public class lingkaran {
    double phi=3.14,r;
    
    public static void main(String[] args) {
        lingkaran lk1 = new lingkaran();
        lk1.r=5;
        System.out.println("Luas lingkarannya :" +lk1.hitungLuas());
        System.out.println("Keliling lingkarannya :" + lk1.hitungKeliling());
    }
    
    public double hitungLuas() {
        double luas = phi*r*r;
        return luas;
    };

    public double hitungKeliling(){
        double keliling = 2*phi*r;
        return keliling;
    };

}

