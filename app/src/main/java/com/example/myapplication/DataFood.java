package com.example.myapplication;

import java.io.Serializable;

public class DataFood implements Serializable {
    private String Data1 ;//ข้อมูลส่วนผสม
    private String Data2;//ข้อมูลขั้นตอนการทำ
    private int Lmage;//รูปภาพ
    private String Name;//ชื่ออาหาร
    private String Name1;//ส่วนผสมในกรทำอาหาร
    private String Name2;//ขั้นตอนการทำอาหาร
    private String Iu;//




    public String getData1() {
        return Data1;
    }

    public void setData1(String data1) {
        Data1 = data1;
    }

    public String getData2() {
        return Data2;
    }

    public void setData2(String data2) {
        Data2 = data2;
    }

    public int getLmage() {
        return Lmage;
    }

    public void setLmage(int lmage) {
        Lmage = lmage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName1() {
        return Name1;
    }

    public void setName1(String name1) {
        Name1 = name1;
    }

    public String getName2() {
        return Name2;
    }

    public void setName2(String name2) {
        Name2 = name2;
    }

    public String getIu(){
        return Iu;}

    public void setIu(String Iu) {
        Iu = Iu; }

}
