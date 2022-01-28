import java.util.Scanner;
public class  LongestIncreasingSubsequence
{
    public int[] LIS(int[] a)
    {        
        int n = a.length - 1;
        int[] b = new int[n + 1];  
        int[] c = new int[n + 1]; 
        int k = 0;
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
            for (int ans = k ; ans >= 1; ans--)
            {
                if (a[b[ans]] < a[i])
                {
                    j = ans;
                    break;
                }
            }            
            c[i] = b[j];
            if (j == k || a[i] < a[b[j + 1]])
            {
                b[j + 1] = i;
                k = Math.max(k,j + 1);
            }
        }
        int[] result = new int[k];
        int ans = b[k];
        for (int i = k - 1; i >= 0; i--)
        {
            result[i] = a[ans];
            ans = c[ans];
        }
        return result;             
    }
    public static void main(String[] args) 
    {    
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter numbers");
        
        int n = Scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" elements");
        
        for (int i = 1; i <= n; i++)
            arr[i] = Scan.nextInt();
 
        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence(); 
        int[] result = obj.LIS(arr);       
 
        System.out.print("\n Longest Increasing Subsequence : ");
        
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
    }
}
