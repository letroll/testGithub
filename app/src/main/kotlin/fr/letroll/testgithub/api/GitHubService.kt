package fr.letroll.testgithub.api

import fr.letroll.testgithub.model.Repo
import retrofit.http.GET
import retrofit.http.Headers
import retrofit.http.Path
import rx.Observable

/**
 * Created by letroll on 30/11/14.
 *
*/

public interface GitHubService{
    GET("/users/{user}/repos")
    fun listRepos(Path("user") user: String): Observable<List<Repo>>

    GET("/users/{user}/starred")
    fun listStarred(Path("user") user: String): Observable<List<Repo>>

    //    POST("/authorizations")
    //    fun getAuthorizations([Query("scopes")] scopes: Array<String>, [Query("note")] note: String,
    //                          [Query("note_url")] note_url: String,[Query("client_id")] client_id: String,
    //                          [Query("client_secret")] client_secret: String, result: Callback<String>)

    GET("/authorizations")
    fun getAuthorizations(): Observable<String>
}