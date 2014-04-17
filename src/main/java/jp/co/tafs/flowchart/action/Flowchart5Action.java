package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

public class Flowchart5Action {

	public static void main(String[] args) {

		List<String> eBox = new ArrayList<String>();
		List<String> sBox = new ArrayList<String>();
		String x;
		List<String> bBox = new ArrayList<String>();
		int sc = 0;
		int ec = 0;

		//入力チェック
		if (args.length != 20) {
			System.out.println("文字が20個ではありません");
			return;
		}
		for (int i = 0; i < 20; i++) {
			if (args[i].length() != 1) {
				System.out.println(args[i] + " " + "1文字ではありません");
				return;
			}
		}

		//英字と数字を分別
		for (int i = 0; i < 20; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
				sBox.add(args[i]);
				sc = sc + 1;
			} else if (args[i].matches("^[a-zA-Z]+$")) {
				eBox.add(args[i]);
				ec = ec + 1;
			} else {
				System.out.println("英・数字以外が入力されています。");
				return;
			}
		}

		//初期表示
		System.out.print("ソート前:" + " ");
		for (int i = 0; i < 20; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();

		//数字のソート
		for (int i = 0; i < (sc - 1); i++) {
			for (int k = (i + 1); k < sc; k++) {
				if (Integer.valueOf(sBox.get(i)) > Integer.valueOf(sBox.get(k))) {
					x = sBox.get(i);
					sBox.set(i, sBox.get(k));
					sBox.set(k, x);
				}
			}
		}

		//文字のソート
		for (int i = 0; i < (ec - 1); i++) {
			for (int k = (i + 1); k < ec; k++) {
				if (eBox.get(i).compareTo(eBox.get(k)) < 0) {
					x = eBox.get(i);
					eBox.set(i, eBox.get(k));
					eBox.set(k, x);
				}
			}
		}

		//結合
		for (int i = 0; i < sc; i++) {
			bBox.add(sBox.get(i));
		}
		for (int i = 0; i < ec; i++) {
			bBox.add(eBox.get(i));
		}

		//表示
		System.out.print("ソート後:" + " ");
		for (int i = 0; i < 20; i++) {
			System.out.print(bBox.get(i) + " ");
		}
	}
}
