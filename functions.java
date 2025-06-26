import java.util.*;

// import java.util.Scanner; // Uncomment and use the class you need
public class functions {
    public static int calculateSum(int a ,int b){
          int sum = a+b;
          return sum;
    }
       // Calculate Product of two numbers 
    public static int calculateProduct(int a, int b ){
        int Product = a*b;
        return Product;
       
    }
        //calculate Difference of two numbers 
    public static float calculateDifference( int a , int b ){
        float Difference = a-b;
        return Difference ;

    }

      // calculate Division of two numbers
    public static float calculateDivision(int a , int b ){
        float Division = a/b;
        return Division;
    }
        // CAlculate Mudule of two numbers 
    public static float calculateModule(int a , int b){
        float Module = a%b;
        return Module;

    }
      // Calculatfe Aveage Of three Numbers 
    public static float calculateAverage( int a , int b , int c ){
        float Average = (a + b + c) / 3.0f;
        return Average;
    }
      // find Greater value
    public static int  printGreaterValue(int a , int b ){

    if (a > b) {
        System.out.println("Greater value is :" + a);
        return a;
    } 
    else if (b > a) {
        System.out.println("Greater  value is :" + b);
        return b;
    }
    else {
        System.out.println("bOTH values are equal");
        return a; // or return b; since they are equal
      }
   }

     //find circumference of circle
     public static float calculateCircumferenc(float radius){
        float Circumference = 2*3.14f*radius;
        return Circumference;
     }

     // A person is eligible to vote or not 

     public static int isEligibleToVote(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
            return 1;//Eligible 

        } else {
            System.out.println("Not eligible to vote");
            return 0;// not Eligible
        }
     }
	
     // fibonacci series 
     public static void fibonacciSeries(int n ){
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }


     }

   
     public static void   main(String args[] ){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       System.out.println("First number is  :"+a);
       int b = sc.nextInt();
       System.out.println("Second number is :"+b);
       int c = sc.nextInt();
       System.out.println("Third number is :"+c);

       
       int sum = calculateSum(a,b);
       System.out.println("sum of two numbers  :"+sum);

       int Product = calculateProduct(a,b);
       System.out.println("product of two numbers  :"+Product);


       float Difference = calculateDifference(a,b);
       System.out.println("Difference of two numbers :"+Difference);

       float Division = calculateDivision(a,b);
       System.out.println("Division of two numbers  :"+Division);


       float Module = calculateModule(a,b);
       System.out.println("Module  :of two numbers "+Module);


       float Average = calculateAverage(a,b,c);
       System.out.println("AVerage of 3 numbers  :"+Average);

       int GreaterValue = printGreaterValue(a,b);
       System.out.println("Greater value is :"+GreaterValue);

    
       System.out.println("Enter radius of circle ");
       float radius = sc.nextInt();
       float Circumference = calculateCircumferenc(radius);
       System.out.println("Circumference of circle is :"+Circumference);


         
       System.out.println("Engter your age");
       int age = sc.nextInt();
       int Eligibility = isEligibleToVote(age);

       System.out.println("Enter the numbers for fibonacci series");
       int n = sc.nextInt();
       System.out.println("Fibonacci series is :");
       fibonacciSeries(n);
       


       




         
    }
  

	
}
