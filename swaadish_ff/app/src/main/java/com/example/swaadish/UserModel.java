package com.example.swaadish;

public class UserModel {
    private String name, phone, email, gst;


    public UserModel(String name, String phone, String email, String gst)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gst=gst;

    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public  void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public  void setEmail(String email){
        this.email = email;
    }



    public String getGst(){
        return gst;
    }

    public  void setGst(String  gst){
        this.gst = gst;
    }


}
