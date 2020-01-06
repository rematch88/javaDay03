package javaday03;

public class ArrayCal {

	public static void main(String[] args) {
		int [] ar = {40, 37, 51, 65, 29};
		//합계
		int sum = 0;
		for(int data : ar) {
			sum = sum + data;
		}
		System.out.print("합계:"+sum+"\n");
		
		
		//50이 넘는 데이터 개수
		int cnt = 0;
		for(int data : ar) {
			if(data>50) {cnt = cnt + 1;}
			}
		System.out.print("50이 넘는 데이터 개수:" + cnt + "\n");
		
		//30이 넘는 데이터의 평균을 소수 첫째 자리에서 반올림
		int cnt1 = 0;
		int sum1 = 0;
		for(int data : ar) {
			if(data>30) {
				cnt1 = cnt1 + 1;
				sum1 = sum1 + 1;
			}
		}
		
		if(cnt1 == 0) {
			System.out.print("조건을 만족하는 데이터 없음");
		}
		else {
			double arg = (double)sum1/cnt1;
			int result = (int)(arg + 0.5);
			System.out.print("평균:" + result);
		}
		
		
		//최대값
		int max = ar[0];
		for(int data : ar) {
			if(max < data) {
				max = data;
			}
		}
		System.out.print("최대값:"+max);
		
		//최소값
		int min= ar[0];
		for(int data : ar) {
			if(min > data) {
				min = data;
			}
		}
		System.out.print("최소값:"+min);
		
		
		
	}

}
