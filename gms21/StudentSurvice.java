package gms21;

import java.util.Random;

public class StudentSurvice {
	
	public String hakbun(){
		Random random = new Random();
		String studentNum="";
		
		for(int i=0; i<4; i++){
			studentNum += random.nextInt(10)+"";
		}
		return studentNum;
	}
}
