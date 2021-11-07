package main;

import java.util.Objects;

public class SinhVien  {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diem;
   

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diem) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final SinhVien other = (SinhVien) obj;
//        if (!Objects.equals(this.maSinhVien, other.maSinhVien)) {
//            return false;
//        }
//        return true;
//    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien : "+ hoVaTen + ", maSinhVien : " + maSinhVien + ", namSinh : " + namSinh + ", diem : " + diem +"\n";
    }
//
//    @Override
//    public int compareTo(SinhVien o) {
//       return maSinhVien.compareTo(o.maSinhVien);
//    }
//    
    
    
}
