package B;

import android.content.Context;
import java.util.concurrent.Callable;

public final class g implements Callable {
    public final int a;
    public final String b;
    public final Context c;
    public final f d;
    public final int e;

    public g(String s, Context context0, f f0, int v, int v1) {
        this.a = v1;
        this.b = s;
        this.c = context0;
        this.d = f0;
        this.e = v;
        super();
    }

    @Override
    public final Object call() {
        return j.a(this.b, this.c, this.d, this.e);
    }
}

