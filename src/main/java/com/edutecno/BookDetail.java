package com.edutecno;

public class BookDetail {

	// atributos
	private Integer id;
	private String author;
	private String country;
	private String imageLink;
	private String language;
	private String link;
	private Integer pages;
	private String title;
	private Integer year;
	private Integer price;
	private Integer lastPrice;
	private boolean delivery;

	// constructor
	public BookDetail() {
	}
	// getters and setter

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Integer lastPrice) {
		this.lastPrice = lastPrice;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	// toString
	
	@Override
	public String toString() {
		return "BookDetail [id=" + id + ", author=" + author + ", country=" + country + ", imageLink=" + imageLink
				+ ", language=" + language + ", link=" + link + ", pages=" + pages + ", title=" + title + ", year="
				+ year + ", price=" + price + ", lastPrice=" + lastPrice + ", delivery=" + delivery + "]";
	}

	
}
