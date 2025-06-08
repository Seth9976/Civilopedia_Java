package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof AudioAttributesImplApi21 ? this.a.equals(((AudioAttributesImplApi21)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}

