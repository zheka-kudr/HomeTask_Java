package op.task3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;
    private int groupSize;

    public Group(int groupSize) {
        this.groupSize = groupSize;
        students = new ArrayList<Student>(groupSize);
    }

    public boolean addStudent(Student student) {
        if (groupSize <= students.size()) {
            return false;
        }
        students.add(student);
        return true;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

}
