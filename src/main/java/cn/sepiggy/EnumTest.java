package cn.sepiggy;

import org.junit.Test;

public class EnumTest {

    @Test
    public void test1() {
        Weekday1 sun = Weekday1.SUN;
        System.out.println(sun);
    }

    @Test
    public void test2() {
        System.out.println("nowday ===> " + Weekday1.SAT);
        System.out.println("nowday int ===> " + Weekday1.SAT.ordinal());
        System.out.println("nextday ===> " + Weekday1.getNextDay(Weekday1.SAT));
    }

    @Test
    public void test3() {
        // System.out.println(Weekday1.valueOf("mon"));
        System.out.println(Weekday1.valueOf("mon".toUpperCase()));

        for (Weekday1 w : Weekday1.values()) {
            System.out.println(w + ".ordinal() ===> " + w.ordinal());
        }

        System.out.println(Weekday1.MON.compareTo(Weekday1.FRI));
        System.out.println(Weekday1.MON.compareTo(Weekday1.MON));
        System.out.println(Weekday1.MON.compareTo(Weekday1.SUN));

        System.out.println("Weekday1.MON.name() ===> " + Weekday1.MON.name());

    }

    @Test
    public void test4() {
        System.out.println(Food.Coffee.BLACK_COFFEE.getName());
        System.out.println(Food.Coffee.values());

    }

}
