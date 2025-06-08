package com.google.android.gms.common.api.internal;

import B.o;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import i3.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.WeakHashMap;
import p.b;

public final class zzb extends Fragment implements LifecycleFragment {
    public final Map i;
    public int j;
    public Bundle k;
    public static final WeakHashMap l;

    static {
        zzb.l = new WeakHashMap();
    }

    public zzb() {
        this.i = Collections.synchronizedMap(new b());  // 初始化器: Lp/k;-><init>()V
        this.j = 0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String s, LifecycleCallback lifecycleCallback0) {
        Map map0 = this.i;
        if(map0.containsKey(s)) {
            throw new IllegalArgumentException(e.f("LifecycleCallback with tag ", s, " already added to this fragment."));
        }
        map0.put(s, lifecycleCallback0);
        if(this.j > 0) {
            new zzi(Looper.getMainLooper()).post(new o(this, lifecycleCallback0, s, 2));
        }
    }

    @Override  // android.app.Fragment
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        for(Object object0: this.i.values()) {
            ((LifecycleCallback)object0).dump(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final LifecycleCallback getCallbackOrNull(String s, Class class0) {
        return (LifecycleCallback)class0.cast(this.i.get(s));
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity getLifecycleActivity() {
        return this.getActivity();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.j > 0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.j >= 2;
    }

    @Override  // android.app.Fragment
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        for(Object object0: this.i.values()) {
            ((LifecycleCallback)object0).onActivityResult(v, v1, intent0);
        }
    }

    @Override  // android.app.Fragment
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.j = 1;
        this.k = bundle0;
        for(Object object0: this.i.entrySet()) {
            ((LifecycleCallback)((Map.Entry)object0).getValue()).onCreate((bundle0 == null ? null : bundle0.getBundle(((String)((Map.Entry)object0).getKey()))));
        }
    }

    @Override  // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.j = 5;
        for(Object object0: this.i.values()) {
            ((LifecycleCallback)object0).onDestroy();
        }
    }

    @Override  // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.j = 3;
        for(Object object0: this.i.values()) {
            ((LifecycleCallback)object0).onResume();
        }
    }

    @Override  // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        if(bundle0 != null) {
            for(Object object0: this.i.entrySet()) {
                Bundle bundle1 = new Bundle();
                ((LifecycleCallback)((Map.Entry)object0).getValue()).onSaveInstanceState(bundle1);
                bundle0.putBundle(((String)((Map.Entry)object0).getKey()), bundle1);
            }
        }
    }

    @Override  // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.j = 2;
        for(Object object0: this.i.values()) {
            ((LifecycleCallback)object0).onStart();
        }
    }

    @Override  // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.j = 4;
        for(Object object0: this.i.values()) {
            ((LifecycleCallback)object0).onStop();
        }
    }

    public static zzb zzc(Activity activity0) {
        zzb zzb1;
        WeakHashMap weakHashMap0 = zzb.l;
        WeakReference weakReference0 = (WeakReference)weakHashMap0.get(activity0);
        if(weakReference0 != null) {
            zzb zzb0 = (zzb)weakReference0.get();
            if(zzb0 != null) {
                return zzb0;
            }
        }
        try {
            zzb1 = (zzb)activity0.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException0);
        }
        if(zzb1 == null || zzb1.isRemoving()) {
            zzb1 = new zzb();
            activity0.getFragmentManager().beginTransaction().add(zzb1, "LifecycleFragmentImpl").commitAllowingStateLoss();
        }
        weakHashMap0.put(activity0, new WeakReference(zzb1));
        return zzb1;
    }
}

