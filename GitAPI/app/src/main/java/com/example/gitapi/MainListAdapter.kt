package com.example.gitapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.listview_item.view.*

class MainListAdapter(val context: Context, val list:ArrayList<String>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.listview_item, null)

        view.listview_item_id.setText(list.get(position))

        return view
    }

    override fun getItem(position: Int): Any {
        return 0 // 현재 프로그램에서는 특별히 사용되지 않으므로 그냥 0리턴
    }

    override fun getItemId(position: Int): Long {
        return 0 // 현재 프로그램에서는 특별히 사용되지 않으므로 그냥 0리턴
    }

    override fun getCount(): Int {
        return list.size
    }

}