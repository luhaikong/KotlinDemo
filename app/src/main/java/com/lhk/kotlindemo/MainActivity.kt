package com.lhk.kotlindemo

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import com.lhk.kotlindemo.fragment.FindFragment
import com.lhk.kotlindemo.fragment.HomeFragment
import com.lhk.kotlindemo.fragment.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : ToolBarActivity() {

    private var contentStr: String = ""

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                contentStr = getString(R.string.title_home)
                title = getString(R.string.title_toolbar)
                switchFragment(contentStr)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                contentStr = getString(R.string.title_find)
                title = getString(R.string.title_toolbar_find)
                switchFragment(contentStr)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                contentStr = getString(R.string.title_setting)
                title = getString(R.string.title_toolbar_setting)
                switchFragment(contentStr)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun switchFragment(title: String?){
        val transaction = supportFragmentManager.beginTransaction()
        when(title){
            getString(R.string.title_home) -> {
                transaction.replace(R.id.main_content,HomeFragment())
            }
            getString(R.string.title_find) -> {
                transaction.replace(R.id.main_content,FindFragment())
            }
            getString(R.string.title_setting) -> {
                transaction.replace(R.id.main_content,SettingFragment())
            }
        }
        transaction.commit()
    }

    private fun initFragment(){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.main_content,HomeFragment())
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setBackVisibilityGone()

        initFragment()

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
