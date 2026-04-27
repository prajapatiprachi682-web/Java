package DSA.Array;

public class A2 {
    public static void main(String[] args) {
        int[] arr ={10, 25, 7, 99, 45};

        int min= arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum element= "+ min);
    }
}
