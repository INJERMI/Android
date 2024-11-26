package com.seongeun.openapi

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class WeatherDto(
    @SerializedName("main")
    var main: String?,
    @SerializedName("icon")
    var icon: String?,
) : Serializable {
}
