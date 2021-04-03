import java.util.*;
@FunctionalInterface
interface MyInterface{
    String print(String n);
}
public class String_traversal {
    public static void main(String [] args){
        String s = "Siddharth";
        MyInterface mystr = (str) ->{
          for(int i=0;i<str.length();i++){
              System.out.println(str.charAt(i));
          }
            return str;
        };
        System.out.println(mystr.print(s));
    }
}
