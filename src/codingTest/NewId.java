package codingTest;

public class NewId {

	public static void main(String[] args) {
//		String new_id = "...!@bat#*..y.abcdefghijklm";
//		String new_id = "123_.def";
		String new_id = "=.=";
		String[] sp = {"~","!","@","#","$","%","^","&","*","(",")","=","+","[","{","]","}",":","?",",","<",">","/"};
		//		1단계
		String[] mm;
		new_id = new_id.toLowerCase();
		
		System.out.println(new_id);
//		2단계
		for(int i=0; i<sp.length; i++) {
			new_id = new_id.replace(sp[i],"");
		}
		System.out.println(new_id);
//		3단계
		for(;;) {
			new_id = new_id.replace("..", ".");
			if(!new_id.contains("..")) {
				break;
			}
				
		}
		System.out.println(new_id);
//		4단계
		if(new_id.substring(0,1).equals(".")) {
			new_id = new_id.replaceFirst(".", "");			
		}
		//마지막 . 제거
		if(new_id.length() >0) {
			if(new_id.substring(new_id.length()-1, new_id.length()).equals(".")) {
				new_id = new_id.replaceFirst(".$","");			
			}	
		}
		
			
		System.out.println(new_id);
//		5단계
		if(new_id.equals("")) {
			new_id = "a";
		}
		System.out.println(new_id);
//		6단계
		if(new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
		}
		System.out.println(new_id);
//		7단계
		mm = new_id.split("");
		if(mm.length<3) {
			for(int i=mm.length; i<3; i++) {
				new_id += mm[mm.length-1];
			}
		}
		//마지막 . 제거
		if(new_id.length() >0) {
			if(new_id.substring(new_id.length()-1, new_id.length()).equals(".")) {
				new_id = new_id.replaceFirst(".$","");			
			}	
		}
		System.out.println(new_id);
	}


}
