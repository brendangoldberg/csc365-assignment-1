package com.example.brendan.mainpackage.api;

import com.example.brendan.mainpackage.model.DataModel;
import com.example.brendan.mainpackage.model.DataSetModel;
import com.example.brendan.mainpackage.model.LocationModel;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Interface class that formulates the structure of all API calls
 */

public interface RetroInterface {

    @GET("locations?limit=25")
    Call<LocationModel> getLocation();

    @GET("locations/{id}?limit=25")
    Call<LocationModel> getLocationById(@Path("id")String id);

    @GET("datasets?limit=25")
    Call<DataSetModel> getDataSets();

    @GET("data?&locationid=ZIP:13126")
    Call<DataModel> getData(@Query("datasetid") String id, @Query("startdate")String startdate, @Query("enddate")String enddate);



}
