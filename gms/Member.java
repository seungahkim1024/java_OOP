package gms;

public class Member {
	String name; //멤버변수(멤버변수는 초기화 하지않는다.)

	public String bmi(String[] arr){
		String bmi = ""; //지역변수 -> 로컬변수
		double wei2, hei2, hei3, bmi2 = 0.0;
		
		hei2 = Double.parseDouble(arr[0]);
		wei2 = Double.parseDouble(arr[1]);
		hei3 = hei2*0.01;
		bmi2= wei2/(hei3*hei3);		
		
		
		if(bmi2>40.0){
			bmi = "고도비만";
		}else if(bmi2>=35.0){
			bmi = "중등비만";
		}else if(bmi2>=30.0){
			bmi = "경도비만";
		}else if(bmi2>=25.0){
			bmi = "과체중";
		}else if(bmi2>=18.5){
			bmi = "정상";
		}else {
			bmi = "저체중";
		}
		return bmi;
	} // bmi end
	
	public String grade(String[]score){
		String res=""; //로컬변수는 반드시 초기화 해야한다. 원치않는 값이 할당됨.
		/*
		 국어, 영어, 수학, 과학, 사회 과목 점수를 입력받아서 평균을 낸뒤
		 100~90 A, 89~80 B, 79~70 C, 69~60 D, E, F 내기.
		 */
		
		int ave = 0;
		int sum = 0;
		int[] ave1 = new int[5];
		for(int i=0; i<score.length;i++){
			ave1[i]=Integer.parseInt(score[i]);
			sum+=ave1[i];
		}
		
		ave = sum/5;
		
		if(ave>101){
			res = "잘못된 결과입니다.";
		}else if(ave>=90){
			res = "A";
		}else if(ave>=80){
			res = "B";
		}else if(ave>=70){
			res = "C";
		}else if(ave>=60){
			res = "D";
		}else if(ave>=50){
			res = "E";
		}else{res = "F";}
		
		return res;
		
	}

	public String genderChecker(String ssn){
		String checker = "";
		
		char ch = ssn.charAt(7);
		
		switch(ch){
		case '1': case '3': checker = "남자";break;
		case '2': case '4': checker = "여자";break;
		case '5': case '6': checker = "외국인";break;
		case '0': case '7': case '8': case '9': checker = "입력오류";
		break;
		}
		
		return checker;
	}
	
}



