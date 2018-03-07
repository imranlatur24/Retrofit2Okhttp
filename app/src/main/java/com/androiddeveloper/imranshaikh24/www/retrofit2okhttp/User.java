package com.androiddeveloper.imranshaikh24.www.retrofit2okhttp;

/**
 * Created by root on 17/2/18.
 */
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public String createdAt;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }


}
