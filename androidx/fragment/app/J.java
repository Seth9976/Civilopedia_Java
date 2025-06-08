package androidx.fragment.app;

import T1.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.e;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.g;
import androidx.lifecycle.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p.d;
import p.l;
import u.a;
import u.b;

public abstract class j extends e implements a, b {
    public final c q;
    public final p r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public l z;

    public j() {
        this.q = new c(new i(this), 19);
        this.r = new p(this);
        this.u = true;
    }

    @Override  // android.app.Activity
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        printWriter0.print(s);
        printWriter0.print("Local FragmentActivity ");
        printWriter0.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter0.println(" State:");
        printWriter0.print(s + "  ");
        printWriter0.print("mCreated=");
        printWriter0.print(this.s);
        printWriter0.print(" mResumed=");
        printWriter0.print(this.t);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.u);
        if(this.getApplication() != null) {
            B b0 = this.getViewModelStore();
            Class class0 = K.b.class;
            String s1 = class0.getCanonicalName();
            if(s1 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            A a0 = (A)b0.a.get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s1);
            if(!class0.isInstance(a0)) {
                a0 = new K.b();
                A a1 = (A)b0.a.put("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s1, a0);
                if(a1 != null) {
                    a1.a();
                }
            }
            l l0 = ((K.b)a0).b;
            if(l0.f() > 0) {
                printWriter0.print(s + "  ");
                printWriter0.println("Loaders:");
                if(l0.f() > 0) {
                    if(l0.g(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter0.print(s + "  ");
                    printWriter0.print("  #");
                    if(l0.i) {
                        l0.c();
                    }
                    printWriter0.print(l0.j[0]);
                    printWriter0.print(": ");
                    throw null;
                }
            }
        }
        ((i)this.q.j).m.G(s, fileDescriptor0, printWriter0, arr_s);
    }

    public final int e(h h0) {
        if(this.z.f() >= 0xFFFE) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while(true) {
            l l0 = this.z;
            int v = this.y;
            if(l0.i) {
                l0.c();
            }
            if(d.a(l0.l, v, l0.j) < 0) {
                break;
            }
            this.y = (this.y + 1) % 0xFFFE;
        }
        int v1 = this.y;
        this.z.e(v1, h0.m);
        this.y = (this.y + 1) % 0xFFFE;
        return v1;
    }

    public static void f(int v) {
        if((v & 0xFFFF0000) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final v g() {
        return ((i)this.q.j).m;
    }

    public static boolean h(androidx.fragment.app.l l0) {
        List list0;
        if(((v)l0).n.isEmpty()) {
            list0 = Collections.emptyList();
        }
        else {
            synchronized(((v)l0).n) {
                list0 = (List)((v)l0).n.clone();
            }
        }
        boolean z = false;
        for(Object object0: list0) {
            h h0 = (h)object0;
            if(h0 != null) {
                if(((p)h0.getLifecycle()).b.compareTo(androidx.lifecycle.h.l) >= 0) {
                    p p0 = h0.a0;
                    p0.d("setCurrentState");
                    p0.f(androidx.lifecycle.h.k);
                    z = true;
                }
                if(h0.getHost() != null) {
                    z |= j.h(h0.getChildFragmentManager());
                }
            }
        }
        return z;
    }

    @Override  // androidx.activity.e
    public void onActivityResult(int v, int v1, Intent intent0) {
        c c0 = this.q;
        c0.R();
        if(v >> 16 != 0) {
            int v2 = (v >> 16) - 1;
            String s = (String)this.z.d(v2, null);
            l l0 = this.z;
            int v3 = d.a(l0.l, v2, l0.j);
            if(v3 >= 0) {
                Object[] arr_object = l0.k;
                Object object0 = l.m;
                if(arr_object[v3] != object0) {
                    arr_object[v3] = object0;
                    l0.i = true;
                }
            }
            if(s == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            h h0 = ((i)c0.j).m.O(s);
            if(h0 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + s);
                return;
            }
            h0.onActivityResult(v & 0xFFFF, v1, intent0);
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.q.R();
        ((i)this.q.j).m.i(configuration0);
    }

    @Override  // androidx.activity.e
    public void onCreate(Bundle bundle0) {
        c c0 = this.q;
        i i0 = (i)c0.j;
        i0.m.d(i0, i0, null);
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            i i1 = (i)c0.j;
            if(!(i1 instanceof C)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig().");
            }
            i1.m.d0(parcelable0);
            if(bundle0.containsKey("android:support:next_request_index")) {
                this.y = bundle0.getInt("android:support:next_request_index");
                int[] arr_v = bundle0.getIntArray("android:support:request_indicies");
                String[] arr_s = bundle0.getStringArray("android:support:request_fragment_who");
                if(arr_v == null || arr_s == null || arr_v.length != arr_s.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                }
                else {
                    this.z = new l(arr_v.length);
                    for(int v = 0; v < arr_v.length; ++v) {
                        this.z.e(arr_v[v], arr_s[v]);
                    }
                }
            }
        }
        if(this.z == null) {
            this.z = new l();
            this.y = 0;
        }
        super.onCreate(bundle0);
        this.r.e(g.ON_CREATE);
        ((i)c0.j).m.k();
    }

    @Override  // android.app.Activity
    public final boolean onCreatePanelMenu(int v, Menu menu0) {
        if(v == 0) {
            boolean z = super.onCreatePanelMenu(0, menu0);
            MenuInflater menuInflater0 = this.getMenuInflater();
            return z | ((i)this.q.j).m.l(menu0, menuInflater0);
        }
        return super.onCreatePanelMenu(v, menu0);
    }

    @Override  // android.app.Activity
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        View view1 = ((i)this.q.j).m.onCreateView(view0, s, context0, attributeSet0);
        return view1 == null ? super.onCreateView(view0, s, context0, attributeSet0) : view1;
    }

    @Override  // android.app.Activity
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        View view0 = ((i)this.q.j).m.onCreateView(null, s, context0, attributeSet0);
        return view0 == null ? super.onCreateView(s, context0, attributeSet0) : view0;
    }

    @Override  // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((i)this.q.j).m.m();
        this.r.e(g.ON_DESTROY);
    }

    @Override  // android.app.Activity
    public final void onLowMemory() {
        super.onLowMemory();
        i i0 = (i)this.q.j;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = i0.m.n;
            if(v >= arrayList0.size()) {
                break;
            }
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.f();
            }
        }
    }

    @Override  // android.app.Activity
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        c c0 = this.q;
        switch(v) {
            case 0: {
                return ((i)c0.j).m.B(menuItem0);
            }
            case 6: {
                return ((i)c0.j).m.j(menuItem0);
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        ArrayList arrayList0 = ((i)this.q.j).m.n;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.g(z);
            }
        }
    }

    @Override  // android.app.Activity
    public final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.q.R();
    }

    @Override  // android.app.Activity
    public void onPanelClosed(int v, Menu menu0) {
        if(v == 0) {
            ((i)this.q.j).m.C(menu0);
        }
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.t = false;
        ((i)this.q.j).m.F(3);
        this.r.e(g.ON_PAUSE);
    }

    @Override  // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        ArrayList arrayList0 = ((i)this.q.j).m.n;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.h(z);
            }
        }
    }

    @Override  // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.r.e(g.ON_RESUME);
        v v0 = ((i)this.q.j).m;
        v0.C = false;
        v0.D = false;
        v0.F(4);
    }

    @Override  // android.app.Activity
    public final boolean onPreparePanel(int v, View view0, Menu menu0) {
        return v == 0 ? super.onPreparePanel(0, view0, menu0) | ((i)this.q.j).m.E(menu0) : super.onPreparePanel(v, view0, menu0);
    }

    @Override  // androidx.activity.e, u.a
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        c c0 = this.q;
        c0.R();
        int v1 = v >> 16 & 0xFFFF;
        if(v1 != 0) {
            String s = (String)this.z.d(v1 - 1, null);
            l l0 = this.z;
            int v2 = d.a(l0.l, v1 - 1, l0.j);
            if(v2 >= 0) {
                Object[] arr_object = l0.k;
                Object object0 = l.m;
                if(arr_object[v2] != object0) {
                    arr_object[v2] = object0;
                    l0.i = true;
                }
            }
            if(s == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            h h0 = ((i)c0.j).m.O(s);
            if(h0 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + s);
                return;
            }
            h0.onRequestPermissionsResult(v & 0xFFFF, arr_s, arr_v);
        }
    }

    @Override  // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.t = true;
        this.q.R();
        ((i)this.q.j).m.J();
    }

    @Override  // androidx.activity.e
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        while(j.h(this.g())) {
        }
        this.r.e(g.ON_STOP);
        Parcelable parcelable0 = ((i)this.q.j).m.e0();
        if(parcelable0 != null) {
            bundle0.putParcelable("android:support:fragments", parcelable0);
        }
        if(this.z.f() > 0) {
            bundle0.putInt("android:support:next_request_index", this.y);
            int[] arr_v = new int[this.z.f()];
            String[] arr_s = new String[this.z.f()];
            for(int v = 0; v < this.z.f(); ++v) {
                l l0 = this.z;
                if(l0.i) {
                    l0.c();
                }
                arr_v[v] = l0.j[v];
                arr_s[v] = (String)this.z.g(v);
            }
            bundle0.putIntArray("android:support:request_indicies", arr_v);
            bundle0.putStringArray("android:support:request_fragment_who", arr_s);
        }
    }

    @Override  // android.app.Activity
    public void onStart() {
        super.onStart();
        this.u = false;
        c c0 = this.q;
        if(!this.s) {
            this.s = true;
            ((i)c0.j).m.C = false;
            ((i)c0.j).m.D = false;
            ((i)c0.j).m.F(2);
        }
        c0.R();
        ((i)c0.j).m.J();
        this.r.e(g.ON_START);
        ((i)c0.j).m.C = false;
        ((i)c0.j).m.D = false;
        ((i)c0.j).m.F(3);
    }

    @Override  // android.app.Activity
    public final void onStateNotSaved() {
        this.q.R();
    }

    @Override  // android.app.Activity
    public void onStop() {
        super.onStop();
        this.u = true;
        while(j.h(this.g())) {
        }
        v v0 = ((i)this.q.j).m;
        v0.D = true;
        v0.F(2);
        this.r.e(g.ON_STOP);
    }

    @Override  // android.app.Activity
    public final void startActivityForResult(Intent intent0, int v) {
        if(!this.x && v != -1) {
            j.f(v);
        }
        super.startActivityForResult(intent0, v);
    }

    @Override  // android.app.Activity
    public final void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        if(!this.x && v != -1) {
            j.f(v);
        }
        super.startActivityForResult(intent0, v, bundle0);
    }

    @Override  // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3) {
        if(!this.w && v != -1) {
            j.f(v);
        }
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3);
    }

    @Override  // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        if(!this.w && v != -1) {
            j.f(v);
        }
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }
}

