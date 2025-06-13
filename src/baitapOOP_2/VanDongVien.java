package baitapOOP_2;

import java.util.Scanner;

public class VanDongVien {
	private String hoTen;
	private int tuoi;
	private String monThiDau;
	private double canNang;
	private double chieuCao;
	public VanDongVien(String hoTen, int tuoi, String monThiDau, double canNang, double chieuCao) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.monThiDau = monThiDau;
		this.canNang = canNang;
		this.chieuCao = chieuCao;
	}
	
	public VanDongVien() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMonThiDau() {
		return monThiDau;
	}

	public void setMonThiDau(String monThiDau) {
		this.monThiDau = monThiDau;
	}

	public double getCanNang() {
		return canNang;
	}

	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}

	public double getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}

	public void nhapThongTin() {
		System.out.println("=========== Nhập thông tin vận động viên ===================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Họ tên : ");
		this.hoTen = scanner.nextLine();
		
		System.out.println("Tuổi : ");
		this.tuoi = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Môn thi đấu : ");
		this.monThiDau = scanner.nextLine();
		
		System.out.println("Cân nặng : ");
		this.canNang = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Chiều cao : ");
		this.chieuCao = Double.parseDouble(scanner.nextLine());
	}
	
	public void xuatThongTin() {
		System.out.println("============ Xuất thông tin vận động viên ===================");
		System.out.println("Họ tên vận động viên : " + this.hoTen);
		System.out.println("Tuổi : " + this.tuoi);
		System.out.println("Môn thi đấu : "+ this.monThiDau);	
		System.out.println("Cân nặng : " + this.canNang);
		System.out.println("Chiều cao : " + this.chieuCao);

	}
	
	public VanDongVien soSanhVDVLonHon(VanDongVien vdv) {
		VanDongVien resultVDV = null;
		if (this.chieuCao == vdv.getChieuCao()) {
			if (this.canNang > vdv.getCanNang()) {
				resultVDV =  this;
			} else {
				resultVDV =  vdv;
			}
		}
		if (this.chieuCao > vdv.getChieuCao()) {
			resultVDV =  this;
		} else {
			resultVDV =  vdv;
		}
		return resultVDV;
	}
	
}
