package com.example.editapp.Domain.Model

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.transformer.EditedMediaItem
import androidx.media3.transformer.Effects
//import javax.xml.transform.Transformer
import androidx.media3.transformer.Transformer

class MediaTransformer(
    private val context: Context
) {
    private val transformer = Transformer.Builder(context)
        .setVideoMimeType(MimeTypes.VIDEO_H265)
        .setAudioMimeType(MimeTypes.AUDIO_AAC)
        .build()

    suspend fun transformVideo(
        inputMediaItem: MediaItem,
        effects: Effects
    ): EditedMediaItem {
        return transformer.start(
            EditedMediaItem.Builder(inputMediaItem)
                .setEffects(effects)
                .build(),
            outputPath
        )
