package com.example.amnhac.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Baihat implements Parcelable {

    @SerializedName("Idbaihat")
    @Expose
    private String idbaihat;
    @SerializedName("Tenbaihat")
    @Expose
    private String tenbaihat;
    @SerializedName("Hinhbaihat")
    @Expose
    private String hinhbaihat;
    @SerializedName("Casi")
    @Expose
    private String casi;
    @SerializedName("Linkbaihat")
    @Expose
    private String linkbaihat;

    public String getIdbaihat() {
    return idbaihat;
    }

    public void setIdbaihat(String idbaihat) {
    this.idbaihat = idbaihat;
    }

    public String getTenbaihat() {
    return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
    this.tenbaihat = tenbaihat;
    }

    public String getHinhbaihat() {
    return hinhbaihat;
    }

    public void setHinhbaihat(String hinhbaihat) {
    this.hinhbaihat = hinhbaihat;
    }

    public String getCasi() {
    return casi;
    }

    public void setCasi(String casi) {
    this.casi = casi;
    }

    public String getLinkbaihat() {
    return linkbaihat;
    }

    public void setLinkbaihat(String linkbaihat) {
    this.linkbaihat = linkbaihat;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}