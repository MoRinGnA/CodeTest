import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        HashSet<String> set =  new HashSet<>();
        
        
        String S = sc.nextLine();   
        
        for(int i=0;i<S.length();i++) {
            for(int j=i+1;j<=S.length();j++) {
                set.add(S.substring(i,j));
            }
        }
        System.out.println(set.size());
        
        
    
    
    
    }
}