package jp.co.tafs.flowchart.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

		Calendar cal1 = new GregorianCalendar(year, mon - 1, day);

		//曜日の特定
		String week = null;

		switch (cal1.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			week = "日曜日";
			break;
		case 2:
			week = "月曜日";
			break;
		case 3:
			week = "火曜日";
			break;
		case 4:
			week = "水曜日";
			break;
		case 5:
			week = "木曜日";
			break;
		case 6:
			week = "金曜日";
			break;
		case 7:
			week = "土曜日";
			break;
		}

		//表示
		System.out.println(args[0] + "は" + week);
	}

}
