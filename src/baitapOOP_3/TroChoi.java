package baitapOOP_3;

import java.util.Scanner;

public class TroChoi {
	private String tenTroChoi;
	private int soLuotDaChoi;
	private boolean isDangChoiTroChoi;
	
	
	
	public TroChoi(String tenTroChoi, int soLuotDaChoi, boolean isDangChoiTroChoi) {
		super();
		this.tenTroChoi = tenTroChoi;
		this.soLuotDaChoi = soLuotDaChoi;
		this.isDangChoiTroChoi = isDangChoiTroChoi;
	}

	public TroChoi() {
		// TODO Auto-generated constructor stub
	}

	public String getTenTroChoi() {
		return tenTroChoi;
	}

	public void setTenTroChoi(String tenTroChoi) {
		this.tenTroChoi = tenTroChoi;
	}

	public int getSoLuotDaChoi() {
		return soLuotDaChoi;
	}

	public void setSoLuotDaChoi(int soLuotDaChoi) {
		this.soLuotDaChoi = soLuotDaChoi;
	}

	public boolean isDangChoiTroChoi() {
		return isDangChoiTroChoi;
	}

	public void setDangChoiTroChoi(boolean isDangChoiTroChoi) {
		this.isDangChoiTroChoi = isDangChoiTroChoi;
	}

	public void trangThaiTroChoi() {
		System.out.println("Tên trò chơi : " + this.tenTroChoi);
		System.out.println("Số lượt đã chơi : " + this.soLuotDaChoi);
		System.out.println("Trạng thái đang chơi : " + this.isDangChoiTroChoi);
	}
	
	public void batDauTroChoi() {
		this.isDangChoiTroChoi = true;
		System.out.println("Bắt đầu trò chơi...");
	}
	public void ketThucTroChoi() {
		this.isDangChoiTroChoi = false;
		this.soLuotDaChoi +=1;
		System.out.println("kết thúc trò chơi...");
	}
}
