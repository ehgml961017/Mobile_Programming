package mop;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int searchArr[] = { 1, 3, 12, 49, 92, 112, 293, 399, 484, 822, 888 };
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int min = 0;
		int max = 10;
		int mid;

		while (true) {
			mid = (min + max) / 2;
			if (min > max) {
				System.out.println("찾는 숫자가 배열안에 없습니다.");
				break;
			}
			if (searchArr[mid] == num) {
				System.out.println("찾는 숫자의 인덱스값은 " + mid + "입니다.");
				break;
			} else if (searchArr[mid] > num)
				max = mid - 1;
			else
				min = mid + 1;

		}
	}

}
