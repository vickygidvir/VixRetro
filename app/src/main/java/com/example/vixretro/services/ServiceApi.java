package com.example.vixretro.services;
import com.example.vixretro.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceApi {
    @GET("register.php")
    Call<User> doRegistration(@Query("name") String name, @Query("email") String email, @Query("phone") String phone, @Query("password") String password);

    @GET("login.php")
    Call<User> doLogin(@Query("email") String email, @Query("password") String password);
}
