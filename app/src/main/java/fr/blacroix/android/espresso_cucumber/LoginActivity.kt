package fr.blacroix.android.espresso_cucumber

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    internal var controller = LoginController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            controller.checkCredentials(loginEditText.text.toString(), passwordEditText.text.toString())
        }
    }

    fun loginSuccessState() {
        errorLoginText.visibility = View.GONE
        startActivity(Intent(this, BooksActivity::class.java))
    }

    fun loginErrorState() {
        errorLoginText.visibility = View.VISIBLE
    }
}
