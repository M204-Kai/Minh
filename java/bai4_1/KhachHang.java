package bai4_1;

import java.util.ArrayList;
import java.util.List;

public class KhachHang {
	
		private String IDKhachHang;
		private String tenKhachHang;
		private int soDienThoai;
		List <GoiMon> lichSuListGoiMon;


		public KhachHang (String IDKhachHang_A, String tenKhachHang_B, int soDienThoai_C)
		{
			this.IDKhachHang = IDKhachHang_A;
			this.tenKhachHang = tenKhachHang_B;
			this.soDienThoai = soDienThoai_C;
			
			this. lichSuListGoiMon = new ArrayList<>();
		}

		public String getIDKhachHang() {
			return IDKhachHang;
		}

		public void setIDKhachHang(String iDKhachHang) {
			IDKhachHang = iDKhachHang;
		}

		public String getTenKhachHang() {
			return tenKhachHang;
		}

		public void setTenKhachHang(String tenKhachHang) {
			this.tenKhachHang = tenKhachHang;
		}

		public int getSoDienThoai() {
			return soDienThoai;
		}

		public void setSoDienThoai(int soDienThoai) {
			this.soDienThoai = soDienThoai;
		}

		public List<GoiMon> getLichSuListGoiMon() {
			return lichSuListGoiMon;
		}

		public void setLichSuListGoiMon(List<GoiMon> lichSuListGoiMon) {
			this.lichSuListGoiMon = lichSuListGoiMon;
		}
		
}

