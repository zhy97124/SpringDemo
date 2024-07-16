package com.zhy.springframework.test.bean;

import java.time.LocalDate;

/**
 * @Description TODO
 * @Classname Husband
 * @Date 2024/7/16 12:46
 * @Created by Shinelon
 */
public class Husband {

    private String wifiName;

    private LocalDate marriageDate;

    public String getWifiName() {
        return wifiName;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "wifiName='" + wifiName + '\'' +
                ", marriageDate=" + marriageDate +
                '}';
    }

}
