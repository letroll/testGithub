package fr.letroll.testgithub.model

/**
 * Created by jquievreux on 01/12/14.
 */

data class Owner {
    private var login: String = ""
    private var id: kotlin.Int = -1
    private var avatarUrl: String = ""
    private var gravatarId: String = ""
    private var url: String = ""
    private var htmlUrl: String = ""
    private var followersUrl: String = ""
    private var followingUrl: String = ""
    private var gistsUrl: String = ""
    private var starredUrl: String = ""
    private var subscriptionsUrl: String = ""
    private var organizationsUrl: String = ""
    private var reposUrl: String = ""
    private var eventsUrl: String = ""
    private var receivedEventsUrl: String = ""
    private var type: String = ""
    private var siteAdmin: Boolean = false
    //    private var additionalProperties: Map<String, kotlin> = HashMap<String, kotlin.Any>()
}