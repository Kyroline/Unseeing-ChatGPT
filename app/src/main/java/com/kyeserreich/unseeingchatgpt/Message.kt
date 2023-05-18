package com.kyeserreich.unseeingchatgpt

class Message {
    companion object {
        var SENT_BY_ME : String = "me"
        var SENT_BY_BOT : String = "bot"
    }

    lateinit private var message : String
    lateinit private var sentBy : String

    fun getMessage() : String {
        return message
    }

    fun setMessage(message : String) {
        this.message = message
    }

    fun getSentBy() : String {
        return sentBy
    }

    fun setSentBy(sentBy : String) {
        this.sentBy = sentBy
    }

    constructor (message : String, sentBy : String) {
        this.message = message
        this.sentBy = sentBy
    }
}