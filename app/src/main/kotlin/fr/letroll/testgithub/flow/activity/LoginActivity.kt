package fr.letroll.testgithub.flow.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import fr.letroll.testgithub.ActionListener
import fr.letroll.testgithub.R
import kotlinx.android.synthetic.activity_login.*
/**
 * Created by jquievreux on 28/08/15.
 */

public class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super<BaseActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        text_input_layout_login.setHint(getString(R.string.hint_login));
        text_input_layout_pass.setHint(getString(R.string.hint_pass));
        edt_login.setOnEditorActionListener(ActionListener.newInstance(this));

        btnConnect.setOnClickListener({
            toast("test")
        });
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    private fun shouldShowError():Boolean {
        val textLength = editText.getText().length();
        return textLength > 0 && textLength < MIN_TEXT_LENGTH;
    }

    private fun showError() {
        text_input_layout_login.setError(getString(R.string.error_login));
    }

    private fun hideError() {
        text_input_layout_login.setError("");
    }


}
