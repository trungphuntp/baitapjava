package baitapOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Bài tập Quản lý sinh viên
		 Scanner scan = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		System.out.println("Nhập thông tin sinh viên!");
		System.out.println("Nhập tên sinh viên : ");
		sv.setHoTen(scan.nextLine());
		System.out.println("Nhập mã sinh viên : ");
		sv.setMaSv(scan.nextLine());
		System.out.println("Nhập điểm Toán của sinh viên "+ sv.getHoTen()+" :");
		sv.setDiemToan(Double.parseDouble(scan.nextLine()));
		System.out.println("Nhập điểm Lý của sinh viên "+ sv.getHoTen()+" :");
		sv.setDiemLy(Double.parseDouble(scan.nextLine()));
		System.out.println("Nhập điểm Hóa của sinh viên "+ sv.getHoTen()+" :");
		sv.setDiemHoa(Double.parseDouble(scan.nextLine()));
		
		// Điểm trung bình
		System.out.println("Điểm trung bình của sinh viên "+sv.getHoTen()+ " là : " + sv.tinhDiemTB());
		
		// xếp loại sv
		System.out.println("Sinh vien "+sv.getHoTen()+ " xếp loại : " + sv.xepLoaiSv());
	}
}
