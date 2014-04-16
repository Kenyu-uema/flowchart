package jp.co.tafs.flowchart.action;

public class Flowchart3Action {

	public static void main(String[] args) {
		int c;
		int b;
		int[] sort = new int[10];

		for (c = 0; c < 10; c++) {
			if (args[c].matches("^[-.0-9]+$")) {
			} else {
				System.out.print("数字以外があります。");
				return;
			}
			if (Integer.valueOf(args[c]) >= 10 && Integer.valueOf(args[c]) <= 99) {
			} else {
				System.out.print("2桁以外の数字があります。");
				return;
			}
			if (args.length == 10) {
			} else {
				System.out.print("数字の数が10個ではありません。");
				return;
			}
		}

		for (c = 0; c < args.length; c++) {
			sort[c] = Integer.valueOf(args[c]);
			for (int a = (c + 1); a < 10; a++) {
				if (sort[c] != Integer.valueOf(args[a])) {
				} else {
					System.out.print("数字が重複しています。");
					return;
				}
			}
			System.out.print(sort[c] + " ");
		}

		System.out.println();

		//昇順ソート
		for (int y = 0; y < 9; y++) {
			for (int x = (y + 1); x < 10; x++) {
				if (Integer.valueOf(sort[y]) > Integer.valueOf(sort[x])) {
					b = sort[y];
					sort[y] = sort[x];
					sort[x] = b;
				}
			}
		}
		for (int z = 0; z < sort.length; z++) {
			System.out.print(sort[z] + " ");
		}
	}
}
