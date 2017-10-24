
package lesson05;
import java.util.Calendar;
import java.util.Locale;
import java.util.*;
import java.io.Console;
/**
 *
 * @author User
 */
public class Lesson05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      //int a=in.nextInt();
      //System.out.printf("%d%n",a);
      double f3=0.0000123456789;
      System.out.println(f3);    
      Locale loc= Locale.getDefault();
      System.out.println(loc);
      Locale usa=new Locale("gr","GREECE");
      System.out.println(usa);
      Locale l=Locale.US;
      System.out.printf(l,"%.2f%n",3.1415);
     /* Console c = System.console();
        if (c == null) {
            System.out.println("No console.");
            return;
        }

        String login;
        char[] password;
        do {
            login = c.readLine("Enter your login: ");
            password = c.readPassword("Enter your password: ");
        } while (!String.copyValueOf(password).equals("java"));
        
        System.out.println("Welcome!");
      */
     String str1="\t    Hello World!          ";//tab spacing
     String str2=str1.trim();//removes spacing from edges
     System.out.println(str2);
     System.out.println(str1);
    str2=str1.toUpperCase();
    System.out.println(str2);
    System.out.printf("%s%n",str2);
    
    
    
    Person a=new Person("Panos","Papas");
    Student as=new Student(2932,a);
    as.setAem(2910);
    System.out.println(as.getAem());
    as=as.changeAem(2932);//defensive code
    System.out.println(as.getAem());
    as.setAem(2910);
    System.out.println(as.getAem());
    
    
    
    String s1=new String("ABC");
    String s2=new String("ABC");
    //== for address
    System.out.printf("%b %n",s1==s2);
    System.out.printf("%b %n",s1.equals(s2));
    
    }
}
