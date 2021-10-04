package com.app.notekeeper.feature.presentation.notes.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.notekeeper.feature.domain.utils.NoteOrder
import com.app.notekeeper.feature.domain.utils.OrderType

@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange : (NoteOrder) -> Unit
){

    
}