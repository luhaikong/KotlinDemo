package com.lhk.kotlindemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.lhk.kotlindemo.R
import com.lhk.kotlindemo.bean.ItemBean

/**
 * Created by MyPC on 2017/5/19.
 */
class HomeAdapter : BaseAdapter {

    private var mContext: Context? = null
    private var mList: MutableList<ItemBean>? = null
    private var mInflater: LayoutInflater? = null
    private var itemView: View? = null
    private var viewHolder: ViewHolder? = null

    constructor(context: Context?, list: MutableList<ItemBean>?) : super() {
        this.mContext = context
        this.mList = list
        this.mInflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        itemView = mInflater?.inflate(R.layout.list_item, null)
        viewHolder = ViewHolder(itemView as View)
        viewHolder?.tv_name?.text = mList?.get(position)?.name
        viewHolder?.tv_age?.text = mList?.get(position)?.age.toString()
        viewHolder?.tv_weight?.text = mList?.get(position)?.weight.toString()
        return itemView as View
    }

    override fun getItem(position: Int): Any {
        return mList?.get(position) as ItemBean
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mList?.size as Int
    }

    class ViewHolder {
        var tv_name: TextView? = null
        var tv_age: TextView? = null
        var tv_weight: TextView? =null

        constructor(view: View){
            tv_name = view.findViewById(R.id.tv_name) as TextView
            tv_age = view.findViewById(R.id.tv_age) as TextView
            tv_weight = view.findViewById(R.id.tv_weight) as TextView
        }
    }
}