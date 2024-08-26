package com.example.editapp.Presentation

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable

@Composable
fun VideoEditorScreen(
    viewModel: VideoEditorViewModel = viewModel()
) {
    val videoState by viewModel.videoState.collectAsState()

    when (videoState) {
        is VideoState.Loading -> {
            // Show a loading indicator
            CircularProgressIndicator()
        }
        is VideoState.Success -> {
            val editedMediaItem = (videoState as VideoState.Success).editedMediaItem
            // Display the edited video using the ExoPlayer
            VideoPlayer(editedMediaItem)
        }
        is VideoState.Error -> {
            // Handle error state
            Text("Error occurred while transforming the video")
        }
    }

    // UI components for video editing controls
    VideoEditingControls()
}
