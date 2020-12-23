package Homework7;

public class Cleaner {

    private DayTime dayTime = DayTime.DAY;
    private DayTime dayTime2 = DayTime.EVENING;

    public DayTime getDayTime() {
        System.out.println("Прибиральник працює");
    }

    public void setDayTime(DayTime dayTime) {
        this.dayTime = dayTime;
    }
}
