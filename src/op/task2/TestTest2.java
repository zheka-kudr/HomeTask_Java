package op.task2;

public class TestTest2 {
    public static void main(String[] args) {
        Test2 test1 = new Test2(5, 5);
        System.out.println(test1.getVariable1());
        System.out.println(test1.getVariable2());
        Test2 test2 = new Test2();
        System.out.println(test2.getVariable1());
        System.out.println(test2.getVariable2());
    }
}
