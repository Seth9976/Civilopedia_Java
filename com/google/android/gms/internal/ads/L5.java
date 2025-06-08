package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec;
import android.media.MediaDrmResetException;
import android.os.Handler;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public abstract class l5 {
    public static boolean A(SpinnerAdapter spinnerAdapter0) {
        return spinnerAdapter0 instanceof ThemedSpinnerAdapter;
    }

    public static boolean B(Throwable throwable0) {
        return throwable0 instanceof MediaDrmResetException;
    }

    public static AudioTrack.Builder D(AudioTrack.Builder audioTrack$Builder0, int v) {
        return audioTrack$Builder0.setSessionId(v);
    }

    public static int a(Context context0) {
        return context0.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS");
    }

    public static AudioTrack.Builder f() {
        return new AudioTrack.Builder();
    }

    public static AudioTrack.Builder g(AudioTrack.Builder audioTrack$Builder0) {
        return audioTrack$Builder0.setTransferMode(1);
    }

    public static AudioTrack.Builder h(AudioTrack.Builder audioTrack$Builder0, int v) {
        return audioTrack$Builder0.setBufferSizeInBytes(v);
    }

    public static AudioTrack.Builder i(AudioTrack.Builder audioTrack$Builder0, AudioAttributes audioAttributes0) {
        return audioTrack$Builder0.setAudioAttributes(audioAttributes0);
    }

    public static AudioTrack.Builder j(AudioTrack.Builder audioTrack$Builder0, AudioFormat audioFormat0) {
        return audioTrack$Builder0.setAudioFormat(audioFormat0);
    }

    public static AudioTrack k(AudioTrack.Builder audioTrack$Builder0) {
        return audioTrack$Builder0.build();
    }

    public static StaticLayout.Builder n(CharSequence charSequence0, int v, TextPaint textPaint0, int v1) {
        return StaticLayout.Builder.obtain(charSequence0, 0, v, textPaint0, v1);
    }

    public static ThemedSpinnerAdapter p(SpinnerAdapter spinnerAdapter0) [...] // Inlined contents

    public static Object q(Context context0) {
        return context0.getSystemService(UiModeManager.class);
    }

    public static void s() {
    }

    public static void u(MediaCodec mediaCodec0, MediaCodec.Callback mediaCodec$Callback0, Handler handler0) {
        mediaCodec0.setCallback(mediaCodec$Callback0, handler0);
    }

    public static boolean y(AudioManager audioManager0, int v) {
        return audioManager0.isStreamMute(v);
    }
}

