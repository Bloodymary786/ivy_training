package com.doubts;

public class Place {
	@Override
	public String toString() {
		return "Place [placeName=" + placeName + ", rating=" + rating + "]";
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	private String placeName;
	private String rating ;//10 best 1 is bad
	public Place(String placeName, String rating) {
		super();
		this.placeName = placeName;
		this.rating = rating;
	}
	public Place() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
