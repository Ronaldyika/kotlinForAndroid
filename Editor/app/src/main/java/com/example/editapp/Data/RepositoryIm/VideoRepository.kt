package com.example.editapp.Data.RepositoryIm

import android.content.Context
import android.net.Uri

class VideoRepository(
    private val context: Context
) {
    fun getVideoUri(): Uri {
        // Implement logic to retrieve the video URI
        return Uri.parse("content://media/external/video/media/12345")
    }
}
