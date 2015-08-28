package fr.letroll.testgithub.model

/**
 * Created by letroll on 30/11/14.
 */

public data class Repo() {
    public var id: kotlin.Int = -1
    public var name: String = ""
    public var fullName: String = ""
    public var owner: Owner = Owner()
    public var _private: Boolean = false
    public var htmlUrl: String = ""
    public var description: String = ""
    public var fork: Boolean = false
    public var url: String = ""
    public var forksUrl: String = ""
    public var keysUrl: String = ""
    public var collaboratorsUrl: String = ""
    public var teamsUrl: String = ""
    public var hooksUrl: String = ""
    public var issueEventsUrl: String = ""
    public var eventsUrl: String = ""
    public var assigneesUrl: String = ""
    public var branchesUrl: String = ""
    public var tagsUrl: String = ""
    public var blobsUrl: String = ""
    public var gitTagsUrl: String = ""
    public var gitRefsUrl: String = ""
    public var treesUrl: String = ""
    public var statusesUrl: String = ""
    public var languagesUrl: String = ""
    public var stargazersUrl: String = ""
    public var contributorsUrl: String = ""
    public var subscribersUrl: String = ""
    public var subscriptionUrl: String = ""
    public var commitsUrl: String = ""
    public var gitCommitsUrl: String = ""
    public var commentsUrl: String = ""
    public var issueCommentUrl: String = ""
    public var contentsUrl: String = ""
    public var compareUrl: String = ""
    public var mergesUrl: String = ""
    public var archiveUrl: String = ""
    public var downloadsUrl: String = ""
    public var issuesUrl: String = ""
    public var pullsUrl: String = ""
    public var milestonesUrl: String = ""
    public var notificationsUrl: String = ""
    public var labelsUrl: String = ""
    public var releasesUrl: String = ""
    public var createdAt: String = ""
    public var updatedAt: String = ""
    public var pushedAt: String = ""
    public var gitUrl: String = ""
    public var sshUrl: String = ""
    public var cloneUrl: String = ""
    public var svnUrl: String = ""
    public var homepage: String = ""
    public var size: kotlin.Int = -1
    public var stargazersCount: kotlin.Int = -1
    public var watchersCount: kotlin.Int = -1
    public var language: String = ""
    public var hasIssues: Boolean = false
    public var hasDownloads: Boolean = false
    public var hasWiki: Boolean = false
    public var hasPages: Boolean = false
    public var forksCount: kotlin.Int = -1
    public var mirrorUrl: String = ""
    public var openIssuesCount: kotlin.Int = -1
    public var forks: kotlin.Int = -1
    public var openIssues: kotlin.Int = -1
    public var watchers: kotlin.Int = -1
    public var defaultBranch: String = ""
    //    private var additionalProperties: Map<String, kotlin.Any> = HashMap<String, kotlin>()
}