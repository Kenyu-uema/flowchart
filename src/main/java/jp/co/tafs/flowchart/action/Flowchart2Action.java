package jp.co.tafs.flowchart.action;

import java.util.ArrayList;

public class Flowchart2Action {

	public static void main(String[] args) {
		ArrayList<Integer> sin2 = new ArrayList<Integer>();
		ArrayList<Integer> count2 = new ArrayList<Integer>();
		ArrayList<Integer> sin8 = new ArrayList<Integer>();
		ArrayList<Integer> count8 = new ArrayList<Integer>();
		ArrayList<String> sin16 = new ArrayList<String>();
		ArrayList<String> count16 = new ArrayList<String>();
		String x;

		int c = 0;

		//エラーチェック
		if (String.valueOf(args[0]).matches("^[-.0-9]+$")) {
		} else {
			System.out.print("数字ではありません。");
			return;
		}
		int b = Integer.valueOf(args[0]);

		//2進数変換
		for (int i = b; i > 0;) {
			sin2.add(i % 2);
			i = i / 2;
			c = c + 1;
		}
		c = c - 1;
		for (int i = c; i >= 0; i--) {
			count2.add(sin2.get(i));
		}

		//8進数
		c = 0;
		for (int i = b; i > 0;) {
			sin8.add(i % 8);
			i = i / 8;
			c = c + 1;
		}
		c = c - 1;
		for (int i = c; i >= 0; i--) {
			count8.add(sin8.get(i));
		}

		//16進数
		c = 0;
		for (int i = b; i > 0;) {
			switch (i % 16) {
			case 10:
				x = "A";
				break;
			case 11:
				x = "B";
				break;
			case 12:
				x = "C";
				break;
			case 13:
				x = "D";
				break;
			case 14:
				x = "E";
				break;
			case 15:
				x = "F";
				break;
			default:
				x = String.valueOf(i % 16);
				break;
			}
			sin16.add(x);
			i = i / 16;
			c = c + 1;
		}
		c = c - 1;
		for (int i = c; i >= 0; i--) {
			count16.add(sin16.get(i));
		}

		//表示
		System.out.print("2進数：");
		for (int i = 0; i < count2.size(); i++) {
			System.out.print(count2.get(i));
		}
		System.out.println();

		System.out.print("8進数：");
		for (int i = 0; i < count8.size(); i++) {
			System.out.print(count8.get(i));
		}
		System.out.println();

		System.out.print("16進数：");
		for (int i = 0; i < count16.size(); i++) {
			System.out.print(count16.get(i));
		}

	}
}
