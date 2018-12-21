package gms31;

import javax.swing.JOptionPane;
/*성적표에 표시될 내용: 
 * 학번(Student)
 * 학생이름(Student)
 * 과목명(Subject)
 * 점수(Subject)
 * */
public class Main {
	public static void main(String[] args) {
	
		while(true){
			switch(JOptionPane.showInputDialog(
					"[메뉴] 0.종료 \n"
							+ "1.학생부등록 \n"
							+ "2.비번변경 \n"
							+ "3.회원정보보기 \n"
							+ "4.수강과목등록 \n"
							+ "5.교수등록 \n"
							+ "6.점수등록 \n"
							+ "7.성적표보기 ")){
							case "0": JOptionPane.showMessageDialog(null, "종료"); return;
							case "1":
								String studentnumber = JOptionPane.showInputDialog("이름");
								StudentBean bean = new StudentBean();
								
			}
		}
	}
}
	