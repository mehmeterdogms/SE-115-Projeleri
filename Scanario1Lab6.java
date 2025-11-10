public class Scenario1 {

    public static int[] grow(int[] oldArr, int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] =  oldArr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {

        int[] roster = new int[20];
         for (int i = 0;i < roster.length; i++) {
            roster[i] = 1000 + i;
         }

          int[] biggerRoster = grow(roster, 42);

           System.out.println("Old roster:");
           for (int x: roster) {
            System.out.println(x + " ");
           }

             System.out.println("New roster:");
             for (int x : biggerRoster) {
              System.out.println(x + " ");
             }
    }
}

