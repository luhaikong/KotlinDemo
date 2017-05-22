package com.lhk.kotlindemo.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lhk.kotlindemo.LoginActivity
import com.lhk.kotlindemo.R
import com.lhk.kotlindemo.adapter.HomeAdapter
import com.lhk.kotlindemo.bean.ItemBean
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by MyPC on 2017/5/18.
 */
class HomeFragment: Fragment() {

    private var mAdapter: HomeAdapter? = null
    private var mList: MutableList<ItemBean>? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(activity).inflate(R.layout.fragment_home,container,false)
    }

    override fun onStart() {
        super.onStart()
        mList = mutableListOf()
        for (i in 0..100) {
            mList?.add(ItemBean(0,"张三",10,60.5))
            mList?.add(ItemBean(1,"李四",11,60.5))
            mList?.add(ItemBean(2,"王五",12,60.5))
            mList?.add(ItemBean(3,"邹六",13,60.5))
            mList?.add(ItemBean(4,"陈七",14,60.5))
            mList?.add(ItemBean(5,"马八进一",15,60.5))
        }
        mAdapter = HomeAdapter(activity,mList)
        listView.adapter = mAdapter
        listView.setOnItemClickListener {
            parent, view, position, id ->
            showRegister(position)
        }
    }

    private fun showRegister(position: Int){
        val intent = Intent(activity,LoginActivity::class.java)
        startActivity(intent)
    }
}