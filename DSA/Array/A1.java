package DSA.Array;

public class A1 
{
    public static void main(String[] args) {
        int[] arr = {10,25,38,9,77,43};
        int max =arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element ="+max);
    }
}
