package Part1;

import java.util.Vector;

public class Problem {
    Vector<Teacher> teachers;
    Vector<Student> students;
    Vector<Person>  participants = new Vector<>();

    public Problem(){
        this.teachers = new Vector<>();
        this.students = new Vector<>();
    }

    public Problem(Vector<Teacher> teachers, Vector<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public Vector<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher ... teachers) {
        for (Teacher teacher : teachers) {
            this.teachers.add(teacher);
            this.participants.add(teacher);
        }
    }

    public Vector<Student> getStudents() {
        return students;
    }

    public void setStudents(Student ... students) {
        for (Student student : students) {
            this.students.add(student);
            this.participants.add(student);
        }
    }

    public Vector<Person> getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "Problem{" + "\n" +
                "   teachers = " + teachers + "\n" +
                "   students = " + students + "\n" +
                '}';
    }
}
