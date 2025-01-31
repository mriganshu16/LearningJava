package BasicsOfJava;

public class ArithmaticOperations {
    public static void main(String[] args) {
        int x = 10;
        double y = 15.5;
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(x/y);
        x--; //decrease x by 1
        System.out.println(x);
        x++;
        System.out.println(x);
        System.out.println(x++);//increment after print, so it will give 10 as well
        System.out.println(++x);//it will increment first then it will give the value. i.e 11
        //but here it will 12 as line 15 incremented to 11 after printing 10
    }
}
