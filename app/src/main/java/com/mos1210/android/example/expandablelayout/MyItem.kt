package com.mos1210.android.example.expandablelayout

data class MyItem(
    val id: Int,
    val title: String,
    val detail: String,
    var isExpanded: Boolean = false
)
