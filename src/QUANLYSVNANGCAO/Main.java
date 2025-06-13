package QUANLYSVNANGCAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
			int luaChon = 0;
			Scanner scanLuaChon = new Scanner(System.in);
			QuanLiSinhVIen qlsv = new QuanLiSinhVIen();
			do {
				System.out.println("====================== QUẢN LÝ SINH VIÊN =====================");
				System.out.println("1. Thêm sinh viên.");
				System.out.println("2. Xếp loại tất cả sinh viên.");
				System.out.println("3. In ra điểm TB cao nhất.");
				System.out.println("4. In ra tất cả học sinh Yếu.");
				System.out.println("5. Tìm danh sách sinh viên theo tên.");
				System.out.println("6. Tìm sinh viên theo mã sinh viên.");
				System.out.println("7. Xóa sinh viên theo mã sinh viên.");
				System.out.println("8. Xuất toàn bộ danh sách sinh viên.");
				System.out.println("9. Tạo dữ liệu giả.");
				System.out.println("0. Thoát chương trình.");
				System.out.println("Hãy chọn option: ");
				luaChon = Integer.parseInt(scanLuaChon.nextLine());
				if (luaChon == 1) {
					qlsv.ThemSinhVien();
				} else if(luaChon == 2) {
					qlsv.xepLoaiSvTheoDiemTB();
				} else if(luaChon == 3) {
					qlsv.laySVDiemTBCaoNhat();
				} else if(luaChon == 4) {
					qlsv.laySvYeu();
				} else if (luaChon == 5) {
					qlsv.timSVTheoTen();
				} else if(luaChon == 6) {
					qlsv.timSVTheoMaSv();
				} else if (luaChon == 7) {
					qlsv.xoaSVTheoMaSv();
				} else if(luaChon == 8) {
					qlsv.xuatToanBoSv();
				}else if(luaChon == 9) {
					qlsv.taoDuLieuGia();
				}
			} while (luaChon != 0);
	}
	

		
}
