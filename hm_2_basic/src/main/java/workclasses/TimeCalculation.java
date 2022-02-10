package workclasses;

import org.apache.commons.lang3.BooleanUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeCalculation {

    public static void toCalculateTime() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of lesson:");

        int x =  Integer.parseInt(reader.readLine());
        boolean a = (x==1);
        boolean b = (x==2);
        boolean c = (x==3);
        boolean d = (x==4);
        boolean e = (x==5);
        boolean f = (x==6);
        boolean g = (x==7);
        boolean h = (x==8);
        boolean i = (x==9);
        boolean j = (x==10);
        int a2= BooleanUtils.toInteger(a);
        int b2 = BooleanUtils.toInteger(b);
        int c2 = BooleanUtils.toInteger(c);
        int d2 = BooleanUtils.toInteger(d);
        int e2 = BooleanUtils.toInteger(e);
        int f2 = BooleanUtils.toInteger(f);
        int g2 = BooleanUtils.toInteger(g);
        int h2 = BooleanUtils.toInteger(h);
        int i2 = BooleanUtils.toInteger(i);
        int j2 = BooleanUtils.toInteger(j);
        int chislo1 = (9*a2)+(10*b2)+(11*c2)+(12*d2)+(13*e2)+(14*f2)+(15*g2)+(16*h2)+(17*i2)+(17*j2);
        int chislo2 =(4*a2)+(3*b2)+(3*c2)+(2*d2)+(2*e2)+(1*f2)+(1*g2)+(0*h2)+(0*i2)+(5*j2);
        int chislo3 =(5*a2)+(5*b2)+(5*c2)+(5*d2)+(5*e2)+(5*f2)+(5*g2)+(5*h2)+(5*i2)+(5*j2);

        System.out.print(chislo1+" ");
        System.out.print(chislo2);
        System.out.print(chislo3);
    }
}
