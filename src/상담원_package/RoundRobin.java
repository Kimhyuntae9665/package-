package 상담원_package;

public class RoundRobin implements 스케줄을결정해주는상담원{
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 배분합니다.");
	}

}

class LeastJob implements 스케줄을결정해주는상담원{
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("현제 상담업무가 없거나 상담대기가 가장 적은 상담원에게 할당합니다");
	}
	
}


class PriorityAllocation implements 스케줄을결정해주는상담원{
	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원에게 먼저 배분합니다.");
	}
}
