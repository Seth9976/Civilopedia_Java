package t1;

import E1.e;
import M1.f;
import Y.m;
import Z1.b;
import Z1.j;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.internal.stats.zze;
import com.google.android.gms.stats.zzd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import y1.a;

public final class c implements e, b, zzbt, RewardItem, zaq, zze, zzd, Continuation, k, s0.b, a, z0.a {
    public final int i;

    public c(int v) {
        this.i = v;
        super();
    }

    @Override  // com.google.gson.internal.k
    public Object F() {
        switch(this.i) {
            case 10: {
                return new TreeMap();
            }
            case 11: {
                return new TreeSet();
            }
            default: {
                return new ArrayList();
            }
        }
    }

    @Override  // y1.a
    public void a() {
    }

    @Override  // y1.a
    public String b() {
        return null;
    }

    @Override  // E1.e
    public E1.c c(f f0, JSONObject jSONObject0) {
        jSONObject0.optInt("settings_version", 0);
        int v = jSONObject0.optInt("cache_duration", 3600);
        double f1 = jSONObject0.optDouble("on_demand_upload_rate_per_minute", 10.0);
        double f2 = jSONObject0.optDouble("on_demand_backoff_base", 1.2);
        int v1 = jSONObject0.optInt("on_demand_backoff_step_duration_seconds", 60);
        m m0 = jSONObject0.has("session") ? new m(jSONObject0.getJSONObject("session").optInt("max_custom_exception_events", 8), 1) : new m(new JSONObject().optInt("max_custom_exception_events", 8), 1);
        JSONObject jSONObject1 = jSONObject0.getJSONObject("features");
        E1.b b0 = new E1.b(jSONObject1.optBoolean("collect_reports", true), jSONObject1.optBoolean("collect_anrs", false));
        return jSONObject0.has("expires_at") ? new E1.c(jSONObject0.optLong("expires_at"), m0, b0, f1, f2, v1) : new E1.c(((long)v) * 1000L + System.currentTimeMillis(), m0, b0, f1, f2, v1);
    }

    @Override  // z0.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override  // y1.a
    public void e(String s, long v) {
    }

    public float f(j j0, boolean z) {
        J2.j.f(j0, "engine");
        return z ? j0.i.j * 0.1f : j0.i.k * 0.1f;
    }

    @Override  // v2.a
    public Object get() {
        c c0 = new c(21);
        HashMap hashMap0 = new HashMap();
        n0.c c1 = n0.c.i;
        Set set0 = Collections.emptySet();
        if(set0 == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap0.put(c1, new w0.c(30000L, 86400000L, set0));
        n0.c c2 = n0.c.k;
        Set set1 = Collections.emptySet();
        if(set1 == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap0.put(c2, new w0.c(1000L, 86400000L, set1));
        n0.c c3 = n0.c.j;
        if(Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set set2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new w0.e[]{w0.e.j})));
        if(set2 == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap0.put(c3, new w0.c(86400000L, 86400000L, set2));
        if(hashMap0.keySet().size() < n0.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new w0.b(c0, hashMap0);
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(this.i != 4) {
            return null;
        }
        if(!((Boolean)task0.getResult()).booleanValue()) {
            throw new ApiException(new Status(13, "listener already unregistered"));
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.base.zaq
    public ExecutorService zaa(ThreadFactory threadFactory0, int v) {
        return this.zac(1, threadFactory0, 1);
    }

    @Override  // com.google.android.gms.internal.base.zaq
    public ExecutorService zab(int v, int v1) {
        return this.zac(4, Executors.defaultThreadFactory(), 2);
    }

    @Override  // com.google.android.gms.internal.base.zaq
    public ExecutorService zac(int v, ThreadFactory threadFactory0, int v1) {
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(v, v, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor0);
    }
}

