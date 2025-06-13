package baitapOOP_3;

public class MaySay extends ThietBiDien {
	private String cheDo; // "MẠNH" hay "YẾU"
	private int thoiGianSay;
	
	
	
	public MaySay(String tenThietBi, String hangSX, double congSuat, boolean trangThaiHoatDong, String chucNang,
			String cheDo, int thoiGianSay) {
		super(tenThietBi, hangSX, congSuat, trangThaiHoatDong, chucNang);
		this.cheDo = cheDo;
		this.thoiGianSay = thoiGianSay;
	}

	public MaySay() {
		// TODO Auto-generated constructor stub
	}

	public String getCheDo() {
		return cheDo;
	}

	public void setCheDo(String cheDo) {
		this.cheDo = cheDo;
	}

	public int getThoiGianSay() {
		return thoiGianSay;
	}

	public void setThoiGianSay(int thoiGianSay) {
		this.thoiGianSay = thoiGianSay;
	}
	
	public void batMaySay() {
		trangThaiHoatDong = true;
		System.out.println("Máy sấy đang bật...");
	}
	
	public void tatMaySay() {
		trangThaiHoatDong = false;
		System.out.println("Máy sấy đang tắt...");
	}
	public void caiDatThoiGianSay (int phut) {
		System.out.println("Máy sấy sẽ sấy trong "+phut+ " phút sẽ tắt!");
	}
}
