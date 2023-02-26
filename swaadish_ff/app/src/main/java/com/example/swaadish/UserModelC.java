package com.example.swaadish;

public class UserModelC {
    private String namec, phonec, emailc;

    public UserModelC(String namec, String phonec, String emailc){

        this.namec = namec;
        this.phonec = phonec;
        this.emailc = emailc;

    }

    public String getNamec(){
        return namec;
    }

    public  void setNamec(String namec){
        this.namec = namec;
    }

    public String getPhonec(){
        return phonec;
    }

    public  void setPhonec(String phonec){
        this.phonec = phonec;
    }

    public String getEmailc(){
        return emailc;
    }

    public  void setEmailc(String emailc){
        this.emailc = emailc;
    }


}
