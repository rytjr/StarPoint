package StarPoint;

import java.util.*;
import java.io.*;

public class StarPoint {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int Num = Integer.parseInt(bf.readLine());
		
		char list[][] = new char[Num][Num];
		
		for(int i = 0; i < Num; i++) {
			for(int j = 0; j < Num; j++) {
				list[i][j] = '*';
			}
		}
		
		recursive(list, 0, Num -1);
		for(int i = 0; i < Num; i++) {
			for(int j = 0; j < Num; j++) {
				sb.append(list[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
		
	}
	
	public static void recursive(char list[][], int left, int right) {
		
		if(left < right) {
			
			int x = (right - left) / 3;
			
			for(int i = left + x; i < left + 2 * x; i++) {
				for(int j = left + x; j< left + 2 * x; j++) {
					list[i][j] = ' ';
				}
			}
			
			recursive(list, left, left + x -1);
			recursive(list, left + 2 * x + 1, right);
		}
	}

}
