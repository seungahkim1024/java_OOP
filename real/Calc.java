package real;

public class Calc {
		
	 public String plus(String[] add){
		 String res = "";
		 int res1=0;
		 int[]add2 = new int[2];
		 int a=Integer.parseInt(add[0]);
		 int b=Integer.parseInt(add[2]);
		 
		 switch(add[1]){
		 case "+": res = a+b+"";break;
		 case "-": res = a-b+"";break;
		 case "*": res = a*b+"";break;
		 case "/": res = a/b+"";break;
		 case "%": res = a%b+"";break;
		 }
		
		 return res;
	 }
	 public String gugudan(String dan){
		 String res="";
		 String res2 = "";
		 int dan2, mul = 0;
		 dan2 = Integer.parseInt(dan);

		 for(int i=1; i<10; i++){
			 mul = dan2*i;
			 res+=dan2+"x"+i+"="+mul+"\n";
		 }
		 return res;
	 }

}
