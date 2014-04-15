package jp.co.tafs.flowchart.action;

import java.util.Random;

import org.seasar.struts.annotation.Execute;

public class Flowchart3Action {

	public Integer[] random = new Integer[10];
	public String message;

	@Execute(validator = false)
	public String index() {
		int c;
		int b;

		Random ran = new Random();

		//ランダムに10個の数を取得する。
		try {
			for (c = 0; c < 10; c++) {
				random[c] = ran.nextInt(89) + 10;
				b = random[c];
				for (c = 0; c < 10; c++) {
					if (random[c] == b) {
						break;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			message = "エラーが起きました";
			return "flowchart3.jsp";
		}

		//昇順ソート
		for (int y = 0; y < 9; y++) {
			for (int x = (y + 1); x < 10; x++) {
				if (random[y] > random[x]) {
					b = random[y];
					random[y] = random[x];
					random[x] = b;
				}
			}
		}
		return "flowchart3.jsp";
	}
}
