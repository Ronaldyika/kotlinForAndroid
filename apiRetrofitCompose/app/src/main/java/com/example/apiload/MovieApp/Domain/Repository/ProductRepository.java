package com.example.apiload.MovieApp.Domain.Repository;


import com.example.apiload.MovieApp.Domain.Model.NetworkError;
import com.example.apiload.MovieApp.Domain.Model.Product;

import java.util.List;

import arrow.core.Either;
import arrow.core.continuations.Suspend;
public interface ProductRepository {
    suspend fun getProduct(): Either<NetworkError, List<Product>>
}
