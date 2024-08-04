import java.util.Scanner;
public class heapSort 
{
    static void heapSort1(int a[]) 
    {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            heapify(a, n, i);
        }
        for (int i = n - 1; i > 0; i--) 
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
    static void heapify(int a[],int n,int i)
    {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2;
        if (left < n && a[left] > a[largest]) 
        {
            largest = left;
        }
        if (right < n && a[right] > a[largest]) 
        {
            largest = right;
        }
        if (largest != i) 
        {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;
            heapify(a, n, largest);
        }
    }
    public static void main(String args[]) 
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("Array before sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        heapSort1(a);
        System.out.println("Array after sorting:");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time: " + timeTaken + " milliseconds");
    }
}

