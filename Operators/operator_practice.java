//Practice questions Solutions of Operators

import java.util.*;

public class operator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //question 1
        int x =2, y=5;
        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));
        System.out.println(exp1+ " , "+ exp2);

        //question 2
        int a = 200,b=50,c=100;
        if(a>b && b>c) {
            System.out.println("Hello");
        }
        if(c>b && c<a) {
            System.out.println("Java");
        }
        if((b+200)<a && (b+150)<c) {
            System.out.println("Hello Java");
        }

        //question 3
        int n1,n2,n3;
        n1 = n2 = n3 = 2;
        n1 +=n2;
        n2-=n3;
        n3 /= (n1+n2);
        System.out.println(n1 +" "+n2+" "+n3);

        //question 4 
        int x1=9, y1=12;
        int a1 =2, b1 =4, c1=6;
        int exp = 4/3 * (x1+34) + 9 * (a1+b1*c1) + (3+y1*(2+a1)) / (a1 + b1*y1);
        System.out.println("exp: 4/3 * (x1+34) + 9 * (a1+b1*c1) + (3+y1*(2+a1)) / (a1 + b1*y1) value is "+ exp);

        //question 5
        int p=10,q=5;
        int exp3 = (q* (p / q + p / q));
        int exp4 = (q * p / q + q * p / q);
        System.out.println("exp3: "+exp3+" exp4: "+exp4);

    }
}
