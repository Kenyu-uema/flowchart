package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

public class Flowchart9Action {

	public static void main(String[] args) {

		Double box;
		List<Double> dis = new ArrayList<Double>();
		List<String> error = new ArrayList<String>();
		int c = 0;
		int e = 0;

		//入力チェック
		if (args.length != 10) {
			System.out.print("数字を10個入力してください。");
			return;
		}

		//数字であることの確認
		for (int i = 0; i < 10; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
			} else {
				error.add(args[i] + " ");
				e = e + 1;
			}
		}
		if (error.size() != 0) {
			error.add("数字以外が入力されています。");
			for (int i = 0; i < error.size(); i++) {
				System.out.print(error.get(i));
			}
			return;
		}

		//2桁であることの確認
		for (int i = 0; i < 10; i++) {
			if (Double.valueOf(args[i]) >= 10 && Double.valueOf(args[i]) < 100) {
			} else if (Double.valueOf(args[i]) <= -10 && Double.valueOf(args[i]) > -100) {
			} else {
				error.add(args[i] + " ");
				e = e + 1;
			}
		}
		if (error.size() != 0) {
			error.add("2桁で入力してください。");
			for (int i = 0; i < error.size(); i++) {
				System.out.print(error.get(i));
			}
			return;
		}

		//重複のチェック
		for (int i = 0; i < 9; i++) {
			box = Double.valueOf(args[i]);
			for (int k = (i + 1); k < 10; k++) {
				if (box.equals(Double.valueOf(args[k]))) {
					for (int j = 0; j < c; j++) {
						if (box == dis.get(j)) {
							break;
						}
					}
					dis.add(box);
				}
			}
		}

		//表示
		if (dis.size() == 0) {
			System.out.print("重複なし");
			return;
		}
		System.out.print("重複した数: ");
		for (int i = 0; i < dis.size(); i++) {
			System.out.print(dis.get(i) + " ");
		}
	}
}
