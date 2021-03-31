import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_sort_rotate_pair_sum {
    //O(n)
    static boolean pair(List<Integer> a,int n , int x){
        int i;
        for(i=0;i<n-1;i++)
            if(a.get(i)>a.get(i+1)) break;
        int l = (i+1)%n;
        int r =i;
        while (l!=r){
            if(a.get(l)+a.get(r)==x) return true;
            if(a.get(l)+a.get(r)<x) l = (l+1)%n;
            else r = (n+r-1)%n;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>(n);
        int sum = sc.nextInt();
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            a.add(s);
        }
        if(pair(a,n,sum)) System.out.println("Array has two elements");
        else System.out.println("Doesnt have");
    }
}
