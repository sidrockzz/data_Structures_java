import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_sort_search {
    static int search(List<Integer> a,int l,int h,int key){
        if(l>h) return -1;
        int mid = (l+h)/2;
        if(a.get(mid)==key) return mid;
        if(a.get(l)<=a.get(mid)){
            if(key>=a.get(l) && key <= a.get(mid)) return search(a,l,mid-1,key);
            return search(a,mid+1,h,key);
        }
        if(key>=a.get(mid)&& key<=a.get(h)) return search(a,mid+1,h,key);
        return search(a,l,mid-1,key);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int s = sc.nextInt();
            a.add(s);
        }
        int key = sc.nextInt();
        int i = search(a,0,n-1,key);
        if(i!=-1) System.out.println("Index: "+i);
        else System.out.println("Key not found");
    }
}
