package exceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadingFiles2 {

	public static void main(String[] args) {

		loadData("Greetings.txt");

	}
	
    public static void loadData(String name) {
        FileInputStream fis = new FileInputStream(name);
        Scanner scan = new Scanner(fis);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
}

}
