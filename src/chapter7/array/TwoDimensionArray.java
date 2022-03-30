package chapter7.array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(arr.length);    //첫번째 차원의 길이만 출력 -> 2
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        System.out.println();

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

        System.out.println();

        char[][] alphabets = new char[13][2];
        char ch = 'A';
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                alphabets[i][j] = ch++;
            }
        }
        for (char[] c : alphabets) {
            System.out.println(c);
        }
    }
}
