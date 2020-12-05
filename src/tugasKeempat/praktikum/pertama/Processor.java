package tugasKeempat.praktikum.pertama;

public class Processor {
    private String merek;
    private double cache;
    Processor(){

    }
    Processor(String merek, double cache){
        this.merek = merek;
        this.cache = cache;
    }
    public void setMerk(String merek){
        this.merek = merek;
    }
    public void setCache(double cache){
        this.cache = cache;
    }
    public String getMerek(){
        return merek;
    }
    public double getCache(){
        return cache;
    }
    public void info(){
        System.out.printf("Merek Processor = " + merek);
        System.out.printf("Cache Processor = %.2f\n", cache);
    }

}
