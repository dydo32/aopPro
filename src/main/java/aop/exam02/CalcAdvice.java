package aop.exam02;

import java.util.Random;

public class CalcAdvice {
	int num; //랜덤수를 저장하기 위한변수
	public void setNum() {
		Random r = new Random();
		num = r.nextInt(100)+1;
		System.out.println("------------------------");
		System.out.println("랜덤수==>"+num);
		System.out.println("------------------------");
	}
	
	//aop.exam02패키지의 모든 클래스 모든 메소드가 정상 실행된 후에 실행할 cross-cutting concern의 메소드
	//- 1부터 100까지의 랜덤수까지의 합계
	public void calc() {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println("========================");
		System.out.println("합계=>" + sum);
		System.out.println("========================");
	}
}
