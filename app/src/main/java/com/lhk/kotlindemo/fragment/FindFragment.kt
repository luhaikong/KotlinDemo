package com.lhk.kotlindemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lhk.kotlindemo.R
import com.lhk.kotlindemo.adapter.FindAdapter
import com.lhk.kotlindemo.bean.ItemBean
import kotlinx.android.synthetic.main.fragment_find.*

/**
 * Created by MyPC on 2017/5/18.
 */
class FindFragment: Fragment() {

    private var mAdapter: FindAdapter? = null
    private var mList: MutableList<ItemBean>? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(activity).inflate(R.layout.fragment_find,container,false)
    }

    override fun onStart() {
        super.onStart()
        mList = mutableListOf()
        for (i in 0..100){
            mList?.add(ItemBean(0,"张三",10,60.5))
            mList?.add(ItemBean(1,"李四",11,60.5))
            mList?.add(ItemBean(2,"王五",12,60.5))
            mList?.add(ItemBean(3,"邹六",13,60.5))
            mList?.add(ItemBean(4,"陈七",14,60.5))
            mList?.add(ItemBean(5,"马八进一",15,60.5))
        }
        recyclerView.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        mAdapter = FindAdapter(activity,mList)
        recyclerView.adapter = mAdapter
    }

}