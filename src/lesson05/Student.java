
package lesson05;

/**
 *
 * @author User
 */
public class Student {
    private int aem;
    private Person person;
   /* public Student(int anAem,Person p){
        aem=anAem;
        person=p;
    }*/
    public Student(int anAem,Person p){
        aem=anAem;
        person=new Person(p.getName(),p.getSurname());
    }
    public Person getPerson(){
        return person;
    }
    public Person getPersonSafe(){
        return new Person(person.getName(),person.getSurname());
    }
    public Student changeAem(int aem){
        return new Student(aem,person);
    }
    public void setAem(int anAem){
        aem=anAem;
    }
    public int getAem(){
        return aem;
    }
    
}
