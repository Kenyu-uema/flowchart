package jp.co.tafs.flowchart.action;

public class Flowchart3Action {

	public static void main(String[] args) {
		int b;
		int[] sort = new int[10];

		//入力チェック
		for (int i = 0; i < 10; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
			} else {
				System.out.print("数字以外があります。");
				return;
			}
			if (Integer.valueOf(args[i]) >= 10 && Integer.valueOf(args[i]) <= 99) {
			} else {
				System.out.print("2桁以外の数字があります。");
				return;
			}
			if (args.length != 10) {
				System.out.print("数字の数が10個ではありません。");
				return;
			}
		}

		for (int i = 0; i < args.length; i++) {
			sort[i] = Integer.valueOf(args[i]);
		}

		//初期表示
		System.out.print("ソート前：" + " ");
		for (int i = 0; i < 10; i++) {
			System.out.print(sort[i] + " ");
		}
		System.out.println();

		//昇順ソート
		for (int i = 0; i < 9; i++) {
			for (int k = (i + 1); k < 10; k++) {
				if (Integer.valueOf(sort[i]) > Integer.valueOf(sort[k])) {
					b = sort[i];
					sort[i] = sort[k];
					sort[k] = b;
				}
			}
		}

		//ソート後表示
		System.out.print("ソート後：" + " ");
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
	}
}
