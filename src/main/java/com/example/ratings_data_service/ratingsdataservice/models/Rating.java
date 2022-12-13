package com.example.ratings_data_service.ratingsdataservice.models;

public class Rating {
    private String movieid;
    private int rating;


    public Rating() {
    }
    public Rating(String movieid, int rating){
        this.movieid = movieid;
        this.rating = rating;
    }
    public String getMovieid() {
        return movieid;
    }
    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Rating [movieid=" + movieid + ", rating=" + rating + "]";
    }
    
}
