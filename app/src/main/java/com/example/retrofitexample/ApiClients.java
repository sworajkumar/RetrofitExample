package com.example.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClients {

    public static final String BASE_URL="https://jsonplaceholder.typicode.com";
    public static Retrofit retrofit=null;

    public static Retrofit getClients(){
        if (retrofit == null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
