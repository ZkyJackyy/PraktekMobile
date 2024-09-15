package com.zack.mobile.model

import com.zack.mobile.R

data class ModelBuah(
    val image: Int , val nama : String
)
object MockList{

    fun getModel() : List<ModelBuah>{
        val itemModel1 = ModelBuah(
            R.drawable.apple,
            nama = "Apple",
        )
        val itemModel2 = ModelBuah(
            R.drawable.grapes,
            nama = "Grape"
        )
        val itemModel3 = ModelBuah(
            R.drawable.strawberry,
            nama = "strawberry"
        )
        val itemModel4 = ModelBuah(
            R.drawable.orange,
            nama = "Orange"
        )
        val itemModel5 = ModelBuah(
            R.drawable.pear,
            nama = "pear"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }

}