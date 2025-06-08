package g1;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.DetectedActivity;
import java.util.Comparator;

public final class r implements Comparator {
    public final int i;

    public r(int v) {
        this.i = v;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.i != 0) {
            Preconditions.checkNotNull(((DetectedActivity)object0));
            Preconditions.checkNotNull(((DetectedActivity)object1));
            int v = ((DetectedActivity)object1).getConfidence().compareTo(((DetectedActivity)object0).getConfidence());
            return v == 0 ? ((DetectedActivity)object0).getType().compareTo(((DetectedActivity)object1).getType()) : v;
        }
        Preconditions.checkNotNull(((ActivityTransition)object0));
        Preconditions.checkNotNull(((ActivityTransition)object1));
        int v1 = ((ActivityTransition)object0).getActivityType();
        int v2 = ((ActivityTransition)object1).getActivityType();
        if(v1 != v2) {
            return v1 < v2 ? -1 : 1;
        }
        int v3 = ((ActivityTransition)object0).getTransitionType();
        int v4 = ((ActivityTransition)object1).getTransitionType();
        if(v3 == v4) {
            return 0;
        }
        return v3 >= v4 ? 1 : -1;
    }
}

