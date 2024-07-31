package com.example.apiload.MovieApp.Data.mapper

import com.example.apiload.MovieApp.Domain.Model.ApiError
import com.example.apiload.MovieApp.Domain.Model.NetworkError
import retrofit2.HttpException
import java.io.IOException

fun Throwable.toNetworkError():NetworkError{
    private val error = when(this){
        is IOException-> ApiError.NetworkError
        is HttpException->ApiError.UnknownResponse
        else-> ApiError.UnknownError
    }
    return  NetworkError(
        error = error,
        t = this
    )
}