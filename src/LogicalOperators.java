public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Logical Operators
//        System.out.println("Logical Operators:");
//        System.out.println("(a < b) && (a != b): " + ((a < b) && (a != b))); // logical AND binary
//        System.out.println("(a < b) || (a == b): " + ((a < b) || (a == b))); // logical OR
//        System.out.println("!(a < b): " + (!(a < b))); uninary                      // logical NOT
 //       System.out.println(false||true);

//        Hello1 h1= new Hello1();
//        Hi h2=new Hi();
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h1 instanceof Hello1);
//        System.out.println(h2 instanceof Hi);
//        System.out.println(h2 instanceof Hello1);

        //Conditional Operators
//        int age=25;
//        String result=(age>=18)?"Eligible to vote":"Not eligible to vote";
//        System.out.println(result);

        //  it is ternary operator
       // <operand1> ? <operand2> : <operand3>
       // operand1 must be boolean expression
        // if operand1 is true then operand2 will be executed
        // if operand1 is false then operand3 will be executed

//        int a1= false ? 10 : 20;
//        int a2= true ? 10 : 20;
//
//        System.out.println(a1);
//        System.out.println(a2);
        int min=a<b?a:b;
        System.out.println("Minimum value is: "+min);

       //int b1= 10>20?10:"TWENTY";



    }

}
class Hello1{}
class Hi{}
