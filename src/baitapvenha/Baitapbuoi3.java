package baitapvenha;

import java.util.Scanner;

public class Baitapbuoi3 {
	public static void main(String[] args) {
		
		
//		tinhCanhHuyenTamGiacVuong();
		
//		tinhSoPhuc();		
		
//		tinhTrungBinh5So();
		
//		DoiNhietDoCSangDoF();
		
		DoiVNDSangUSD();
		}
	
	// BAI TAP 1
	public static void  tinhCanhHuyenTamGiacVuong () {
		System.out.println("====== Tinh canh huyen tam giac vuong! ======");
		
		System.out.println("Nhap canh A: ");
		Scanner scan1 = new Scanner(System.in);
		double canhA = Double.parseDouble(scan1.nextLine());

		System.out.println("Nhap canh B: ");
		Scanner scan2 = new Scanner(System.in);
		double canhB = Double.parseDouble(scan2.nextLine());
		
		if (canhA <= 0  || canhB <= 0 ) {
			System.out.println("Canh khong hop le!");
		} else {
			double canhHuyen =  Math.sqrt(Math.pow(canhA, 2)  + Math.pow(canhB, 2));
			System.out.println("Canh huyen: "+ canhHuyen);
		}
	}
	
	// BAI TAP 2 
	public static void tinhSoPhuc () {	
		System.out.println("====== Tinh so phuc P(x) = ax^n voi x = 8 cho truoc! ======");
		double x = 8;
		
		System.out.println("Nhap a: ");
		Scanner scan1 = new Scanner(System.in);
		double a = Double.parseDouble(scan1.nextLine());

		System.out.println("Nhap n: ");
		Scanner scan2 = new Scanner(System.in);
		int n = Integer.parseInt(scan2.nextLine());
		
		if (n < 0 ) {
			System.out.println("n phai la so nguyen khong am!");
		} else {
			double result = (double) Math.pow(a * x, n);
			System.out.println("Ket qua la: "+ result);
		}
	}
	
	// BAI TAP 3
	public static void tinhTong2KyTuSo () {
		System.out.println("====== Tinh tong 2 ky tu so! ======");
		System.out.println("Nhap so a: ");
		Scanner scan1 = new Scanner(System.in);
		int soA = Integer.parseInt(scan1.nextLine());
		
		if ( soA > 10 && soA < 100) {
		    int hangChuc = soA / 10;
	        int hangDonVi = soA % 10;
	     
	        int result = hangChuc + hangDonVi;
	        System.out.println("Ket qua la: " + result);
		} else {
			System.out.println("So a chi duoc phep co 2 ky tu so!");
		}
	}
	
	// BAI TAP 4
	public static void tinhTrungBinh5So () {
		System.out.println("====== Tinh trung binh 5 so! ======");

		final int trungBinh = 5;
		double tongCacSo  = 0 ;
		
		for (int i = 1; i < trungBinh + 1; i++) {
			System.out.println("Nhap so thu " + i );
			Scanner soDuocNhap = new Scanner(System.in);
			tongCacSo += Double.parseDouble(soDuocNhap.nextLine());
		}
		
		double result = (double) tongCacSo / trungBinh;
        System.out.println("Ket qua la: " + result);
	}
	
	// BAI TAP 5
	public static void DoiNhietDoCSangDoF () {
		System.out.println("====== Doi Do C sang Do F! ======");

		System.out.println("Nhap do C : " );
		Scanner doC = new Scanner(System.in);
		
		double doF =  Double.parseDouble(doC.nextLine()) * 1.8  + 32;
		System.out.println("Do F la : " + doF);
	}
	// BAI TAP 6
	public static void DoiVNDSangUSD () {
		System.out.println("====== Doi VND sang USD! ======");
		
		final double tiGia = 23500;
		
		System.out.println("Nhap USD : " );
		Scanner nhapUSD = new Scanner(System.in);
		
		double usd = Double.parseDouble(nhapUSD.nextLine());
		
		if (usd < 0) {
			System.out.println("usd phai lon hon 0");
		} else {
			double vnd = usd * tiGia ;
			System.out.println("VND duoc chuyen la: " + vnd + "VND");
		}
		
		
	}

	

	
}
