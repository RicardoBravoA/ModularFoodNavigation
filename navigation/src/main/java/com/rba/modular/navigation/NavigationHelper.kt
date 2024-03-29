package com.rba.modular.navigation

import android.content.Intent

private const val PACKAGE_NAME = "com.rba.modular"

fun intentTo(intentActivity: IntentActivity): Intent? =
    Intent(Intent.ACTION_VIEW).setClassName("$PACKAGE_NAME", intentActivity.className)

interface IntentActivity {
    /**
     * The activity class name.
     */
    val className: String
}

object Activity {
    /**
     * MainActivity
     */
    object Main : IntentActivity {
        override val className = "$PACKAGE_NAME.map.MainActivity"
    }

    object Detail : IntentActivity {
        override val className = "$PACKAGE_NAME.detail.DetailActivity"
    }

}