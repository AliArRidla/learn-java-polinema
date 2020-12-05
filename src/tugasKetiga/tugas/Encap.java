package tugasKetiga.tugas;

public class Encap {
    private String nama;
    private int age;
    
    public String getNama(){
        return nama;
    }

    public void setNama(String newNama){
        nama = newNama;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge > 30){
            age = 30;
        }else{
            age = newAge;
        }
    }
}
