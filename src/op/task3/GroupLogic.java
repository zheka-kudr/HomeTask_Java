package op.task3;

import java.util.List;

class GroupLogic {
    StudentLogic studentLogic;

    GroupLogic(StudentLogic studentLogic) {
        this.studentLogic = studentLogic;
    }

    int countOfALevelStudents(Group group) {
        int count = 0;
        List<Student> students;
        students = group.getStudents();
        for (Student student : students) {
            if (studentLogic.isALEvelStudent(student)) {
                count++;
            }
        }
        return count;
    }

    void getALevelGroupStudentsSurnames(Group group) {
        int count = 0;
        List<Student> students;
        students = group.getStudents();
        for (Student student : students) {
            if (studentLogic.isALEvelStudent(student)) {
                count++;
            }
        }
        if (count == students.size()) {
            for (Student student : students) {
                System.out.println(student.getSurname());
            }
        }
    }
}
