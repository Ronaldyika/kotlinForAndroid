package com.example.apiload.MovieApp.Data.Repository

import arrow.core.Either
import com.example.apiload.MovieApp.Data.Remote.ProductApi
import com.example.apiload.MovieApp.Data.mapper.toNetworkError
import com.example.apiload.MovieApp.Domain.Model.NetworkError
import com.example.apiload.MovieApp.Domain.Model.Product
import com.example.apiload.MovieApp.Domain.Repository.ProductRepository

class ProductRepositoryImp constructor(
    private val productApi: ProductApi
):ProductRepository {
    override suspend fun getProduct(): Either<NetworkError,List<Product>>{
        return Either.catch {
            productApi.getProduct()
        }.mapLeft { it.toNetworkError() }
    }

}