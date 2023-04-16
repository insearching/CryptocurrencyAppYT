package com.plcoding.cryptocurrencyappyt.domain.repository

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.TickerDto

interface CoinRepository {

    suspend fun getTickers(): List<TickerDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}