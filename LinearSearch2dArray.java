import java.util.Scanner;

public class LinearSearch2dArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        //creation
        int[][] arr = new int[rows][];

        // Input columns for each row and elements
        for (int row = 0; row < rows; row++) {
            System.out.print("Enter number of columns for row " + (row+1)+ ": ");
            int cols = scanner.nextInt();
            arr[row] = new int[cols];

            System.out.println("Enter " + cols + " elements for row " + (row+1) + ":");
            for (int col = 0; col < cols; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }

        // Display
        System.out.println("2D Array:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element you want to search:");
        int target = scanner.nextInt();

        int[] result = SearchTarget(arr, target);
        if (result[0] != -1) {
            System.out.println("Element found at row " + result[0] + " and column " + result[1]);
        } else {
            System.out.println("Element not found");
        };
    }


    static int[] SearchTarget(int[][] arr, int target) {
        System.out.println("Your selected target:" + target);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}





