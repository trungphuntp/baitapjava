package baitapOOP_3;

import java.util.Scanner;

public class XeMay extends PhuongTienGiaoThong {
	private String soKhungXe;
	private double vanTocToiDa;

	public XeMay(String hangSX, String tenPhuongTien, int namSX, String mauSac, String soKhungXe, double vanTocToiDa) {
		super(hangSX, tenPhuongTien, namSX, mauSac);
		this.soKhungXe = soKhungXe;
		this.vanTocToiDa = vanTocToiDa;
	}
	public XeMay() {
		// TODO Auto-generated constructor stub
	}
	public String getSoKhungXe() {
		return soKhungXe;
	}
	public void setSoKhungXe(String soKhungXe) {
		this.soKhungXe = soKhungXe;
	}
	
	
	@Override
	public void xuatPhuongTienGiaoThong() {
		// TODO Auto-generated method stub
		super.xuatPhuongTienGiaoThong();
		System.out.println("Số khung xe : " + this.soKhungXe);
		System.out.println("Vận tốc tối đa : " + this.vanTocToiDa);
	}
	
	@Override
	public void nhapPhuongTienGiaoThong() {
		// TODO Auto-generated method stub
		super.nhapPhuongTienGiaoThong();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số khung xe : ");
		this.soKhungXe = scanner.nextLine();
		System.out.println("Vận tối tối đa : ");
		this.vanTocToiDa = Double.parseDouble(scanner.nextLine());
	}
}
