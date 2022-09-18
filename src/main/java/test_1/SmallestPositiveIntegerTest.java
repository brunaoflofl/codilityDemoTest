package test_1;

public class SmallestPositiveIntegerTest {
    public static void main(String[] args) {
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();

        int[] A = new int[]{1, 2, 3, 4, 8};
        int smallestInteger = smallestPositiveInteger.solution(A);
        System.out.print("Smallest integer is: " + smallestInteger);
    }
}
