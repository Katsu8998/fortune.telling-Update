# Query: 
# Flags: CaseSensitive
# ContextLines: 1

package fortuneTelling_Update;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("ようこそ占いの館へ、\n名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();

		Scanner scanner = new Scanner(System.in);
		System.out.println("好きな数字を入力してください");
		int first = new java.util.Scanner(System.in).nextInt();
		try {
			if (first <= 0 || 100 <= first) {
				throw new Exception();
			}
			String favoritNumber = Integer.toString(first);

			System.out.println("好きな数字を入力してください");
			int secondN = new java.util.Scanner(System.in).nextInt();
			if (secondN <= 0 || 100 <= secondN) {
				throw new Exception();
			}
			String favoritNumber2 = Integer.toString(secondN);

			System.out.println("好きな数字を入力してください");
			int third = new java.util.Scanner(System.in).nextInt();
			if (third <= 0 || 100 <= third) {
				throw new Exception();
			}
			String favoritNumber3 = Integer.toString(third);

			int input[];
			input = new int[3];
			input[0] = first;
			input[1] = secondN;
			input[2] = third;

			int sum;
			sum = input[0] + input[1] + input[2];

			if (sum >= 100) {
				System.out.println("大吉");
			}
			if (sum >= 50 && sum <= 99) {
				System.out.println("中吉");
			}
			if (sum >= 30 && sum <= 49) {
				System.out.println("吉");
			}
			if (sum >= 15 && sum <= 29) {
				System.out.println("凶");
			}
			if (sum >= 0 && sum <= 14) {
				System.out.println("大凶");
			}

		} catch (Exception e) {
			System.out.println("0以上100以下の整数を入力ください。はじめから始めて下さい。");
		} finally {
			scanner.close();
		}
	}
}
