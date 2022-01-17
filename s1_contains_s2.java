import java.util.*;
public class s1_contains_s2 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]="sgfkjillfrgachk".split("");
		String stx[]="skillrack".split("");
		int down = 0;
		int up =0;
		
		while(up<str.length){
		    if(str[up].equals(stx[down])){
		        down++;
		    }
		    up++;
		    if(down == stx.length){
		        System.out.println("YES");
		        return;
		    }
		}
		//System.out.println(down);
		System.out.print("NO");
	}
}


