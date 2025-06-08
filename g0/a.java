package g0;

import A.f;
import M0.s;
import Y.g;
import Y.m;
import Z.k;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import d0.b;
import d0.c;
import h0.i;
import i3.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public final class a implements Z.a, b {
    public final k i;
    public final B1.a j;
    public final Object k;
    public String l;
    public final LinkedHashMap m;
    public final HashMap n;
    public final HashSet o;
    public final c p;
    public SystemForegroundService q;
    public static final String r;

    static {
        a.r = "WM-SystemFgDispatcher";
    }

    public a(Context context0) {
        this.k = new Object();
        k k0 = k.U(context0);
        this.i = k0;
        this.j = k0.n;
        this.l = null;
        this.m = new LinkedHashMap();
        this.o = new HashSet();
        this.n = new HashMap();
        this.p = new c(context0, k0.n, this);
        k0.p.b(this);
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        synchronized(this.k) {
            i i0 = (i)this.n.remove(s);
            if((i0 == null ? false : this.o.remove(i0))) {
                this.p.c(this.o);
            }
        }
        g g0 = (g)this.m.remove(s);
        if(s.equals(this.l) && this.m.size() > 0) {
            Iterator iterator0 = this.m.entrySet().iterator();
            Object object1 = iterator0.next();
            Map.Entry map$Entry0;
            for(map$Entry0 = (Map.Entry)object1; iterator0.hasNext(); map$Entry0 = (Map.Entry)object2) {
                Object object2 = iterator0.next();
            }
            this.l = (String)map$Entry0.getKey();
            if(this.q != null) {
                g g1 = (g)map$Entry0.getValue();
                this.q.j.post(new g0.b(this.q, g1.a, g1.c, g1.b));
                this.q.j.post(new s(g1.a, 2, this.q));
            }
        }
        SystemForegroundService systemForegroundService0 = this.q;
        if(g0 != null && systemForegroundService0 != null) {
            m m0 = m.d();
            StringBuilder stringBuilder0 = new StringBuilder("Removing Notification (id: ");
            stringBuilder0.append(g0.a);
            stringBuilder0.append(", workSpecId: ");
            stringBuilder0.append(s);
            stringBuilder0.append(" ,notificationType: ");
            m0.a("WM-SystemFgDispatcher", e.g(stringBuilder0, g0.b, ")"), new Throwable[0]);
            systemForegroundService0.j.post(new s(g0.a, 2, systemForegroundService0));
        }
    }

    public static Intent b(Context context0, String s, g g0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_NOTIFY");
        intent0.putExtra("KEY_NOTIFICATION_ID", g0.a);
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g0.b);
        intent0.putExtra("KEY_NOTIFICATION", g0.c);
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    @Override  // d0.b
    public final void c(ArrayList arrayList0) {
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                m.d().a("WM-SystemFgDispatcher", f.h("Constraints unmet for WorkSpec ", ((String)object0)), new Throwable[0]);
                i0.i i0 = new i0.i(this.i, ((String)object0), true);
                this.i.n.k(i0);
            }
        }
    }

    public static Intent d(Context context0, String s, g g0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_START_FOREGROUND");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        intent0.putExtra("KEY_NOTIFICATION_ID", g0.a);
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", g0.b);
        intent0.putExtra("KEY_NOTIFICATION", g0.c);
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    @Override  // d0.b
    public final void e(List list0) {
    }

    public final void f(Intent intent0) {
        int v = 0;
        int v1 = intent0.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int v2 = intent0.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String s = intent0.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification0 = (Notification)intent0.getParcelableExtra("KEY_NOTIFICATION");
        m m0 = m.d();
        StringBuilder stringBuilder0 = new StringBuilder("Notifying with (id: ");
        stringBuilder0.append(v1);
        stringBuilder0.append(", workSpecId: ");
        stringBuilder0.append(s);
        stringBuilder0.append(", notificationType: ");
        m0.a("WM-SystemFgDispatcher", e.g(stringBuilder0, v2, ")"), new Throwable[0]);
        if(notification0 != null && this.q != null) {
            g g0 = new g(v1, notification0, v2);
            LinkedHashMap linkedHashMap0 = this.m;
            linkedHashMap0.put(s, g0);
            if(TextUtils.isEmpty(this.l)) {
                this.l = s;
                this.q.j.post(new g0.b(this.q, v1, notification0, v2));
                return;
            }
            this.q.j.post(new androidx.activity.b(this.q, v1, notification0, 2));
            if(v2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for(Object object0: linkedHashMap0.entrySet()) {
                    v |= ((g)((Map.Entry)object0).getValue()).b;
                }
                g g1 = (g)linkedHashMap0.get(this.l);
                if(g1 != null) {
                    this.q.j.post(new g0.b(this.q, g1.a, g1.c, v));
                }
            }
        }
    }

    public final void g() {
        this.q = null;
        synchronized(this.k) {
            this.p.d();
        }
        this.i.p.f(this);
    }
}

