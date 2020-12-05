package UTS;

import java.util.Scanner;

public class UTS_ALI {
    public float angka1;
    public float angka2;
    public float hasil;


    public float kali(float angka1, float angka2) {
        return hasil = angka1*angka2;
    }
    
    public float tambah(float angka1, float angka2) {
        return hasil = angka1 + angka2;
    }

    public float bagi(float angka1, float angka2) {
        return hasil = angka1 / angka2;
    }

    public float kurang(float angka1, float angka2) {
        return hasil = angka1 - angka2;
    }

    public void info(float angka1, float angka2) {
        System.out.println("Hasil nya adalah : " + hasil);
    }


    public static void main(String[] args) {
        UTS_ALI ob1 = new UTS_ALI();
        Scanner sc = new Scanner(System.in);



        System.out.println("----Menu----");
        System.out.println(
                "1.Kali \n2.Tambah \n3.Kurang \n4.Bagi");
                System.out.println("Masukkan angka menu :");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.print("Masukkan angka pertama ? ");
                ob1.angka1 = sc.nextFloat();
                System.out.print("Masukkan angka kedua ? ");
                ob1.angka2 = sc.nextFloat();
                System.out.println("Hasil :" +"\n" + ob1.angka1 + "+" + ob1.angka2 + "=" + ob1.kali(ob1.angka1, ob1.angka2));
                break;
            case 2:
                System.out.print("Masukkan angka pertama ? ");
                ob1.angka1 = sc.nextFloat();
                System.out.print("Masukkan angka kedua ? ");
                ob1.angka2 = sc.nextFloat();
                System.out.println("Hasil :" + "\n" + ob1.angka1 + "+" + ob1.angka2 + "=" + ob1.tambah(ob1.angka1, ob1.angka2));
                break;
            case 3:
                System.out.print("Masukkan angka pertama ? ");
                ob1.angka1 = sc.nextFloat();
                System.out.print("Masukkan angka kedua ? ");
                ob1.angka2 = sc.nextFloat();
                System.out.println("Hasil :" + "\n" + ob1.angka1 + "+" + ob1.angka2 + "=" + ob1.kurang(ob1.angka1, ob1.angka2));
                break;
            case 4:
                System.out.print("Masukkan angka pertama ? ");
                ob1.angka1 = sc.nextFloat();
                System.out.print("Masukkan angka kedua ? ");
                ob1.angka2 = sc.nextFloat();
                System.out.println("Hasil :" + "\n" + ob1.angka1 + "+" + ob1.angka2 + "=" + ob1.bagi(ob1.angka1, ob1.angka2));
                break;
            
            default:
                break;
        }

    }

}
