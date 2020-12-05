package tugasKeempat.tugas;

public class Film {
    private String judul,genre;
    Film(String judul,String genre){
        this.judul = judul;
        this.genre = genre;
    }
    Film(){

    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    public String info(){
        String info = "";
        info += "Nama : "+judul+"\n";
        info += "Genre : " + genre + "\n"; 
        return info;
    }
}
