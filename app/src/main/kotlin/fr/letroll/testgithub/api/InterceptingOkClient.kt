package fr.letroll.testgithub.api

import android.util.Log
import retrofit.client.Header
import retrofit.client.OkClient
import retrofit.client.Request
import retrofit.client.Response

/**
 * Created by letroll on 07/12/14.
 */

open public class InterceptingOkClient() : OkClient() {

    public override fun execute(request: Request): Response {
        val response: Response = super.execute(request);

        for (header: Header in response.getHeaders()) {
            if(header.toString().contains("Link:")) {
                Log.e("header", header.toString())
                break;
            }
        }

        return response;
    }
}