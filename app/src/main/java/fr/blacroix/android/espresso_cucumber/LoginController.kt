package fr.blacroix.android.espresso_cucumber

class LoginController(private val activity: LoginActivity) {

    fun checkCredentials(login: String, password: String) {
        if (login.length > 0 && login == password) {
            activity.loginSuccessState()
        } else {
            activity.loginErrorState()
        }
    }
}
