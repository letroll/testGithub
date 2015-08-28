package fr.letroll.testgithub

import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import fr.letroll.testgithub.flow.activity.BaseActivity
import java.lang.ref.WeakReference

/**
 * Created by jquievreux on 28/08/15.
 */

public open class ActionListener(mActivityWeakReference:WeakReference<BaseActivity>): TextView.OnEditorActionListener {

    object compagnion{
        public fun newInstance(mActivity:BaseActivity):ActionListener {
            return ActionListener(mActivityWeakReference)
        }
    }

    override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
        val mainActivity:BaseActivity= mActivityWeakReference.get()
        if (mainActivity != null) {
            if (actionId == EditorInfo.IME_ACTION_GO && mainActivity.shouldShowError()) {
                mainActivity.showError();
            } else {
                mainActivity.hideError();
            }
        }
        return true;
    }

    /*        public static ActionListener newInstance(MainActivity mainActivity) {
                WeakReference<MainActivity> mainActivityWeakReference = new WeakReference<>(mainActivity);
                return new ActionListener(mainActivityWeakReference);
            }

            private ActionListener(WeakReference<MainActivity> mainActivityWeakReference) {
                this.mainActivityWeakReference = mainActivityWeakReference;
            }

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                MainActivity mainActivity = mainActivityWeakReference.get();
                if (mainActivity != null) {
                    if (actionId == EditorInfo.IME_ACTION_GO && mainActivity.shouldShowError()) {
                        mainActivity.showError();
                    } else {
                        mainActivity.hideError();
                    }
                }
                return true;
            }*/
    }