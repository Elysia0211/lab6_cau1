/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tong nhan vien: ");
        int tongNhanVien = Integer.parseInt(scanner.nextLine());
        NhanVien[] mangNhanVien = new NhanVien[tongNhanVien];
        for (int i = 0; i < tongNhanVien; i++) {
            System.out.print("Ten " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("nhan vien(1-Fulltime; 2-Parttime): ");
            int laNhanVien = Integer.parseInt(scanner.nextLine());
            if (laNhanVien == 1) {
               
                System.out.print("Chuc vu (1-Sep; 2-nguoi ): ");
                int chucVu = Integer.parseInt(scanner.nextLine());
                System.out.print("Ngay lam them: ");
                int ngayLamThem = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienFullTime(ten, ngayLamThem, chucVu);
            } else {
                System.out.print("Gio lam: ");
                int gioLamViec = Integer.parseInt(scanner.nextLine());
                mangNhanVien[i] = new NhanVienPartTime(ten, gioLamViec);
            }
        }
         
        System.out.println("\n Ket qua");
         
        for (NhanVien nhanVien : mangNhanVien) {
            nhanVien.tinhLuong();
            nhanVien.xuatThongTin();
        
        } 
    }
    
}
