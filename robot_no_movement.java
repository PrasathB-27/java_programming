import java.util.*;
public class robot_no_movement {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c1=sc.nextInt();
		sc.nextLine();
		String s[]=sc.nextLine().split(" ");
		int c=0;
		int row=a,col=0;
		int p=col;
		int q=row;
		for(int i=0;i<c1;i++){
		    String str=s[i];
		  //  append(s[i]);
		  //  System.out.print(Arrays.toString(s1));
		  //  int p=col;
		  //  int q=row;
		        if((str.substring(str.length()-1)).equals("R")) {
		            col=col+(Integer.parseInt(str.substring(0,str.length()-1)))-1;
		            if(col>=b) {c++; col=p;}
		        } 
		        else if((str.substring(str.length()-1)).equals("L")){
		            col=col-(Integer.parseInt(str.substring(0,str.length()-1)))+1;
		            if(col<0) {c++; col=p;}
		        }
		        else if((str.substring(str.length()-1)).equals("F")){
		            row=row-(Integer.parseInt(str.substring(0,str.length()-1)))+1;
		            if(row<0){c++; row=q;}
		        }
		        else if((str.substring(str.length()-1)).equals("B")){
		            row=row+(Integer.parseInt(str.substring(0,str.length()-1)))-1;
		            if(row>=a){c++; row=q;}
		        }
		}
		System.out.print(c);
// 		10
// 		10
// 		12
// 		5F 8L 4F 8B 10R 6F  8B 7L 4R 3L 2L 5F
	}
}