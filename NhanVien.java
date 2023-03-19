/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhanvien;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String ten;
    private long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }
    protected String loaiNhanVien(){
        return null;
    }
   public void tinhLuong(){
       
   }
   public void xuatTHongTin(){
       System.out.println("Nhan vien:"+ten);
       System.out.println("Loai Nhan Vien"+ loaiNhanVien());
       System.out.println("Luong"+ luong);
       
   }

    void xuatThongTin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
