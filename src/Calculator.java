public class Calculator
{ // inside the class - outside the method with static keyword
    static  int a = 10; // static/class variable
    static  int b = 5;
    static  void add ()// this is addition method whose value given on top
    {
        System.out.println( a +b );
    }
    static void sub () //no return type no argument user defined
    {
        System.out.println( a - b);
    }
    static void division (int c, int d)
    {
        System.out.println(c/d);
    }
    static void multiply (int e, int f){
        System.out.println(e*f);


    }
    public static void main(String[] args)
    {
        add();
        sub();
        division(20, 4 );
        multiply(10, 6);
    }
}
