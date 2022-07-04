package com.example.imageapp.api

import com.example.imageapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)