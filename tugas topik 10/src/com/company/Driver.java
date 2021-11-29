package com.company;

public
class Driver extends User{
    String platNo;
    String jenis;

    public Driver ( String nik, String nama, String noTelp, double saldo, String platNo, String jenis ) {
        super(nik, nama, noTelp, saldo);
        this.platNo = platNo;
        this.jenis = jenis;

    }
    public String getPlatNo () {
        return platNo;
    }

    public void setPlatNo ( String platKendaraan ) {
        this.platNo = platKendaraan;
    }

    public
    String getJenis() {
        return jenis;
    }
}
