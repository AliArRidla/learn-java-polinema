package tugasKeempat.tugas;

public class Drive {
    private Film film;
    private int page;
    Drive(int page,Film film){
        this.page = page;
        this.film = film;
    }
    Drive(){

    }
    public void setGenres(int page){
        this.page = page;
    }
    public int getNama(){
        return page;
    }
    public void setFilm(Film film){
        this.film = film;
    }
    public Film getFilm(){
        return film;
    }
    public String info(){
        String info = "";
        info += "Genres :" + page + "\n";
        film.info();
        return info;
    }
}
