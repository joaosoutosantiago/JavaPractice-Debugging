package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingFiles {

	public static void main(String[] args) {

		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Lemm\\Documents\\GitHub\\JavaPractice-Debugging\\debugging\\src\\exceptionHandling");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
