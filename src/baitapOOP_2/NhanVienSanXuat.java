package baitapOOP_2;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {
	private double luongCoBan ;
	private int soLuongSanPham;
	
	
	public NhanVienSanXuat(String hoTen, String ngaySinh, double luongCoBan, int soLuongSanPham) {
		super(hoTen, ngaySinh);
		this.luongCoBan = luongCoBan;
		this.soLuongSanPham = soLuongSanPham;
	}
	
	public NhanVienSanXuat() {
		// TODO Auto-generated constructor stub
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public int getSoLuongSanPham() {
		return soLuongSanPham;
	}

	public void setSoLuongSanPham(int soLuongSanPham) {
		this.soLuongSanPham = soLuongSanPham;
	}
	
	@Override
	public void nhapNhanVien() {
		super.nhapNhanVien();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập lương cơ bản : " );
		this.luongCoBan = Double.parseDouble(scanner.nextLine());
		System.out.println("Nhập số lượng sản phẩm : ");
		this.soLuongSanPham = Integer.parseInt(scanner.nextLine());
	}
	
	@Override
	public void xuatNhanVien() {
		super.xuatNhanVien();
		System.out.println("Lương cơ bản : " + this.luongCoBan);
		System.out.println("Số lượng sản phẩm : " + this.soLuongSanPham);

	}
	
	
	public double layLuongNhanVien() {
		return (luongCoBan * soLuongSanPham * 5000);
	}
	
}
