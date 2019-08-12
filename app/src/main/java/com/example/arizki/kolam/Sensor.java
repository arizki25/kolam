package com.example.arizki.kolam;

import org.json.JSONException;
import org.json.JSONObject;

public class Sensor {
    private String NTU = "NTU";
    private String status = "status";
    private String Kg = "Kg";

    public String getNTU() {
        return NTU;
    }

    public void setNTU(String NTU) {
        this.NTU = NTU;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public String getKg() {
        return Kg;
    }

    public void setKg (String Kg) {
        this.Kg = Kg;
    }

    public Sensor(JSONObject obj) {
        try {
            String Kg = obj.getString("Kg");
            String NTU = obj.getString("NTU");
            String status = obj.getString("status");

            this.NTU = NTU;
            this.Kg = Kg;
            this.status = status;

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

