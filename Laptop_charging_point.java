import java.util.*;
public class Laptop_charging_point {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char ch[]="*-*---L--*---*-L".toCharArray();
	    List<Integer> list = new ArrayList<Integer>();
	    for(int i=0;i<ch.length;i++){
	        if(ch[i]=='L'){
	            boolean l=false;
	            boolean r=false;
	            int c1=0,c2=0;
	            for(int j=i-1;j>=0;j--){
	                if(ch[j]=='#') {l=false; break;}
	                if(ch[j]=='*') {c1++; l=true; break;}
	                c1++;
	            }
	            for(int j=i+1;j<ch.length;j++){
	                if(ch[j]=='#') {r=false; break;}
	                if(ch[j]=='*') {c2++; r=true; break;}
	                c2++;
	            }
	            if(l==false && r==false){list.add(-1); continue;}
	            if(l==false){list.add(c2); continue;}
	            if(r==false){list.add(c1); continue;}
	            if(c1<=c2) list.add(c1);
	            else list.add(c2);
	        }
	    }
	    for(int i=0;i<list.size();i++){
	       System.out.print(list.get(i)+" ");
	    }
        sc.close();
	}
}

// to Do: print the minimum distance between chraging point and Laptop

//Readme:
// '*'- charging Laptop
// '#'- wall, which denotes that a laptop could not be charged
// '-'- free spaces