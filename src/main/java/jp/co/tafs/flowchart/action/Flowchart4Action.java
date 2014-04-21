package jp.co.tafs.flowchart.action;

public class Flowchart4Action {

	public static void main(String[] args) {
		int sum = 0;
		int sub = 0;
		int oSum = 0;
		int eSum = 0;

		//入力チェック
		for (int i = 0; i < args.length; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
			} else {
				System.out.println("数字以外があります。");
				return;
			}
			if (Integer.valueOf(args[i]) >= 1 && Integer.valueOf(args[i]) <= 10) {
			} else {
				System.out.println("1～10ではありません。");
				return;
			}

			//奇数と偶数に分けて合計する
			if (Integer.valueOf(args[i]) % 2 == 0) {
				oSum = oSum + Integer.valueOf(args[i]);

			} else {
				eSum = eSum + Integer.valueOf(args[i]);
			}
		}

		//全部の合計値を求める
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.valueOf(args[i]);
		}

		//偶数の合計を確認
		sub = sum - oSum;
		if (sub != eSum) {
			System.out.println("偶数の値が違います");
			return;
		}

		//奇数の合計を確認
		sub = sum - eSum;
		if (sub != oSum) {
			System.out.println("奇数の値が違います");
			return;
		}
		System.out.println("奇数の合計：" + eSum);
		System.out.println("偶数の合計：" + oSum);
	}
}
