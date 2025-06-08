package K0;

import com.google.android.gms.common.zze;

public final class h extends i {
    public final zze f;

    public h(zze zze0) {
        super(false, 1, null, null);
        this.f = zze0;
    }

    @Override  // K0.i
    public final String a() {
        try {
            return (String)this.f.call();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }
}

