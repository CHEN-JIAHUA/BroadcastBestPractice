package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * <pre>
 *      author : ChenJiahua
 *      github :
 *      time   : 2020/12/4
 *      desc   :
 * </pre>
 */
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.setOnClickListener {
            val userName  = UserNameInput.text.toString()
            val password = PasswordInput.text.trim().toString()
            if(userName == UserInfo.CODEBERRY && password == UserInfo.CODEBERRY_PASSWORD){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this,"username or password is invalid...",Toast.LENGTH_SHORT).show()

            }
        }
    }
}