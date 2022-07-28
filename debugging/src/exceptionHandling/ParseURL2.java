package exceptionHandling;

import java.net.URL;

public class ParseURL2 {

	public static void main(String[] args) {
		
        parseURL("https://www.google.com/images");
	}
	
    public static void parseURL(String link) {
        URL url = new URL(link);
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPath());
}    

}
