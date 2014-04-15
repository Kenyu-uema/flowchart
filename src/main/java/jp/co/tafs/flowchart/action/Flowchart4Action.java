package jp.co.tafs.flowchart.action;

import org.seasar.struts.annotation.Execute;

public class Flowchart4Action {

	public int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public int oSum = 0;
	public int eSum = 0;
	public String message;

	@Execute(validator = false)
	public String index() {
		int sum = 0;
		int sub = 0;
		int c;

		//奇数と偶数に分けて合計する
		for (c = 0; c < 10; c++) {
			if (String.valueOf(num[c]).matches("^[-.0-9]+$")) {
			} else {
				message = "数字以外があります。";
				return "flowchart4.jsp";
			}

			if (num[c] >= 1 && num[c] <= 10) {
			} else {
				message = "1～10ではありません。";
				return "flowchart4.jsp";
			}

			if (num[c] % 2 == 0) {
				oSum = oSum + num[c];
			} else {
				eSum = eSum + num[c];
			}
		}

		//全部の合計値を求める
		for (int e = 0; e < 10; e++) {
			sum = sum + num[e];
		}

		//偶数の合計を確認
		sub = sum - oSum;
		if (sub == eSum) {
		} else {
			message = "偶数の値が違います";
			return "flowchart4.jsp";
		}

		//奇数の合計を確認
		sub = sum - eSum;
		if (sub == oSum) {

		} else {
			message = "奇数の値が違います";
			return "flowchart4.jsp";
		}
		return "flowchart4.jsp";
	}
}
