package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class zzo {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final boolean d;
    public static final Uri e;

    static {
        zzo.e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public zzo(ComponentName componentName0, int v) {
        this.a = null;
        this.b = null;
        Preconditions.checkNotNull(componentName0);
        this.c = componentName0;
        this.d = false;
    }

    public zzo(String s, int v, boolean z) {
        this(s, "com.google.android.gms", 0x1081, false);
    }

    public zzo(String s, String s1, int v, boolean z) {
        Preconditions.checkNotEmpty(s);
        this.a = s;
        Preconditions.checkNotEmpty(s1);
        this.b = s1;
        this.c = null;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzo ? Objects.equal(this.a, ((zzo)object0).a) && Objects.equal(this.b, ((zzo)object0).b) && Objects.equal(this.c, ((zzo)object0).c) && this.d == ((zzo)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.a, this.b, this.c, 0x1081, Boolean.valueOf(this.d)});
    }

    @Override
    public final String toString() {
        String s = this.a;
        if(s == null) {
            Preconditions.checkNotNull(this.c);
            return this.c.flattenToString();
        }
        return s;
    }

    public final ComponentName zza() {
        return this.c;
    }

    public final Intent zzb(Context context0) {
        Bundle bundle1;
        Intent intent0 = null;
        String s = this.a;
        if(s != null) {
            if(this.d) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("serviceActionBundleKey", s);
                try {
                    bundle1 = context0.getContentResolver().call(zzo.e, "serviceIntentCall", null, bundle0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: " + illegalArgumentException0.toString());
                    bundle1 = null;
                }
                if(bundle1 != null) {
                    intent0 = (Intent)bundle1.getParcelable("serviceResponseIntentKey");
                }
                if(intent0 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: " + s);
                }
            }
            return intent0 == null ? new Intent(s).setPackage(this.b) : intent0;
        }
        return new Intent().setComponent(this.c);
    }

    public final String zzc() {
        return this.b;
    }
}

