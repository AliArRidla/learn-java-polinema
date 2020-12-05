package tugasKetiga.praktikum;

/**
 * Motor
 */
public class Motor {
    private int kecepatan = 0;
    private boolean statusKontak = false;
    
    public void nyalakanMesin(){
        statusKontak = true;
    }
    
    public void matikanMesin() {
        statusKontak = false;
        kecepatan=0;
    }
    
    public void tambahKecepatan() {
        if(statusKontak == true){
            kecepatan +=5;
        }else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off : \n");
        }
    }
    
    public void kurangiKecepatan() {
        if (statusKontak == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off : \n");
        }
    }

    public void printStatus() {
        if(statusKontak == true){
            System.out.println("Status kontak hidup");;
        }else {
            System.out.println("Status kontak mati");
        }
        System.out.println("Kecepatan : "+ kecepatan+"\n");
    }
}