package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

public class Flowchart1Action {

	public static void main(String[] args) {

		//種類の特定
		List<String> balltype = new ArrayList<String>();

		balltype.add(args[0]);
		for (int i = 0; i < args.length; i++) {
			for (int k = 0; k < balltype.size(); k++) {
				if (balltype.get(k).equals(args[i])) {
					break;
				}
				if ((k + 1) == balltype.size()) {
					balltype.add(args[i]);
				}
			}
		}

		if (balltype.size() != 3) {
			System.out.print("3種類ではありません。");
			return;
		}

		//カウントの処理
		int c;
		int[] count;
		count = new int[3];

		for (int i = 0; i < balltype.size(); i++) {
			c = 0;
			for (int k = 0; k < args.length; k++) {
				if (balltype.get(i).equals(args[k])) {
					c = c + 1;
					count[i] = c;
				}
			}
		}

		//表示
		for (c = 0; c < count.length; c++) {
			System.out.println((c + 1) + "種類目：" + count[c]);

		}
	}
}
