package Questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngine {

	    public void matches(String pattern, String text) {
	        Pattern pattern1 = Pattern.compile(pattern);
	        Matcher matcher = pattern1.matcher(text);

	        while (matcher.find()) {
	            System.out.println("Found at index: " + matcher.start());
	        }
	    }
	    String highlights(String pattern, String text)
	    {
	    	StringBuilder sb=new StringBuilder(text);
	    	Pattern pattern1 = Pattern.compile(pattern);
	        Matcher matcher = pattern1.matcher(text);
	        int i=0;
	        while (matcher.find()) {
	        	
	            sb.insert(matcher.start()+i,"@");  
	            i++;
	            sb.insert(matcher.end() + i,"@");
	            i++;
	        }
	    	return sb.toString();
	    }
	}

