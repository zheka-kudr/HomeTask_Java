package op.task6;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour < 24 && minute < 60 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    int getHour() {
        return hour;
    }

    void setHour(int hour) {
        if (hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    int getMinute() {
        return minute;
    }

    void setMinute(int minute) {
        if (minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    int getSecond() {
        return second;
    }

    void setSecond(int second) {
        if (second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        return "Time{" + hour + ":" + minute + ":" + second + '}';
    }
}
