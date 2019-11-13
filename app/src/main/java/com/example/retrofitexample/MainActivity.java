package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    public static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface=ApiClients.getClients().create(ApiInterface.class);

    }

    public void gettodos(View view) {

        Call<List<Todo>> call=apiInterface.getTodos();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                Log.e(TAG, "onResponse: " +response.body() );
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                Log.e(TAG, "onFailure: "+ t.getLocalizedMessage());
            }
        });
    }

    public void gettodousingparameters(View view) {
    }

    public void gettodousingquery(View view) {
    }

    public void posttodos(View view) {
    }
}
