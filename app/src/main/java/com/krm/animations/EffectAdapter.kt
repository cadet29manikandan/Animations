package com.krm.animations

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.krm.animations.anim.Techniques

class EffectAdapter(private val mContext: Context) : BaseAdapter() {
    override fun getCount(): Int {
        return Techniques.values().size
    }

    override fun getItem(position: Int): Any {
        return Techniques.values()[position].animator
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(
        position: Int,
        convertView: View,
        parent: ViewGroup
    ): View {
        val v = LayoutInflater.from(mContext).inflate(R.layout.item, null, false)
        val t = v.findViewById<View>(R.id.list_item_text) as TextView
        val o = getItem(position)
        val start = o.javaClass.name.lastIndexOf(".") + 1
        val name = o.javaClass.name.substring(start)
        t.text = name
        v.tag = Techniques.values()[position]
        return v
    }

}