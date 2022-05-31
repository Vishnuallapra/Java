import java.util.*;

class stringFn{
    public static void main(String[] args){ 
       Scanner in = new Scanner(System.in);
       //String Concatenation
       System.out.println("Enter the first String");
       String str1 = in.nextLine();
       System.out.println("Enter the second string ");
       String str2 = in.nextLine();
       // concatanation
       String str3 = str1.concat(str2);
       System.out.println(str3);
       //length
       System.out.println("length of " +str3+" is :"+str3.length());
       //indexOf
       System.out.println("index of character 'H'is "+str3.indexOf('h'));
       //charAt
       System.out.println("character at pos 5 in str3 is "+str3.charAt(5));
       //compareTo
       String sample="Hi";
       System.out.println("compare str1 to Hi "+sample.compareTo(str1));
       //Compare to - Ignore case
       System.out.println("Compare str1 to Hi - Case Ignored: " + sample.compareToIgnoreCase(str1));
       //contain
       System.out.println("contains sequence 'llo' "+ str3.contains("llo"));
       //replace
       System.out.println("Replace 'hi' with 'how': " + str3.replace("hi", "how"));
          
    }
}