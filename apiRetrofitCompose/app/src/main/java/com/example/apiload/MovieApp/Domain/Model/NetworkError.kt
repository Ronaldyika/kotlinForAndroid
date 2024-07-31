package com.example.apiload.MovieApp.Domain.Model

class NetworkError {
    val error:ApiError,
    val t:Throwable?=null
}

enum class ApiError(val Message:String){
    NetworkError("net work error"),
    UnknownResponse("unknown Response"),
    UnknownError("Unknown Error"),
}