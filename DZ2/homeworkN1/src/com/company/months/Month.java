package com.company.months;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int number;

    Month(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static Month getMonthByNum(int number) {
        for (Month month : values()) {
            if (month.number == number) {
                return month;
            }
        }
        return null;
    }

    public static int getNumByMonth(String months) {
        for (Month month : values()) {
            if (month.valueOf(months).equals(months)) {
                return month.number;
            }
        }
        return 0;
    }
}

