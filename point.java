package com.measurment;

import java.util.Scanner;

public class point {

	public static void main(String[] args) {
		double r;
		Scanner in = new Scanner(System.in);
		System.out.println("내경을 입력해 주세요");
		r = in.nextDouble();
		double r0, r1, r01, r02, ra1, ra2, ra3, rb1, rb2, rb3, rb4, rc1, rc2, rc3, rc4, rc5;
		// 면적 0.5m^2이하
		r0 = (r * 0.5);
		// 내경 1.0m 이하
		r1 = (r * 0.707 * 0.5);
		// 1<r<=2
		r01 = (r * 0.5 * 0.5);
		r02 = (r * 0.866 * 0.5);
		// 2<=r<4
		ra1 = (r * 0.408 * 0.5);
		ra2 = (r * 0.707 * 0.5);
		ra3 = (r * 0.913 * 0.5);
		// 4 <= r <4.5
		rb1 = (r * 0.354 * 0.5);
		rb2 = (r * 0.612 * 0.5);
		rb3 = (r * 0.791 * 0.5);
		rb4 = (r * 0.935 * 0.5);
		// 4.5 <= r
		rc1 = (r * 0.316 * 0.5);
		rc2 = (r * 0.548 * 0.5);
		rc3 = (r * 0.707 * 0.5);
		rc4 = (r * 0.837 * 0.5);
		rc5 = (r * 0.949 * 0.5);

		if ((r * r) <= 0.25) {
			System.out.printf("%f", r0);
		} else if (r <= 1) {
			System.out.printf("r1 %f", r1);
		} else if (r <= 2) {
			System.out.printf("r1 %f \t r2 %f", r01, r02);
		} else if (r <= 4) {
			System.out.printf("r1 %f \t r2 %f \t r3 %f", ra1, ra2, ra3);
		} else if (r <= 4.5) {
			System.out.printf("r1 %f \t r2 %f \f r3 %f \t r4 %f", rb1, rb2, rb3, rb4);
		} else if (r > 4.5) {
			System.out.printf("r1 %f \t r2 %f \t r3 %f \t r4 %f \t r5 %f", rc1, rc2, rc3, rc4, rc5);
		}
		
	}
}

