package com.seongeun.openapi

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("weather")
    var weather: List<WeatherDto> = arrayListOf()
)
