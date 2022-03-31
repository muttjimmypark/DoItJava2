package chapter11.object;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        //java.object

        //일반적인 toString의 작업이라면 주소값을 보여줄텐데
        //toString을 오버라이딩 하여 다르게 표현할 수 있다
        Book book = new Book("DoItJava", "EJ");
        System.out.println(book);

        //String 클래스의 toString은 자기자신을
        String str = new String("test");
        System.out.println(str);
    }
}
