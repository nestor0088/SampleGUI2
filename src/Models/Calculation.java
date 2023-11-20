package Models;

public class Calculation {
    double numa;
    double numb;
    double result;

    public Calculation(double a, double b) 
    {
        this.numa=a;
        this.numb=b;
    }
    public void Addition()
    {
        this.result=this.numa+this.numb;
    }
    public double getResult()
    {
        return this.result;
    }
}