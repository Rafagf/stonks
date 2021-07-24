package com.rafag.stonks

import com.rafag.stonks.Method.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class SearchApi {

    fun searchRequest(symbol: String) = HttpRequest<ApiSearchResponse>(
        method = GET,
        url = "search?q=${symbol}"
    )
}

@Serializable
data class ApiSearchResponse(
    @SerialName("result") val result: List<ApiSearchItemResponse>,
)

@Serializable
data class ApiSearchItemResponse(
    @SerialName("description") val description: String,
    @SerialName("displaySymbol") val displaySymbol: String,
    @SerialName("symbol") val symbol: String,
    @SerialName("type") val type: String,

    )