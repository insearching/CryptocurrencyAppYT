package com.plcoding.cryptocurrencyappyt.presentation.theme.coin_detail

import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailsState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
