package androidx.media;

import W.a;
import W.c;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a a0) {
        AudioAttributesCompat audioAttributesCompat0 = new AudioAttributesCompat();
        c c0 = audioAttributesCompat0.a;
        if(a0.e(1)) {
            c0 = a0.h();
        }
        audioAttributesCompat0.a = (AudioAttributesImpl)c0;
        return audioAttributesCompat0;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat0, a a0) {
        a0.getClass();
        AudioAttributesImpl audioAttributesImpl0 = audioAttributesCompat0.a;
        a0.i(1);
        a0.k(audioAttributesImpl0);
    }
}

