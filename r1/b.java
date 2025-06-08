package r1;

import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.internal.zzhd;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public abstract class b {
    public static final HashSet a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        b.a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
        b.b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
        b.c = Arrays.asList(new String[]{"auto", "app", "am"});
        b.d = Arrays.asList(new String[]{"_r", "_dbg"});
        b.e = Arrays.asList(((String[])ArrayUtils.concat(new String[][]{zzhd.zza, zzhd.zzb})));
        b.f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }
}

