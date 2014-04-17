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
		}

		for (int i = 0; i < 10; i++) {
			sum = sum + Double.valueOf(args[i]);
			c = c + 1;
		}

		ave = sum / c;

		//表示
		System.out.printf("%1.1f\n", sum);
		System.out.printf("%1.1f\n", ave);
	}
}
