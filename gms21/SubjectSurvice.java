package gms21;

import bank21.AccountBean;

public class SubjectSurvice {
	public String showRecord(String hakbun, 
			String name, 
			String subjName, 
			int score) {
		return String.format("학번: %s\n"
				+ "이름: %s\n"
				+ "과목명: %s\n"
				+ "점수: %d", hakbun,name, subjName,score);
	}
}