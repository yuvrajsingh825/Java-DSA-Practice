 import java.util.*;
public class arrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
      int numbers[] = new int[size];

      for(int i = 0; i <size; i++){
        numbers[i]=sc.nextInt();
      }
       //linear search
      int x = sc.nextInt();
      for(int i =0;i <size;i++){
        if(numbers[i]==x){
            System.out.println("Element fount at index "+i);
        }
      }
 
     for(int i =0; i<5; i++){
        System.out.println(numbers[i]);
     }

     sc.close();



    }
}