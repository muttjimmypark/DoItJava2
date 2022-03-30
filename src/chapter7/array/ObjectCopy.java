package chapter7.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥1", "조정래");
        bookArray1[1] = new Book("태백산맥2", "조정래");
        bookArray1[2] = new Book("태백산맥3", "조정래");

        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
        System.out.println();
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        // 복사한 원 객체의 주소값만 복사되어, 원객체의 수정값에 따라 출력됨
        // arraycopy는 얕은 복사
        System.out.println();
        System.out.println();
        
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookName(bookArray1[i].getBookName());
        }
        bookArray1[0].setBookName("나목2");
        bookArray1[0].setAuthor("박완서2");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
        System.out.println();
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        //값을 직접 옮기는 깊은 복사를 필요에 따라 진행할 수 있다
        System.out.println();
        System.out.println();

    }
}
