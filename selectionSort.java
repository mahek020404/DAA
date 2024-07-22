import java.util.Scanner;
public class selectionSort 
{
    static void selectinSort(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[index]>a[j])
                {
                    index=j;
                }
            }
            int temp=a[index];
            a[index]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int a[]= new int[n];
        System.out.println("Enter "+n+" integer:");
        long startTime=System.currentTimeMillis();
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        selectinSort(a);
        System.out.println("Array after sorting:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        long endTime=System.currentTimeMillis();
        long timeTaken=endTime-startTime;
        System.out.println("Time:"+timeTaken);
    }   
}
