package baitapOOP_2;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong{
	private int soChoNgoi;
	private String kieuDongCo;
	
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	
	public Oto() {
		// TODO Auto-generated constructor stub
	}
	
	public Oto(String hangSX, String tenPhuongTien, int namSX, double vanTocToiDa, int soChoNgoi, String kieuDongCo) {
		super(hangSX, tenPhuongTien, namSX, vanTocToiDa);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}
	@Override
	public void nhapPhuongTienGiaoThong() {
		super.nhapPhuongTienGiaoThong();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số chỗ người : ");
		this.soChoNgoi = Integer.parseInt(scanner.nextLine());
		System.out.println("Kiểu động cơ : ");
		this.kieuDongCo =  scanner.nextLine();
	}
	
	@Override
	public void xuatPhuongTienGiaoThong() {
		super.xuatPhuongTienGiaoThong();
		System.out.println("Số chỗ người : " + this.soChoNgoi);
		System.out.println("Kiểu động cơ : " + this.kieuDongCo);
	}
	
	
}
