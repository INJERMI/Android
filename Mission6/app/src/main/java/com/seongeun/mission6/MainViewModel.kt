package com.seongeun.mission6

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val dummyList = listOf(
        ExampleItem("1"),
        ExampleItem("2"),
        ExampleItem("3"),
        ExampleItem("4"),
        ExampleItem("5"),
    )

    fun showToastMessage(view: View, text: String) {
        Toast.makeText(view.context, text, Toast.LENGTH_SHORT).show()
    }
}