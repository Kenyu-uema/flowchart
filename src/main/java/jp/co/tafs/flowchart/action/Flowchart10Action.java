package jp.co.tafs.flowchart.action;

public class Flowchart10Action {

	public static void main(String[] args) {

		String ad;

		//入力チェック
		if (args[0].matches("^[-.0-9]+$")) {
		} else {
			System.out.println(args[0] + " 数字以外が入力されています。");
			return;
		}

		if (args[0].length() != 4) {
			System.out.println("yyyyで入力してください。");
			return;
		}

		if (Integer.valueOf(args[0]) == 0) {
			System.out.println("0000年は存在しません。");
			return;
		}

		//閏年判定
		ad = args[0];
		if (Integer.valueOf(ad) % 4 == 0 && Integer.valueOf(ad) % 100 != 0 || Integer.valueOf(ad) % 400 == 0) {
			ad = ad + "年【閏年】";
		} else {
			ad = ad + "年";
		}

		//表示
		System.out.println(ad);
	}
}
