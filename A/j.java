package A;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;

public abstract class j {
    public static final int a;

    static {
        Class class0 = String.class;
        Class class1 = Trace.class;
        if(Build.VERSION.SDK_INT < 29) {
            try {
                class1.getField("TRACE_TAG_APP").getLong(null);
                Class class2 = Long.TYPE;
                class1.getMethod("isTagEnabled", class2);
                Class class3 = Integer.TYPE;
                class1.getMethod("asyncTraceBegin", class2, class0, class3);
                class1.getMethod("asyncTraceEnd", class2, class0, class3);
                class1.getMethod("traceCounter", class2, class0, class3);
            }
            catch(Exception exception0) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", exception0);
            }
        }
    }
}

