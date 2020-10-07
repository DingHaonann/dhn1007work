package com.kgc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Assets {
    private Integer id;

    private String assetid;

    private String assetname;

    private String assettype;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date assetdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetid() {
        return assetid;
    }

    public void setAssetid(String assetid) {
        this.assetid = assetid == null ? null : assetid.trim();
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public Date getAssetdate() {
        return assetdate;
    }

    public void setAssetdate(Date assetdate) {
        this.assetdate = assetdate;
    }
}