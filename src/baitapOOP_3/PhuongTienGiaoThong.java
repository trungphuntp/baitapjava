package baitapOOP_3;

import java.util.Scanner;

public class PhuongTienGiaoThong {
	protected String hangSX;
	protected String tenPhuongTien;
	protected int namSX;
	protected String mauSac;

	public PhuongTienGiaoThong(String hangSX, String tenPhuongTien, int namSX, String mauSac) {
		super();
		this.hangSX = hangSX;
		this.tenPhuongTien = tenPhuongTien;
		this.namSX = namSX;
		this.mauSac = mauSac;
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

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
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
		System.out.println("Màu sắc : ");
		this.mauSac = scanner.nextLine();
	}

	public void xuatPhuongTienGiaoThong() {
		System.out.println("=======> Thông tin về Phương Tiện Giao Thông <========");
		System.out.println("Tên phương tiện : " + this.tenPhuongTien);
		System.out.println("Hãng sản xuất : " + this.hangSX);
		System.out.println("Năm sản xuất : " + this.namSX);
		System.out.println("Màu sắc : " + this.mauSac);
	}

}
