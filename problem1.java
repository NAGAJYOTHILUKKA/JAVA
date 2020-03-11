import java.lang.*;
import java.util.*;
class problem1{
	public static void main(String args[]){
     String s;
     Scanner sc=new Scanner(System.in);
     s=sc.nextLine();
     s = s.replaceAll("([A-Z])[\\w]*\\s*[a-z]*\\s*","$1.").toUpperCase();
     System.out.println(s);

	}
}
