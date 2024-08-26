package com.example.editapp.Data.RepositoryIm

import android.graphics.Matrix
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.unit.min
import androidx.media3.common.audio.ChannelMixingAudioProcessor
import androidx.media3.effect.MatrixTransformation
import androidx.media3.effect.ScaleAndRotateTransformation
import androidx.media3.transformer.Effects
import kotlin.math.min

class EffectsRepository {
    fun getEffects(): Effects {
        val channelMixingProcessor = ChannelMixingAudioProcessor()
        val rotateEffect = ScaleAndRotateTransformation.Builder().setRotationDegrees(60f).build()
        val cropEffect = Crop(-0.5f, 0.5f, -0.5f, 0.5f)
        val zoomEffect = MatrixTransformation { presentationTimeUs ->
            val transformationMatrix = Matrix()
            val scale = min(1f, presentationTimeUs / 1_000f)
            transformationMatrix.postScale(scale, scale)
            transformationMatrix
        }

        return Effects(listOf(channelMixingProcessor), listOf(rotateEffect, cropEffect, zoomEffect))
    }
}