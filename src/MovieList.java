
public class MovieList {
	
private String category; 
private String title;



public  MovieList ( ) {}

public MovieList(String name, String category) {
	this.title = name;
	this.category = category;
}
// get
public String getTitle() {
	
	return title;
}

public String getCategory() {
	
	return category;
}
//set 
public void setCategory(String category) {
	this.category = category;
}
public void setTitle(String title) {
	this.title = title;
}

public String toString() {
	return "Movies(Title:" + title + ",Category:" + category + ")";
}


}
