package QUANLYSVNANGCAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSinhVIen {
	private ArrayList<SinhVien> danhSach;
	private Scanner sc;

	public QuanLiSinhVIen() {
		this.danhSach = new ArrayList<SinhVien>();
		this.sc = new Scanner(System.in);
	}

	public void taoDuLieuGia() {
		System.out.println("Đang tạo dữ liệu giả...");
		danhSach.add(new SinhVien("Nguyen Van A", "SV001", 8.5, 7.5, 9.0));
		danhSach.add(new SinhVien("Tran Thi B", "SV002", 9.5, 9.0, 8.5));
		danhSach.add(new SinhVien("Le Van C", "SV003", 6.0, 5.5, 4.0));
		danhSach.add(new SinhVien("Pham Thi D", "SV004", 7.5, 8.0, 7.0));
		danhSach.add(new SinhVien("Hoang Van E", "SV005", 4.5, 3.0, 5.0));
		danhSach.add(new SinhVien("Vu Thi F", "SV006", 9.0, 9.5, 8.5));
		danhSach.add(new SinhVien("Do Van G", "SV007", 6.5, 7.0, 6.0));
	}

	public void ThemSinhVien() {
		SinhVien sv = new SinhVien();
		sv.nhapThongTin();
		danhSach.add(sv);
		System.out.println("Thêm sinh viên thành công...");
	}

	public void xepLoaiSvTheoDiemTB() {
		System.out.println("======= Xếp loại tất cả sinh viên =======");
		for (SinhVien sinhVien : danhSach) {
			System.out.println("===> Tên : " + sinhVien.getHoTen() + " - Điểm TB : " + sinhVien.tinhDiemTB()
					+ " - Xếp loại : " + sinhVien.xepLoaiSv());
		}
	}

	public void laySVDiemTBCaoNhat() {
		System.out.println("===== Sinh viên có điểm TB cao nhất =======");
		SinhVien svDiemCaoNhat = null;
		List<SinhVien> listSVCaoNhat = new ArrayList<SinhVien>();
		double maxDiemTB = 0;

		for (SinhVien sinhVien : danhSach) {
			if (maxDiemTB < sinhVien.tinhDiemTB()) {
				maxDiemTB = sinhVien.tinhDiemTB();
				svDiemCaoNhat = sinhVien;
			}
		}
		for (SinhVien sinhVien : danhSach) {
			if (maxDiemTB == sinhVien.tinhDiemTB()) {
				listSVCaoNhat.add(sinhVien);
			}
		}

		for (SinhVien sinhVien : listSVCaoNhat) {
			sinhVien.xuatThongTin();
		}
	}

	public void laySvYeu() {
		System.out.println("======== Danh sách sinh viên xếp loại Yếu =========");
		List<SinhVien> listSVYeu = new ArrayList<SinhVien>();
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.xepLoaiSv().equals("Yếu")) {
				listSVYeu.add(sinhVien);
			}
		}
		for (SinhVien sinhVien : listSVYeu) {
			System.out.println("==> Tên : " + sinhVien.getHoTen() + " - xếp loại : " + sinhVien.xepLoaiSv()
					+ " - Điểm TB : " + sinhVien.tinhDiemTB());
		}
	}

	public void timSVTheoTen() {
		System.out.println(" ===> Nhập tên sinh viên cần tìm : ");
		String tenSV = sc.nextLine().trim();

		System.out.println("======== Danh sách sinh viên tìm theo tên =========");
		List<SinhVien> listSVTheoTen = new ArrayList<SinhVien>();
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoTen().toLowerCase().contains(tenSV.toLowerCase())) {
				listSVTheoTen.add(sinhVien);
			}
		}
		if (listSVTheoTen.size() <= 0) {
			System.out.println("Không tìm thấy sinh viên!");
		} else {
			for (SinhVien sinhVien : listSVTheoTen) {
				sinhVien.xuatThongTin();
			}
		}
	}

	public void timSVTheoMaSv() {
		System.out.println("======== Danh sách sinh viên tìm theo mã sinh viên =========");
		System.out.println(" ===> Nhập mã sinh viên cần tìm : ");
		List<SinhVien> listSvTheoMaSv = new ArrayList<SinhVien>();

		String maSVTim = sc.nextLine().trim();
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getMaSv().toLowerCase().contains(maSVTim.toLowerCase())) {
				listSvTheoMaSv.add(sinhVien);
			}
		}
		if (listSvTheoMaSv.size() < 1) {
			System.out.println("Không tìm thấy sinh viên!");
		} else {
			for (SinhVien sinhVien : listSvTheoMaSv) {
				sinhVien.xuatThongTin();
			}
		}
	}

	public void xoaSVTheoMaSv() {
		System.out.println("======== Xóa sinh viên tìm theo mã sinh viên =========");
		System.out.println(" ===> Nhập mã sinh viên cần xóa : ");
		String maSVXoa = sc.nextLine().trim();
		SinhVien svDaXoa = null;

		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getMaSv().toLowerCase().equals(maSVXoa.toLowerCase())) {
				svDaXoa = sinhVien;
				break;
			}
		}

		if (svDaXoa == null) {
			System.out.println("Không tìm thấy sinh viên!");
		} else {
			int xacNhanXoa = 0;
			
			do {
				System.out.println("Bạn có chắc chắc muốn xóa sinh viên có mã sinh viên : " + svDaXoa.getMaSv());
				System.out.println("Lựa chọn : \n" + "1. Xác nhận. \n" + "2. Hủy bỏ");
				 xacNhanXoa = Integer.parseInt(sc.nextLine().trim());
				if (xacNhanXoa == 1) {
					danhSach.remove(svDaXoa);
					System.out.println("==> Đã xóa sinh viên : ");
					svDaXoa.xuatThongTin();
				} 
				if (xacNhanXoa == 2) {
						System.out.println("Hủy xóa sinh viên...");
					
				}
			} while (xacNhanXoa != 1 && xacNhanXoa !=2);
			
		}
	}
	
	public  void xuatToanBoSv() {
		System.out.println("========= Danh sách sinh viên ============");
		for (SinhVien sinhVien : danhSach) {
			sinhVien.xuatThongTin();
		}
	}
	
	

}
