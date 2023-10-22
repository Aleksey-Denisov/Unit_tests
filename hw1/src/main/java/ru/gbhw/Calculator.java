package ru.gbhw;

public class Calculator {
    public int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }
    
    public double calculatingDiscount(double amount, double discount){
        if(amount < 0 || discount < 0 || discount > 100){
            throw new ArithmeticException("Invalid arguments");
        }
        return amount - (amount * discount / 100);
    }
    
}
