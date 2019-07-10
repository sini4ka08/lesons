package com.lesson.lesson_3_2;

public enum  DayOfWeek {
    PN(8), VT(8), SR(8), CHT(8), PT(7), SB(0), VS(0);

    private int timeWork;

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }
    public int getTimeWork() {
        return timeWork;
    }
    private DayOfWeek(int timeWork) {
        this.timeWork = timeWork;
    }
}
