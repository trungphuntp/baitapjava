package baitapOOP_2;

import java.util.Scanner;

public class PhanSo {
	private double tuso;
	private double mauso;
	
	public PhanSo(double tuso, double mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	
	}
	
	public PhanSo() {
		// TODO Auto-generated constructor stub
	}

	public double getTuso() {
		return tuso;
	}

	public void setTuso(double tuso) {
		this.tuso = tuso;
	}

	public double getMauso() {
		return mauso;
	}

	public void setMauso(double mauso) {
		this.mauso = mauso;
	}
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tử số : ");
		this.tuso = Double.parseDouble(scanner.nextLine());
		double mausoScan = 0;
		do {
			System.out.println("Nhập mẫu số (mẫu số khác 0) : ");
			mausoScan =  Double.parseDouble(scanner.nextLine());
			if ( mausoScan == 0 ) {
				this.mauso = mausoScan;
			}
			
		} while (mausoScan == 0);
	}
	
	public void xuatThongTin() {
		System.out.println("Tử số là : " + this.tuso);
		System.out.println("Mẫu số là : " + this.mauso);
	}
	
	public double tinhCong(PhanSo ps2) {
		double ts = this.tuso * ps2.getMauso()  + this.mauso * ps2.getTuso();
		double ms = this.mauso * ps2.getMauso();
		return ts / ms;
	}
	
	public double tinhTru(PhanSo ps2) {
		double ts = this.tuso * ps2.getMauso()  - this.mauso * ps2.getTuso();
		double ms = this.mauso * ps2.getMauso();
		return ts / ms;
	}	
	
	public double tinhNhan(PhanSo ps2) {
		double ts = this.tuso * ps2.getTuso();
		double ms = this.mauso * ps2.getMauso();
		return ts / ms;

	}
	
	public double tinhChia(PhanSo ps2) {
		double ts = this.tuso * ps2.getMauso();
		double ms = this.mauso * ps2.getTuso();
		return ts / ms;

	}
	
	
}
