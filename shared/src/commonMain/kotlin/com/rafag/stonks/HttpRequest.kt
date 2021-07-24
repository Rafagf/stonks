package com.rafag.stonks

import io.ktor.client.utils.EmptyContent
import io.ktor.http.content.OutgoingContent

data class HttpRequest<T>(
    val url: String,
    val method: Method,
    val body: OutgoingContent = EmptyContent,
    val headers: List<Pair<String, String>> = emptyList(),
)

enum class Method { GET, POST, DELETE }