package chcolateFEst;

import java.util.Arrays;
import java.util.Scanner;

public class newBill {
	public static void main(String[] args) {
		int count, k, i, sum = 0, j;
		Scanner scn = new Scanner(System.in);
		count = scn.nextInt();
		k = scn.nextInt();
		boolean flag = false;
		if (!((1 <= count) && (count <= Math.pow(10, 5)) || (1 <= k && k <= count)))
			flag = true;
		int value[] = new int[count];
		for (i = 0; i < count; i++) {
			value[i] = scn.nextInt();
			if (!((0 <= value[i]) && (value[i] < Math.pow(10, 9))))
				flag = true;
		}
		if (flag) {
			System.out.println(0);
			System.exit(1);
		}
		Arrays.sort(value);
		int min[] = new int[count];
		min[0] = value[0] - value[1];
		for (i = 1; i < count - 1; i++) {
			min[i] = Math.min((value[i] - value[i - 1]),
					(value[i + 1] - value[i]));
		}
		min[count - 1] = value[count - 1] - value[count - 2];
		int packets[] = new int[k];
		for (i = 0; i < packets.length; i++) {
			int minIndex = min(min);
			packets[i] = value[minIndex];
			min[minIndex] = Integer.MAX_VALUE;
		}
		for (i = 0; i < packets.length - 1; i++) {
			for (j = i + 1; j < packets.length; j++) {
				sum += Math.abs(packets[i] - packets[j]);
			}
		}
		System.out.println(sum);
	}
	public static int min(int n[]) {
		int min = 0;
		for (int j = 1; j < n.length; j++) {
			if (n[min] > n[j])
				min = j;
		}
		return min;
	}
}
