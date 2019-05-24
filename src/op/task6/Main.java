package op.task6;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(16, 42, 56);
        TimeLogic timeLogic = new TimeLogic();
        System.out.println(time);
        timeLogic.addSecond(time, 1874);
        System.out.println(time);
        time.setMinute(64);
        System.out.println(time);
    }
}
