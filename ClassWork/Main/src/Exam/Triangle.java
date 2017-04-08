package Exam;
import java.math.*;

public class Triangle {
    int Fa;
    int Fb;
    int Fc;
    double S;
    double P;

    public Triangle(int a, int b, int c){
        Fa = a;
        Fb = b;
        Fc = c;
    }
    double getP(){
        P = Fa + Fb + Fc;
        return P;
    }
    double getS(){
        int p, x;
        p = (int) (P/2);
        x = p * (p - Fa) * (p - Fb) * (p - Fc);
        S = Math.sqrt(x);
        return S;
    }
}
