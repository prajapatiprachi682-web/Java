import java.util.ArrayList;

public class p5 
{
    public static void main(String[] args){
        try 
        {
            voteAge(15);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        try
        {
            voteAge(19);
        }
        catch(Exception e)    
        {
            System.out.println(e);
        }
    }

    static void voteAge(int age)
    {
        System.out.println("check for vote");

        if(age < 18)
        {
            throw new IllegalArgumentException("aap vote nhi de sakte");
        }
        else
        {
            System.out.println("aap vote de sakte ho");
        }
    }   
}
