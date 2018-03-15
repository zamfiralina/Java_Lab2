package Part1;

import java.util.Vector;

public class Teacher extends Person {
    private Vector<Student> preferences = new Vector<>();

    private Teacher() {
        this.name = new String();
        this.email = new String();
    }

    public Teacher(String name, String email) {
        super(name, email);
        if (super.persons.isEmpty()) {
            this.name = name;
            this.email = email;
            super.persons.add(this);
            //System.out.println("Prima persoana!!");
            return;
        } else {
            for (Person s : persons) {
                if (this.equals(s)) {
                    System.out.println("Persoana deja exista " + this.name + "---" + this.email);
                    System.exit(1);
                }
            }

        }
        this.name = name;
        this.email = email;
        super.persons.add(this);
        //System.out.println("Am trecut de verificari!! :)");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vector<Student> getPreferences() {
        return preferences;
    }

    public void setPreferences(Student ... students) {
        for (Student student : students)
            this.preferences.add(student);
    }

    public boolean equals(Person person) {
        if ( (this.name == person.name ) && (this.email == person.email) )
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "\n        Teacher{" + "\n" +
                "           name = '" + name + '\'' + "\n" +
                "           email = '" + email + '\'' + "\n" +
                "           preferences = " + preferences + "\n" +
                "       }";
    }

    public Project createProject(String name, int capacity) {
        return new Project(name,capacity);
    }
}
