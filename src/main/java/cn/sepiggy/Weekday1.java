package cn.sepiggy;

public enum Weekday1 {
    SUN(0),
    MON(1),
    TUS(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6);

    private int value;

    Weekday1(int value) {
        this.value = value;
    }

    public static Weekday1 getNextDay(Weekday1 nowDay) {
        int nextDayValue = nowDay.value;

        if (++nextDayValue == 7) {
            nextDayValue = 0;
        }

        return getWeekdayByValue(nextDayValue);
    }

    public static Weekday1 getWeekdayByValue(int value) {
        for (Weekday1 c : Weekday1.values()) {
            if (c.value == value) {
                return c;
            }
        }
        return null;
    }
}
