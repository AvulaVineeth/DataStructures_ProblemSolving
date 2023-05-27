import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Countzero {
	
	static ArrayList<S> findSubArrays(int[] arr, int n)
    {    
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
            ArrayList<S> out = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum = sum+arr[i];
                if (sum == 0)
                    out.add(new S(0, i));
                ArrayList<Integer> al = new ArrayList<>();
            
                if (map.containsKey(sum))
                {
                    al = map.get(sum);
                    for (int j = 0; j < al.size(); j++)
                    {
                            out.add(new S(al.get(j) + 1, i));
                    }
                }
                al.add(i);
                map.put(sum, al);
            }
            return out;
    }
	
	static void print(ArrayList<S> out)
    {
            for (int i = 0; i < out.size(); i++)
            {
                S s = out.get(i);
                System.out.println(s.a+"  " +s.b);
            }
    }

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
		
		ArrayList<S> out = findSubArrays(array, n);
        if (out.size() == 0)
            System.out.println("No subarray exists");
        else
            print(out);
		
	}

}
class S
{
    int a, b;
    S(int a, int b)
    {
        this.a = a;
        this.a = b;
    }
}
