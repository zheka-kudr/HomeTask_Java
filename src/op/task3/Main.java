package op.task3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov", "I.O.", 1, new int[]{9, 9, 9, 10, 10});
        Student student2 = new Student("Petrov", "G.V.", 1, new int[]{10, 9, 9, 10, 10});
        Student student3 = new Student("Belov", "K.I.", 1, new int[]{10, 8, 9, 10, 10});
        Student student4 = new Student("Smolyakova", "O.G.", 1, new int[]{10, 10, 10, 10, 10});
        Student student5 = new Student("Serebrov", "P.V.", 1, new int[]{9, 9, 9, 10, 9});

        StudentLogic studentLogic = new StudentLogic();
        GroupLogic groupLogic = new GroupLogic(studentLogic);
        studentLogic.getALevelStudentSurnameGroupNumber(student2);
        Group group = new Group(5);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);

        System.out.println(groupLogic.countOfALevelStudents(group));
        groupLogic.getALevelGroupStudentsSurnames(group);
    }
}
