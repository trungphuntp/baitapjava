package baitapvenha;

import java.util.Iterator;
import java.util.Scanner;

public class Baitapbuoi4 {
	public static void main(String[] args) {
//		timSoLonNhat();
//		kiemTraChanLe();
//		tong3So();
		chuongTrinhTinhToanDonGian();
		}
	
//	Bài tập 1
	public static void timSoLonNhat() {
		System.out.println("============= Tìm số lớn nhất trong 3 số =============");
		double ketQua;
		double[] soCanNhap = new double[3];
		Scanner nhapSo = new Scanner(System.in);
		ketQua = soCanNhap[0];
		
		for (int i = 0; i < soCanNhap.length; i++) {
				System.out.println("Nhập số thứ " + (i + 1));
				soCanNhap[i] = Double.parseDouble(nhapSo.nextLine());		
				if (soCanNhap[i] > ketQua) {
					ketQua = soCanNhap[i];
				}
		}	
		System.out.println("Ket qua la : " + ketQua);
	}
	
//	Bài tập 2
	public static void kiemTraChanLe() {
		System.out.println("============= Tìm số chẵn lẻ =============");
		System.out.println("Vui lòng nhập số : ");
		Scanner nhapSo = new Scanner(System.in);
		double soCanNhap = Double.parseDouble(nhapSo.nextLine());
		if (soCanNhap % 2 == 0) {
			System.out.println("Số " + soCanNhap + " là số chẵn");
		} else {
			System.out.println("Số " + soCanNhap + " là số lẻ");
		}
	}
	
//	Bài tập 3 
	public static void tong3So() {
		System.out.println("============= Tính tổng 3 số =============");
		double ketQua = 0;
		double[] soCanNhap = new double[3];
		Scanner nhapSo = new Scanner(System.in);
		
		for (int i = 0; i < soCanNhap.length; i++) {
			System.out.println("Nhập số thứ " + (i + 1));
			soCanNhap[i] = Double.parseDouble(nhapSo.nextLine());		
			ketQua += soCanNhap[i];
		};
		System.out.println("Ket qua la : " + ketQua);

	}
	
//	Bài tập 4
	public static void chuongTrinhTinhToanDonGian() {
		System.out.println("============= Tính toán đơn giản =============");
		
		
		Scanner nhapLuaChon = new Scanner(System.in);
		int luaChon  = 0;
		do {
			System.out.println("1. Tính tổng \n"
					+ "2. Tính hiệu \n"
					+ "3. Tinh nhân \n"
					+ "4. Tính chia \n"
					+ "Vui lòng nhập lựa chọn : ");
			luaChon = Integer.parseInt(nhapLuaChon.nextLine());
		} while (luaChon < 0 && luaChon > 5);
		
		Scanner nhapSo = new Scanner(System.in);
		System.out.println(" Nhập số thứ a : ");
		double soA = Double.parseDouble(nhapSo.nextLine());
		
		System.out.println(" Nhập số thứ b : ");
		double soB = Double.parseDouble(nhapSo.nextLine());
		
		double ketQua = 0;
		switch (luaChon) {
		case 1:
			System.out.println("Tính tổng : a + b");
			ketQua = soA + soB;
			break;
		case 2:
			System.out.println("Tính hiệu : a - b");
			ketQua = soA - soB;
			break;
		case 3:
			System.out.println("Tính nhân : a * b");
			ketQua = soA * soB;
			break;
		case 4:
			
		do  {
			System.out.println("Vui lòng nhập số b khác 0");
			soB = Double.parseDouble(nhapSo.nextLine());
		} while ((soB == 0));
			System.out.println("Tính chia : a / b");
			ketQua = soA / soB;
			break;
		}
		System.out.println("Kết quả là : " + ketQua);
	}
	
}
