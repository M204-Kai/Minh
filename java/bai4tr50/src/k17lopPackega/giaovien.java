package k17lopPackega;

public class giaovien
{
    SinhVien[] Dangday;
    public void ListSinhVienDangday(int sosv){
        for(int i=0;i<sosv;i++){
            System.out.println(Dangday[i].NaSoSinhVien);
            System.out.println(Dangday[i].Ten);
            Dangday[i].HienThi();
        }

    }
}
