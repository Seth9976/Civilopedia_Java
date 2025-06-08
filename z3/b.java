package Z3;

import java.util.concurrent.atomic.AtomicLong;

public abstract class b {
    public static final boolean a;

    static {
        boolean z;
        String s = null;
        try {
            s = System.getProperty("kotlinx.coroutines.debug");
            z = false;
        }
        catch(SecurityException unused_ex) {
        }
        if(s != null) {
            switch(s) {
                case "": 
                case "on": {
                    z = true;
                    break;
                }
                case "auto": 
                case "off": {
                    break;
                }
                default: {
                    throw new IllegalStateException(("System property \'kotlinx.coroutines.debug\' has unrecognized value \'" + s + '\'').toString());
                }
            }
        }
        b.a = z;
        if(z) {
            try {
                System.getProperty("kotlinx.coroutines.stacktrace.recovery");
            }
            catch(SecurityException unused_ex) {
            }
        }
        new AtomicLong(0L);
    }
}

