package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=8,fn=0,sn=1,total=0;
		for(int i=0;i<num;i++) {
			System.out.println(fn+" ");
			total=fn+sn;
			fn=sn;
			sn=total;
		}
	}

}
