import java.util.Random;

public class Scenario2 {

    public static int[] rotate(int[] arr) {

        int size = arr.length;
        int last = arr[size - 1];

        int i = size - 1;
        while (i > 0) {
            arr[i] = arr[i - 1];
            i = i - 1;
        }

        arr[0] = last;

        return arr;
    }

     public static void main(String[] args) {

        Random rn = new Random();

        int size = 10 + rn.nextInt(11);

        int[] arr = new int[size];

         int i = 0;
         while (i < size) {
             arr[i] = rn.nextInt(100);
               i = i + 1;
         }

          System.out.println("Original:");
          for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
          }

          int[] rotated = rotate(arr);

           System.out.println("Rotated:");
           for (int x = 0; x < rotated.length; x++) {
            System.out.print(rotated[x] + " ");
           }
    }
}


