package jp.co.tafs.flowchart.action;

import java.util.ArrayList;

public class Flowchart2Action {

	public static void main(String[] args) {
		ArrayList<Integer> sin = new ArrayList<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();

		int c = 0;

		//エラーチェック
		if (String.valueOf(args[0]).matches("^[-.0-9]+$")) {
		} else {
			System.out.print("数字ではありません。");
			return;
		}

		//進数変換
		System.out.print(args[0] + "進数：");
		int b = Integer.valueOf(args[0]);
		for (int i = 100; i > 0;) {
			sin.add(i % b);
			i = i / b;
			c = c + 1;
		}
		c = c - 1;
		for (int x = c; x >= 0; x--) {
			count.add(sin.get(x));
		}

		//表示
		for (int z = 0; z < count.size(); z++) {
			System.out.print(count.get(z));

		}

	}
}
