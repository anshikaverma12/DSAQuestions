import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //length
        System.out.print("Enter the length of an array:");
        int length = input.nextInt();
        //creation
        int[] arr = new int[length];
        //elements
        System.out.print("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        //Display
        System.out.print("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //target
        System.out.print("Enter the target you want to search in array:");
        int target=input.nextInt();
        Search(arr,target);
    }
    //function for search
    static int  Search(int[]arr,int target){
        System.out.println("Your selected target:"+target);
       for(int i=0;i< arr.length;i++){
           if(arr[i]==target){
               System.out.println("Found at index:"+ i);
               return i;
           }
       }
        System.out.println("Element not found in array");
        return-1;
    }
}
