import java.util.Random;

public class Scenario4 {
    public static void main(String[] args) {

        Random rn = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + rn.nextInt(101);
        }

        int peakcount = 0;
        int tallest = 0;

        System.out.println("Peaks:");

          for (int i = 1; i < arr.length - 1; i++) {
             if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
                peakcount++;
                   if (arr[i] > tallest){ tallest = arr[i];
                   }


             }
          }

             System.out.println("Total peaks = " + peakcount);
          System.out.println("Tallest peak = " + tallest);
    }
}
