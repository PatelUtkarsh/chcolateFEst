package chcolateFEst;

import java.util.Scanner;

public class Choco {

	public static void main(String args[]){
		int count;
		Scanner scn= new Scanner(System.in);
		count=scn.nextInt();
		
		for (int i = 0; i < count; i++) {
			int n,c,m,result,tmp,tmp1;
			n=scn.nextInt();
			c=scn.nextInt();
			m=scn.nextInt();
			if((n>=2 && n<=100000) || (c>=1 && c<=n) || (m>=2 && m<=n)){
					result = n/c;
					tmp=result;
				while(tmp>=m){
					/*tmp-=m;
					result++;
					tmp++;*/
					tmp1= (int) Math.ceil(tmp/m);
					result+=tmp1;
				//	tmp = (tmp-((result-tmp)*m))+(result-tmp);
					tmp=tmp1+(tmp-(tmp1*m));
				}
				System.out.println(result);
			}
			else
				System.out.println(0);
		}
	}
}
