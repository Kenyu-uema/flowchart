package jp.co.tafs.flowchart.action;

import java.util.Random;

public class Flowchart3Action {

	public static void main(String[] args) {
		int c;
		String b;
		String[] sort = new String[10];
		int[] random = new int[10];
		String message;

		Random ran = new Random();

		if (0 == 0) {

		}

		try {
			for (c = 0; c < args.length; c++) {
				sort[c] = args[c];
			}
			for (c = 0; c < 10; c++) {
				System.out.print(sort[c] + " ");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数字が10個ではありませんされていません");
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
