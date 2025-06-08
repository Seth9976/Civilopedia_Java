package i1;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzfd;
import com.google.android.gms.measurement.internal.zzfe;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzfh;
import com.google.android.gms.measurement.internal.zzfi;
import com.google.android.gms.measurement.internal.zzge;

public final class r extends B {
    public SharedPreferences c;
    public zzfh d;
    public final zzff e;
    public final zzfi f;
    public String g;
    public boolean h;
    public long i;
    public final zzff j;
    public final zzfd k;
    public final zzfi l;
    public final zzfd m;
    public final zzff n;
    public boolean o;
    public final zzfd p;
    public final zzfd q;
    public final zzff r;
    public final zzfi s;
    public final zzfi t;
    public final zzff u;
    public final zzfe v;
    public static final Pair w;

    static {
        r.w = new Pair("", 0L);
    }

    public r(zzge zzge0) {
        super(zzge0);
        this.j = new zzff(this, "session_timeout", 1800000L);
        this.k = new zzfd(this, "start_new_session", true);
        this.n = new zzff(this, "last_pause_time", 0L);
        this.l = new zzfi(this, "non_personalized_ads", null);
        this.m = new zzfd(this, "allow_remote_dynamite", false);
        this.e = new zzff(this, "first_open_time", 0L);
        new zzff(this, "app_install_time", 0L);
        this.f = new zzfi(this, "app_instance_id", null);
        this.p = new zzfd(this, "app_backgrounded", false);
        this.q = new zzfd(this, "deep_link_retrieval_complete", false);
        this.r = new zzff(this, "deep_link_retrieval_attempts", 0L);
        this.s = new zzfi(this, "firebase_feature_rollouts", null);
        this.t = new zzfi(this, "deferred_attribution_cache", null);
        this.u = new zzff(this, "deferred_attribution_cache_timestamp", 0L);
        this.v = new zzfe(this, "default_event_parameters", null);
    }

    @Override  // i1.B
    public final void a() {
        SharedPreferences sharedPreferences0 = this.a.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences0;
        boolean z = sharedPreferences0.getBoolean("has_been_opened", false);
        this.o = z;
        if(!z) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.c.edit();
            sharedPreferences$Editor0.putBoolean("has_been_opened", true);
            sharedPreferences$Editor0.apply();
        }
        this.d = new zzfh(this, Math.max(0L, ((long)(((Long)zzeh.zzb.zza(null))))));
    }

    @Override  // i1.B
    public final boolean b() {
        return true;
    }

    public final SharedPreferences d() {
        this.zzg();
        this.c();
        Preconditions.checkNotNull(this.c);
        return this.c;
    }

    public final zzai e() {
        this.zzg();
        return zzai.zzb(this.d().getString("consent_settings", "G1"));
    }

    public final void f(boolean z) {
        this.zzg();
        this.a.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor sharedPreferences$Editor0 = this.d().edit();
        sharedPreferences$Editor0.putBoolean("deferred_analytics_collection", z);
        sharedPreferences$Editor0.apply();
    }

    public final boolean g(long v) {
        return v - this.j.zza() > this.n.zza();
    }
}

