package Part1;

import java.util.Vector;

public class Person {
    String name;
    String email;
    static Vector<Person> persons = new Vector<>();

    Person() {
        this.name = new String();
        this.email = new String();
        this.persons.add(this);
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public boolean equals(Person person) {
        if ( this.name == person.name && (this.email == person.email) )
            return true;
        return false;
    }
}
