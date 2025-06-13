package baitapOOP_2;

import java.util.Scanner;

public class NhanVien {
	protected String hoTen;
	protected String ngaySinh;

	public NhanVien(String hoTen, String ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void nhapNhanVien() {
		System.out.println("============ Nhập thông tin nhân viên ===============");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên : ");
		this.hoTen = scanner.nextLine();
		System.out.println("Nhập Ngày sinh : ");
		this.ngaySinh = scanner.nextLine();
	}

	public void xuatNhanVien() {
		System.out.println("============== Xuất thông tin ====================");
		System.out.println("Họ tên : " + this.hoTen);
		System.out.println("Ngày sinh : " + this.ngaySinh);

	}

}
