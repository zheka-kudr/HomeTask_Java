package op.task3;

class StudentLogic {

    boolean isALEvelStudent(Student student) {
        int[] marks = student.getMarks();
        for (int mark : marks) {
            if (mark != 9 && mark != 10) {
                return false;
            }
        }
        return true;
    }

    void getALevelStudentSurnameGroupNumber(Student student) {
        if (isALEvelStudent(student)) {
            System.out.println(student.getSurname() + " in group " + student.getGroupNumber());
        }
    }
}
