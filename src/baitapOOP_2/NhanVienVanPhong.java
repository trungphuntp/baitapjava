package baitapOOP_2;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien{
	private int soNgayLamViec;

	
	
	public NhanVienVanPhong(String hoTen, String ngaySinh, int soNgayLamViec) {
		super(hoTen, ngaySinh);
		this.soNgayLamViec = soNgayLamViec;
	}

	public NhanVienVanPhong() {
		// TODO Auto-generated constructor stub
	}

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	@Override
	public void nhapNhanVien() {
		super.nhapNhanVien();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số ngày làm việc : " );
		this.soNgayLamViec = Integer.parseInt(scanner.nextLine());
	}
	@Override
	public void xuatNhanVien() {
		super.xuatNhanVien();
		System.out.println("Số ngày làm việc : " + this.soNgayLamViec);

	}
	
	public double tinhLuongNhanVien() {
		return soNgayLamViec * 100000;
	}
	
}
