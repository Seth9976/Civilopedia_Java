package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jeb.synthetic.TWR;
import p.b;

public final class zzhc implements zzhi {
    public final zzhe zza;

    public zzhc(zzhe zzhe0) {
        this.zza = zzhe0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhi
    public final Object zza() {
        Map map0;
        b b0;
        Cursor cursor0 = this.zza.a.query(this.zza.b, zzhe.zza, null, null, null);
        if(cursor0 == null) {
            return Collections.emptyMap();
        }
        try {
            int v = cursor0.getCount();
            if(v != 0) {
                b0 = v <= 0x100 ? new b(v) : new HashMap(v, 1.0f);
                while(true) {
                    if(!cursor0.moveToNext()) {
                        goto label_12;
                    }
                    b0.put(cursor0.getString(0), cursor0.getString(1));
                }
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
    label_12:
        cursor0.close();
        return b0;
        try {
        label_14:
            map0 = Collections.emptyMap();
        }
        catch(Throwable throwable0) {
        label_17:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return map0;
    }
}

