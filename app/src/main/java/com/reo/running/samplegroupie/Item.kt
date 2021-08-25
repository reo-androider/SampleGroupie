package com.reo.running.samplegroupie

import com.reo.running.samplegroupie.databinding.ItemRecyclerviewBinding
import com.xwray.groupie.databinding.BindableItem

class Item(private val habit: String) : BindableItem<ItemRecyclerviewBinding>() {
    override fun getLayout(): Int = R.layout.item_recyclerview

    override fun bind(viewBinding: ItemRecyclerviewBinding, position: Int) {
        viewBinding.habit = habit
    }
}
