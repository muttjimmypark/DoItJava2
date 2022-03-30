package chapter7.array;

public class ArrayTest3 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
            System.out.println(alphabets[i]);
        }
    }
}
