package com.measurment;

import java.util.Scanner;

public class water {
	public static void main(String[] args) {
		double ma1,ma2,vm,tm,p1,pm;
		
		Scanner in = new Scanner(System.in);
		String a = "%";
		System.out.print("수분 측정 전 무게 : ");
		ma1 = in.nextDouble();
		System.out.print("수분 측장 후 무게 : ");
		ma2 = in.nextDouble();
		System.out.print("흡입한 건조 가스량(L) : ");
		vm = in.nextDouble();
		System.out.print("가스미터 흡인 가스 온도 (℃)  : ");
		tm = in.nextDouble();
		System.out.print("측정공 위치에서 대기압(mmHg) : ");
		p1 = in.nextDouble();
		System.out.print("가스미터에서의 가스의 게이지압(mmH2O) : ");
		pm = in.nextDouble();
		pm = (pm / 10332) * 760;

		final double w = (double) ((22.4 / 18) * (ma2 - ma1))
				/ (vm * ((273) / (273 + tm)) * ((p1 + pm) / (760)) + (((22.4 / 18)) * (ma2 - ma1))) * 100;

		System.out.printf("수분량 %2.2f%s", w, a);

		
	}
	

}