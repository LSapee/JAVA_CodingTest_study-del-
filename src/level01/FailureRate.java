package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FailureRate {

	public static void main(String[] args) {
		
		int N = 5;
		int[] answer = new int[N];
		int[] stages = {1,1,4,3,2};
		int size = stages.length;
		float a = 0.0f;
		Arrays.sort(stages);
		int count =0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		Map<Integer, Float> map = new HashMap();
		
//		al��  �ֱ�
		for(int i =0; i<stages.length; i++) {
			al.add(stages[i]);
			
		}
//		Ȯ�� ���ϱ�
		for(int i=1; i<=N; i++) {
			if(i!=1) {
				size = size-count;				
			}
			count = Collections.frequency(al, i);
			a = (float)count/size;
			if(Float.isNaN(a)) {
				a =0;
			}
			map.put(i, a);
		}
		
		System.out.println(map);
//		�������� ���� value ��������
		List<Entry<Integer, Float>> list = new ArrayList<>(map.entrySet());
		list.sort(Collections.reverseOrder(Entry.comparingByValue()));
		
		for(int i=0; i<N; i++) {
			answer[i] =list.get(i).getKey();
		}
		System.out.println(Arrays.toString(answer));
	}

}
