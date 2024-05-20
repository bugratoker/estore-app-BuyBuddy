package com.example.shoppingapp.network

import com.example.shoppingapp.data.Product
import retrofit2.http.GET

interface ProductService {
    @GET("products")
    suspend fun getProducts(): List<Product>
}