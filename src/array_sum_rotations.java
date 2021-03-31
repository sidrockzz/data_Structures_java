import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_sum_rotations {
    static int sum(List<Integer> a,int n){
        int sum =0;
        int currval=0;
        for(int i=0;i<a.size();i++){
            sum+=a.get(i);
            currval+=(i*a.get(i));
        }
        int max = currval;
        for(int j=1;j<a.size();j++){
            currval+= sum - a.size()*a.get(a.size()-j);
            if(currval>max) max =currval;
        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>a = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println(sum(a,n));
    }
}
