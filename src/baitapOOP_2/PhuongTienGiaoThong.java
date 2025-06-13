package baitapOOP_2;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	protected String hangSX;
	protected String tenPhuongTien;
	protected int namSX;
	protected double vanTocToiDa;

	public PhuongTienGiaoThong(String hangSX, String tenPhuongTien, int namSX, double vanTocToiDa) {
		this.hangSX = hangSX;
		this.tenPhuongTien = tenPhuongTien;
		this.namSX = namSX;
		this.vanTocToiDa = vanTocToiDa;
	}

	public PhuongTienGiaoThong() {
		// TODO Auto-generated constructor stub
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	public String getTenPhuongTien() {
		return tenPhuongTien;
	}

	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}

	public int getNamSX() {
		return namSX;
	}

	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}

	public double getVanTocToiDa() {
		return vanTocToiDa;
	}

	public void setVanTocToiDa(double vanTocToiDa) {
		this.vanTocToiDa = vanTocToiDa;
	}

	public void nhapPhuongTienGiaoThong() {
		System.out.println("============= Nhập Phương Tiện Giao Thông ==============");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tên phương tiện : ");
		this.tenPhuongTien = scanner.nextLine();
		System.out.println("Hãng sản xuất : ");
		this.hangSX = scanner.nextLine();
		System.out.println("Năm sản xuất : ");
		this.namSX = Integer.parseInt(scanner.nextLine());
		System.out.println("Vận tốc tối đa : ");
		this.vanTocToiDa = Double.parseDouble(scanner.nextLine());
	}

	public void xuatPhuongTienGiaoThong() {
		System.out.println("=======> Thông tin Phương Tiện Giao Thông <========");
		System.out.println("Tên phương tiện : " + this.tenPhuongTien);
		System.out.println("Hãng sản xuất : " + this.hangSX);
		System.out.println("Năm sản xuất : " + this.namSX);
		System.out.println("Vận tốc tối đa : " + this.vanTocToiDa);
	}

}
