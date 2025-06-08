package QUANLYSVNANGCAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
			int luaChon = 0;
			Scanner scanLuaChon = new Scanner(System.in);
			List<SinhVien> listSv = new ArrayList<SinhVien>();
			do {
				System.out.println("======================== QUẢN LÝ SINH VIÊN =====================");
				System.out.println("1. Thêm sinh viên.");
				System.out.println("2. Xếp loại tất cả sinh viên.");
				System.out.println("3. In ra điểm TB cao nhất.");
				System.out.println("4. In ra tất cả học sinh Yếu.");
				System.out.println("5. Tìm danh sách sinh viên theo tên.");
				System.out.println("6. Tìm sinh viên theo mã sinh viên.");
				System.out.println("7. Xóa sinh viên theo mã sinh viên.");
				System.out.println("8. Xuất toàn bộ danh sách sinh viên");
				System.out.println("0. Thoát.");
				luaChon = Integer.parseInt(scanLuaChon.nextLine());
				if (luaChon == 1) {
					SinhVien sv = new SinhVien();
					sv.nhapThongTin();
					listSv.add(sv);
				} else if(luaChon == 2) {
					xepLoaiSvTheoDiemTB(listSv);
				} else if(luaChon == 3) {
					laySVDiemTBCaoNhat(listSv);
				} else if(luaChon == 4) {
					laySvYeu(listSv);
				} else if (luaChon == 5) {
					System.out.println(" ===> Nhập tên sinh viên cần tìm : ");
					Scanner sc = new Scanner(System.in);
					String tenSVTim = sc.nextLine();
					timSVTheoTen(listSv, tenSVTim);
				} else if(luaChon == 6) {
					System.out.println("======== Danh sách sinh viên tìm theo mã sinh viên =========");
					System.out.println(" ===> Nhập mã sinh viên cần tìm : ");
					Scanner sc = new Scanner(System.in);
					String maSVTim = sc.nextLine();
					SinhVien svDaTim =  timSVTheoMaSv(listSv, maSVTim);
					if (svDaTim == null) {
						System.out.println("Không tìm thấy sinh viên!");
					} else {
						svDaTim.xuatThongTin();
					}
				} else if (luaChon == 7) {
					System.out.println("======== Xóa sinh viên tìm theo mã sinh viên =========");
					System.out.println(" ===> Nhập mã sinh viên cần xóa : ");
					Scanner sc = new Scanner(System.in);
					String maSVXoa = sc.nextLine();
					SinhVien svDaXoa = timSVTheoMaSv(listSv, maSVXoa);
					if ( svDaXoa == null) {
						System.out.println("Không tìm thấy sinh viên!");
					} else {
						listSv.remove(svDaXoa);
						System.out.println("==> đã xóa sinh viên : ");
						svDaXoa.xuatThongTin();
					}
				} else if(luaChon == 8) {
					System.out.println("========= Danh sách sinh viên ============");
					xuatToanBoSv(listSv);
				}
				
			} while (luaChon != 0);
	}
	
	public static void xepLoaiSvTheoDiemTB(List<SinhVien> list) {
		System.out.println("======= Xếp loại tất cả sinh viên =======");

		for (SinhVien sinhVien : list) {
			System.out.println("===> Tên : " + sinhVien.getHoTen() +" - Điểm TB : " + sinhVien.tinhDiemTB() +" - Xếp loại : "+ sinhVien.xepLoaiSv()); 
		}
	}
	public static void laySVDiemTBCaoNhat(List<SinhVien> list) {
		System.out.println("===== Sinh viên có điểm TB cao nhất =======");
		SinhVien svDiemCaoNhat = null;
		List<SinhVien> listSVCaoNhat = new ArrayList<SinhVien>();
		double maxDiemTB = 0;
		
	
		for (SinhVien sinhVien : list) {
			if (maxDiemTB < sinhVien.tinhDiemTB()) {
				maxDiemTB = sinhVien.tinhDiemTB();
				svDiemCaoNhat = sinhVien;
			}
		}
		for (SinhVien sinhVien : list) {
			if (maxDiemTB == sinhVien.tinhDiemTB()) {
				listSVCaoNhat.add(sinhVien);
			}
		}		
	
		for (SinhVien sinhVien : listSVCaoNhat) {
			sinhVien.xuatThongTin();
		}
	}
	
	public static void laySvYeu(List<SinhVien> list) {
		System.out.println("======== Danh sách sinh viên xếp loại Yếu =========");
		List<SinhVien> listSVYeu = new ArrayList<SinhVien>();
		for (SinhVien sinhVien : list) {
			if (sinhVien.xepLoaiSv().equals("Yếu")) {
				listSVYeu.add(sinhVien);
			}
		}
		for (SinhVien sinhVien : listSVYeu) {
			System.out.println("==> Tên : " + sinhVien.getHoTen()+ " - xếp loại : "+ sinhVien.xepLoaiSv() + " - Điểm TB : " + sinhVien.tinhDiemTB());

		}
	}
	
	public static void timSVTheoTen(List<SinhVien> list , String tenSV) {
		System.out.println("======== Danh sách sinh viên tìm theo tên =========");
		List<SinhVien> listSVTheoTen = new ArrayList<SinhVien>();
		
		for (SinhVien sinhVien : list) {
			if (sinhVien.getHoTen().equals(tenSV)) {
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
	
	public static SinhVien timSVTheoMaSv(List<SinhVien> list , String maSV) {
		for (SinhVien sinhVien : list) {
			if (sinhVien.getMaSv().equals(maSV)) {
				return sinhVien;
			}
		}
		return null;
	}
	
	public static void xuatToanBoSv(List<SinhVien> list) {
		for (SinhVien sinhVien : list) {
			sinhVien.xuatThongTin();
		}
	}
		
}
