package movie;

import java.beans.Transient;
import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class Movie {
	
	@SerializedName ("id")
	private String imdbId;
	
	private String title;
	
	@SerializedName("year")
	private int releseYear;
	
	private transient double rating;
	
	
	private String[] actors;
	
	
	
	
	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}

	public String getImdbId() {
		return imdbId;
	}
	
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getReleseYear() {
		return releseYear;
	}
	
	public void setReleseYear(int releseYear) {
		this.releseYear = releseYear;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [imdbId=" + imdbId + ", title=" + title + ", releseYear=" + releseYear + ", rating=" + rating
				+ ", actors=" + Arrays.toString(actors) + "]";
	}

	
	
	
	

}
