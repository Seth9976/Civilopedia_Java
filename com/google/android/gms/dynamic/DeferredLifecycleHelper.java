package com.google.android.gms.dynamic;

import D3.b;
import X0.a;
import X0.c;
import X0.d;
import X0.e;
import X0.f;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zac;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.LinkedList;

@KeepForSdk
public abstract class DeferredLifecycleHelper {
    public LifecycleDelegate a;
    public Bundle b;
    public LinkedList c;

    @KeepForSdk
    public DeferredLifecycleHelper() {
        new b(this, 9);
    }

    public abstract void a();

    public final void b(int v) {
        while(!this.c.isEmpty() && ((f)this.c.getLast()).zaa() >= v) {
            this.c.removeLast();
        }
    }

    public final void c(Bundle bundle0, f f0) {
        if(this.a != null) {
            f0.zab();
            return;
        }
        if(this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(f0);
        if(bundle0 != null) {
            Bundle bundle1 = this.b;
            if(bundle1 == null) {
                this.b = (Bundle)bundle0.clone();
            }
            else {
                bundle1.putAll(bundle0);
            }
        }
        this.a();
    }

    @KeepForSdk
    public LifecycleDelegate getDelegate() {
        return this.a;
    }

    @KeepForSdk
    public void onCreate(Bundle bundle0) {
        this.c(bundle0, new X0.b(this, bundle0));
    }

    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = new FrameLayout(layoutInflater0.getContext());
        this.c(bundle0, new c(this, ((FrameLayout)view0), layoutInflater0, viewGroup0, bundle0));
        if(this.a == null) {
            DeferredLifecycleHelper.showGooglePlayUnavailableMessage(((FrameLayout)view0));
        }
        return view0;
    }

    @KeepForSdk
    public void onDestroy() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onDestroy();
            return;
        }
        this.b(1);
    }

    @KeepForSdk
    public void onDestroyView() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onDestroyView();
            return;
        }
        this.b(2);
    }

    @KeepForSdk
    public void onInflate(Activity activity0, Bundle bundle0, Bundle bundle1) {
        this.c(bundle1, new a(this, activity0, bundle0, bundle1));
    }

    @KeepForSdk
    public void onLowMemory() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onPause();
            return;
        }
        this.b(5);
    }

    @KeepForSdk
    public void onResume() {
        this.c(null, new e(this, 1));
    }

    @KeepForSdk
    public void onSaveInstanceState(Bundle bundle0) {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onSaveInstanceState(bundle0);
            return;
        }
        Bundle bundle1 = this.b;
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
    }

    @KeepForSdk
    public void onStart() {
        this.c(null, new e(this, 0));
    }

    @KeepForSdk
    public void onStop() {
        LifecycleDelegate lifecycleDelegate0 = this.a;
        if(lifecycleDelegate0 != null) {
            lifecycleDelegate0.onStop();
            return;
        }
        this.b(4);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout0) {
        GoogleApiAvailability googleApiAvailability0 = GoogleApiAvailability.getInstance();
        Context context0 = frameLayout0.getContext();
        int v = googleApiAvailability0.isGooglePlayServicesAvailable(context0);
        String s = zac.zac(context0, v);
        String s1 = zac.zab(context0, v);
        LinearLayout linearLayout0 = new LinearLayout(frameLayout0.getContext());
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout0.addView(linearLayout0);
        TextView textView0 = new TextView(frameLayout0.getContext());
        textView0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView0.setText(s);
        linearLayout0.addView(textView0);
        Intent intent0 = googleApiAvailability0.getErrorResolutionIntent(context0, v, null);
        if(intent0 != null) {
            Button button0 = new Button(context0);
            button0.setId(0x1020019);
            button0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button0.setText(s1);
            linearLayout0.addView(button0);
            button0.setOnClickListener(new d(context0, intent0));
        }
    }
}

