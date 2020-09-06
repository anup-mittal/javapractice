package Aman.simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

   public void execute(String line, String pattern) {
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
    	  System.out.println("MATCH");
      }else {
         System.out.println("NO MATCH");
      }
   }
}