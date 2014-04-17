package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

public class Flowchart6Action {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		//文字の分解
		for (int i = 0; i < args[0].length(); i++) {
			str.add(String.valueOf(args[0].charAt(i)));
		}

		//文字の変換
		for (int i = 0; i < args[0].length(); i++) {
			if (str.get(i).matches("^[A-Z]+$")) {
				str.set(i, str.get(i).toLowerCase());
			} else if (str.get(i).matches("^[a-z]+$")) {
				str.set(i, str.get(i).toUpperCase());
			} else {
				System.out.println("英文字以外が入力されています。");
			}
		}

		//表示
		System.out.println("変換前: " + args[0]);

		System.out.print("変換後: ");
		for (int i = 0; i < str.size(); i++) {
			System.out.print(str.get(i));
		}
	}
}
