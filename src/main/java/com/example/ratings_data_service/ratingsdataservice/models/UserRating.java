package com.example.ratings_data_service.ratingsdataservice.models;

import java.util.Arrays;
import java.util.List;

public class UserRating {
    private String userid;
    private List<Rating> ratings;

    public UserRating() {
    }
    public UserRating(String userid, List<Rating> ratings) {
        this.userid = userid;
        this.ratings = ratings;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public List<Rating> getRatings() {
        return ratings;
    }
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
    
    public void initializeData(String userid){
        this.setUserid(userid);
        this.setRatings(Arrays.asList(new Rating("bollywood", 2),new Rating("tollywood", 7)));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userid == null) ? 0 : userid.hashCode());
        result = prime * result + ((ratings == null) ? 0 : ratings.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserRating other = (UserRating) obj;
        if (userid == null) {
            if (other.userid != null)
                return false;
        } else if (!userid.equals(other.userid))
            return false;
        if (ratings == null) {
            if (other.ratings != null)
                return false;
        } else if (!ratings.equals(other.ratings))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "UserRating [userid=" + userid + ", ratings=" + ratings + "]";
    }
   
    
}
