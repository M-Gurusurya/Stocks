
import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        findMaxProfit(array,size);
    }
    public static void findMaxProfit(int array[],int size)
    {
        int profit=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int index=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(min>array[i])
            {
                min=array[i];
                index=i;
            }
            else if(i>index && max<array[i])
            {
                max=array[i];
            }
        }
        System.out.println(max-min);
    }
}
