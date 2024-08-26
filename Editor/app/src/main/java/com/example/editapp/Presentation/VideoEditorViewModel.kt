package com.example.editapp.Presentation

import android.media.browse.MediaBrowser
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.editapp.Data.RepositoryIm.EffectsRepository
import com.example.editapp.Data.RepositoryIm.VideoRepository
import com.example.editapp.Domain.Repository.VideoEditorUseCase
import kotlinx.coroutines.launch

class VideoEditorViewModel(
    private val videoEditorUseCase: VideoEditorUseCase,
    private val videoRepository: VideoRepository,
    private val effectsRepository: EffectsRepository
) : ViewModel() {
    private val _videoState = mutableStateOf<VideoState>(VideoState.Loading)
    val videoState: State<VideoState> = _videoState

    fun transformVideo() {
        viewModelScope.launch {
            val videoUri = videoRepository.getVideoUri()
            val mediaItem = MediaBrowser.MediaItem.Builder()
                .setUri(videoUri)
                .setClippingConfiguration(
                    MediaItem.ClippingConfiguration.Builder()
                        .setStartPositionMs(10_000)
                        .setEndPositionMs(20_000)
                        .build()
                )
                .build()

            val effects = effectsRepository.getEffects()
            val editedMediaItem = videoEditorUseCase.transformVideo(mediaItem, effects)

            _videoState.value = VideoState.Success(editedMediaItem)
        }
    }
}