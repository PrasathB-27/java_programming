import java.util.*;
    public class substring {
        public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
String str[]=sc.nextLine().split("");
String s="";
List<String> l =new ArrayList<String>();
int f=0;
for(int i=0;i<str.length;i++){
    for(int j=i;j<str.length;j++)
    {
        if(s.contains(str[j])){
            if(s.length()>=3){
                l.add(s);
                f=1;
            }
            s="";
            break;
        }
        else{
            s=s+str[j];
        }
    }
}   
if(f==0) {System.out.print("-1"); return ;}
String st="";
for(int i=0;i<l.size();i++){
    int a=l.get(i).length();
    if(st.length() < a){
        st=l.get(i);
    }
} 
System.out.print(st);
        }
     }
 

  