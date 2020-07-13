package com.ex.sivri.RestApi;

import com.ex.sivri.Models.Bilgiler;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("/kocindex.php")
    Call<Bilgiler> kocBilgi();

    @GET("/bogaindex.php")
    Call<Bilgiler> bogaBilgi();

    @GET("/ikizlerindex.php")
    Call<Bilgiler> ikizlerBilgi();

    @GET("/yengecindex.php")
    Call<Bilgiler> yengecBilgi();

    @GET("/aslanindex.php")
    Call<Bilgiler> aslanBilgi();

    @GET("/basakindex.php")
    Call<Bilgiler> basakBilgi();

    @GET("/teraziindex.php")
    Call<Bilgiler> teraziBilgi();

    @GET("/akrepindex.php")
    Call<Bilgiler> akrepBilgi();

    @GET("/yayindex.php")
    Call<Bilgiler> yayBilgi();

    @GET("/oglakindex.php")
    Call<Bilgiler> oglakBilgi();

    @GET("/kovaindex.php")
    Call<Bilgiler> kovaBilgi();

    @GET("/balıkindex.php")
    Call<Bilgiler> balıkBilgi();

}
