package jp.co.tafs.flowchart.action;


public class Flowchart4Action {

	public static void main(String[] args) {
		int sum = 0;
		int sub = 0;
		int c;
		int oSum = 0;
		int eSum = 0;

		//奇数と偶数に分けて合計する
		for (c = 0; c < 10; c++) {
			if (args[c].matches("^[-.0-9]+$")) {
			} else {
				System.out.println("数字以外があります。");
				return;
			}

			if (Integer.valueOf(args[c]) >= 1 && Integer.valueOf(args[c]) <= 10) {
			} else {
				System.out.println("1～10ではありません。");
				return;
			}

			if (Integer.valueOf(args[c]) % 2 == 0) {
				oSum = oSum + Integer.valueOf(args[c]);
			} else {
				eSum = eSum + Integer.valueOf(args[c]);
			}
		}

		//全部の合計値を求める
		for (int e = 0; e < 10; e++) {
			sum = sum + Integer.valueOf(args[e]);
		}

		//偶数の合計を確認
		sub = sum - oSum;
		if (sub == eSum) {
		} else {
			System.out.println("偶数の値が違います");
			return;
		}

		//奇数の合計を確認
		sub = sum - eSum;
		if (sub == oSum) {

		} else {
			System.out.println("奇数の値が違います");
			return;
		}
	}
}
