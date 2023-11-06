package com.tc.musicplayer.data.repository

import com.tc.musicplayer.data.local.ContentResolverHelper
import com.tc.musicplayer.data.local.model.Audio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AudioRepository @Inject constructor(
    private val contentResolver: ContentResolverHelper,
) {
    suspend fun getAudioData(): List<Audio> = withContext(Dispatchers.IO) {
        contentResolver.getAudioData()
    }
}