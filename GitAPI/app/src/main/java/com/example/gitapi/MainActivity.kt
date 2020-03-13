package com.example.gitapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    val BASE_URL = "https://api.github.com/search/"

    val arr = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var retrofit : Retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        // retrofit 생성

        var api = retrofit.create(API::class.java)
        // 그를 기반으로 api 생성

        var call = api.getUsers()
        // api에서 각 정보를 호출

        call.enqueue(object : Callback<UserData>{
            override fun onFailure(call: Call<UserData>, t: Throwable) {
                // 호출 실패시 실행하는 것
                Log.e("MAINACTIVITY", "fail to call")
            }

            override fun onResponse(call: Call<UserData>, response: Response<UserData>) {
                // 호출 성공시 실행하는 것
                for (str in response?.body()?.items!!) {
                    Log.e("MAINACTIVITY", str.login)
                    arr.add(str.login)
                }

                val listAdapter = MainListAdapter(this@MainActivity, arr)
                listview_api_id.adapter = listAdapter
            }
        })

    }
}
