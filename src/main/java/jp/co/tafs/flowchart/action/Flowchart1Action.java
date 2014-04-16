package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

public class Flowchart1Action {

	public static void main(String[] args) {
		List<String> balltype = new ArrayList<String>();
		int[] count;

		count = new int[3];

		int c;

		//種類の特定
		balltype.add(args[0]);
		for (int b = 0; b < args.length; b++) {
			for (int a = 0; a < balltype.size(); a++) {
				if (balltype.get(a).equals(args[b])) {
					break;
				} else {
				}
				if ((a + 1) == balltype.size()) {
					balltype.add(args[b]);
				}
			}
		}

		if (balltype.size() != 3) {
			System.out.print("3種類ではありません。");
			return;
		}

		//カウントの処理
		for (int b = 0; b < balltype.size(); b++) {
			c = 0;
			for (int a = 0; a < args.length; a++) {
				if (balltype.get(b).equals(args[a])) {
					c = c + 1;
					count[b] = c;
				} else {
				}
			}
		}

		//表示
		for (c = 0; c < count.length; c++) {
			System.out.println((c + 1) + "種類目：" + count[c]);

		}
	}
}
