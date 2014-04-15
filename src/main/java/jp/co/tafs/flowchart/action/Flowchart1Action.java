package jp.co.tafs.flowchart.action;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Execute;

public class Flowchart1Action {
	public List<String> ballbox = new ArrayList<String>();

	public String[] balltype;

	public int[] count;
	public String message;

	@Execute(validator = false)
	public String index() {
		balltype = new String[3];
		count = new int[3];
		ballbox.add("野球ボール");
		ballbox.add("テニスボール");
		ballbox.add("ゴルフボール");
		ballbox.add("テニスボール");
		ballbox.add("ゴルフボール");
		ballbox.add("野球ボール");
		ballbox.add("野球ボール");
		ballbox.add("ゴルフボール");

		balltype[0] = ballbox.get(0);

		int c;
		int t = 1;
		int x = 0;

		//3種類のボールを特定
		try {
			for (x = 0; x < ballbox.size(); x++) {
				if (balltype[0] == ballbox.get(x)) {
				} else {
					if (balltype[1] == ballbox.get(x)) {
					} else {
						if (balltype[2] == ballbox.get(x)) {
						} else {
							balltype[t] = ballbox.get(x);
							t = t + 1;
						}
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			message = "3種類以上あります。";
		}

		//3種類のボールをカウント
		for (t = 0; t < 3; t++) {
			c = 0;
			for (x = 0; x < ballbox.size(); x++) {
				if (balltype[t].equals(ballbox.get(x))) {
					c = c + 1;
					count[t] = c;
				} else {
				}
			}
		}
		return "flowchart1.jsp";
	}
}
