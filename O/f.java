package O;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

public final class f extends RemoteCallbackList {
    public final MultiInstanceInvalidationService a;

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService0) {
        this.a = multiInstanceInvalidationService0;
        super();
    }

    @Override  // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface0, Object object0) {
        b b0 = (b)iInterface0;
        ((Integer)object0).intValue();
        this.a.j.remove(((Integer)object0));
    }
}

