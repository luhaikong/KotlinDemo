package com.lhk.kotlindemo.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import com.lhk.kotlindemo.R
import kotlinx.android.synthetic.main.activity_tool_bar.*

open class ToolBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme_Activity_in_out_anim)
        super.setContentView(R.layout.activity_tool_bar)

        tv_toolBar_back.setOnClickListener {
            onBackPressed()
        }
    }

    override fun setContentView(layoutResID: Int) {
        LayoutInflater.from(this).inflate(layoutResID, frameLayout)
    }

    protected fun setBackVisibilityGone(){
        tv_toolBar_back.visibility = GONE
    }

    override fun setTitle(title: CharSequence?) {
        super.setTitle("")
        tv_toolBar_title.text = title
    }

    override fun setTitle(titleId: Int) {
        super.setTitle("")
        tv_toolBar_title.setText(titleId)
    }

    protected fun setSubtitle(title: CharSequence?){
        if (title.isNullOrEmpty()){
            tv_toolBar_subtitle.visibility = GONE
        } else {
            tv_toolBar_subtitle.visibility = VISIBLE
            tv_toolBar_subtitle.text = title
        }
    }

    protected fun setSubtitle(titleId: Int){
        tv_toolBar_subtitle.visibility = VISIBLE
        tv_toolBar_subtitle.setText(titleId)
    }

}
