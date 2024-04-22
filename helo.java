public class helo {
    public static void allOccurrences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println("Key found at index " + i);
        }
        allOccurrences(arr, key, i + 1);
    }
}
