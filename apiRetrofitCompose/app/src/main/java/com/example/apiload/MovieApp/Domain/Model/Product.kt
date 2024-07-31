package com.example.apiload.MovieApp.Domain.Model

data class Product(
    val id: Int,
    val title:String,
    val price:Double,
    val description:String,
    val category: String,
    val image:String,
    val rating:Rating
)

data class Rating(
    val page:Double,
    val count:Int
)
