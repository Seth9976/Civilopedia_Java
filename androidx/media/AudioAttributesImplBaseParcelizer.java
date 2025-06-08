package androidx.media;

import W.a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a a0) {
        AudioAttributesImplBase audioAttributesImplBase0 = new AudioAttributesImplBase();
        audioAttributesImplBase0.a = a0.f(audioAttributesImplBase0.a, 1);
        audioAttributesImplBase0.b = a0.f(audioAttributesImplBase0.b, 2);
        audioAttributesImplBase0.c = a0.f(audioAttributesImplBase0.c, 3);
        audioAttributesImplBase0.d = a0.f(audioAttributesImplBase0.d, 4);
        return audioAttributesImplBase0;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase0, a a0) {
        a0.getClass();
        a0.j(audioAttributesImplBase0.a, 1);
        a0.j(audioAttributesImplBase0.b, 2);
        a0.j(audioAttributesImplBase0.c, 3);
        a0.j(audioAttributesImplBase0.d, 4);
    }
}

