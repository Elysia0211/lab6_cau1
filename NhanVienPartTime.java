/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

/**
 *
 * @author Admin
 */
public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(int gioLamViec, String ten) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    NhanVienPartTime() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    NhanVienPartTime(String ten, int gioLamViec) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tinhLuong() {
        super.tinhLuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    System.out.println("Đây là lương nhân viên parttime");
    }

    @Override
    protected String loaiNhanVien() {
        return super.loaiNhanVien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
       
    }
    
}
