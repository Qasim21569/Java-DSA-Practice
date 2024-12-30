package Arrays;

public class array1 {
    public static void main(String[] args) {
        float[] marks = { 45.7f, 67.8f, 345.2f, 789.6f, 678.f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is: " + sum);

    }
}
