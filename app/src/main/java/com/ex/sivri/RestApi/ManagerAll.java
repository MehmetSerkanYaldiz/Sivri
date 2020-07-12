package com.ex.sivri.RestApi;

import com.ex.sivri.Models.Bilgiler;

import retrofit2.Call;

public class ManagerAll extends BaseManager{
    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return ourInstance;
    }
    public Call<Bilgiler> kocBilgileri(){
        Call<Bilgiler> call=getRestApiClient().kocBilgi();
        return call;
    }
    public Call<Bilgiler> bogaBilgileri(){
        Call<Bilgiler> call=getRestApiClient().bogaBilgi();
        return call;
    }
    public Call<Bilgiler> ikizlerBilgileri(){
        Call<Bilgiler> call=getRestApiClient().ikizlerBilgi();
        return call;
    }
    public Call<Bilgiler> yengecBilgileri(){
        Call<Bilgiler> call=getRestApiClient().yengecBilgi();
        return call;
    }
    public Call<Bilgiler> aslanBilgileri(){
        Call<Bilgiler> call=getRestApiClient().aslanBilgi();
        return call;
    }
    public Call<Bilgiler> basakBilgileri(){
        Call<Bilgiler> call=getRestApiClient().basakBilgi();
        return call;
    }

    public Call<Bilgiler> teraziBilgileri(){
        Call<Bilgiler> call=getRestApiClient().teraziBilgi();
        return call;
    }
    public Call<Bilgiler> akrepBilgileri(){
        Call<Bilgiler> call=getRestApiClient().akrepBilgi();
        return call;
    }
    public Call<Bilgiler> yayBilgileri(){
        Call<Bilgiler> call=getRestApiClient().yayBilgi();
        return call;
    }
    public Call<Bilgiler> oglakBilgileri(){
        Call<Bilgiler> call=getRestApiClient().oglakBilgi();
        return call;
    }
    public Call<Bilgiler> kovaBilgileri(){
        Call<Bilgiler> call=getRestApiClient().kovaBilgi();
        return call;
    }
    public Call<Bilgiler> balıkBilgileri(){
        Call<Bilgiler> call=getRestApiClient().balıkBilgi();
        return call;
    }

}
