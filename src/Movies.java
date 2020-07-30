
public class Movies {

	private String title;
	private String category;

	// Constructors
	public Movies() {

	}

	public Movies(String title, String category) {
		this.title = title;
		this.category = category;

	}

	// Setters methods
	public void setTitle(String title) {
		this.title = title;

	}

	public void setCategory(String category) {
		this.category = category;

	}

	// Getter methods
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String toString() {

		return String.format("Movie[Title=%s, Category=%s]", title, category);
	}

}
