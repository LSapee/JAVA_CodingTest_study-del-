package level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test010 {
	

	public static void main(String[] args) {
//		문자열 내맘대로 정렬하기 미완

//		String[] strings= {"car", "bed", "sun"};
				String[] strings= {"abcd", "abce", "cdx"};
		int n =1;
		Arrays.stream(strings);		
		String[] a = new String[strings.length]; 
		String[] answer = new String[strings.length];
		for(int i =0; i<a.length; i++) {
			a[i] = strings[i];
		}
		System.out.println(Arrays.toString(a));
		
		
		Map<String, Character> map = new HashMap<String,Character>();
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
			map.put(a[i], a[i].charAt(n));		
		}
		System.out.println(map);
		List<Map.Entry<String, Character>> list = new LinkedList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		for(int i =0; i<a.length; i++) {
			answer[i] = list.get(i).getKey();		
			}
		
		System.out.println(list);
		System.out.println(Arrays.toString(answer));
		

	}

}
