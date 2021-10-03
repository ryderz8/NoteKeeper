package com.app.notekeeper.feature.domain.utils

sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType = orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType = orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType = orderType)
}
