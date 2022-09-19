package pack;

public class FilmClass
{
    String title;
    String rating;
    String age_rating;
    String film_type;
    String date_write_in;
    String film_description;


    FilmClass(){
        title = "";
        rating = "";
        age_rating = "";
        film_type = "";
        date_write_in = "";
        film_description = "";
    }
    public void setTitle (String n){title = n;}
    public void setRating (String n){rating = n;}
    public void setAge_rating (String n){age_rating = n;}
    public void setFilm_type (String n){film_type = n;}
    public void setDate_write_in (String n){date_write_in = n;}
    public void setFilm_description (String n){film_description =n;}

}
