package com.example.editapp.Domain.Repository

import android.media.browse.MediaBrowser
import androidx.media3.transformer.EditedMediaItem
import androidx.media3.transformer.Effects
import com.example.editapp.Domain.Model.MediaTransformer

data class VideoEditorUseCase(
    private val mediaTransformer: MediaTransformer
) {
    suspend fun transformVideo(
        inputMediaItem: MediaBrowser.MediaItem,
        effects: Effects
    ): EditedMediaItem {
        return mediaTransformer.transformVideo(inputMediaItem, effects)
    }
}