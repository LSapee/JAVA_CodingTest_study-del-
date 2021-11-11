package level01;

public class Watermelon {

	public static void main(String[] args) {
//		수박수바수박수?
		int n =10;
		 String answer = "";
	        for (int i=0; i<n; i++){
	            if(i== 0){
	                answer += "수";
	            }else if(i == 1){
	                answer += "박";
	            }else if(i%2 == 0){
	                answer += "수";
	            }else{
	                answer +="박";
	            }
	        }

	}

}
