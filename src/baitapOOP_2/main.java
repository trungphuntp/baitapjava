package baitapOOP_2;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		// Bài tập 4
		List<PhuongTienGiaoThong> listPhuongTien = new ArrayList<PhuongTienGiaoThong>();
		Oto pt1 = new Oto("BWM", "BWM", 2005, 30, 4, "6 thi");
		PhuongTienGiaoThong pt2 = new PhuongTienGiaoThong("Vin fat", "VF3", 2025, 30); 
		PhuongTienGiaoThong pt3 = new PhuongTienGiaoThong("Vincent", "VC10", 2025, 50); 
		PhuongTienGiaoThong pt4 = new PhuongTienGiaoThong("Mec", "Mec", 2015, 50); 
		PhuongTienGiaoThong pt5= new PhuongTienGiaoThong("audi", "audi v3", 2022, 40);
		PhuongTienGiaoThong pt6 = new PhuongTienGiaoThong("Vingood 2", "VG3", 2001, 30); 

		listPhuongTien.add(pt1);
		listPhuongTien.add(pt2);
		listPhuongTien.add(pt3);
		listPhuongTien.add(pt4);
		listPhuongTien.add(pt5);
		listPhuongTien.add(pt6);

		layDsPhuongTienCungVanToc(listPhuongTien).forEach(item -> {
			item.forEach(item2->{
				item2.xuatPhuongTienGiaoThong();
			});
			System.out.println("<=======================================================================>");
		});;
		
	
	}
	
	
	
	public static List<List<PhuongTienGiaoThong>> layDsPhuongTienCungVanToc(List<PhuongTienGiaoThong> listPt) {
		List<List<PhuongTienGiaoThong>> listKetQua = new ArrayList<List<PhuongTienGiaoThong>>();
		
		List<PhuongTienGiaoThong> listPtCungVanToc = new ArrayList<PhuongTienGiaoThong>();
		
		List<Double> listVanTocCung = new ArrayList<Double>();
		for (PhuongTienGiaoThong phuongTienGiaoThong : listPt) {
			double vanTocKiemTra = phuongTienGiaoThong.getVanTocToiDa();
			for (PhuongTienGiaoThong phuongTienGiaoThong_2 : listPt) {
				if (!phuongTienGiaoThong_2.equals(phuongTienGiaoThong)) {
					if (phuongTienGiaoThong_2.getVanTocToiDa() == vanTocKiemTra) {
						listPtCungVanToc.add(phuongTienGiaoThong_2);
						
						if (!listVanTocCung.contains(vanTocKiemTra)) {
							listVanTocCung.add(vanTocKiemTra);
						}
						
					}
				}
			}			
		}

		for (Double vt : listVanTocCung) {
			List<PhuongTienGiaoThong> listXetKetQua = new ArrayList<PhuongTienGiaoThong>();

			for (PhuongTienGiaoThong pt : listPt) {
				if (pt.getVanTocToiDa() == vt) {
					listXetKetQua.add(pt);
				}
			}
			listKetQua.add(listXetKetQua);
		}
		return listKetQua;
	}
	
}
