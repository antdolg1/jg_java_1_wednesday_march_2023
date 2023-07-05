package teacher.lesson_15.homework.level_6_middle.videostore;

class Movie {

	public static final String REGULAR = "REGULAR";
	public static final String NEW_RELEASE = "NEW_RELEASE";
	public static final String CHILDRENS = "CHILDRENS";

	private String title;
	private String priceCode;

	public Movie(String title, String priceCode) {
		this.title 		= title;
		this.priceCode = priceCode;
	}

	public String getTitle () {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}
}
