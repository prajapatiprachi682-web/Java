class A5 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 99, 45};

        int i = 1; // first index
        int j = 3; // second index

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}