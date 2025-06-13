package baitapOOP_3;

import java.util.Scanner;

public class XeHoi extends PhuongTienGiaoThong{
	private String dongCo;
	private int soChoNgoi;


	public XeHoi(String hangSX, String tenPhuongTien, int namSX, String mauSac, String dongCo, int soChoNgoi) {
		super(hangSX, tenPhuongTien, namSX, mauSac);
		this.dongCo = dongCo;
		this.soChoNgoi = soChoNgoi;
	}

	public XeHoi() {
		// TODO Auto-generated constructor stub
	}

	public String getDongCo() {
		return dongCo;
	}

	public void setDongCo(String dongCo) {
		this.dongCo = dongCo;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	@Override
	public void xuatPhuongTienGiaoThong() {
		// TODO Auto-generated method stub
		super.xuatPhuongTienGiaoThong();
		System.out.println("Động cơ : " + this.dongCo);
		System.out.println("Số chỗ ngồi : " + this.soChoNgoi);
	}

	@Override
	public void nhapPhuongTienGiaoThong() {
		// TODO Auto-generated method stub
		super.nhapPhuongTienGiaoThong();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Động cơ : ");
		this.dongCo = scanner.nextLine();
		System.out.println("Số chỗ ngồi : ");
		this.soChoNgoi = Integer.parseInt(scanner.nextLine());
	}
	 
	
}
