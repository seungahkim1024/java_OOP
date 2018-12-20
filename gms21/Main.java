package gms21;

import javax.swing.JOptionPane;
/*성적표에 표시될 내용: 
 * 학번(Student)
 * 학생이름(Student)
 * 과목명(Subject)
 * 점수(Subject)
 * */
public class Main {
	public static void main(String[] args) {
		StudentBean student = null;
		SubjectBean subject = null;
		StudentSurvice ss = new StudentSurvice();
		SubjectSurvice sub = new SubjectSurvice();
		
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
								String name = JOptionPane.showInputDialog("이름");
								String ssn = JOptionPane.showInputDialog("주민등록번호");
								String pass = JOptionPane.showInputDialog("비밀번호");
								student = new StudentBean();
								student.setName(name);
								student.setPass(pass);
								student.setSsn(ssn);
								break;
							case "2":
								String newpass = JOptionPane.showInputDialog("비밀번호");
								student.setPass(newpass);
								break;
							case "3":
								String studentNum = ss.hakbun();
								student.setHakbun(studentNum);
								JOptionPane.showMessageDialog(null,student.toString());
								break;
							case "4":
								String sub2 = JOptionPane.showInputDialog("과목입력");
								subject = new SubjectBean();
								subject.setSubjName(sub2);
								JOptionPane.showMessageDialog(null, "수강신청 완료");
								break;
							case "5":
								subject.setProfName(JOptionPane.showInputDialog("교수명입력"));
								JOptionPane.showMessageDialog(null, "등록완료");
								break;
							case "6":
								String score1 = JOptionPane.showInputDialog("점수");
								int score = Integer.parseInt(score1);
								JOptionPane.showMessageDialog(null, "등록완료");
								break;
							case "7":
								String record = sub.showRecord(
										student.getHakbun(),
										student.getName(),
										subject.getSubjName(),
										subject.getScore());
								JOptionPane.showMessageDialog(null,record);
								break;

			}
		}
	}
}
	