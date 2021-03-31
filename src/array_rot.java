import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class array_rot {
    static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> ar = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            ar.add(s);
        }
        d = d%n;
        int i,j,k,temp;
        int gcd = gcd(d,n);
        for(i=0;i<gcd;i++){
            temp = ar.get(i);
            j=i;
            while (true){
                k = j+d;
                if(k>=n) k = k-n;
                if(k==i) break;
                ar.set(j,ar.get(k));
                j=k;
            }
            ar.set(j,temp);
        }
        for(i=0;i<n;i++){
            System.out.print(ar.get(i) + " ");
        }
    }
}
