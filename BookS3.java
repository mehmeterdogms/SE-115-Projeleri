public class BookS3 {
    String title;
    int pages;

    public BookS3(String t, int p) {
        title = t;
        pages = p;
    }

    public void addPages(int number) {
        pages += number;
    }

    public void printBook() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}