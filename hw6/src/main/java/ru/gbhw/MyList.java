package ru.gbhw;

import java.util.Arrays;

public class MyList {
    private int[] list1;
    private int[] list2;


    public double getAverage(int[] useArr) {
        if(useArr.length > 0)
            return (double) Arrays.stream(useArr).sum() / useArr.length;
        else
            return 0;
    }

    public String compareAverage() {
        double avg1 = getAverage(list1), avg2 = getAverage(list2);
        if (avg1 > avg2)
            return "Первый список имеет большее среднее значение";
        else if (avg1 < avg2)
            return "Второй список имеет большее среднее значение";
        else
            return "Средние значения равны";
    }

    public void setList1(int[] list1) {
        this.list1 = list1;
    }
    public void setList2(int[] list2) {
        this.list2 = list2;
    }

    public int[] getList1() {
        return list1;
    }

    public int[] getList2() {
        return list2;
    }
}
