package jp.co.tafs.flowchart.action;

import java.util.ArrayList;

public class Flowchart2Action {

	public static void main(String[] args) {
		ArrayList<Integer> sin = new ArrayList<Integer>();
		ArrayList<Integer> count = new ArrayList<Integer>();

		int a;
		int c = 0;
		if (String.valueOf(args[0]).matches("^[-.0-9]+$")) {

		} else {
			System.out.print("数字以外があります。");
			return;
		}
		//進数変換
		int b = Integer.valueOf(args[0]);
		for (a = 100; a > 0;) {
			sin.add(a % b);
			a = a / b;
			c = c + 1;
		}
		c = c - 1;
		for (int x = c; x >= 0; x--) {
			count.add(sin.get(x));
		}
		for (int z = 0; z < count.size(); z++) {
			System.out.print(count.get(z));

		}

	}
}
