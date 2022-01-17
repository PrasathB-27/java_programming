import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        Stack<String> stk = new Stack<>();  
        for(int i=0;i<a;i++){
            String str[]=sc.nextLine().split("");
            for(int j=0;j<str.length;j++){
                if(str[j].equals("^") && stk.empty()==false){
                    stk.pop();
                }
                else if(!(str[j].equals("^"))){
                    stk.push(str[j]);
                }
            }
            if(stk.empty()==true) System.out.print("-1");
            else {
                for(int k=0;k<stk.size();k++){System.out.print(stk.get(k));}
            }
            stk.clear();
            System.out.println("");
        }
        
	}
}