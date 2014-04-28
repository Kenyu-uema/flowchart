package jp.co.tafs.flowchart.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Flowchart12Action {

	public static void main(String[] args) {

		//入力チェック
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setLenient(false);

		try {
			sdf.parse(args[0]);
			sdf.parse(args[1]);
		} catch (ParseException e) {
			System.out.println("入力が正しくありません");
			return;
		}

		//１つめの日数計算
		String[] date = args[0].split("\\/");
		int year = Integer.valueOf(date[0]);
		int mon = Integer.valueOf(date[1]);
		int day = Integer.valueOf(date[2]);

		//2つめの日数計算
		String[] sdate = args[1].split("\\/");
		int syear = Integer.valueOf(sdate[0]);
		int smon = Integer.valueOf(sdate[1]);
		int sday = Integer.valueOf(sdate[2]);

		Calendar cal1 = new GregorianCalendar(year, mon - 1, day);
		Calendar cal2 = new GregorianCalendar(syear, smon - 1, sday);
		int tSum = 0;
		long mday = 0;

		//経過日数の計算と経過時間の計算
		if (cal1.getTimeInMillis() >= cal2.getTimeInMillis()) {
			mday = (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (24 * 60 * 60 * 1000);
			tSum = (int) (mday * 24);
		} else {
			mday = (cal2.getTimeInMillis() - cal1.getTimeInMillis()) / (24 * 60 * 60 * 1000);
			tSum = (int) (mday * 24);
		}
		//表示
		System.out.println("経過日数: " + mday + "日");
		System.out.println("経過時間: " + tSum + "時間");
	}

}