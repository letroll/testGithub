package fr.letroll.testgithub.model

import java.util.*

/**
 * Created by jquievreux on 05/12/14.
 */

public data class RepoAuthorization(
    var id: Int,
    var url: String,
    var app: App,
    var token: String,
    var note: String,
    var note_url: String,
    var created_at: String,
    var updated_at: String,
    var scopes: List<String>)

//    public var id: kotlin.Int = -1
//
//    public var url: String = ""
//
//    public var app: App = App()
//
//    public var token: String = ""
//
//    public var note: String = ""
//
//    public var note_url: String = ""
//
//    public var created_at: String = ""
//
//    public var updated_at: String = ""
//
//    public var scopes: List<String> = ArrayList<String>()

//}