package com.capital.one.comparing;

public class Candy implements Comparable<Candy> {
	private String name;
	private int rating;
	private String flavor;

	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, int rating, String flavor) {
		super();
		this.name = name;
		this.rating = rating;
		this.flavor = flavor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public int compareTo(Candy o) {
		if (o.rating == this.rating) {
			return this.getName().charAt(0) - o.getName().charAt(0);
		}
		return o.rating - this.rating;
	}

	@Override
	public String toString() {
		return "Candy [name=" + name + ", rating=" + rating + ", flavor=" + flavor + "]";
	}

}
