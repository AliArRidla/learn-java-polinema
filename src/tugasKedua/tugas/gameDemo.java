package tugasKedua.tugas;

import java.util.Scanner;

public class gameDemo {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    game gm1 = new game();

     gm1.id = 1;
     gm1.nama = "ALI AR RIDLA";
     gm1.namaGame = "GTA";
     gm1.harga = 20000;
     gm1.printDataPeminjam();

     System.out.print("Lama penyewaan nya :");
     int scan = sc.nextInt();
     System.out.println("Total harga sewa :"+gm1.hargaSewa(scan));


 }   
}
