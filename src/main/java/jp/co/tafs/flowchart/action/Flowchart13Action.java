package jp.co.tafs.flowchart.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Flowchart13Action {

	public static void main(String[] args) {

		//入力チェック
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setLenient(false);

		try {
			sdf.parse(args[0]);
		} catch (ParseException e) {
			System.out.println("入力が正しくありません");
			return;
		}

		//日数計算
		String[] date = args[0].split("\\/");
		int year = Integer.valueOf(date[0]);
		int mon = Integer.valueOf(date[1]);
		int day = Integer.valueOf(date[2]);
		int dSum = 0;

		dSum = change(year, mon, day);

		//曜日の特定
		int rem = dSum % 7;

		String week = null;

		switch (rem) {
		case 0:
			week = "日曜日";
			break;
		case 1:
			week = "月曜日";
			break;
		case 2:
			week = "火曜日";
			break;
		case 3:
			week = "水曜日";
			break;
		case 4:
			week = "木曜日";
			break;
		case 5:
			week = "金曜日";
			break;
		case 6:
			week = "土曜日";
			break;
		}

		//表示
		System.out.println(args[0] + "は" + week);
	}

	public static int change(int year, int mon, int day) {

		int ySum;
		int mSum;
		if (mon >= 3) {
			ySum = year + (year / 4) - (year / 100) + (year / 400);
			mSum = (int) ((2.6 * mon) + 1.6) + day;
		} else {
			ySum = (year - 1) + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400);
			mSum = (int) ((2.6 * (mon + 12)) + 1.6) + day;
		}

		int dSum = ySum + mSum;
		return dSum;
	}
}
