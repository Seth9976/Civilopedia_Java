package x1;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class h implements Callable {
    public final long a;
    public final i b;

    public h(i i0, long v) {
        this.b = i0;
        this.a = v;
    }

    @Override
    public final Object call() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("fatal", 1);
        bundle0.putLong("timestamp", this.a);
        this.b.j.e(bundle0);
        return null;
    }
}

