package Questions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String emailToChecked;
	    System.out.println("Enter your email:- ");
		emailToChecked=sc.nextLine();
		Email email=new Email();
		if(email.isValid(emailToChecked)) { 
			System.out.println("Valid"); 
			}
		 else {
			 System.out.println("InValid"); 
			 }
		MyStringBuilder msb=new MyStringBuilder();
		msb.append("Kunal cool");
		System.out.println(msb);
		msb.insert(7,"Sharma");
		System.out.println(msb);
		msb.delete(2,5);
		System.out.println(msb);
		SearchEngine searchEngine=new SearchEngine();
		String pattern;
		System.out.println("Enter your pattern:- ");
		pattern=sc.nextLine();
		String text;
		System.out.println("Enter your text:- ");
		text=sc.nextLine();
		searchEngine.matches(pattern,text);
		System.out.println(searchEngine.highlights(pattern,text));
		String  sampleURL = "https://wwww.example.com/path?param1=value1&param2=value2";
		URLParser urlParser = new URLParser();
		urlParser.parseURL(sampleURL);
		System.out.println("Protocol: " + urlParser.getProtocol());
        System.out.println("Host: " + urlParser.getHost());
        System.out.println("Path: " + urlParser.getPath());
        System.out.println("Query Parameters: " + urlParser.getQueryParameters());
        URLBuilder urlBuilder = new URLBuilder(urlParser.getProtocol(), urlParser.getHost(),urlParser.getPath(), urlParser.getQueryParameters());
        System.out.println(urlBuilder.buildURL());
        
	}

}
