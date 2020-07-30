import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MoviesAppLab {
	private static Scanner scnr;

	public static void main(String[] args) {

		ArrayList<Movies> movie = new ArrayList<>();
		System.out.println("There are 100 movies in this list");

		// Adding 100 movies in the list
		for (int i = 0; i < 100; i++) {
			movie.add(MoviesIO.getMovie(i + 1));
		}

		for (Movies m : movie)
			System.out.println(m);

		boolean prompt = true;
		do {
			ArrayList<String> result = new ArrayList<>();

			// Matching category entered the movie list
			result = matchMovie(movie);

			// Sorting movies in specific category by alphabetical order
			result.sort(Comparator.comparing(String::toString));

			for (String r : result)
				System.out.println(r);
			prompt = Validator.getYesNo(scnr, "\nWanna continue searching more movies?(y/n)");
		} while (prompt);

		System.out.println("Thanks for using our website!! Please visit us again");

	}

	// Matching the category from the movie list
	public static ArrayList<String> matchMovie(ArrayList<Movies> mov) {
		scnr = new Scanner(System.in);
		System.out.println("\nWhich category you are interested in?");
		String category = scnr.nextLine();
		ArrayList<String> result = new ArrayList<>();
		boolean check = false;
		for (Movies m : mov) {
			if ((m.getCategory().equalsIgnoreCase(category))) {
				result.add(m.getTitle());
				check = true;
			}
		}
		if (check == false)
			System.out.println("Sorry we dont have movie in this category");
		return result;
	}

}
