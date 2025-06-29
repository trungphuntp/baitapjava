package baitapOOP;

public class SinhVien {
	private String hoTen;
	private String maSv;
	private double diemToan;
	private double diemLy;
	private double diemHoa;

	//	CONSTRUCTION
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(String hoTen, String maSv, int diemToan, int diemLy, int diemHoa) {
		this.hoTen = hoTen;
		this.maSv = maSv;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	 
	// GETTER / SETTER
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	// METHOD Sinh Vien
	public double tinhDiemTB() {
		 final int soLuongMon = 3;
		double diemTB = 0;
		diemTB = (double) (diemHoa + diemLy + diemToan) / soLuongMon;
		return diemTB; 
	}
	
	public String xepLoaiSv() {
		double diemTB = tinhDiemTB();
		String loaiSv = "";
		if (diemTB >= 9) {
			loaiSv = "Xuất Sắc";
		} else if(diemTB < 9 && diemTB >=8){
			loaiSv = "Giỏi";
		} else if(diemTB < 8 && diemTB >=7){
			loaiSv = "Khá";
		} else if(diemTB < 7 && diemTB >=6){
			loaiSv = "Trung Bình Khá";
		} else if(diemTB < 6 && diemTB >=5){
			loaiSv = "Trung Bình";
		} else {
			loaiSv = "Yếu";
		}
		return loaiSv;
	}
	
	
	
}
