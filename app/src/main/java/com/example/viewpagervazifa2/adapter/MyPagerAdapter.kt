package com.example.viewpagervazifa2.adapter

import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpagervazifa2.databinding.ItemPageBinding
import com.example.viewpagervazifa2.model.User
import java.util.Objects

class MyPagerAdapter ( var list : ArrayList<User>):PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val itemPageBinding = ItemPageBinding.inflate(LayoutInflater.from(container.context), container, false)
        itemPageBinding.image.setImageResource(list[position].image)
        itemPageBinding.tv1.text =list[position].tv1
        itemPageBinding.tv2.text = list[position].tv2
        itemPageBinding.tv3.text = list[position].tv3
        itemPageBinding.tv4.text = list[position].tv4
        container.addView(itemPageBinding.root)
        return itemPageBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }


}