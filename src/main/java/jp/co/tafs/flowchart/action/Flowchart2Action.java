package jp.co.tafs.flowchart.action;

import java.util.ArrayList;

import org.seasar.struts.annotation.Execute;

public class Flowchart2Action {
	public ArrayList<Integer> sin2 = new ArrayList<Integer>();
	public ArrayList<Integer> sin8 = new ArrayList<Integer>();
	public ArrayList<Integer> sin16 = new ArrayList<Integer>();
	public ArrayList<Integer> count2 = new ArrayList<Integer>();
	public ArrayList<Integer> count8 = new ArrayList<Integer>();
	public ArrayList<Integer> count16 = new ArrayList<Integer>();

	@Execute(validator = false)
	public String index() {
		int a;
		int c = 0;

		//2進数
		for (a = 100; a > 0;) {
			sin2.add(a % 2);
			a = a / 2;
			c = c + 1;
		}
		c = c - 1;
		for (int x = c; x >= 0; x--) {
			count2.add(sin2.get(x));
		}

		//8進数
		c = 0;
		for (a = 100; a > 0;) {
			sin8.add(a % 8);
			a = a / 8;
			c = c + 1;
		}
		c = c - 1;
		for (int x = c; x >= 0; x--) {
			count8.add(sin8.get(x));
		}

		//16進数
		c = 0;
		for (a = 100; a > 0;) {
			sin16.add(a % 16);
			a = a / 16;
			c = c + 1;
		}
		c = c - 1;
		for (int x = c; x >= 0; x--) {
			count16.add(sin16.get(x));
		}
		return "flowchart2.jsp";
	}
}
