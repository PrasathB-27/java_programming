import java.util.*;
public class edges_with_same_alpabet_triangle {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("*".repeat(a-1)+'a');
		
		for(int i=1;i<a-1;i++){
		    System.out.println("*".repeat(a-i-1)+'c'+"*".repeat(Math.abs((a-i+1)-(a+i)))+'a');
		}
		
		System.out.println('c'+" b".repeat(a-1));
		
	}
}

