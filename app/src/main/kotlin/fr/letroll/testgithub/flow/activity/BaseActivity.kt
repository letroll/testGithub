package fr.letroll.testgithub.flow.activity

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by jquievreux on 26/11/14.
 */

abstract class BaseActivity : AppCompatActivity() {

    fun toast(txt: kotlin.Any?) {
        if (txt != null)
            if(txt is String)
                Toast.makeText(this, txt, Toast.LENGTH_SHORT).show()
            else if(txt is Int)
                Toast.makeText(this, txt, Toast.LENGTH_SHORT).show()
    }

}