public class BookDemoS3 {
    public static void main(String[] args) {
        BookS3 b1 = new BookS3("Java Programming", 300);

        BookS3 b2 = b1;

        b2.addPages(20);

        System.out.println(" b1 Details ");
        b1.printBook();

        System.out.println(" b2 Details ");
        b2.printBook();

        System.out.println(" Extension ");
        BookS3 b3 = new BookS3("Java Programming", 320);

        if (b1 == b3) {
            System.out.println("b1 and b3 are the Same object reference.");
        } else {
            System.out.println("b1 and b3 are Different object references.");
        }
    }
}

/*
 *
 * 1.
 * - Because "b2 = b1" copies the REFERENCE not the object. Both variables point
 * to the exact same location in memory. So changing one changes the other.
 * - Currently there is only 1 Book object for b1 and b2 in memory.
 *
 * 2.
 * - Even though they have the same values (title and pages) "b3" was created
 * using the "new" keyword. This creates a new object at a different memory address.
 * - The "==" operator compares memory addresses, not the content. Since their
 * addresses are different, the result is "different objects".
 */