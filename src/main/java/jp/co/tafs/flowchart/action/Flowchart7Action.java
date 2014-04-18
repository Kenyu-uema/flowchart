package jp.co.tafs.flowchart.action;

public class Flowchart7Action {

	public static void main(String[] args) {

		//入力チェック
		if (args.length != 3) {
			System.out.println("数字を3つ入力してください。");
			return;
		}
		for (int i = 0; i < 3; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
			} else {
				System.out.println("数字以外が入力されています。");
				return;
			}
		}

		//基準値に初期値を設定
		double max = Double.valueOf(args[0]);
		double min = Double.valueOf(args[0]);

		//最大値と最小値に振り分ける
		for (int i = 1; i < 3; i++) {
			if (Double.valueOf(args[i]) > max) {
				max = Double.valueOf(args[i]);
			}
			if (Double.valueOf(args[i]) < min) {
				min = Double.valueOf(args[i]);
			}
		}

		//表示
		System.out.print("入力された数値: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(Double.valueOf(args[i]) + " ");
		}
		System.out.println();
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

	}
}
