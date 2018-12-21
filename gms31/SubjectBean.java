package gms31;

public class SubjectBean {
	private String subjName, profName;
	private int score;
	
	public void setSubjName(String sub){
		this.subjName = subjName;
	}
	public String getSubjName(){
		return subjName;
	}
	public void setProfName(String pro){
		this.profName = profName;
	}
	public String getProName(){
		return profName;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	public String toString(){
		return String.format("성적표\n"
				+ "과목: %s \n"
				+ "교수: %s \n"
				+ "점수: %d \n",  subjName, profName, score);
	}	
}
