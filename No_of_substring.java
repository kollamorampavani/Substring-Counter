package strings;
import java.util.Scanner;
public class No_of_substring {
	public static int count_substring(String s1,String s2) {
    	int size=s2.length(),count=0;
    	for(int i=0;i<=s1.length()-size;i++) {
			String t="";
			for(int j=i;j<i+size;j++) {
				t=t+s1.charAt(j);
			}
			if(t.equals(s2)) {
			 count++;
			}
    	}
	    return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter string and substring");
	     String s1=scan.nextLine();
	     String s2=scan.nextLine();
	     int res=count_substring(s1,s2);
	     System.out.println(res);
	}

}
