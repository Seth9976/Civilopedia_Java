package androidx.fragment.app;

import K.a;
import K.b;
import K.c;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p.l;

public abstract class h implements ComponentCallbacks, View.OnCreateContextMenuListener, C, n, e {
    public i A;
    public v B;
    public h C;
    public int D;
    public int E;
    public String F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ViewGroup N;
    public View O;
    public View P;
    public boolean Q;
    public boolean R;
    public f S;
    public final d T;
    public boolean U;
    public boolean V;
    public float W;
    public LayoutInflater X;
    public boolean Y;
    public androidx.lifecycle.h Z;
    public p a0;
    public L b0;
    public final u c0;
    public androidx.savedstate.d d0;
    public static final Object e0;
    public int i;
    public Bundle j;
    public SparseArray k;
    public Boolean l;
    public String m;
    public Bundle n;
    public h o;
    public String p;
    public int q;
    public Boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public v z;

    static {
        h.e0 = new Object();
    }

    public h() {
        this.i = 0;
        this.m = "8dc1613f-b65a-4de3-b0f9-cea80b383eae";
        this.p = null;
        this.r = null;
        this.B = new v();
        this.L = true;
        this.R = true;
        this.T = new d(this, 0);
        this.Z = androidx.lifecycle.h.m;
        this.c0 = new u();  // 初始化器: Landroidx/lifecycle/t;-><init>()V
        this.a0 = new p(this);
        this.d0 = new androidx.savedstate.d(this);
        this.a0.a(new Fragment.2(this));
    }

    public final void a() {
        f f0 = this.S;
        androidx.fragment.app.u u0 = null;
        if(f0 != null) {
            f0.o = false;
            androidx.fragment.app.u u1 = f0.p;
            f0.p = null;
            u0 = u1;
        }
        if(u0 != null) {
            int v = u0.c - 1;
            u0.c = v;
            if(v == 0) {
                u0.b.q.g0();
            }
        }
    }

    public final f b() {
        if(this.S == null) {
            f f0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
            f0.g = null;
            f0.h = h.e0;
            f0.i = null;
            f0.j = h.e0;
            f0.k = null;
            f0.l = h.e0;
            this.S = f0;
        }
        return this.S;
    }

    public final View c() {
        return this.S == null ? null : this.S.a;
    }

    public final Animator d() {
        return this.S == null ? null : this.S.b;
    }

    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mFragmentId=#");
        printWriter0.print(Integer.toHexString(this.D));
        printWriter0.print(" mContainerId=#");
        printWriter0.print(Integer.toHexString(this.E));
        printWriter0.print(" mTag=");
        printWriter0.println(this.F);
        printWriter0.print(s);
        printWriter0.print("mState=");
        printWriter0.print(this.i);
        printWriter0.print(" mWho=");
        printWriter0.print(this.m);
        printWriter0.print(" mBackStackNesting=");
        printWriter0.println(this.y);
        printWriter0.print(s);
        printWriter0.print("mAdded=");
        printWriter0.print(this.s);
        printWriter0.print(" mRemoving=");
        printWriter0.print(this.t);
        printWriter0.print(" mFromLayout=");
        printWriter0.print(this.u);
        printWriter0.print(" mInLayout=");
        printWriter0.println(this.v);
        printWriter0.print(s);
        printWriter0.print("mHidden=");
        printWriter0.print(this.G);
        printWriter0.print(" mDetached=");
        printWriter0.print(this.H);
        printWriter0.print(" mMenuVisible=");
        printWriter0.print(this.L);
        printWriter0.print(" mHasMenu=");
        printWriter0.println(this.K);
        printWriter0.print(s);
        printWriter0.print("mRetainInstance=");
        printWriter0.print(this.I);
        printWriter0.print(" mUserVisibleHint=");
        printWriter0.println(this.R);
        if(this.z != null) {
            printWriter0.print(s);
            printWriter0.print("mFragmentManager=");
            printWriter0.println(this.z);
        }
        if(this.A != null) {
            printWriter0.print(s);
            printWriter0.print("mHost=");
            printWriter0.println(this.A);
        }
        if(this.C != null) {
            printWriter0.print(s);
            printWriter0.print("mParentFragment=");
            printWriter0.println(this.C);
        }
        if(this.n != null) {
            printWriter0.print(s);
            printWriter0.print("mArguments=");
            printWriter0.println(this.n);
        }
        if(this.j != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedFragmentState=");
            printWriter0.println(this.j);
        }
        if(this.k != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewState=");
            printWriter0.println(this.k);
        }
        h h0 = this.getTargetFragment();
        if(h0 != null) {
            printWriter0.print(s);
            printWriter0.print("mTarget=");
            printWriter0.print(h0);
            printWriter0.print(" mTargetRequestCode=");
            printWriter0.println(this.q);
        }
        if((this.S == null ? 0 : this.S.d) != 0) {
            printWriter0.print(s);
            printWriter0.print("mNextAnim=");
            printWriter0.println((this.S == null ? 0 : this.S.d));
        }
        if(this.N != null) {
            printWriter0.print(s);
            printWriter0.print("mContainer=");
            printWriter0.println(this.N);
        }
        if(this.O != null) {
            printWriter0.print(s);
            printWriter0.print("mView=");
            printWriter0.println(this.O);
        }
        if(this.P != null) {
            printWriter0.print(s);
            printWriter0.print("mInnerView=");
            printWriter0.println(this.O);
        }
        if(this.c() != null) {
            printWriter0.print(s);
            printWriter0.print("mAnimatingAway=");
            printWriter0.println(this.c());
            printWriter0.print(s);
            printWriter0.print("mStateAfterAnimating=");
            printWriter0.println((this.S == null ? 0 : this.S.c));
        }
        if(this.getContext() != null) {
            B b0 = this.getViewModelStore();
            Class class0 = b.class;
            String s1 = class0.getCanonicalName();
            if(s1 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            A a0 = (A)b0.a.get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s1);
            if(!class0.isInstance(a0)) {
                a0 = new b();
                A a1 = (A)b0.a.put("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s1, a0);
                if(a1 != null) {
                    a1.a();
                }
            }
            l l0 = ((b)a0).b;
            if(l0.f() > 0) {
                printWriter0.print(s);
                printWriter0.println("Loaders:");
                if(l0.f() > 0) {
                    if(l0.g(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter0.print(s);
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
        printWriter0.print(s);
        printWriter0.println("Child " + this.B + ":");
        this.B.G(q.e.b(s, "  "), fileDescriptor0, printWriter0, arr_s);
    }

    public final void e(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.B.Z();
        this.x = true;
        L l0 = new L();  // 初始化器: Ljava/lang/Object;-><init>()V
        l0.i = null;
        this.b0 = l0;
        View view0 = this.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.O = view0;
        if(view0 != null) {
            L l1 = this.b0;
            if(l1.i == null) {
                l1.i = new p(l1);
            }
            this.c0.e(this.b0);
            return;
        }
        if(this.b0.i != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.b0 = null;
    }

    @Override
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    public final void f() {
        this.onLowMemory();
        v v0 = this.B;
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = v0.n;
            if(v1 >= arrayList0.size()) {
                break;
            }
            h h0 = (h)arrayList0.get(v1);
            if(h0 != null) {
                h0.f();
            }
        }
    }

    public final void g(boolean z) {
        ArrayList arrayList0 = this.B.n;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.g(z);
            }
        }
    }

    public final j getActivity() {
        return this.A == null ? null : this.A.j;
    }

    public boolean getAllowEnterTransitionOverlap() {
        f f0 = this.S;
        if(f0 != null) {
            return f0.n == null ? true : f0.n.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        f f0 = this.S;
        if(f0 != null) {
            return f0.m == null ? true : f0.m.booleanValue();
        }
        return true;
    }

    public final Bundle getArguments() {
        return this.n;
    }

    public final androidx.fragment.app.l getChildFragmentManager() {
        if(this.A == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " has not been attached yet."));
        }
        return this.B;
    }

    public Context getContext() {
        i i0 = this.A;
        return i0 == null ? null : i0.k;
    }

    public Object getEnterTransition() {
        return this.S == null ? null : this.S.g;
    }

    public Object getExitTransition() {
        return this.S == null ? null : this.S.i;
    }

    public final androidx.fragment.app.l getFragmentManager() {
        return this.z;
    }

    public final Object getHost() {
        return this.A == null ? null : this.A.n;
    }

    public final int getId() {
        return this.D;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater0 = this.X;
        if(layoutInflater0 == null) {
            layoutInflater0 = this.onGetLayoutInflater(null);
            this.X = layoutInflater0;
        }
        return layoutInflater0;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle0) {
        i i0 = this.A;
        if(i0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflater0 = i0.n.getLayoutInflater().cloneInContext(i0.n);
        v v0 = this.B;
        v0.getClass();
        layoutInflater0.setFactory2(v0);
        return layoutInflater0;
    }

    @Override  // androidx.lifecycle.n
    public androidx.lifecycle.i getLifecycle() {
        return this.a0;
    }

    @Deprecated
    public a getLoaderManager() {
        return new c(this, this.getViewModelStore());
    }

    public final h getParentFragment() {
        return this.C;
    }

    public Object getReenterTransition() {
        f f0 = this.S;
        if(f0 == null) {
            return null;
        }
        return f0.j == h.e0 ? this.getExitTransition() : f0.j;
    }

    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.I;
    }

    public Object getReturnTransition() {
        f f0 = this.S;
        if(f0 == null) {
            return null;
        }
        return f0.h == h.e0 ? this.getEnterTransition() : f0.h;
    }

    @Override  // androidx.savedstate.e
    public final androidx.savedstate.c getSavedStateRegistry() {
        return this.d0.b;
    }

    public Object getSharedElementEnterTransition() {
        return this.S == null ? null : this.S.k;
    }

    public Object getSharedElementReturnTransition() {
        f f0 = this.S;
        if(f0 == null) {
            return null;
        }
        return f0.l == h.e0 ? this.getSharedElementEnterTransition() : f0.l;
    }

    public final String getString(int v) {
        return this.getResources().getString(v);
    }

    public final String getString(int v, Object[] arr_object) {
        return this.getResources().getString(v, arr_object);
    }

    public final String getTag() {
        return this.F;
    }

    public final h getTargetFragment() {
        h h0 = this.o;
        if(h0 != null) {
            return h0;
        }
        v v0 = this.z;
        if(v0 != null) {
            return this.p == null ? null : ((h)v0.o.get(this.p));
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return this.q;
    }

    public final CharSequence getText(int v) {
        return this.getResources().getText(v);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.R;
    }

    public View getView() {
        return this.O;
    }

    public n getViewLifecycleOwner() {
        n n0 = this.b0;
        if(n0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        return n0;
    }

    public t getViewLifecycleOwnerLiveData() {
        return this.c0;
    }

    @Override  // androidx.lifecycle.C
    public B getViewModelStore() {
        v v0 = this.z;
        if(v0 == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        HashMap hashMap0 = v0.M.d;
        B b0 = (B)hashMap0.get(this.m);
        if(b0 == null) {
            b0 = new B();
            hashMap0.put(this.m, b0);
        }
        return b0;
    }

    public final void h(boolean z) {
        ArrayList arrayList0 = this.B.n;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.h(z);
            }
        }
    }

    public final boolean hasOptionsMenu() {
        return this.K;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    public final void i(int v) {
        if(this.S == null && v == 0) {
            return;
        }
        this.b().d = v;
    }

    @Deprecated
    public static h instantiate(Context context0, String s) {
        return h.instantiate(context0, s, null);
    }

    @Deprecated
    public static h instantiate(Context context0, String s, Bundle bundle0) {
        try {
            h h0 = (h)k.b(context0.getClassLoader(), s).getConstructor(null).newInstance(null);
            if(bundle0 != null) {
                bundle0.setClassLoader(h0.getClass().getClassLoader());
                h0.setArguments(bundle0);
                return h0;
            }
            return h0;
        }
        catch(InstantiationException instantiationException0) {
            throw new Fragment.InstantiationException(i3.e.f("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"), instantiationException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new Fragment.InstantiationException(i3.e.f("Unable to instantiate fragment ", s, ": make sure class name exists, is public, and has an empty constructor that is public"), illegalAccessException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new Fragment.InstantiationException(i3.e.f("Unable to instantiate fragment ", s, ": could not find Fragment constructor"), noSuchMethodException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new Fragment.InstantiationException(i3.e.f("Unable to instantiate fragment ", s, ": calling Fragment constructor caused an exception"), invocationTargetException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    public final boolean isAdded() {
        return this.A != null && this.s;
    }

    public final boolean isDetached() {
        return this.H;
    }

    public final boolean isHidden() {
        return this.G;
    }

    public final boolean isInLayout() {
        return this.v;
    }

    public final boolean isMenuVisible() {
        return this.L;
    }

    public final boolean isRemoving() {
        return this.t;
    }

    public final boolean isResumed() {
        return this.i >= 4;
    }

    public final boolean isStateSaved() {
        return this.z == null ? false : this.z.S();
    }

    // 去混淆评级： 低(20)
    public final boolean isVisible() {
        return this.isAdded() && !this.isHidden() && (this.O != null && this.O.getWindowToken() != null && this.O.getVisibility() == 0);
    }

    public final void j(androidx.fragment.app.u u0) {
        this.b();
        f f0 = this.S;
        androidx.fragment.app.u u1 = f0.p;
        if(u0 == u1) {
            return;
        }
        if(u0 != null && u1 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if(f0.o) {
            f0.p = u0;
        }
        if(u0 != null) {
            ++u0.c;
        }
    }

    public void onActivityCreated(Bundle bundle0) {
        this.M = true;
    }

    public void onActivityResult(int v, int v1, Intent intent0) {
    }

    @Deprecated
    public void onAttach(Activity activity0) {
        this.M = true;
    }

    public void onAttach(Context context0) {
        this.M = true;
        j j0 = this.A == null ? null : this.A.j;
        if(j0 != null) {
            this.M = false;
            this.onAttach(j0);
        }
    }

    public void onAttachFragment(h h0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
        this.M = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem0) [...] // Inlined contents

    public abstract void onCreate(Bundle arg1);

    public Animation onCreateAnimation(int v, boolean z, int v1) [...] // Inlined contents

    public Animator onCreateAnimator(int v, boolean z, int v1) [...] // Inlined contents

    @Override  // android.view.View$OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.requireActivity().onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
    }

    public void onCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
    }

    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return null;
    }

    public void onDestroy() {
        this.M = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.M = true;
    }

    public void onDetach() {
        this.M = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        return this.getLayoutInflater(bundle0);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity0, AttributeSet attributeSet0, Bundle bundle0) {
        this.M = true;
    }

    public void onInflate(Context context0, AttributeSet attributeSet0, Bundle bundle0) {
        this.M = true;
        j j0 = this.A == null ? null : this.A.j;
        if(j0 != null) {
            this.M = false;
            this.onInflate(j0, attributeSet0, bundle0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.M = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem0) [...] // Inlined contents

    public void onOptionsMenuClosed(Menu menu0) {
    }

    public void onPause() {
        this.M = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu0) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
    }

    public void onResume() {
        this.M = true;
    }

    public abstract void onSaveInstanceState(Bundle arg1);

    public abstract void onStart();

    public abstract void onStop();

    public void onViewCreated(View view0, Bundle bundle0) {
    }

    public void onViewStateRestored(Bundle bundle0) {
        this.M = true;
    }

    public void postponeEnterTransition() {
        this.b().o = true;
    }

    public final void postponeEnterTransition(long v, TimeUnit timeUnit0) {
        this.b().o = true;
        v v1 = this.z;
        Handler handler0 = v1 == null ? new Handler(Looper.getMainLooper()) : v1.x.l;
        handler0.removeCallbacks(this.T);
        long v2 = timeUnit0.toMillis(v);
        handler0.postDelayed(this.T, v2);
    }

    public void registerForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(this);
    }

    public final void requestPermissions(String[] arr_s, int v) {
        i i0 = this.A;
        if(i0 != null) {
            j j0 = i0.n;
            j0.getClass();
            if(v == -1) {
                u.c.a(j0, arr_s, -1);
                return;
            }
            j.f(v);
            try {
                j0.v = true;
                u.c.a(j0, arr_s, (j0.e(this) + 1 << 16) + (v & 0xFFFF));
                j0.v = false;
                return;
            }
            catch(Throwable throwable0) {
                j0.v = false;
                throw throwable0;
            }
        }
        throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to Activity"));
    }

    public final j requireActivity() {
        j j0 = this.getActivity();
        if(j0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to an activity."));
        }
        return j0;
    }

    public final Bundle requireArguments() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " does not have any arguments."));
        }
        return bundle0;
    }

    public final Context requireContext() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to a context."));
        }
        return context0;
    }

    public final androidx.fragment.app.l requireFragmentManager() {
        androidx.fragment.app.l l0 = this.getFragmentManager();
        if(l0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not associated with a fragment manager."));
        }
        return l0;
    }

    public final Object requireHost() {
        Object object0 = this.getHost();
        if(object0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to a host."));
        }
        return object0;
    }

    public final h requireParentFragment() {
        h h0 = this.getParentFragment();
        if(h0 == null) {
            throw this.getContext() == null ? new IllegalStateException(A.f.g("Fragment ", this, " is not attached to any Fragment or host")) : new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + this.getContext());
        }
        return h0;
    }

    public final View requireView() {
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        }
        return view0;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.b().n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.b().m = Boolean.valueOf(z);
    }

    public void setArguments(Bundle bundle0) {
        if(this.z != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.n = bundle0;
    }

    public void setEnterSharedElementCallback(u.j j0) {
        this.b().getClass();
    }

    public void setEnterTransition(Object object0) {
        this.b().g = object0;
    }

    public void setExitSharedElementCallback(u.j j0) {
        this.b().getClass();
    }

    public void setExitTransition(Object object0) {
        this.b().i = object0;
    }

    public void setHasOptionsMenu(boolean z) {
        if(this.K != z) {
            this.K = z;
            if(this.isAdded() && !this.isHidden()) {
                f.t t0 = (f.t)((f.h)this.A.n).i();
                t0.t();
                t0.u(0);
            }
        }
    }

    public void setInitialSavedState(Fragment.SavedState fragment$SavedState0) {
        Bundle bundle0;
        if(this.z != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if(fragment$SavedState0 == null) {
            bundle0 = null;
        }
        else {
            bundle0 = fragment$SavedState0.i;
            if(bundle0 == null) {
                bundle0 = null;
            }
        }
        this.j = bundle0;
    }

    public void setMenuVisibility(boolean z) {
        if(this.L != z) {
            this.L = z;
            if(this.K && this.isAdded() && !this.isHidden()) {
                f.t t0 = (f.t)((f.h)this.A.n).i();
                t0.t();
                t0.u(0);
            }
        }
    }

    public void setReenterTransition(Object object0) {
        this.b().j = object0;
    }

    public void setRetainInstance(boolean z) {
        this.I = z;
        v v0 = this.z;
        if(v0 == null) {
            this.J = true;
        }
        else if(z) {
            if(!v0.S()) {
                v0.M.b.add(this);
            }
        }
        else if(!v0.S()) {
            v0.M.b.remove(this);
        }
    }

    public void setReturnTransition(Object object0) {
        this.b().h = object0;
    }

    public void setSharedElementEnterTransition(Object object0) {
        this.b().k = object0;
    }

    public void setSharedElementReturnTransition(Object object0) {
        this.b().l = object0;
    }

    public void setTargetFragment(h h0, int v) {
        androidx.fragment.app.l l0 = this.getFragmentManager();
        androidx.fragment.app.l l1 = h0 == null ? null : h0.getFragmentManager();
        if(l0 != null && l1 != null && l0 != l1) {
            throw new IllegalArgumentException(A.f.g("Fragment ", h0, " must share the same FragmentManager to be set as a target fragment"));
        }
        for(h h1 = h0; h1 != null; h1 = h1.getTargetFragment()) {
            if(h1 == this) {
                throw new IllegalArgumentException("Setting " + h0 + " as the target of " + this + " would create a target cycle");
            }
        }
        if(h0 == null) {
            this.p = null;
            this.o = null;
        }
        else if(this.z == null || h0.z == null) {
            this.p = null;
            this.o = h0;
        }
        else {
            this.p = h0.m;
            this.o = null;
        }
        this.q = v;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z1 = false;
        if(!this.R && z && this.i < 3 && this.z != null && this.isAdded() && this.Y) {
            v v0 = this.z;
            v0.getClass();
            if(this.Q) {
                if(v0.l) {
                    v0.F = true;
                }
                else {
                    this.Q = false;
                    v0.Y(this, v0.w, 0, 0, false);
                }
            }
        }
        this.R = z;
        if(this.i < 3 && !z) {
            z1 = true;
        }
        this.Q = z1;
        if(this.j != null) {
            this.l = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String s) {
        return this.A == null || Build.VERSION.SDK_INT < 23 ? false : this.A.n.shouldShowRequestPermissionRationale(s);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent0) {
        this.startActivity(intent0, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent0, Bundle bundle0) {
        i i0 = this.A;
        if(i0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to Activity"));
        }
        i0.c(this, intent0, -1, bundle0);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent0, int v) {
        this.startActivityForResult(intent0, v, null);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent0, int v, Bundle bundle0) {
        i i0 = this.A;
        if(i0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to Activity"));
        }
        i0.c(this, intent0, v, bundle0);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) throws IntentSender.SendIntentException {
        j j0;
        i i0 = this.A;
        if(i0 == null) {
            throw new IllegalStateException(A.f.g("Fragment ", this, " not attached to Activity"));
        }
        try {
            j0 = i0.n;
            j0.w = true;
            if(v == -1) {
                j0.startIntentSenderForResult(intentSender0, -1, intent0, v1, v2, v3, bundle0);
            }
            else {
                j.f(v);
                j0.startIntentSenderForResult(intentSender0, (j0.e(this) + 1 << 16) + (v & 0xFFFF), intent0, v1, v2, v3, bundle0);
            }
        }
        finally {
            j0.w = false;
        }
    }

    public void startPostponedEnterTransition() {
        if(this.z != null && this.z.x != null) {
            if(Looper.myLooper() != this.z.x.l.getLooper()) {
                this.z.x.l.postAtFrontOfQueue(new d(this, 1));
                return;
            }
            this.a();
            return;
        }
        this.b().o = false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        android.support.v4.media.session.a.f(this, stringBuilder0);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.m);
        stringBuilder0.append(")");
        if(this.D != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(this.D));
        }
        if(this.F != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.F);
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public void unregisterForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(null);
    }
}

