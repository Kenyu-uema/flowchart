package jp.co.tafs.flowchart.action;

public class Flowchart8Action {
	public static void main(String[] args) {

		double sum = 0;
		double ave = 0;
		int c = 0;

		//入力チェック
		if (args.length != 10) {
			System.out.println("数字を10個入力してください。");
			return;
		}
		for (int i = 0; i < 10; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
			} else {
				System.out.println("数字以外が入力されています。");
				return;
			}
			if (args[i].matches("^(([1-9])|0)(\\.\\d)?$")) {
			} else {
				System.out.println(args[i] + " 小数点第1位までです。");
				return;
			}
		}

		//合計の計算
		for (int i = 0; i < 10; i++) {
			sum = sum + Double.valueOf(args[i]);
			c = c + 1;
		}

		//平均の計算
		ave = sum / c;

		//表示
		System.out.printf("合計値: " + "%1.1f\n", sum);
		System.out.printf("平均値: " + "%1.1f\n", ave);
	}
}
