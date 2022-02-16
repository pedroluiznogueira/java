package oop.association.aggregation;

import java.util.List;

public class Aggregation {

    /*
     * Aggregation
     *
     * - an Association is said to be Aggregation
     * if both the entities that are associated can
     * exist independently
     * - examples:
     * - College has a Teacher
     * - Office has an Employee
     * - why ?
     * - a Teacher can exist without the College
     * - an Employee can exist without an Office
     *
     *
     */
    public static void main(String[] args) {

        // the two entities can exist independently

        // teacherOne points to it's adress in memory and teacherTwo points to it's adress in memory
        Teacher teacherOne = new Teacher("math");
        Teacher teacherTwo = new Teacher("physics");
        List<Teacher> teachers = List.of(teacherOne, teacherTwo);

        // college points to it's adress in memory, but Teacher don't depende on College beign instanciated to exist
        College college = new College("harvard", teachers);

    }

}

class Teacher {
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "subject: " + subject;
    }
}

class College {
    private String name;
    private List<Teacher> teachers;

    public College(String name, List<Teacher> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
