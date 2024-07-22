import java.util.Scanner;
class bubbleSort
{
    static void bubbleSort1(int[] a)
    {
        int n=a.length;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
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
        bubbleSort1(a);
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
