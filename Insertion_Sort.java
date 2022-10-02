import java.util.Scanner;

public class Insertion_Sort 
{
    public static void main(String[] args) 
    {
        int n,i,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n=sc.nextInt();

        int[] a=new int[50];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(i=1;i<n;i++)
        {
             temp=a[i];
             int j=i-1;
             while(j>=0)
             {
                if(a[j]>temp)
                {
                   a[j+1]=a[j];
                   j--; 
                }
                a[j+1]=temp;
             }

        }
        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
    
}
