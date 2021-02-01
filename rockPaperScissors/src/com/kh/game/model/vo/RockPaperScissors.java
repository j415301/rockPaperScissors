package com.kh.game.model.vo;

import java.util.Scanner;

import com.kh.game.controller.Controller;

public class RockPaperScissors {
	
	private Controller c = new Controller();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		boolean flag = true;
		System.out.println("가위 바위 보 게임을 시작합니다.");
		do {
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String insertRps = sc.next();
			int pcNum = (int)(Math.random()*3)+1;
			System.out.println(pcNum);
			String pcRps = "";
			if (pcNum==1) pcRps = "가위";
				else if (pcNum==2) pcRps = "바위";
				else pcRps = "보";
			if (insertRps.equals(pcRps)) {
				System.out.println("당신은 "+insertRps+"를 냈습니다.");
				System.out.println("컴퓨터는 "+pcRps+"를 냈습니다.");
				System.out.println("비겼습니다. 다시 시작합니다.");
			} else if ((insertRps.equals("가위") && pcNum==3) || (insertRps.equals("바위") && pcNum==1) ||
					(insertRps.equals("보") && pcNum==2)) {
				System.out.println("당신은 "+insertRps+"를 냈습니다.");
				System.out.println("컴퓨터는 "+pcRps+"를 냈습니다.");
				System.out.println("당신이 이겼습니다!");
				flag = false;
			} else {
				System.out.println("당신은 "+insertRps+"를 냈습니다.");
				System.out.println("컴퓨터는 "+pcRps+"를 냈습니다.");
				System.out.println("당신이 졌습니다!");
				flag = false;
			}
		} while (flag);
	}
	
}
