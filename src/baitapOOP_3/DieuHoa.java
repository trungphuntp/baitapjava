package baitapOOP_3;

public class DieuHoa extends ThietBiDien {
	private double nhietDoCaoNhat;
	private double nhietDongThapNhat;
	private double nhietDoHienTai;
	public DieuHoa(String tenThietBi, String hangSX, double congSuat, boolean trangThaiHoatDong, String chucNang,
			double nhietDoCaoNhat, double nhietDongThapNhat, double nhietDoHienTai) {
		super(tenThietBi, hangSX, congSuat, trangThaiHoatDong, chucNang);
		this.nhietDoCaoNhat = nhietDoCaoNhat;
		this.nhietDongThapNhat = nhietDongThapNhat;
		this.nhietDoHienTai = nhietDoHienTai;
	}
	
	public DieuHoa() {
		// TODO Auto-generated constructor stub
	}

	public double getNhietDoCaoNhat() {
		return nhietDoCaoNhat;
	}

	public void setNhietDoCaoNhat(double nhietDoCaoNhat) {
		this.nhietDoCaoNhat = nhietDoCaoNhat;
	}

	public double getNhietDongThapNhat() {
		return nhietDongThapNhat;
	}

	public void setNhietDongThapNhat(double nhietDongThapNhat) {
		this.nhietDongThapNhat = nhietDongThapNhat;
	}

	public double getNhietDoHienTai() {
		return nhietDoHienTai;
	}

	public void setNhietDoHienTai(double nhietDoHienTai) {
		this.nhietDoHienTai = nhietDoHienTai;
		if (nhietDoHienTai > nhietDoCaoNhat) {
			nhietDoHienTai = nhietDoCaoNhat;
		} 
		if (nhietDoHienTai <  nhietDongThapNhat) {
			nhietDoHienTai = nhietDongThapNhat;
		} 
	}
	
	public void batDieuHoa() {
		trangThaiHoatDong = true;
		System.out.println("Điều hòa đang bật...");
	}
	public void tatDieuHoa() {
		trangThaiHoatDong = false;
		System.out.println("Điều hòa đang tắt...");
	}
	
}
