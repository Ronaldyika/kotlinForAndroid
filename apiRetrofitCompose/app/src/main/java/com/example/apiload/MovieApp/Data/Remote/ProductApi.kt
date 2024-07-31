package com.example.apiload.MovieApp.Data.Remote

import com.example.apiload.MovieApp.Domain.Model.Product
import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getProduct():List<Product>
}