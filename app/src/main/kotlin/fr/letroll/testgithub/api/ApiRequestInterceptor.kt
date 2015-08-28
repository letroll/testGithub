package fr.letroll.testgithub.api

import android.util.Base64
import retrofit.RequestInterceptor
import retrofit.RequestInterceptor.RequestFacade

/**
 * Created by jquievreux on 04/12/14.
 */

public open class ApiRequestInterceptor( _user: String, _pass: String) : RequestInterceptor {

    private var user = _user
    private var pass = _pass
//    private var storage = _storage

    public override fun intercept(requestFacade: RequestFacade) {
//        val key: String = storage.getApiKey()
        //ajoute aux header la ApiKey en clé bearer
//        requestFacade.addHeader("bearer", key)

        val authorizationValue = encodeCredentialsForBasicAuthorization()
        requestFacade.addHeader("Authorization", authorizationValue)
        requestFacade.addHeader("Accept", "application/vnd.github.v3+json")
        requestFacade.addHeader("User-Agent", "letroll")
    }

    private fun encodeCredentialsForBasicAuthorization(): String {
        val userAndPassword = user + ":" + pass
        return "Basic " + Base64.encodeToString(userAndPassword.toByteArray(), Base64.NO_WRAP)
    }
}