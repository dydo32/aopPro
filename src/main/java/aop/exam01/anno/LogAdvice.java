package aop.exam01.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
//모든 클래스에 적용할 공통의 모듈 - 비지니스로직 외적인 부분이지만 늘 많은 메소드에 적용
@Service
//aop를 적용할 advice임을 나타내는 어노테이션 기호를적용(공통모듈이라고 정의)
@Aspect
public class LogAdvice {
	//어노테이션으로 포인트컷을 정의하는 경우 메소드를 반드시 한 개 정의해서 메소드 위에 패턴을 정의
	//메소드위에 @Pointcut이라는 어노테이션을 적용
	//이렇게 작업해야 메소드명이 포인트컷 명으로 인식
	
	@Pointcut("execution(* aop.exam01.anno.*.get*(..))")
	public void mylogPointcut() {}
	
	//정의한 포인트컷을 적용(메소드 실행 후)
	@After("mylogPointcut()")
	public void log(){
		System.out.println("================== 로그기록 ==================");
	}
}
