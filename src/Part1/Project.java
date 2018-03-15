package Part1;

import java.util.Vector;

public class Project {
    String name;
    int capacity;
    static Vector<Project> projects = new Vector<>();

    public Project() {
        this.name = new String();
        projects.add(this);
    }

    public Project(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        projects.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name = '" + name + '\'' +
                ", capacity = " + capacity +
                '}';
    }
}
