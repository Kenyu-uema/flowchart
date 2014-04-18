package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

public class Flowchart9Action {

	public static void main(String[] args) {

		Double box;
		List<Double> dis = new ArrayList<Double>();
		int c = 0;

		//入力チェック
		if (args.length != 10) {
			System.out.println("数字を10個入力してください。");
			return;
		}
		for (int i = 0; i < 10; i++) {
			if (args[i].matches("^[-.0-9]+$")) {
			} else {
				System.out.println(args[i] + " 数字以外が入力されています。");
				return;
			}
			if (Double.valueOf(args[i]) >= 10 && Double.valueOf(args[i]) < 100) {
			} else if (Double.valueOf(args[i]) <= -10 && Double.valueOf(args[i]) > -100) {
			} else {
				System.out.println(args[i] + " 2桁で入力してください。");
				return;
			}
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
