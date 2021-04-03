import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findTotalDistance {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            ar.add(s);
        }
        int result = 0;
        for(int i=0;i<n-1;i++){
            result = result + (Math.abs(ar.get(i)-ar.get(i+1)));
        }
        System.out.println(result);
    }
}
