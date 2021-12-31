package 상담원_package;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		System.out.println("전화 상담원 할당 방식을 선택하시오");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객우선 숙련고 높은 상담원");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		스케줄을결정해주는상담원 scheduler = null;
		
		if(ch=='R'||ch=='r') {
			scheduler = new RoundRobin();
		}
		
		else if(ch=='L'|| ch=='l') {
			scheduler = new LeastJob();
		}
		
		else if(ch=='P'|| ch=='p') {
			scheduler = new PriorityAllocation();
		}
		
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
