package codingTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bj_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] input = new String[n];
		
		for(int i=0; i<n; i++) {
			input[i] = sc.next();
		}
		
		
		
		ArrayList<String> words = new ArrayList<>(); //以묐났�젣嫄곕맖
		
		for(String item : input) {
			if(!words.contains(item)) {
				words.add(item);
			}
		}
		//以묐났�젣嫄�
		
		

	
		
		for(int i=0; i<words.size(); i++) {
			for(int j=0; j<words.size()-1; j++) {
				if(words.get(j).length() > words.get(j+1).length()) {
					Collections.swap(words, j, j+1); //�옄由ъ뒪�솞
				}
			}
		}
		//湲몄씠�닚�젙�젹
		
		for(int i=0; i<words.size();i++) {
			System.out.println(words.get(i));
		}
		System.out.println();
		
		char temp_word ='s';
		char temp_word2 = 's';	//鍮꾧탳�슜 �엫�떆
		for(int x=0; x<words.size(); x++) {
			for(int i=0; i<words.size()-1; i++) {
				if(words.get(i).length() == words.get(i+1).length()) {
					for(int j=0; j<words.get(i).length(); j++) {

						temp_word = words.get(i).charAt(j);
						temp_word2 = words.get(i+1).charAt(j);
						System.out.println(words.get(i) +" " +  words.get(i).charAt(j) +" " + words.get(i+1) + " " + words.get(i+1).charAt(j));
						if(temp_word == temp_word2) {
							continue;
							//char�삎�씠 媛숇떎硫� for臾몃떎�떆�룎由�
						}else {
							if(temp_word > temp_word2) {
								System.out.println("1踰덉씠�봽"+words.get(i) +" " +  words.get(i).charAt(j) +" " + words.get(i+1) + " " + words.get(i+1).charAt(j));
								Collections.swap(words, i+1, i);
								
							}
							
							//char�삎�씠 �떎瑜대떎硫� �궗�쟾�닚�씠誘�濡� �닽�옄媛� �옉��寃� �븵�쑝濡쒓컧
						}
						
						//�쁽�옱�떒�뼱�� �떎�쓬�떒�뼱�쓽 湲몄씠媛� 媛숈쓣寃쎌슦, for臾몄쑝濡� �븘�뒪�궎瑜� 戮묒븘媛�硫곕퉬援�
					}
				}else {
					continue;	//湲몄씠�떎瑜대�濡� �떎�쓬臾몄옄濡� �꽆�뼱媛�
				}
			}
		}
		//�궗�쟾�닚�젙�젹
		//1.�쁽�옱�� �씠�떎�쓬寃껋쓽 湲몄씠媛� 媛숈�吏�蹂몃떎
		//2.湲몄씠媛� �떎瑜대떎硫� �뙣�뒪.
		//3.湲몄씠媛� 媛숇떎硫� �뮮湲��옄瑜� for臾몄궗�슜鍮꾧탳�븳�떎
		
		for(int i=0; i<words.size();i++) {
			System.out.println(words.get(i));
		}
		

	}

}
