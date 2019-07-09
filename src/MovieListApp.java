import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieListApp {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	String pick;
	String user="";
	
	
	
	System.out.println("Welcome to Block Buster");
	
	List<MovieList> movies = new ArrayList<>();
	moviePicks(movies);
	
	do{
		System.out.println("What catogory are intrested in?");
		System.out.println("--------------------------------");
		System.out.println("scifi, drama, horror,or animated");
		pick = userPick(scan);
		sortMovies(movies, pick);
		

		
		
   System.out.println("Would you like to make another selection? (y/n)");
   user=scan.nextLine();
   
	}while(user.equalsIgnoreCase("y"));
	System.out.println("Be kind rewind !");

	
}
private static void moviePicks(List<MovieList> films) {
	
	films.add(new MovieList("The Godfather","drama"));
	films.add(new MovieList("Ready Player One","scifi"));
	films.add(new MovieList("Us","horror"));
	films.add(new MovieList("Get Out","horror"));
	films.add(new MovieList("The Color Purple","drama"));
	films.add(new MovieList("Spirited Away","animated"));
	films.add(new MovieList("Pulp Fiction","drama"));
	films.add(new MovieList("Fignt Club","drama"));
	films.add(new MovieList("Back to the Future II","scifi"));
	films.add(new MovieList("Coco","animated"));
}

private static String userPick(Scanner scan) {
	String choice;
	int valid=0;
	
	do {
	choice = scan.nextLine();
	
	switch (choice) {
	case ("scifi"):
		valid =1;
		
		break;
	case ("drama"):
		valid =1;
		
		break;
	case ("horror"):
		valid =1;
		
		break;
	case ("animated"):
		valid =1;
		
		break;
	default:
		System.out.println("Please enter a valid category");
		break;
	}
}while(valid == 0);
	
	return choice;
	}
private static void sortMovies(List<MovieList> movies, String Choice) {
	
	Set<String> sorted = new TreeSet<>();
	for (MovieList movie: movies) {
		if (movie.getCategory().equals(Choice)) {
			sorted.add(movie.getTitle());
		}
	}
	System.out.println(sorted);
}
}
