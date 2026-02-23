import java.util.*;

public class var_datatypes {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         //question1
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int o = sc.nextInt();
        float avg = (float)((a+b+o)/3);
        System.out.println(avg);

        //question2
        System.out.println("Enter side of square:");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);
    
        //question3
        System.out.println("Enter price of pencil, pen and eraser:");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        float gst = total * 0.18f; //18% gst
        float final_price = total + gst;
        System.out.println("price without gst: " + total);
        System.out.println("price with gst: " + final_price);

        //question4
        byte by =4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*by) + (i%c) - (d*s);
        System.out.println("(f*by) + (i%c)  + (d*s)");
        System.out.println((f*by) + " " + (i%c) + " " + (d*s));
        System.out.println(result);

        //question5
        int $ = 24;
        int _ = 25;
        // int sum = $ + _ ; this is error _ cannot be used as identifier
    }
}

