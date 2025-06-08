package androidx.room;

import O.f;
import O.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    public int i;
    public final HashMap j;
    public final f k;
    public final g l;

    public MultiInstanceInvalidationService() {
        this.i = 0;
        this.j = new HashMap();
        this.k = new f(this);
        this.l = new g(this);
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        return this.l;
    }
}

