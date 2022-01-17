import java.util.Collection;
import java.util.*;
public class no_of_occurence {
    public static void main(String[] args){
        String s=sc.nextLine();
        int c[]=new int[26];
        for(int i=0;i<26;i++){
           c[i]=0;
        }
        for(int j=0;j<s.length();j++){
            c[s.charAt(j)]++;
        }
        Arrays.sort(c,Collection.reverseOrder());
    }
}
