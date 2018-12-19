package gms1;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
					+ "1. Student \n"
					+ "2. Subject \n")){
				case "0": JOptionPane.showMessageDialog(null, "종료"); return;
				case "1": 
					String hakbun = JOptionPane.showInputDialog("학번");
					String name = JOptionPane.showInputDialog("이름");
					String pass = JOptionPane.showInputDialog("학번");
					String ssn = JOptionPane.showInputDialog("학번");
					
					break;
				case "2": 
					
					break;
				
			}
		}
	}
}
