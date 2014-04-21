package jp.co.tafs.flowchart.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flowchart11Action {

	public static void main(String[] args) {

		//入力チェック
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setLenient(false);

		try {
			sdf.parse(args[0]);
		} catch (ParseException e) {
			System.out.println(args[0] + " 入力が正しくありません");
			return;
		}

		Date systemdate = new Date();
		SimpleDateFormat sys = new SimpleDateFormat("yyyy/MM/dd");
		String[] sdate = sys.format(systemdate).split("\\/");

		if (args[0].compareTo(sys.format(systemdate)) > 0) {
			System.out.println(args[0] + "   " + sys.format(systemdate) + "より前の日付を入力してください");
			return;
		}

		String[] date = args[0].split("\\/");
		int sum;
		int ySum = 0;
		int mSum = 0;
		int dSum = 0;
		int sySum = 0;
		int smSum = 0;
		int sdSum = 0;
		int y = Integer.valueOf(date[0]);
		int m = Integer.valueOf(date[1]);
		int d = Integer.valueOf(date[2]);
		int sy = Integer.valueOf(sdate[0]);
		int sm = Integer.valueOf(sdate[1]);
		int sd = Integer.valueOf(sdate[2]);
		String wareki = null;

		//入力日の日数計算
		if (Integer.valueOf(date[1]) >= 3) {
			ySum = ySum + (y * 365);
			ySum = ySum + (y / 4);
			ySum = ySum - (y / 100);
			ySum = ySum + (y / 400);
			mSum = mSum + (m * 30);
			mSum = mSum + ((m + 1) * 3 / 5 - 33);
		} else {
			ySum = ySum + ((y - 1) * 365);
			ySum = ySum + ((y - 1) / 4);
			ySum = ySum - ((y - 1) / 100);
			ySum = ySum + ((y - 1) / 400);
			mSum = mSum + ((m + 12) * 30);
			mSum = mSum + (((m + 12) + 1) * 3 / 5 - 33);
		}
		dSum = ySum + mSum + d;

		//システム日付の日数計算
		if (Integer.valueOf(date[1]) >= 3) {
			sySum = sySum + (sy * 365);
			sySum = sySum + (sy / 4);
			sySum = sySum - (sy / 100);
			sySum = sySum + (sy / 400);
			smSum = smSum + (sm * 30);
			smSum = smSum + ((sm + 1) * 3 / 5 - 33);
		} else {
			sySum = sySum + ((sy - 1) * 365);
			sySum = sySum + ((sy - 1) / 4);
			sySum = sySum - ((sy - 1) / 100);
			sySum = sySum + ((sy - 1) / 400);
			smSum = smSum + ((sm + 12) * 30);
			smSum = smSum + (((sm + 12) + 1) * 3 / 5 - 33);
		}
		sdSum = sySum + smSum + sd;

		//経過日数の計算
		sum = sdSum - dSum;

		//和暦の計算
		if (y >= 1989) {
			if (y == 1989) {
				if (m == 1 && d < 8) {
					wareki = "昭和" + (y - 1925) + "年";
				} else {
					wareki = "平成" + (y - 1988) + "年";
				}
			} else {
				wareki = "平成" + (y - 1988) + "年";
			}
		} else {
			if (y < 1989 && y >= 1926) {
				if (y == 1926) {
					if (m == 12 && d < 25) {
						wareki = "大正" + (y - 1911) + "年";
					} else {
						wareki = "昭和" + (y - 1925) + "年";
					}
				} else {
					wareki = "昭和" + (y - 1925) + "年";
				}
			} else {
				if (y < 1926 && y >= 1912) {
					if (y == 1912) {
						if (m == 7 && d < 30) {
							wareki = "明治" + (y - 1867) + "年";
						} else {
							wareki = "大正" + (y - 1911) + "年";
						}
					} else {
						wareki = "大正" + (y - 1911) + "年";
					}
				} else {
					if (y < 1912 && y >= 1873) {
						wareki = "明治" + (y - 1867) + "年";
					} else {
						wareki = "明治6年以前";
					}
				}
			}
		}

		//表示
		System.out.println("経過日数: " + sum + "日");
		System.out.println("和暦: " + wareki);

	}
}
