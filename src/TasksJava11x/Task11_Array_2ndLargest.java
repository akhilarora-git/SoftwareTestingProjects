package TasksJava11x;

public class Task11_Array_2ndLargest {
    public static void main(String[] args) {
        int[] arr = {12, 33, 21, 42, 15, 62};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }
}
