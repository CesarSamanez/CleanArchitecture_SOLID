package com.example.core.data

// Note entity
data class Note(
    var title: String,
    var content: String,
    var creationTime: Long,
    var updateTime: Long,
    var id: Long = 0,
    var wordCount: Int = 0
)