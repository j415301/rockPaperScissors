package com.kh.game.model.vo;

import java.util.Scanner;

import com.kh.game.controller.Controller;

public class RockPaperScissors {
	
	private Controller c = new Controller();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		boolean flag = true;
		System.out.println("���� ���� �� ������ �����մϴ�.");
		do {
			System.out.print("���� ���� �� �� �� ���� �Է��ϼ��� : ");
			String insertRps = sc.next();
			int pcNum = (int)(Math.random()*3)+1;
			System.out.println(pcNum);
			String pcRps = "";
			if (pcNum==1) pcRps = "����";
				else if (pcNum==2) pcRps = "����";
				else pcRps = "��";
			if (insertRps.equals(pcRps)) {
				System.out.println("����� "+insertRps+"�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� "+pcRps+"�� �½��ϴ�.");
				System.out.println("�����ϴ�. �ٽ� �����մϴ�.");
			} else if ((insertRps.equals("����") && pcNum==3) || (insertRps.equals("����") && pcNum==1) ||
					(insertRps.equals("��") && pcNum==2)) {
				System.out.println("����� "+insertRps+"�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� "+pcRps+"�� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�!");
				flag = false;
			} else {
				System.out.println("����� "+insertRps+"�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� "+pcRps+"�� �½��ϴ�.");
				System.out.println("����� �����ϴ�!");
				flag = false;
			}
		} while (flag);
	}
	
}
