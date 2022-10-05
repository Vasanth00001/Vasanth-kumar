package com.vasanth;
class SeriesOverloading {
	void sumseries(int n,double x) {
		double ssum =0;
		for (int i=1;i<=n;i++) {
			if(i%2==0) {
				ssum=ssum-(double)x/i;
			}else {
				ssum=ssum+(double)x/i;
				
			}		
		}
		System.out.println(" sum of (x/1)-(x/2)-(x/3)-(x/4)+(x/5) _ to n terms = "+ssum);		
	}
void sumseries() {
	int p=1,sum=0;
	for(int i=1;i<=20;i++) {
		p=1;
		for(int j=1;j<=i;j++) {
			p=p*i;
		}
		sum=sum+p;
		}
	System.out.println("sum of s = 1+(1x2)+(1x2x3)+....20)+ "+sum);
	}
}
public class SeriesOverLoad {

	public static void main(String[] args) {
		SeriesOverloading ob=new SeriesOverloading();
		ob.sumseries(2, 5);
		ob.sumseries();
		

	}

}
