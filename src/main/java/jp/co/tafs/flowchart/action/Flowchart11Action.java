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
		String[] ad = { "1868/01/25", "1912/07/30", "1926/12/25", "1989/01/08" };
		String[] jc = { "明治", "大正", "昭和", "平成" };
		int sum;
		int ySum = 0;
		int mSum = 0;
		int dSum = 0;
		int sySum = 0;
		int smSum = 0;
		int sdSum = 0;
		int year = Integer.valueOf(date[0]);
		int mon = Integer.valueOf(date[1]);
		int day = Integer.valueOf(date[2]);
		int syear = Integer.valueOf(sdate[0]);
		int smon = Integer.valueOf(sdate[1]);
		int sday = Integer.valueOf(sdate[2]);
		String wareki = null;

		//入力日の日数計算
		if (Integer.valueOf(date[1]) >= 3) {
			ySum = ySum + (year * 365);
			ySum = ySum + (year / 4);
			ySum = ySum - (year / 100);
			ySum = ySum + (year / 400);
			mSum = mSum + (mon * 30);
			mSum = mSum + ((mon + 1) * 3 / 5 - 33);
		} else {
			ySum = ySum + ((year - 1) * 365);
			ySum = ySum + ((year - 1) / 4);
			ySum = ySum - ((year - 1) / 100);
			ySum = ySum + ((year - 1) / 400);
			mSum = mSum + ((mon + 12) * 30);
			mSum = mSum + (((mon + 12) + 1) * 3 / 5 - 33);
		}
		dSum = ySum + mSum + day;

		//システム日付の日数計算
		if (Integer.valueOf(date[1]) >= 3) {
			sySum = sySum + (syear * 365);
			sySum = sySum + (syear / 4);
			sySum = sySum - (syear / 100);
			sySum = sySum + (syear / 400);
			smSum = smSum + (smon * 30);
			smSum = smSum + ((smon + 1) * 3 / 5 - 33);
		} else {
			sySum = sySum + ((syear - 1) * 365);
			sySum = sySum + ((syear - 1) / 4);
			sySum = sySum - ((syear - 1) / 100);
			sySum = sySum + ((syear - 1) / 400);
			smSum = smSum + ((smon + 12) * 30);
			smSum = smSum + (((smon + 12) + 1) * 3 / 5 - 33);
		}
		sdSum = sySum + smSum + sday;

		//経過日数の計算
		sum = sdSum - dSum;

		//和暦の計算
		int c = 0;
		String[] date2 = new String[3];
		for (int i = 0; i < ad.length; i++) {
			date2 = ad[i].split("\\/");
			if (Integer.valueOf(date2[0]) <= year) {
				if (Integer.valueOf(date2[0]) == year) {
					if (mon == Integer.valueOf(date2[1]) && day < Integer.valueOf(date2[2])) {
						date2 = ad[i - 1].split("\\/");
						break;
					} else {
						c = c + 1;
						date2 = ad[i].split("\\/");
						break;
					}
				} else {
					c = c + 1;
				}
			} else {
				if (c > 0) {
					date2 = ad[i - 1].split("\\/");
					break;
				} else {
					break;
				}

			}
		}

		if (c > 0) {
			wareki = jc[c - 1] + (year - (Integer.valueOf(date2[0]) - 1)) + "年";
		} else {
			wareki = jc[c] + "以前";
		}
		//表示
		System.out.println("経過日数: " + sum + "日");
		System.out.println("和暦: " + wareki);

	}
}
