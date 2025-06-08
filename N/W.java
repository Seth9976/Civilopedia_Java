package N;

import android.view.animation.Interpolator;

public final class w implements Interpolator {
    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
    }
}

