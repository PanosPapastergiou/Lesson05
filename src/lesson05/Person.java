
package lesson05;

/**
 *
 * @author User
 */
public class Person {
    private String name;
    private String surname;
    public Person(String n,String s){
      name=n;
      surname=s;
    }
    public void setName(String n){
        name=n;
    }
    public void setSurname(String s){
        surname=s;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    
}
