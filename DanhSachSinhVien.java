package main;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;
   
    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }
    
    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }
    public void inDanhSachSinhVien() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
        }
    }
    public boolean kiemTraDanhSachTrong(){
        return danhSach.isEmpty();
    }
    public int soLuongSinhVien(){
        return danhSach.size();
    }
    
    public void lamRongDanhSach(){
        danhSach.clear();
    }
    
    public void kiemTraSinhVien(String msv) {
        
       danhSach.forEach(sv ->{
           if(sv.getMaSinhVien().equals(msv)) {
               System.out.println("kết quả"+sv);
       }
       });
       }     
      
    
    
    public void xoaSinhVien(String maSinhVien) {
       for(int i = 0; i < danhSach.size();i++ ) {
            if(danhSach.get(i).getMaSinhVien().equals(maSinhVien)) {
                danhSach.remove(i);
                System.out.println("xoa");
            }      
        }
       }
    
    
    public SinhVien timKiemTenSinhVien(String svCanTim){
        SinhVien sv = null;
        for( SinhVien s :danhSach) {
            if((s.getHoVaTen()).equals(svCanTim))
               sv = s;
            
        }
        return sv;
        
    }
    
    
}
