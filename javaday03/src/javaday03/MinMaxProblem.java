package javaday03;

public class MinMaxProblem {

	public static void main(String[] args) {
		int [] ar = {30, 47, 51, 27, 38};
		//위 배열에서 최대값 구하기
		int max = 0;
		for(int data : ar) {
			if(max < data) {
				max = data;
			}
		}
		System.out.print("최대값:" + max +"\n");
		
		System.out.println("=========================");
		
		
		int [] ar1 = {-30, -47, -51, -27, -38};
		//위 배열에서 최대값 구하기
		int max1 = ar1[0];
		//0으로 하면 음수만 있을 때 최대 값이 0으로 나옴, 첫번째 값을 넣어서 초기화
		for(int data : ar1) {
			if(max1 < data) {
				max1 = data;
			}
		}
		System.out.print("최대값:" + max1 + "\n");
		
		System.out.println("=========================");
		
		//위의 데이터 배열에서 40과 가장 가까운 수 찾기
		int [] ar2 = {30, 47, 51, 27, 38};
		//위의 데이터 배열에서 40과 가장 가까운 수 찾기
		//40과의 차이가 최소인 데이터 찾기
		
		//첫번째 데이터와 40의 차이 계산하기
		//차이는 음수가 나올 수 없으므로 음수가 나오면 -1을 곱해서 양수로 만들기
		int chaMin = ar2[0] - 40;
		if(chaMin < 0) {
			chaMin = chaMin * -1;
		}
		//차이가 가장 작은 데이터의 값을 저장할 변수
		int first = ar2[0];
		
		//데이터 순회
		for(int data : ar2) {
			//40과의 차이 계산
			int cha = data - 40;
			if(cha < 0) {
				cha = cha * -1;
			}
			//차이가 최소인 데이터 찾기
			if(chaMin > cha) {
				//차이의 최소를 chaMin에 저장
				chaMin = cha;
				//차이가 최소인 데이터를 first에 저장
				first = data;
			}
		}
		System.out.print("40과 가까운 수:" + first + "\n");
		/*
		//두 점 사이의 거리 계산
		(x1, y1), (x2, y2)
		=>(x1 - x2)제곱 + (y1 - y2)제곱의 제곱근을 구하는 거리 계산 방법이 있는데 유클리디안 거리
		=>(x1 - x2)절대값 + (y1 - y2)절대값의 형태로 거리 계산하는 방법을 멘하탄 거리라고 합니다.
		*/
		
		
	}

}
