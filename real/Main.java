package real;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog(
					"0.종료\n "
					+ "1.회원관리 \n"
					+ "2.계산기 \n"
					+ "3.구구단 \n"
					+ "4.로또 \n"
					+ "5.달력 \n");
			switch(menu) {
			case "0":
				JOptionPane.showMessageDialog(null,"시스템 종료");
				return;
			case "1":
				Member m = new Member();
				String name = JOptionPane.showInputDialog("이름 입력");
				m.name = name;
				JOptionPane.showMessageDialog(null,
						String.format("환영합니다 %s 님", m.name));
				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴] \n"
						+ "1. BMI(키, 몸무게) \n"
						+ "2. 학점(국어, 영어, 수학, 과학, 사회) \n"
						+ "3. 성별체크(SSN)");
				switch (mMenu) {
				case "1":
					String[] arr = JOptionPane.showInputDialog(null,
							"키,몸무게 입력").split(",");
					JOptionPane.showMessageDialog(null,
							String.format("%s 님은 %s 입니다.", 
									m.name,	m.bmi(arr)));
					break;
				case "2":
					String[] score = JOptionPane.showInputDialog(null,"국,영,수,사,과 점수 입력").split(",");
					//String grade =m.grade(score);
					JOptionPane.showMessageDialog(null,
							String.format("%s님의 학점은 %s입니다", m.name, m.grade(score)));
					break;
				case "3":
					String ssn = JOptionPane.showInputDialog(null,"주민등록번호를 입력하세요.");
					//String genderChecker = m.genderChecker(ssn);
					
					JOptionPane.showMessageDialog(null, 
							String.format("%s님의 성별은 %s입니다.", m.name,m.genderChecker(ssn)));
					break;
				}
			case "2":
				Calc calc = new Calc();
				String[] add = JOptionPane.showInputDialog(null, "숫자,연산자,숫자 입력").split(",");
				//String plus = calc.plus(add);
				JOptionPane.showMessageDialog(null,String.format("%s",calc.plus(add)));
				break;
			case "3":
				Calc calc2 = new Calc();
				String dan = JOptionPane.showInputDialog(null,"단을 입력하세요");
				JOptionPane.showMessageDialog(null, String.format("%s", calc2.gugudan(dan)));
				break;
			case "4":
				Lotto lotto = new Lotto();
				JOptionPane.showMessageDialog(null, String.format("%s", lotto.randomNum()));
				break;
			case "5":
				MyCalender calender = new MyCalender();
				
				break;
			}
		}
		
	}
}