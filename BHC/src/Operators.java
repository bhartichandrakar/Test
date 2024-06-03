class Operators
{
     public static void main(String args[])
   {
        int a=9,b=54;

//Arithmetic Oerators ---> + - * / %
 
        System.out.println("...................................................Arithemetic Opertors...............................................");
        System.out.println("Sum of Nos.="+(a+b));
        System.out.println("Subtraction of nos.="+(b-a));
        System.out.println("Multiplication of nos.="+(a*b));
        System.out.println("Divivsion of Nos.="+(b/a));
        System.out.println("Percentage of a and b is ="+(a%b));

//Relational Operators (Comparison Operators)--->  == <> <= >= !=
//Always reture boolean value
        
        System.out.println(".................................................Relational Operators...............................................");
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

//Logical  operators && || !
//works between two boolean

        boolean x=true;
        boolean y=false;
        
        System.out.println("............................................................Logical Operators........................................");
        System.out.println(x && y); 
        System.out.println(x || y);
        System.out.println(!x);

//Increment/decrement operators ++ --

        a=26;
        a++;   //a=a+1;
        System.out.println("...............................Incremental Operators ++ ...........................................................");
        System.out.println(a);

        b=78;
        b--;     //b=b-1;
        System.out.println("................................Decremental Operators -- ..........................................................");
        System.out.println(b);

//Assignment Operators =

        a=12;
        b=a;
        System.out.println(".................................Assignment Operators = .............................................................");
        System.out.println(b);


    }
}