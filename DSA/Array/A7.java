class A7 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 99, 45};

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        System.out.println("Product = " + product);
    }
}

