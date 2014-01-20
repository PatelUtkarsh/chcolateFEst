package chcolateFEst;

import java.util.Arrays;
import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		int count, k;
		Scanner scn = new Scanner(System.in);
		count = scn.nextInt();
		k = scn.nextInt();
		boolean flag = false;
		if (!((1 <= count) && (count <= Math.pow(10, 5))
				|| (1 <= k && k <= count)))
			flag = true;
		int value[] = new int[count];
		int min[] = new int[count];
		for (int i = 0; i < count; i++) {
			value[i] = scn.nextInt();
			if (!((0 <= value[i]) && (value[i] < Math.pow(10, 9))))
				flag = true;
		}

		if (flag) {
			System.out.println(0);
			System.exit(1);
		}
		int tmp[] = new int[count];
		for (int i = 0; i < count; i++) {
			tmp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < count; j++) {
				if (i == j)
					continue;
				tmp[j] = Math.abs((value[i] - value[j]));
			}
			min[i] = tmp[min(tmp)];
		}

		int candy[] = new int[k];

		for (int i = 0; i < k; i++) {
			int val = min(min);
			candy[i] = value[val];
			min[val] = Integer.MAX_VALUE;
		}

		System.out.println(candy[max(candy)] - candy[min(candy)]);

	}

	public static int min(int n[]) {
		int min = 0;

		for (int j = 1; j < n.length; j++) {
			if (n[min] > n[j])
				min = j;
		}
		return min;
	}

	public static int max(int n[]) {
		int min = 0;

		for (int j = 1; j < n.length; j++) {
			if (n[min] < n[j])
				min = j;
		}
		return min;
	}
	
}



/*	int min = Integer.MAX_VALUE;
for(i=0;i<count-k;i++){ 
	if((value[i+k-1]-value[i])<min) 
		min=value[i+k-1]-value[i]; 
	}

System.out.println(min);*/