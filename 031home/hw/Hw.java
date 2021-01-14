package hw;

import hw.book.Book;
import hw.salary.Salary;

public class Hw {

	public static void main(String[] args) {
		//Books
		Book heaven_has_no_favorites = new Book();
		Book the_trial = new Book();
		Book how_to_win_friends_and_influence_people = new Book();
		heaven_has_no_favorites.isbn = "978-0449912492";
		heaven_has_no_favorites.title = "Heaven Has No Favorites";
		heaven_has_no_favorites.autor = "Erich Maria Remarque";
		heaven_has_no_favorites.year = 1961;
		the_trial.isbn = "978-0805209990";
		the_trial.title = "The Trial";
		the_trial.autor = "Franz Kafka";
		the_trial.year = 1914 ;
		how_to_win_friends_and_influence_people.isbn = "978-0671027032";
		how_to_win_friends_and_influence_people.title = "How to Win Friends & Influence People";
		how_to_win_friends_and_influence_people.autor = "Dale Carnegie";
		how_to_win_friends_and_influence_people.year = 1936;
		heaven_has_no_favorites.display();
		the_trial.display();
		how_to_win_friends_and_influence_people.display();
		
		//Salary
		Salary salary_1 = new Salary();
		salary_1.salary = 5000;
		salary_1.display();
		
	}
}
