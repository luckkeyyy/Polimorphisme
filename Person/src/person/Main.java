
package person;

public class Main {
        public static void main(String[] args) {
        Person mPerson = new Person("Nadia");
        System.out.println("Person Name: " + mPerson.getName());
        mPerson.setName("Nila");
        System.out.println("Person Name: " + mPerson.getName());        
    }   
}