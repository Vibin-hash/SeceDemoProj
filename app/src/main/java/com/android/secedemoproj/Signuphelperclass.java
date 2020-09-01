package com.android.secedemoproj;

class Signuphelperclass {

    public Signuphelperclass() {
    }

    String name;
    String email;
    String password;
    String mobileno;
    String cityname;

    public Signuphelperclass(String name, String email, String  password, String mobileno, String cityname) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobileno = mobileno;
        this.cityname = cityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
}
