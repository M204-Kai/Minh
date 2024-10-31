package bai4_1;

public class BanhMi 
			{
			private String IDBanhMi;
			private String tenBanhMi;
			private int giaBanhMi;
			private int soLuong;
			private int tonKho;

			public BanhMi (String IDBanhMi_A, String tenBanhMi_B, int giaBanhMi_C, int tonKho_D) 
			{
				this.IDBanhMi = IDBanhMi_A;
				this.tenBanhMi = tenBanhMi_B;
				this.giaBanhMi =giaBanhMi_C;
				this.tonKho = tonKho_D;
			}

			public String getIDBanhMi() {
				return IDBanhMi;
			}

			public void setIDBanhMi(String iDBanhMi) {
				IDBanhMi = iDBanhMi;
			}

			public String getTenBanhMi() {
				return tenBanhMi;
			}

			public void setTenBanhMi(String tenBanhMi) {
				this.tenBanhMi = tenBanhMi;
			}

			public int getGiaBanhMi() {
				return giaBanhMi;
			}

			public void setGiaBanhMi(int giaBanhMi) {
				this.giaBanhMi = giaBanhMi;
			}

			public int getSoLuong() {
				return soLuong;
			}

			public void setSoLuong(int soLuong) {
				this.soLuong = soLuong;
			}

			public int getTonKho() {
				return tonKho;
			}

			public void setTonKho(int tonKho) {
				this.tonKho = tonKho;
			}
			
			}
		

				