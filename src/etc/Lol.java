package etc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Lol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		int level;
		int count = 0;
		for (;;) {
			String a = sc.nextLine();
			boolean isNumeric = a.matches("[+-]?\\d*(\\.\\d+)?");
			if (isNumeric) {
				level = Integer.parseInt(a);
				break;
			} else {
				String cham = a.substring(0, a.indexOf("("));

				map.put(cham, a.substring(2).replace("(", "").replace(")", "").trim().split(","));
			}

		}

		String[] cham = new String[map.size()];

//		Å°°ª ²¨³»±â
		int q = 0;
		for (String key : map.keySet()) {
			String[] values = map.get(key);
			cham[q] = key;
			q++;
			for(int n = 0; n<values.length; n++) {
				if(values[n].equals("ºÀ¼âÀÚ")) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(count);
			}
			count=0;
		}

//		Æ¯¼º Ãâ·ÂÇÏ±â
		for (int i = 0; i < cham.length; i++) {
//			Ã¨ÇÁ¸í
			System.out.print(cham[i] + " : ");

			for (int k = 0; k < map.get(cham[i]).length; k++) {
				System.out.print(map.get(cham[i])[k] + " ");
			}
			System.out.println();
//			String cm = cham[i];
//			for(int j =0; j<map.get(cham[i]).length; j++)
//			System.out.println(j);
		}
	}

}
