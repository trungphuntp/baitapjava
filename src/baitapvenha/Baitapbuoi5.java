package baitapvenha;

import java.util.Scanner;

public class Baitapbuoi5 {
		public static void main(String[] args) {
//			troChoiKeoBuaBao();
//			timSoNguyenNhoNhat();
//			tongLeNhoHonSoN();
//			tinhTongSoS();
			tinhNamGuiTichKiem();
		}
		
//		Bài tập 1
		public static void troChoiKeoBuaBao() {
			System.out.println("================ Trò chơi kéo búa bao! ================");
			int diemNguoiChoi = 0;
			int diemMay = 0;		
			
			Scanner nhapLuaChon = new Scanner(System.in);
			int luaChon = 1;

			do {
				System.out.println("------- Bắt đầu trò chơi -------");
				
				// xử lí giao diện
				do {
					if (luaChon < 0 || luaChon > 3) {
						System.out.println("Vui lòng nhập 3 lựa chọn!");
					}
					System.out.println("Điểm người chơi: "+diemNguoiChoi + " <=====>" + " Điểm máy : " + diemMay);;
					System.out.println("Hãy chọn : \n"
							+ "1. Kéo \n"
							+ "2. Búa \n"
							+ "3. Bao \n");
					System.out.println("Nhập 0 để dừng trò chơi!");
					luaChon = Integer.parseInt(nhapLuaChon.nextLine());
					
				} while (luaChon < 0 || luaChon > 3);
				
				// xử lí kết quả
				if (luaChon != 0) {
					int luaChonMay = (int) (Math.random() * (3) + 1);
					if (luaChonMay ==  luaChon) {
						System.out.println("Người chơi chọn " +luaChonBangChu(luaChon) + "  -  Máy chọn "+ luaChonBangChu(luaChonMay));
						System.out.println("===> Máy và Người chơi hòa");
					} else if ((luaChonMay == 1 && luaChon == 3) || (luaChonMay == 2 && luaChon == 1)|| (luaChonMay == 3 && luaChon == 2) ) {
							System.out.println("Người chơi chọn " +luaChonBangChu(luaChon) + "  -  Máy chọn "+ luaChonBangChu(luaChonMay));
							System.out.println("==> Máy thắng");
							diemMay += 1;
					} else {
						System.out.println("Người chơi chọn " +luaChonBangChu(luaChon) + "  -  Máy chọn "+ luaChonBangChu(luaChonMay));
						System.out.println("===> Người chơi thắng");
						diemNguoiChoi += 1;
					}
				}
			} while (luaChon != 0);
			
			System.out.println("Tổng kết điểm: \n"
					+ "Người chơi: "+ diemNguoiChoi +"\n"
					+ "Máy:" + diemMay);
			
		}
		public static String luaChonBangChu(int luaChon) {
			String ketQua = "";	
			switch (luaChon) {
			case 1:
				ketQua =  "Kéo";
				break;
			case 2:
				ketQua =  "Búa";
				break;
			case 3:
				ketQua =  "Bao";
				break;
			default:
				break;
			}
			
			return ketQua;
		}
		
		
//		Bài tập 2
		public static void timSoNguyenNhoNhat() {
			System.out.println("============ Tìm số nguyên dương n nhỏ nhất sao cho : 1 + 2 + ...+ n > 10000 ============");
			int max = 10000;
			int sum = 0;
			int n = 0;
			while (sum <= max) {
				n++;
				sum+=n;
			}
			System.out.println("kết quả là : "+ (n));	
		}
		
//		Bài tập 3
		public static void tongLeNhoHonSoN() {
			System.out.println("============ Tổng lẻ nhỏ hơn số N ============");
			Scanner nhapN = new Scanner(System.in);
			int N ;
			int ketQua = 0; 
			
			do {
				System.out.println("Vui lòng nhập số N : ");
				N = Integer.parseInt(nhapN.nextLine());
			} while (N <= 0);
			
			for (int i = 1; i < N; i++) {
				if (i % 2 != 0) {
					ketQua +=i;
				}
			}
			System.out.println("Kết quả là : " + ketQua);
		}
		
//		Bài tập 4
		public static void tinhTongSoS() {
			System.out.println("============ tính S(n) = x + x^2 + x^3 + ...+ x^n ============");
			Scanner nhapSo = new Scanner(System.in);
			
			int ketQua = 0; 
			
			System.out.println("Vui lòng nhập số N : ");
			int N = Integer.parseInt(nhapSo.nextLine());
		
			System.out.println("Vui lòng nhập số X : ");
			int X = Integer.parseInt(nhapSo.nextLine());
			
			for (int i = 1; i <= N; i++) {
				ketQua += Math.pow(X, i);
			}
			
			System.out.println("Kết quả là : "+ketQua);
		}

//		Bài tập 5
		public static void tinhNamGuiTichKiem() {
			System.out.println("=============== Tính số năm để anh X có số tiền mong muốn trong tương lai sau khi gởi tiết kiệm ===============");
			double laiSuat = 8;
			
			Scanner scan = new Scanner(System.in);
			
			double tienGoi = 0;
			double tienLoi = 0;
		
			
			double tienMongMuon = 0;
			double namChoDoi = 0;
			double tongTien = 0;
			
			do {
				System.out.println("Nhập số tiền muốn gởi : ");
			tienGoi	= Double.parseDouble(scan.nextLine());
				
			System.out.println("Nhập số tiền mong muốn sau khi gởi : ");
			tienMongMuon =	Double.parseDouble(scan.nextLine());

			} while (tienGoi < 0 || tienMongMuon < 0);
			
			while (tongTien < tienMongMuon) {
				namChoDoi++;
				tongTien = tienGoi * Math.pow((1 + (laiSuat / 100)/1) , (namChoDoi * 1));			
			}
			System.out.println("=========== Tổng kết ============");
			System.out.println("tiền gởi là : " + tienGoi + " VND");
			System.out.println("tiền mong muốn là : " + tienMongMuon +" VND");
			System.out.println("Tổng tiền sau khi gởi là: " + (tongTien) + " VND");
			System.out.println("Năm chờ đợi là : " + namChoDoi + " năm");
			
		}
}
