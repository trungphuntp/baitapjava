package baitapOOP_3;

public class ThietBiDien {
	protected String tenThietBi;
	protected String hangSX;
	protected double congSuat;
	protected boolean trangThaiHoatDong;
	protected String chucNang;

	public ThietBiDien(String tenThietBi, String hangSX, double congSuat, boolean trangThaiHoatDong, String chucNang) {
		this.tenThietBi = tenThietBi;
		this.hangSX = hangSX;
		this.congSuat = congSuat;
		this.trangThaiHoatDong = trangThaiHoatDong;
		this.chucNang = chucNang;
	}

	public ThietBiDien() {
		// TODO Auto-generated constructor stub
	}

	public String getTenThietBi() {
		return tenThietBi;
	}

	public void setTenThietBi(String tenThietBi) {
		this.tenThietBi = tenThietBi;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	public boolean isTrangThaiHoatDong() {
		return trangThaiHoatDong;
	}

	public void setTrangThaiHoatDong(boolean trangThaiHoatDong) {
		this.trangThaiHoatDong = trangThaiHoatDong;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}
	
	

}
