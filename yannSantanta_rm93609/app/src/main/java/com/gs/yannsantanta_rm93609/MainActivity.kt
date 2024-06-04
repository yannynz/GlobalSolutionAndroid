package com.gs.yannsantanta_rm93609

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.RecyclerView
import android.widget.Button
import android.widget.EditText

class MainActivity : ComponentActivity() {
    private lateinit var itemsAdapter: ItemsAdapter
    private val items = mutableListOf<ItemModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        itemsAdapter = ItemsAdapter(items)
        recyclerView.adapter = itemsAdapter

        val buttonAdd = findViewById<Button>(R.id.button_add)
        val editTextBeach = findViewById<EditText>(R.id.editText_beach)
        val editTextCity = findViewById<EditText>(R.id.editText_city)
        val editTextState = findViewById<EditText>(R.id.editText_state)

        buttonAdd.setOnClickListener {
            val beachName = editTextBeach.text.toString()
            val cityName = editTextCity.text.toString()
            val stateName = editTextState.text.toString()

            if (beachName.isEmpty() || cityName.isEmpty() || stateName.isEmpty()) {
                editTextBeach.error = "Preencha todos os campos"
                editTextCity.error = "Preencha todos os campos"
                editTextState.error = "Preencha todos os campos"
                return@setOnClickListener
            }

            val item = ItemModel(
                id = 0,
                name = beachName,
                cityName = cityName,
                stateName = stateName,
                onRemove = { item ->
                    itemsAdapter.removeItem(item)
                }
            )

            itemsAdapter.addItem(item)
            clearEditTexts()
        }
    }

    private fun clearEditTexts() {
        findViewById<EditText>(R.id.editText_beach).text.clear()
        findViewById<EditText>(R.id.editText_city).text.clear()
        findViewById<EditText>(R.id.editText_state).text.clear()
    }
}
