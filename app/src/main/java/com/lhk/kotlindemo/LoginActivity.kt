package com.lhk.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_tool_bar.*

class LoginActivity : ToolBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initToolBar()

        initEvent()
    }

    private fun initToolBar(){
        setBackVisibilityGone()
        tv_toolBar_title.setText(R.string.title_activity_login)
    }

    private fun initEvent(){
        email.setText("1031350293@qq.com")
        password.setText("password")
        email_sign_in_button.setOnClickListener {
            if (email.text.isEmpty()) {
                Toast.makeText(this, "账号不能为空！", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (password.text.isEmpty()){
                Toast.makeText(this, "密码不能为空！", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            showMainActivity()
        }
    }

    private fun showMainActivity(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        this.finish()
    }
}

