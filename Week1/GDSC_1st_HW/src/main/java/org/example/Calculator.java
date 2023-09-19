package org.example;

public interface Calculator {
    int plus(int a, int b);
    int minus(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}

class BasicCalculator implements Calculator{
    public int plus(int a, int b){
        return a+b;
    }
    public int minus(int a, int b){
        return b-a;
    }
    public int mul(int a, int b) {
        return a*b;
    }
    public int div(int a, int b) {
        if(b==0){
            throw new ArithmeticException("div by zero nono");
        }
        return a/b;
    }
}