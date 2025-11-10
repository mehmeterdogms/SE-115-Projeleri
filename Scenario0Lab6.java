public class Scenario0 {
    public static void main(String[] args) {

        int[] myArr = {4, 8, 15, 16, 23, 42};

        int length = myArr.length;
        int first = myArr[0];
        int lastIndex = myArr.length - 1;
        int third = myArr[2];
        int valueAt3 = myArr[3];

        System.out.println("Length: " + length);
        System.out.println("First element: " + first);
        System.out.println("Last index: " + lastIndex);
        System.out.println("Third element: " + third);
        System.out.println("myArr[3]: " + valueAt3);

        int ErrorTest = myArr[10];
    }
}
// 1.) uzunluk 6'dır 2.) 1. element 4 dür 3.) last index 5 dir 4.) 3. element 15'dir 4.) myArr[3] (4. element) 16'dır.
// myArr[10] satırı çalıştığında hata oluşur hatanın adı ArrayIndexOutOfBoundsException’dır.
// Bu hatanın nedeni dizinin uzunluğunun 6 olması ve geçerli indexlerin yalnızca 0 ile 5 arasında olmasıdır.
//10. index olmadığı için java programı çalıştırmayı durdurur ve bu hata mesajını verir. exit code 1 ile çıkar.

