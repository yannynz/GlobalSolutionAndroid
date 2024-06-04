package com.gs.yannsantanta_rm93609
data class ItemModel (
    val id: Int,
    val name: String,
    val cityName: String,
    val stateName: String,
    val onRemove: (ItemModel) -> Unit
) 
