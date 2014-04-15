package jp.co.tafs.flowchart.action;

import java.util.Random;

import org.seasar.struts.annotation.Execute;

public class Flowchart3Action {

	public int[] sort = new int[10];
	public int[] random = new int[10];
	public String message;

	@Execute(validator = false)
	public String index() {
		int c;
		int b;

		Random ran = new Random();

		//ランダムに10個の数を取得する。
		for (c = 0; c < 10; c++) {
			random[c] = ran.nextInt(89) + 10;
			b = random[c];
			for (c = 0; c < 10; c++) {
				if (random[c] == b) {
					break;
				}
			}
		}

		if (random.length == 10) {
		} else {
			message = "数字が10個ではありません。";
			return "flowchart3.jsp";
		}

		for (c = 0; c < 10; c++) {
			sort[c] = random[c];
		}

		//昇順ソート
		for (int y = 0; y < 9; y++) {
			for (int x = (y + 1); x < 10; x++) {
				if (sort[y] > sort[x]) {
					b = sort[y];
					sort[y] = sort[x];
					sort[x] = b;
				}
			}
		}
		return "flowchart3.jsp";
	}
}
