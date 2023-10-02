package com.ojaq.footballnews

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ojaq.footballnews.data.BallResponse
import com.ojaq.footballnews.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsViewModel : ViewModel() {
    //expose screen yi state
    private var _bundesNews = MutableLiveData<BallResponse>()
    val bundesNews get() = _bundesNews as LiveData<BallResponse>
    private var _laligaNews = MutableLiveData<BallResponse>()
    val laligaNews get() = _laligaNews as LiveData<BallResponse>
    private var _premierNews = MutableLiveData<BallResponse>()
    val premierNews get() = _premierNews as LiveData<BallResponse>
    private var _serieaNews = MutableLiveData<BallResponse>()
    val serieaNews get() = _serieaNews as LiveData<BallResponse>
    private var _ligueNews = MutableLiveData<BallResponse>()
    val ligueNews get() = _ligueNews as LiveData<BallResponse>
    private var _searchNews = MutableLiveData<BallResponse>()
    val searchNews get() = _searchNews as LiveData<BallResponse>

    //handle business logic
    fun getBundesNews (){
        ApiClient.getApiService().getBundesNews().enqueue(object : Callback<BallResponse> {
            override fun onResponse(call: Call<BallResponse>, response: Response<BallResponse>) {
                if (response.isSuccessful) {
                    Log.i("ViewModel", "onResponse: ${response.body()}")
                    _bundesNews.postValue(response.body())
                } else Log.e(
                    "ViewModel",
                    "onFailedCall: Call error with Http Status Code : " + response.code()
                )
            }

            override fun onFailure(call: Call<BallResponse>, t: Throwable) {
                Log.e("ViewModel", "onFailure " + t.localizedMessage)
            }

        })
    }
    fun getLaLigaNews (){
        ApiClient.getApiService().getLaligaNews().enqueue(object : Callback<BallResponse> {
            override fun onResponse(call: Call<BallResponse>, response: Response<BallResponse>) {
                if (response.isSuccessful) {
                    Log.i("ViewModel", "onResponse: ${response.body()}")
                    _laligaNews.postValue(response.body())
                } else Log.e(
                    "ViewModel",
                    "onFailedCall: Call error with Http Status Code : " + response.code()
                )
            }

            override fun onFailure(call: Call<BallResponse>, t: Throwable) {
                Log.e("ViewModel", "onFailure " + t.localizedMessage)
            }

        })
    }
    fun getPremierNews (){
        ApiClient.getApiService().getPremierNews().enqueue(object : Callback<BallResponse> {
            override fun onResponse(call: Call<BallResponse>, response: Response<BallResponse>) {
                if (response.isSuccessful) {
                    Log.i("ViewModel", "onResponse: ${response.body()}")
                    _premierNews.postValue(response.body())
                } else Log.e(
                    "ViewModel",
                    "onFailedCall: Call error with Http Status Code : " + response.code()
                )
            }

            override fun onFailure(call: Call<BallResponse>, t: Throwable) {
                Log.e("ViewModel", "onFailure " + t.localizedMessage)
            }

        })
    }
    fun getSerieANews (){
        ApiClient.getApiService().getSerieANews().enqueue(object : Callback<BallResponse> {
            override fun onResponse(call: Call<BallResponse>, response: Response<BallResponse>) {
                if (response.isSuccessful) {
                    Log.i("ViewModel", "onResponse: ${response.body()}")
                    _serieaNews.postValue(response.body())
                } else Log.e(
                    "ViewModel",
                    "onFailedCall: Call error with Http Status Code : " + response.code()
                )
            }

            override fun onFailure(call: Call<BallResponse>, t: Throwable) {
                Log.e("ViewModel", "onFailure " + t.localizedMessage)
            }
        })
    }
    fun getLigueNews (){
        ApiClient.getApiService().getLigueNews().enqueue(object : Callback<BallResponse> {
            override fun onResponse(call: Call<BallResponse>, response: Response<BallResponse>) {
                if (response.isSuccessful) {
                    Log.i("ViewModel", "onResponse: ${response.body()}")
                    _ligueNews.postValue(response.body())
                } else Log.e(
                    "ViewModel",
                    "onFailedCall: Call error with Http Status Code : " + response.code()
                )
            }

            override fun onFailure(call: Call<BallResponse>, t: Throwable) {
                Log.e("ViewModel", "onFailure " + t.localizedMessage)
            }
        })
    }
    fun searchNews(query : String){
        ApiClient.getApiService().searchNews(query).enqueue(object : Callback<BallResponse> {
            override fun onResponse(call: Call<BallResponse>, response: Response<BallResponse>) {
                if (response.isSuccessful){
//                    _searchNews.value = response.body()
                    _searchNews.postValue(response.body())
                } else Log.e("NewsViewModel", "onResponse : ${response.message()}")
            }

            override fun onFailure(call: Call<BallResponse>, t: Throwable) {
                Log.e("NewsViewModel", "onResponse : ${t.localizedMessage}")
            }

        })
    }
}