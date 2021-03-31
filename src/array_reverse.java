import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_reverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<Integer>(n);
        List<Integer> revar = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            ar.add(s);
        }
        for(int i= ar.size()-1;i>=0;i--){
            revar.add(ar.get(i));
        }
        for(int i=0;i<n;i++){
            System.out.print(ar.get(i)+ " ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(revar.get(i)+" ");
        }
    }
}
