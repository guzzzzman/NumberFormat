// Jose Guzman
// September 17, 2023
// Description: printf sample program
// File name: NumberFormat.java
// To Compile in terminal type: javac NumberFormat.java
// To Run in terminal type: java NumberFormat.java 

// Number formatting in Java (using C++ style printf)
class NumberFormat
{ 
 public static void main (String[] args)
 {
  double num = 1.2345678;
  System.out.printf("Round to 1 decimal num = %.1f\n", num);
  System.out.printf("Round to 2 decimal num = %.2f\n", num);
  System.out.printf("Round to 2 decimal num = %5.2f\n", num);
  // %5.2f means
  // "Field of 5 numbers total with 2 decimal digits" 
  // |xx.xx|  the . counts as a number

  System.out.printf("Round to 3 decimal num = %.3f\n", num);
  System.out.printf("Round to 4 decimal num = %.4f\n", num);

  AddingNumbers.addNumbers();
  /*I added this class to find the sum of the first three
  numbers of the output*/
 }
}
class AddingNumbers{
    public static void addNumbers(){
        double num1 = 1.2;
        double num2 = 1.23;
        double num3 = 1.23;

        double sum = num1 + num2 + num3;

        System.out.printf("Sum of numbers 1-3: " + sum);
    }
 }

/*
javac NumberFormat.java
java NumberFormat
Rounded to 1 decimal num = 1.2
Rounded to 2 decimal num = 1.23
Rounded to 2 decimal num =  1.23
Rounded to 3 decimal num = 1.235
Rounded to 4 decimal num = 1.2346
Sum of numbers 1-3 : 3.6599999999999997
*/