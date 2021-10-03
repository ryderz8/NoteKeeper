package com.app.notekeeper.feature.domain.utils

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
