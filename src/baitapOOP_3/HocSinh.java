package baitapOOP_3;

import java.util.Scanner;

public class HocSinh {
	private String hoTen;
	private int tuoi;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	public HocSinh(String hoTen, int tuoi, double diemToan, double diemLy, double diemHoa) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	public HocSinh() {
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
	
	public void nhapThongTin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập thông tin học sinh!");
		System.out.println("Nhập tên học sinh : ");
		this.hoTen = scan.nextLine();
		System.out.println("Nhập tuổi học sinh : ");
		this.tuoi = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập điểm Toán của học sinh "+ this.hoTen+" :");
		this.diemToan = Double.parseDouble(scan.nextLine());
		System.out.println("Nhập điểm Lý của học sinh "+ this.hoTen+" :");
		this.diemLy = Double.parseDouble(scan.nextLine());
		System.out.println("Nhập điểm Hóa của học sinh "+ this.hoTen+" :");
		this.diemHoa = Double.parseDouble(scan.nextLine());
	}
	
	public void xuatThongTin() {
		System.out.println("==> Tên : " + hoTen + " - Tuổi : " + tuoi + " - Toán : " + diemToan + " - Lý : "+ diemLy + " - Hóa : "+ diemHoa);
	}
	
	public double tinhDiemTB() {
		 final int soLuongMon = 3;
		double diemTB = 0;
		diemTB = (double) (diemHoa + diemLy + diemToan) / soLuongMon;
		return diemTB; 
	}
}
