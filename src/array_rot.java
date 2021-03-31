import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class array_rot {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> ar = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            ar.add(s);
        }
        for(int i=0;i<d;i++){
            int j,temp;
            temp = ar.get(0);
            for(j=0;j<n-1;j++){
                ar.set(j,ar.get(j+1));
            }
            ar.set(n-1,temp);
        }
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i) + " ");
        }
    }
}
