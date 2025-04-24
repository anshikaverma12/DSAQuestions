import java.util.Scanner;
public class MaxInRange {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //length
        System.out.print("Enter the length of an array:");
        int length = input.nextInt();
        //creation
        int[] arr = new int[length];
        //elements
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        //Display
        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //enter range
        System.out.println("Enter start index (0 to " + (arr.length - 1) + "): ");
        int start = input.nextInt();

        System.out.print("Enter end index (start to " + (arr.length - 1) + "): ");
        int end = input.nextInt();

        // Validate indices
        if (start < 0 || end >= arr.length || start > end) {
            System.out.println("Invalid range.");
            return;
        }
findMax(arr,start,end);
    }
    static int findMax(int []arr,int start,int end) {
        int max = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            System.out.println("Maximum in range [" + start + ", " + end + "] is: " + max);
        }
  return max;
    }

}




