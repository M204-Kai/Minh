package bai4_1;

import java.util.ArrayList;
import java.util.List;

public class GoiMon 
{
			private int IDgoiMon;
			private int soLuong;
			private int tongTien;
			private BanhMi banhMi;
			private List<BanhMi> danhSachGoiMonBanhMis;
			private String trangthaithanhtoanString;
			
			public GoiMon(int IDgoiMon_A, KhachHang khachHang, int soLuong) {
				this.IDgoiMon =IDgoiMon_A;
				this.danhSachGoiMonBanhMis =new ArrayList<>();
				this.tongTien = 0;
				this.trangthaithanhtoanString ="Chua thanh toan";	
			}
			public void themBanhMi(BanhMi banhMi) {
				this.danhSachGoiMonBanhMis.add(banhMi);
				this.tongTien += banhMi.getGiaBanhMi();
			}
			public void xoaBanhMi(BanhMi banhMi) {
				this.danhSachGoiMonBanhMis.remove(banhMi);
				this.tongTien -= banhMi.getGiaBanhMi();
			}
			public void trangthaithanhtoanString (String trangThai) {
				this.trangthaithanhtoanString = trangThai;
			}
		
			public double getTongGia() {
				return this.getTongGia();
			}
			public String toString() {
				return "IDgoiMon: " + this.IDgoiMon +", khach hang: "+ this.khachhang
			}
			
			
		
	}
