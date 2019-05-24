package op.task1;

public class TestTest1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1(5, 5);
        System.out.println(test1.getGreater());
        System.out.println(test1.getSum());
        System.out.println(test1.getVariable1());
        System.out.println(test1.getVariable2());
        Test1 test2 = new Test1(5, 14);
        System.out.println(test2.getGreater());
        System.out.println(test2.getSum());
        System.out.println(test2.getVariable1());
        System.out.println(test2.getVariable2());
    }
}
