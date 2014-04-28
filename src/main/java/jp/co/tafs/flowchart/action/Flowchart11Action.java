package jp.co.tafs.flowchart.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

		if (args[0].compareTo(sys.format(systemdate)) > 0) {
			System.out.println(args[0] + "   " + sys.format(systemdate) + "より前の日付を入力してください");
			return;
		}

		//入力日の日数計算
		String[] date = args[0].split("\\/");
		int year = Integer.valueOf(date[0]);
		int mon = Integer.valueOf(date[1]);
		int day = Integer.valueOf(date[2]);

		//システム日付の計算
		Calendar calendar = Calendar.getInstance();
		int syear = calendar.get(Calendar.YEAR);
		int smon = calendar.get(Calendar.MONTH) + 1;
		int sday = calendar.get(Calendar.DATE);

		//経過日数の計算
		Calendar cal1 = new GregorianCalendar(year, mon - 1, day);
		Calendar cal2 = new GregorianCalendar(syear, smon, sday);

		long mday = 0;

		mday = (cal2.getTimeInMillis() - cal1.getTimeInMillis()) / (24 * 60 * 60 * 1000);

		//和暦の計算
		int c = 0;
		String[] date2 = new String[3];

		Wareki wareki[] = new Wareki[4];
		wareki[0] = new Wareki("1868/01/25", "明治");
		wareki[1] = new Wareki("1912/07/30", "大正");
		wareki[2] = new Wareki("1926/12/25", "昭和");
		wareki[3] = new Wareki("1989/01/08", "平成");

		for (int i = 0; i < wareki.length; i++) {
			date2 = wareki[i].ad.split("\\/");
			if (Integer.valueOf(date2[0]) <= year) {
				if (Integer.valueOf(date2[0]) == year) {
					if (mon == Integer.valueOf(date2[1]) && day < Integer.valueOf(date2[2])) {
						date2 = wareki[i - 1].ad.split("\\/");
						break;
					} else {
						c = c + 1;
						date2 = wareki[i].ad.split("\\/");
						break;
					}
				} else {
					c = c + 1;
				}
			} else {
				if (c > 0) {
					date2 = wareki[i - 1].ad.split("\\/");
					break;
				} else {
					break;
				}
			}
		}

		String des = null;
		if (c > 0) {
			des = wareki[c - 1].js + (year - (Integer.valueOf(date2[0]) - 1)) + "年";
		} else {
			des = wareki[c].js + "以前";
		}

		//表示
		System.out.println("経過日数: " + mday + "日");
		System.out.println("和暦: " + des);
	}

	static class Wareki {
		String ad;
		String js;

		Wareki(String ad, String js) {
			this.ad = ad;
			this.js = js;
		}
	}
}
