package Y;

import android.support.v4.media.session.a;
import i3.e;

public final class o extends a {
    public final Throwable d;

    public o(Throwable throwable0) {
        this.d = throwable0;
    }

    @Override
    public final String toString() {
        return e.f("FAILURE (", this.d.getMessage(), ")");
    }
}

