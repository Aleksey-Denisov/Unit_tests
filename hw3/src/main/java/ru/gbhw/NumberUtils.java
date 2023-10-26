package ru.gbhw;

public class NumberUtils {
    
    public boolean evenOddNumber(int number){
        return number % 2 == 0;
    }

    public boolean numberInInterval(int number){
        return number > 25 && number < 100;
    }
}
