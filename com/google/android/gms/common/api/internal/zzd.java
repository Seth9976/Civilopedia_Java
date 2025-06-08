package com.google.android.gms.common.api.internal;

import B.o;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import androidx.fragment.app.a;
import androidx.fragment.app.h;
import androidx.fragment.app.j;
import androidx.fragment.app.v;
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

public final class zzd extends h implements LifecycleFragment {
    public final Map f0;
    public int g0;
    public Bundle h0;
    public static final WeakHashMap i0;

    static {
        zzd.i0 = new WeakHashMap();
    }

    public zzd() {
        this.f0 = Collections.synchronizedMap(new b());  // 初始化器: Lp/k;-><init>()V
        this.g0 = 0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String s, LifecycleCallback lifecycleCallback0) {
        Map map0 = this.f0;
        if(map0.containsKey(s)) {
            throw new IllegalArgumentException(e.f("LifecycleCallback with tag ", s, " already added to this fragment."));
        }
        map0.put(s, lifecycleCallback0);
        if(this.g0 > 0) {
            new zzi(Looper.getMainLooper()).post(new o(this, lifecycleCallback0, s, 3));
        }
    }

    @Override  // androidx.fragment.app.h
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        for(Object object0: this.f0.values()) {
            ((LifecycleCallback)object0).dump(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final LifecycleCallback getCallbackOrNull(String s, Class class0) {
        return (LifecycleCallback)class0.cast(this.f0.get(s));
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity getLifecycleActivity() {
        return this.getActivity();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.g0 > 0;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.g0 >= 2;
    }

    @Override  // androidx.fragment.app.h
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        for(Object object0: this.f0.values()) {
            ((LifecycleCallback)object0).onActivityResult(v, v1, intent0);
        }
    }

    @Override  // androidx.fragment.app.h
    public final void onCreate(Bundle bundle0) {
        this.M = true;
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            if(parcelable0 != null) {
                this.B.d0(parcelable0);
                this.B.k();
            }
        }
        v v0 = this.B;
        if(v0.w < 1) {
            v0.k();
        }
        this.g0 = 1;
        this.h0 = bundle0;
        for(Object object0: this.f0.entrySet()) {
            ((LifecycleCallback)((Map.Entry)object0).getValue()).onCreate((bundle0 == null ? null : bundle0.getBundle(((String)((Map.Entry)object0).getKey()))));
        }
    }

    @Override  // androidx.fragment.app.h
    public final void onDestroy() {
        super.onDestroy();
        this.g0 = 5;
        for(Object object0: this.f0.values()) {
            ((LifecycleCallback)object0).onDestroy();
        }
    }

    @Override  // androidx.fragment.app.h
    public final void onResume() {
        super.onResume();
        this.g0 = 3;
        for(Object object0: this.f0.values()) {
            ((LifecycleCallback)object0).onResume();
        }
    }

    @Override  // androidx.fragment.app.h
    public final void onSaveInstanceState(Bundle bundle0) {
        if(bundle0 != null) {
            for(Object object0: this.f0.entrySet()) {
                Bundle bundle1 = new Bundle();
                ((LifecycleCallback)((Map.Entry)object0).getValue()).onSaveInstanceState(bundle1);
                bundle0.putBundle(((String)((Map.Entry)object0).getKey()), bundle1);
            }
        }
    }

    @Override  // androidx.fragment.app.h
    public final void onStart() {
        this.M = true;
        this.g0 = 2;
        for(Object object0: this.f0.values()) {
            ((LifecycleCallback)object0).onStart();
        }
    }

    @Override  // androidx.fragment.app.h
    public final void onStop() {
        this.M = true;
        this.g0 = 4;
        for(Object object0: this.f0.values()) {
            ((LifecycleCallback)object0).onStop();
        }
    }

    public static zzd zzc(j j0) {
        zzd zzd1;
        WeakHashMap weakHashMap0 = zzd.i0;
        WeakReference weakReference0 = (WeakReference)weakHashMap0.get(j0);
        if(weakReference0 != null) {
            zzd zzd0 = (zzd)weakReference0.get();
            if(zzd0 != null) {
                return zzd0;
            }
        }
        try {
            zzd1 = (zzd)j0.g().N("SupportLifecycleFragmentImpl");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException0);
        }
        if(zzd1 == null || zzd1.isRemoving()) {
            zzd1 = new zzd();
            v v0 = j0.g();
            v0.getClass();
            a a0 = new a(v0);
            a0.b(zzd1, "SupportLifecycleFragmentImpl");
            a0.e(true);
        }
        weakHashMap0.put(j0, new WeakReference(zzd1));
        return zzd1;
    }
}

