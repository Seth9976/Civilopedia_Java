package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class zzfcs {
    public final Pattern a;

    @VisibleForTesting
    public zzfcs() {
        Pattern pattern0 = null;
        try {
            pattern0 = Pattern.compile(((String)zzay.zzc().zzb(zzbhz.zzfQ)));
        }
        catch(PatternSyntaxException unused_ex) {
        }
        this.a = pattern0;
    }

    public final String zza(String s) {
        Pattern pattern0 = this.a;
        if(pattern0 != null && s != null) {
            Matcher matcher0 = pattern0.matcher(s);
            return matcher0.find() ? matcher0.group() : null;
        }
        return null;
    }
}

