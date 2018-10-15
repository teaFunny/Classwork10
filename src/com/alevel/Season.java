package com.alevel;

public enum Season {
    WINTER(new String[]{"Dec", "Jan", "Feb"}),
    SPRING(new String[]{"Mar", "Apr", "May"}),
    SUMMER(new String[]{"Jun", "Jul", "Aug"}),
    FALL(new String[]{"Sep", "Oct", "Nov"});

    String[] months;

    Season(String[] months) {
        this.months = months;
    }
}
