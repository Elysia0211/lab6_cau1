/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author Admin
 */
public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem) {
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    NhanVienFullTime(String ten, int ngayLamThem1, int chucVu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String loaiNhanVien() {
        return super.loaiNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    }

    @Override
    public void tinhLuong() {
        super.tinhLuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    System.out.println("Đây là lương nhân viên fulltime");
    }

    
    
}
