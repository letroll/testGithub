package fr.letroll.githubbookmarkmanager.api

import fr.letroll.testgithub.Constant
import fr.letroll.testgithub.api.ApiRequestInterceptor
import fr.letroll.testgithub.api.GitHubService
import fr.letroll.testgithub.api.InterceptingOkClient
import retrofit.RestAdapter

/**
 * Created by letroll on 30/11/14.
 */

public open class GithubApi : Constant() {

    public fun getService(): GitHubService {
        return RestAdapter.Builder()
                .setEndpoint(API_URL)
                .setRequestInterceptor (ApiRequestInterceptor("", ""))
                .setClient(InterceptingOkClient())
                .build().create(javaClass<GitHubService>())
    }

}