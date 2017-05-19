package com.lhk.kotlindemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.lhk.kotlindemo.R
import com.lhk.kotlindemo.bean.ItemBean

/**
 * Created by MyPC on 2017/5/19.
 */
class FindAdapter : RecyclerView.Adapter<FindAdapter.ViewHolder> {

    private var mContext: Context? = null
    private var mList: MutableList<ItemBean>? = null

    constructor(context: Context?, list: MutableList<ItemBean>?) : super() {
        this.mContext = context
        this.mList = list
    }

    override fun getItemCount(): Int {
        return mList?.size as Int
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tv_name?.text = mList?.get(position)?.name
        holder?.tv_age?.text = mList?.get(position)?.age.toString()
        holder?.tv_weight?.text = mList?.get(position)?.weight.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var tv_name = itemView?.findViewById(R.id.tv_name) as TextView
        var tv_age = itemView?.findViewById(R.id.tv_age) as TextView
        var tv_weight = itemView?.findViewById(R.id.tv_weight) as TextView
    }
}