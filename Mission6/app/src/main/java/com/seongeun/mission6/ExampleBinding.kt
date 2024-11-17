package com.seongeun.mission6

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("app:items")
fun setList(recyclerView: RecyclerView, items: List<ExampleItem>?) {
    items?.let {
        (recyclerView.adapter as ExampleRVAdapter).exampleList = items
    }
}