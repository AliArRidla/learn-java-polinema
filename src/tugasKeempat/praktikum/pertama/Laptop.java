package tugasKeempat.praktikum.pertama;

public class Laptop {
    private String merek;
    private Processor proc;
    Laptop(){

    }
    Laptop(String merek,Processor proc){
        this.merek = merek;
        this.proc = proc;
    }

    public void setMerk(String merek) {
        this.merek = merek;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public String getMerek() {
        return merek;
    }

    public Processor getProc() {
        return proc;
    }
    public void info(){
        System.out.println("Merek Processor =" + merek);
        proc.info();
    }
}
