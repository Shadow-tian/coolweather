package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pfei on 2019/1/25.
 */
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }
    public void SetId(int id) {
        this.id = id;
    }
    public String getProvinceName() {
        return provinceName;
    }
    public void SetPovinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void SetPovinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
