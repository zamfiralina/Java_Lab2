package Part1;

import java.util.Vector;

public class Matching extends Problem {
    Vector<Student> availableStudents = new Vector<>();
    Vector<Project> availableProjects = new Vector<>();
    StringBuilder matches = new StringBuilder();

    Matching() {
        this.availableProjects = new Vector<>();
        this.availableStudents = new Vector<>();
    }

    public Matching(Problem p, Project project) {
        for (Student s : p.students )
            this.availableStudents.add(s);
        for (Project proj : project.projects)
            this.availableProjects.add(proj);

    }

    public void match() {
        int totalStudents = availableStudents.size();
        System.out.println("Numarul total de studenti: \t\t\t\t\t\t\t\t" + totalStudents);

        for (Student s : availableStudents) {
            for (int i = 0; i < s.getPreferences().size(); i++) {
                if (s.getPreferences().get(i).capacity > 0) {
                    this.matches.append("(" + s.name + ", " + s.getPreferences().get(i).name + ")\n");
                    s.getPreferences().get(i).capacity--;
                    break;
                }
            }

        }

        //System.out.println("Avem: " + availableStudents.toString());

        availableStudents.removeIf(stud -> Boolean.valueOf(String.valueOf(matches.toString().contains(stud.name))));

        availableProjects.removeIf(project -> project.capacity == 0);


        System.out.println("Numarul de studenti care au obtinut proiectul dorit: \t" + (totalStudents - this.availableStudents.size()));
        System.out.println("Numarul studentilor care nu au obtinut proiectul dorit: " + this.availableStudents.size());

        for (Student s : this.availableStudents) {
            for (Project proj : this.availableProjects) {
                if (proj.capacity > 0) {
                    this.matches.append("(" + s.name + ", " + proj.name + ")\n");
                    proj.capacity--;
                    break;
                }
            }
        }
        //availableStudents.removeIf(stud -> (Boolean.valueOf(String.valueOf(matches.toString().contains(stud.name)))));

        availableStudents.removeIf(stud -> matches.toString().contains(stud.name));

        availableProjects.removeIf(project -> project.capacity == 0);

        System.out.println("Studenti fara proiect: " + availableStudents.toString());

        System.out.println("Proiecte ramase: " + availableProjects.toString());
    }

    public String displayMatches() {
        return matches.toString();
    }

}
