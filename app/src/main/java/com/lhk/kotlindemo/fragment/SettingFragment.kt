package com.lhk.kotlindemo.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lhk.kotlindemo.R

/**
 * Created by MyPC on 2017/5/18.
 */
class SettingFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(activity as Context?).inflate(R.layout.fragment_setting,container,false)
    }

    override fun onStart() {
        super.onStart()
    }
}