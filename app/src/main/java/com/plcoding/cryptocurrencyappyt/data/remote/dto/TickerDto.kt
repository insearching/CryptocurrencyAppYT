package com.plcoding.cryptocurrencyappyt.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

data class TickerDto(
    val beta_value: Double,
    val circulating_supply: Long,
    val first_data_at: String,
    val id: String,
    val last_updated: String,
    val max_supply: Long,
    val name: String,
    val quotes: Quotes,
    val rank: Int,
    val symbol: String,
    val total_supply: Long
) {
    data class Quotes(
        @SerializedName("USD")
        val usd: Usd
    ) {
        data class Usd(
            val ath_date: String,
            val ath_price: Double,
            val market_cap: Long,
            val market_cap_change_24h: Double,
            val percent_change_12h: Double,
            val percent_change_15m: Double,
            val percent_change_1h: Double,
            val percent_change_1y: Double,
            val percent_change_24h: Double,
            val percent_change_30d: Double,
            val percent_change_30m: Double,
            val percent_change_6h: Double,
            val percent_change_7d: Double,
            val percent_from_price_ath: Double,
            val price: Double,
            val volume_24h: Double,
            val volume_24h_change_24h: Double
        )
    }
}

fun TickerDto.toCoin(): Coin {
    return Coin(
        id = id,
        price = String.format("%.2f", quotes.usd.price),
        name = name,
        rank = rank,
        symbol = symbol,
    )
}