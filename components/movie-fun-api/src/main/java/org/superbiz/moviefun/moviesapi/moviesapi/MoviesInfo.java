package org.superbiz.moviefun.moviesapi.moviesapi;

public class MoviesInfo {



    private  Long id;
    private String director;
    private String title;
    private int year;
    private String genre;
    private int rating;

    public MoviesInfo() {
    }

    public MoviesInfo(Long id,String title, String director, String genre, int rating, int year) {
        this.id=id;
        this.director = director;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
    }

    public MoviesInfo(String director, String title, int year) {
        this.director = director;
        this.title = title;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

