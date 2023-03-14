import java.util.Scanner;

public class Main {

    // Method
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world!");

        /*
        Variables
        Just Like:
            water - Bucket
            Masala - box
            Lunch - LunchBox
        In Java:
        Variables are containers which store data values
        String, int, float, char, boolean
        How to declare variables:
        syntax - <dataType> <variableName> = <value>;
         */

        String name = "Harry";
        System.out.println(name);

        int a = 45, x = 56, y = 67;
        float b = 45.22f;
        boolean isAdult = false;
        System.out.println(x);
        System.out.println(b);
        System.out.println(isAdult);

        /*
        Rules for constructing name of variables in Java
            1.can contain digits, underscores, dollar signs, letters
            2.Should begin with a letter, $ or _
            3.Java is case-sensitive language which means that
            harry and Harry are two different variables altogether
            4.should not contain whitespaces
            5.You cannot use reserved keywords from Java
         */

        /*
        Two types of Java Data Types:
            1.Primitive - byte (1 byte), short (2 bytes), int (4 bytes) , long (8 bytes),
                float (4 bytes), double (8 bytes), boolean (1 bit), char (2 bytes)
            2.Non-Primitive or Reference Data Type - String, Array, Class, Interface
         */

        byte u = -56; // -128 to 127
        double d = 45.635435345d;
        System.out.println(d);
        char grade = 'A';
        System.out.println(grade);

        /*
        Operators in Java
            Operand, operator, Operand = Result
            4           +       7      =   11
        
        Types of operators in Java
            Arithmetic operators
            Assignment operators
            Logical Operators
            Comparison Operators
         */
        int num1 = 45, num2 = 78;
        num1 += 3;
        num2 -= 8;
        // Explore these operators - *=, /=, %=,
        System.out.print("The value of num1 + num2 is ");
        System.out.println(num1 + num2);

        System.out.print("The value of num1 - num2 is ");
        System.out.println(num1 - num2);

        System.out.print("The value of num1 * num2 is ");
        System.out.println(num1 * num2);

        System.out.print("The value of num1 / num2 is ");
        System.out.println(num1 / num2);

        System.out.print("The value of num1 % num2 is ");
        System.out.println(num1 % num2);

        System.out.println(num2++);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);

        /*
        Comparison Operators
        1. == : checks for equality of two values
        2. != : checks if two values are not equal
        3. <
        4. >
        5. <=
        6. >=

        Logical Operators
        1. && - Logical and operator - returns true only if both conditions are true
        2. || - Logical or operator - returns true if any one condition are true
        3. ! - Logical not - Reverse the result from true to false and vide versa
         */

        // Taking user input in Java
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter Your Age");
        // int age = scan.nextInt();
        // System.out.println(age);

        // String Methods
        String Name = "Harry"; // Variable names are case-sensitive.
        String channel = "CodeWithHarry";
        System.out.println(Name);
        System.out.println(Name.length());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        System.out.println(Name + " from\" " + channel);
        System.out.println(Name + " from\\ " + channel);
        System.out.println(Name + " from\t " + channel); // tab
        System.out.println(Name + " from\n " + channel); // new line

        System.out.println(Name.contains("Har"));
        System.out.println(Name.charAt(2));
        System.out.println(Name.indexOf("rry"));

        int numb1 = 4, numb2 = 7;
        System.out.println(Math.max(numb1, numb2));
        System.out.println(Math.min(numb1, numb2));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-36));
        System.out.println(Math.abs(6));
        System.out.println(Math.random());
        System.out.println(4 + (8 - 4) * Math.random());
        System.out.println(4 + (8 - 4) * Math.random());
        System.out.println(4 + (8 - 4) * Math.random());
        System.out.println(4 + (8 - 4) * Math.random());
        System.out.println(4 + (8 - 4) * Math.random());

        // If-else conditionals
        // if (age > 20) {
        // System.out.println("You are an adult");
        // } else if (age > 5) {
        // System.out.println("You are not a kid");
        // } else {
        // System.out.println("You are a kid");
        // }

        // Switch statement in Java
        // switch (age) {
        // case 12:
        // System.out.println("You are 12 years old");
        // break;
        // case 56:
        // System.out.println("You are 56 years old");
        // break;
        // case 16:
        // System.out.println("You are 16 years old");
        // break;
        // default:
        // System.out.println("You did not match any of the cases");
        // }

        // Quick Quiz: print sunday to saturday based on numbers 1 to 7 typed by the
        // user
        // System.out.println("Enter Your Number");
        // int number = scan.nextInt();

        // switch (number) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Number entered is other than 1 to 7");
        // break; // optional
        // }

        // Loops

        /*
        1.While Loop
        while(condition){
            // This code will keep executing until the condition is true
        }
         */
        // int i=0;
        // while(i<100){
        // System.out.println(i);
        // i+=1;
        // }

        /*
        2. Do While Loop
        do{
            // This code will keep executing until the condition is true
        }while(condition)
         */
        // int j=0;
        // do{
        // System.out.println(j);
        // j+=1;
        // }while(j>100);

        /*
        3. For Loop
        for(st1;st2;st3){
            // Code to be executed
        }
         */
        // for (int i = 0; i <= 10; i++) {
        // System.out.println(i);
        // }

        // Break Statement
        // for (int i = 0; i <= 10; i++) {
        // if (i > 2) {
        // break;
        // } else {
        // System.out.println(i);
        // }
        // }

        // Continue Statement
        // for (int i = 0; i <= 10; i++) {
        // if (i == 2) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // Java Arrays
        // int [] marks={1,2,3,5};
        // marks[3]=34; // this will update marks[3]
        // System.out.println(marks[0]);
        // System.out.println(marks[3]);
        //
        // // Classical way to iterate an array
        // for(int i=0;i<marks.length;i++){
        // System.out.println(marks[i]);
        // }
        //
        // System.out.println("This is for each loop:");
        //
        // // For each loop
        // for(int value:marks){
        // System.out.println(value);
        // }
        //
        // int [][] matrix = {{1,2,3},
        // {4,5,6}};
        // System.out.println(matrix[0][1]);
        //
        // String [] cars={"Maruti Harry", "Maruti", "Suzuki","Innova","Ford Titanium"};
        // for(String value:cars){
        // System.out.println(value);
        // }

        // Try - Catch
        String[] cars = { "Maruti Harry", "Maruti", "Suzuki", "Innova", "Ford Titanium" };

        try
        {
            System.out.println(cars[5]);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println("Masoom");
        System.out.println(sum(5, 7));

        float number_1, number_2;
        System.out.println("Enter first number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number");
        // Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " + "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);

        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid input");
        }

    }
}