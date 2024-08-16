package testForLecture;
import java.io.InputStreamReader;
import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		int num,fd,sd,td,fod,fid,rn;
		Scanner sc= new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter a five digits number:");
		num=sc.nextInt();
		fd=num/10000;
		sd=num%10000/1000;
		td=num%1000/100;
		fod=num%100/10;
		fid=num%10;
		rn=fid*10000+fod*1000+td*100+sd*10+fd*1;	
		System.out.println("Original number:"+num);
		System.out.println("Reverse number:"+rn);
	}
}