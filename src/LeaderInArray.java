import java.util.ArrayList;
import java.util.Scanner;

public class LeaderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i< array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        leaderOfArray(array,size);
    }
    public static void leaderOfArray(int array[],int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int min =Integer.MIN_VALUE;
        for(int i=size-1;i>=0;i--)//checking from last element to find greater
        {
            if(array[i]>=min)
            {
                min=array[i];
                list.add(array[i]);
            }
        }
        //System.out.println(list);
        reverseArray(list);
    }
    public static void reverseArray(ArrayList list)
    {
        int i=0;
        int j=list.size()-1;
        while(i<j)
        {
            int temp = (int) list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
    }

}
//Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
// An element is a leader if it is strictly greater than all the elements to its right side.
//PS: The rightmost element is always a leader.
//Input
//A = [16, 17, 4, 3, 5, 2]
//Output
//[17, 2, 5]
