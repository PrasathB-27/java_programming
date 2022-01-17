import java.util.*;
public class generate_key {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[]=sc.nextLine().split(" ");
		
		List<String> l = new ArrayList<String>();
		
		for(String s: str) l.add(s);
		
		String st="";
		for(int i=0;i<l.get(0).length();i++){
		    int m=(l.get(0).charAt(i))-'0';
		    for(int j=1;j<l.size();j++){
		       if(i%2==0){
		           if(m>(l.get(j).charAt(i))-'0'){
		               m=(l.get(j).charAt(i))-'0';
		           }
		       }
		       else{
		           if(m<(l.get(j).charAt(i))-'0'){
		               m=(l.get(j).charAt(i))-'0';
		           }
		       }
		    }
		    st=st+String.valueOf(m);
		}
		System.out.print(st);
	}
}

// Example 
// Input/Output 1:
// Input: 5107 1234 2948
// Output: 1908 
// Explanation: 
// The digits in the thousands place of all three integers are 5, 1 and 2. 
// Here 1 is the smallest digit, so 1 is printed. 
// The digits in the hundreds place of all three integers are 1, 2 and 9.
//  Here 9 is the largest digit, so 9 is printed. The digits in the tens place of all three integers are 0, 3 and 4.
//   Here 0 is the smallest digit, so 0 is printed. The digits in the units place of all three integers are 7, 4 and 8.
//    Here 8 is the largest digit, so 8 is printed.