package ����_package;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		System.out.println("��ȭ ���� �Ҵ� ����� �����Ͻÿ�");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���ð� ���� ����");
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		���������������ִ»��� scheduler = null;
		
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
