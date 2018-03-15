package Part1;

public class Main {
    public static void main(String args[]){
        Student s1 = new Student("S1", "s1@info.uaic.ro");
        Student s2 = new Student("S2", "s2@info.uaic.ro");
        Student s3 = new Student("S3", "s3@info.uaic.ro");
        Student s4 = new Student("S4", "s4@info.uaic.ro");
        //Student s5 = new Student ("S1", "s1@info.uaic.ro");

        Teacher t1 = new Teacher("T1", "t1@info.uaic.ro");
        Project p1 = t1.createProject("P1", 2);

        Teacher t2 = new Teacher("T2", "t2@info.uaic.ro");
        Project p2 = t2.createProject("P2", 1);

        Teacher t3 = new Teacher("T3", "t3@info.uaic.ro");
        Project p3 = t3.createProject("P3", 1);

        //Teacher t4 = new Teacher("T3", "t3@info.uaic.ro");

        s1.setPreferences(p1, p2, p3);
        s2.setPreferences(p1, p3, p2);
        s3.setPreferences(p1);
        s4.setPreferences(p3, p2, p1);

        t1.setPreferences(s3, s1, s2, s4);
        t2.setPreferences(s1, s2, s3, s4);
        t3.setPreferences(s4, s3, s1, s2);

        Problem problem = new Problem();
        problem.setStudents(s1, s2, s3, s4);
        problem.setTeachers(t1, t2, t3);
        System.out.println(problem);
        //System.out.println(t1.name);
        //System.out.println(t1.equals(t2));
        Matching m = new Matching(problem,p1);

        m.match();

        System.out.println("Matchinguri: \n" + m.displayMatches());
    }
}
