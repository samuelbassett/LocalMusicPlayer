package com.tc.musicplayer.data.local.model

import android.net.Uri

data class Audio(
    val uri: Uri,
    val id: Long,
    val artist: String,
    val data: String,
    val duration: Int,
    val title: String,
)
