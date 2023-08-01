

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public double div(double a, double b){
        return a/b;
    }

    public double per(double a, double b, double c){
        return (a/b)*100;
    }

    public boolean isEven(int num){
        return num % 2 == 0;
    }

}
