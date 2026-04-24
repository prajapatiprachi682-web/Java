package DSA;

public class JavaAraay3 {
    public static void main(String[] args) {
        
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    int min=arr[0];
    int max=arr[0];
    int sum=0;

    for(int i=0; i<n; i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        else if(arr[i]>max)
        {
            max=arr[i];
        }
        sum=sum+arr[i];
    }
    double avg = (double) sum / n;

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Average = " + avg);
}
}