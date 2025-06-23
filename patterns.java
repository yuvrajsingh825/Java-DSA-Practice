<<<<<<< HEAD


public class patterns {
    public static void main(String[] args) {
         
        System.out.println("Solid Rectangle");
        // solid rectangle 
        for(int i = 1; i<5;i++){

            for(int j = 1; j <=5; j++){
            System.out.print(" * ");
            }
            System.out.println(" ");
            
        }

        //hollow rectangle 
             System.out.println(" ");
        System.out.println(" Hollow Rectangle ");
        
        for(int k = 1; k<=4 ;k++){
        for( int j = 1;j<=5;j++){

            if(k==1|| j ==1||k==4||j==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

           }
           System.out.println("");

       }
       //half pyramid
            System.out.println(" ");
       System.out.println("HAlf Pyramid");

        for(int a = 1 ; a <=4 ;a++){

        for (int b =1;b<=a; b++){
            System.out.print("*");
        }
        System.out.println("");
        }

     // invert half pyramid
          System.out.println(" ");
     System.out.println("Inverted Half Pyramid");
     
     for(int c = 4;c>=1; c--){
        for(int d=1;d<=c;d++){
            System.out.print("*");
        }
         System.out.println(" ");
     }
     
     //Mirror Half pyramid
          System.out.println(" ");
     System.out.println("Mirror Half Pyramid");
       
        
        for (int e = 1; e <= 4; e++) {
            // print spaces
            for (int f = 1; f <= 4 - e; f++) {
                System.out.print(" ");
            }

            // print stars
            for (int f = 1; f <= e; f++) {
                System.out.print("*");
            }
            System.out.println(" ");
}
     
     
        //half Pyramid with numbers
             System.out.println(" "); 
        System.out.println("Half Pyramid With Numbers");

        for(int g = 1;g<=5;g++){
            for(int h=1;h<=g;h++){
                System.out.print(" "+h);
        }
        System.out.println("");
         

    }

    // inverted half pyramid with numbers
          System.out.println(" ");
    System.out.println("Inverted Half Pyramid With Numbers ");

    for(int l = 5;l>=1;l--){
        for(int m =1;m<=l;m++){
            System.out.print(" "+m);
        }
        System.out.println(" ");
    }
    

    //floyd triangle 
     int number = 1;
          System.out.println(" ");
    System.out.println("Floyd's Triangle");
    for(int n =1;n<=5;n++){
        for(int o =1;o<=n;o++){
            System.out.print(number+" ");
            number++;
                }
                 System.out.println(" ");

      }


      //0-1 Triangle 
      System.out.println(" ");
      System.out.println("Triangle 0-1");

      for(int p =1;p<=5;p++){
         for(int q =1;q<=p;q++){
            int  sum =p+q;
            if(sum%2==0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println(""); 

      } 




} 

}

 
=======


public class patterns {
    public static void main(String[] args) {
         
        System.out.println("Solid Rectangle");
        // solid rectangle 
        for(int i = 1; i<5;i++){

            for(int j = 1; j <=5; j++){
            System.out.print(" * ");
            }
            System.out.println(" ");
            
        }

        //hollow rectangle 
             System.out.println(" ");
        System.out.println(" Hollow Rectangle ");
        
        for(int k = 1; k<=4 ;k++){
        for( int j = 1;j<=5;j++){

            if(k==1|| j ==1||k==4||j==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

           }
           System.out.println("");

       }
       //half pyramid
            System.out.println(" ");
       System.out.println("HAlf Pyramid");

        for(int a = 1 ; a <=4 ;a++){

        for (int b =1;b<=a; b++){
            System.out.print("*");
        }
        System.out.println("");
        }

     // invert half pyramid
          System.out.println(" ");
     System.out.println("Inverted Half Pyramid");
     
     for(int c = 4;c>=1; c--){
        for(int d=1;d<=c;d++){
            System.out.print("*");
        }
         System.out.println(" ");
     }
     
     //Mirror Half pyramid
          System.out.println(" ");
     System.out.println("Mirror Half Pyramid");
       
        
        for (int e = 1; e <= 4; e++) {
            // print spaces
            for (int f = 1; f <= 4 - e; f++) {
                System.out.print(" ");
            }

            // print stars
            for (int f = 1; f <= e; f++) {
                System.out.print("*");
            }
            System.out.println(" ");
}
     
     
        //half Pyramid with numbers
             System.out.println(" "); 
        System.out.println("Half Pyramid With Numbers");

        for(int g = 1;g<=5;g++){
            for(int h=1;h<=g;h++){
                System.out.print(" "+h);
        }
        System.out.println("");
         

    }

    // inverted half pyramid with numbers
          System.out.println(" ");
    System.out.println("Inverted Half Pyramid With Numbers ");

    for(int l = 5;l>=1;l--){
        for(int m =1;m<=l;m++){
            System.out.print(" "+m);
        }
        System.out.println(" ");
    }
    

    //floyd triangle 
     int number = 1;
          System.out.println(" ");
    System.out.println("Floyd's Triangle");
    for(int n =1;n<=5;n++){
        for(int o =1;o<=n;o++){
            System.out.print(number+" ");
            number++;
                }
                 System.out.println(" ");

      }


      //0-1 Triangle 
      System.out.println(" ");
      System.out.println("Triangle 0-1");

      for(int p =1;p<=5;p++){
         for(int q =1;q<=p;q++){
            int  sum =p+q;
            if(sum%2==0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println(""); 

      } 




} 

}

 
>>>>>>> 59b5f2bad9143a5c2c4779062a8cb60bc229918f
