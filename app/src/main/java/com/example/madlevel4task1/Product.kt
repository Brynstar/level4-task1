package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product (
    @ColumnInfo(name = "product_name")
    var productName: String,
    @ColumnInfo(name = "product_quantity")
    var productQuantity: Int,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
    )