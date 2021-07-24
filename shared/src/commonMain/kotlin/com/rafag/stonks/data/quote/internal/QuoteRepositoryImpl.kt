package com.rafag.stonks.data.quote.internal

import com.rafag.stonks.api.ApiQuoteResponse
import com.rafag.stonks.api.QuoteApi
import com.rafag.stonks.api.StonksHttpClient
import com.rafag.stonks.data.quote.QuoteRepository

class QuoteRepositoryImpl(
    private val httpClient: StonksHttpClient
) : QuoteRepository {

    override suspend fun quote(symbol: String): ApiQuoteResponse {
        return httpClient.execute(QuoteApi.quoteRequest(symbol))
    }
}