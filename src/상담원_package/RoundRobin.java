package ����_package;

public class RoundRobin implements ���������������ִ»���{
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");
	}

}

class LeastJob implements ���������������ִ»���{
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ����Ⱑ ���� ���� �������� �Ҵ��մϴ�");
	}
	
}


class PriorityAllocation implements ���������������ִ»���{
	@Override
	public void getNextCall() {
		System.out.println("������� ���� ���� call�� ���� �����ɴϴ�.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����մϴ�.");
	}
}
