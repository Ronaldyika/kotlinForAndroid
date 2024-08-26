package com.example.editapp.Presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.ui.PlayerView

@Composable
fun VideoPlayer(
    editedMediaItem: EditedMediaItem
) {
    val player = rememberExoPlayerInstance(editedMediaItem)

    AndroidView(
        factory = { context ->
            PlayerView(context).apply {
                player = player
                useController = true
                setShowNextButton(false)
                setShowPreviousButton(false)
            }
        },
        update = { it.player = player }
    )
}