package p18_09_2023.Zadatak3;

public class JednakostranicniTrougao extends Figura{
    private double a;

    public JednakostranicniTrougao(double a) {
        this.a = a;
    }
    public double povrsina (){
        return (a*a)*1.73205/4;
    }
    public double obim () {
        return a+a+a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
