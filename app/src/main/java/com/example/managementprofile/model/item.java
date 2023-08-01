package com.example.managementprofile.model;

import android.content.ClipData;

import java.io.Serializable;
import java.time.LocalDate;

public class item implements Serializable {
    private String maSV, hoTen, queQuan, avatarUrl;
    private LocalDate ngaySinh;
    private Gender gioiTinh;
    public enum Gender {
        MALE, FEMALE, OTHER
    }

    public item(String maSV, String hoTen, String queQuan, String avatarUrl, LocalDate ngaySinh, Gender gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.avatarUrl = avatarUrl;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
}
