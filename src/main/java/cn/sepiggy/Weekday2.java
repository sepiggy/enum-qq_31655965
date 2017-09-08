package cn.sepiggy;

public enum Weekday2 {
    MON(1, "mon"),
    TUS(2, "tus"),
    WED(3, "wed"),
    THU(4, "thu"),
    FRI(5, "fri"),
    SAT(6, "sat"),
    SUN(0, "sun");

    private int value;
    private String label;

    private Weekday2(int value, String label) {
        this.value = value;
        this.label = label;
    }
}
