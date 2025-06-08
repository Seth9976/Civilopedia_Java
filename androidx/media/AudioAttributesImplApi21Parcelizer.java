package androidx.media;

import W.a;
import W.b;
import android.media.AudioAttributes;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a a0) {
        AudioAttributesImplApi21 audioAttributesImplApi210 = new AudioAttributesImplApi21();
        audioAttributesImplApi210.a = (AudioAttributes)a0.g(audioAttributesImplApi210.a, 1);
        audioAttributesImplApi210.b = a0.f(audioAttributesImplApi210.b, 2);
        return audioAttributesImplApi210;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi210, a a0) {
        a0.getClass();
        AudioAttributes audioAttributes0 = audioAttributesImplApi210.a;
        a0.i(1);
        ((b)a0).e.writeParcelable(audioAttributes0, 0);
        a0.j(audioAttributesImplApi210.b, 2);
    }
}

