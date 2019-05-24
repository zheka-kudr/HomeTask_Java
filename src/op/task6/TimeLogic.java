package op.task6;

class TimeLogic {
    private void addHour(Time time, int number) {
        int t = time.getHour() + number;
        time.setHour(t % 24);
    }

    private void addMinute(Time time, int number) {
        int t = time.getMinute() + number;
        int h = t / 60;
        time.setMinute(t % 60);
        addHour(time, h);
    }

    void addSecond(Time time, int number) {
        int t = time.getSecond() + number;
        int m = t / 60;
        time.setSecond(t % 60);
        addMinute(time, m);
    }
}
