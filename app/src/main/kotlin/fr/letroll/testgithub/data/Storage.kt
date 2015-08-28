package fr.letroll.testgithub.data

import android.content.Context
import android.content.SharedPreferences
import kotlin.properties.Delegates

/**
 * Created by jquievreux on 31/07/15.
 */

/**
 * Classe permettant de stocker l'API KEY dans les SharedPreferences
 */
public class Storage {
    protected val SHARED_PREFERENCES:String= "StorageModule"
    protected val PREFERENCES_API_KEY:String= "PREFERENCES_API_KEY"

    var context: Context by Delegates.notNull()

    var sharedPreferences: SharedPreferences by Delegates.notNull()

    public constructor(context: Context) {
        this.context = context
        this.sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE)
    }

    public fun getApiKey():String {
        return this.sharedPreferences.getString(PREFERENCES_API_KEY, null)
    }

    public fun setApiKey(apiKey:String) {
        this.sharedPreferences.edit().putString(PREFERENCES_API_KEY, apiKey).apply()
    }
}