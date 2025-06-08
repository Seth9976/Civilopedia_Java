package androidx.recyclerview.widget;

import B.c;
import B.f;
import B1.a;
import E.e;
import E.h;
import E.k;
import E.q;
import E.r;
import N.B;
import N.C;
import N.D;
import N.F;
import N.G;
import N.H;
import N.I;
import N.J;
import N.K;
import N.L;
import N.M;
import N.N;
import N.O;
import N.P;
import N.Q;
import N.S;
import N.T;
import N.V;
import N.b0;
import N.i;
import N.m;
import N.n;
import N.p;
import N.w;
import N.x;
import N.y;
import N.z;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class RecyclerView extends ViewGroup {
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public Parcelable k;

        static {
            SavedState.CREATOR = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = F.class.getClassLoader();
            }
            this.k = parcel0.readParcelable(classLoader0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeParcelable(this.k, 0);
        }
    }

    public int A;
    public static final boolean A0;
    public boolean B;
    public static final boolean B0;
    public boolean C;
    public static final Class[] C0;
    public boolean D;
    public static final w D0;
    public int E;
    public final AccessibilityManager F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public C K;
    public EdgeEffect L;
    public EdgeEffect M;
    public EdgeEffect N;
    public EdgeEffect O;
    public D P;
    public int Q;
    public int R;
    public VelocityTracker S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public final int b0;
    public final int c0;
    public final float d0;
    public final float e0;
    public boolean f0;
    public final S g0;
    public p h0;
    public final O i;
    public final n i0;
    public final M j;
    public final P j0;
    public SavedState k;
    public J k0;
    public final f l;
    public ArrayList l0;
    public final a m;
    public boolean m0;
    public final c n;
    public boolean n0;
    public boolean o;
    public final y o0;
    public final Rect p;
    public boolean p0;
    public final Rect q;
    public V q0;
    public final RectF r;
    public final int[] r0;
    public z s;
    public e s0;
    public F t;
    public final int[] t0;
    public final ArrayList u;
    public final int[] u0;
    public final ArrayList v;
    public final int[] v0;
    public I w;
    public final ArrayList w0;
    public boolean x;
    public final B.b x0;
    public boolean y;
    public final x y0;
    public boolean z;
    public static final int[] z0;

    static {
        RecyclerView.z0 = new int[]{0x1010436};
        RecyclerView.A0 = Build.VERSION.SDK_INT >= 23;
        RecyclerView.B0 = true;
        RecyclerView.C0 = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        RecyclerView.D0 = new w();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public RecyclerView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F020125);  // attr:recyclerViewStyle
        Constructor constructor0;
        Object[] arr_object;
        TypedArray typedArray1;
        this.i = new O(this, 0);
        this.j = new M(this);
        this.n = new c(15);
        this.p = new Rect();
        this.q = new Rect();
        this.r = new RectF();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.A = 0;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        this.K = new C();  // 初始化器: Ljava/lang/Object;-><init>()V
        i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        i0.a = null;
        i0.b = new ArrayList();
        i0.c = 120L;
        i0.d = 120L;
        i0.e = 0xFAL;
        i0.f = 0xFAL;
        i0.g = true;
        i0.h = new ArrayList();
        i0.i = new ArrayList();
        i0.j = new ArrayList();
        i0.k = new ArrayList();
        i0.l = new ArrayList();
        i0.m = new ArrayList();
        i0.n = new ArrayList();
        i0.o = new ArrayList();
        i0.p = new ArrayList();
        i0.q = new ArrayList();
        i0.r = new ArrayList();
        this.P = i0;
        this.Q = 0;
        this.R = -1;
        this.d0 = 1.401298E-45f;
        this.e0 = 1.401298E-45f;
        this.f0 = true;
        this.g0 = new S(this);
        this.i0 = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        P p0 = new P();  // 初始化器: Ljava/lang/Object;-><init>()V
        p0.a = 0;
        p0.b = 0;
        p0.c = 1;
        p0.d = 0;
        p0.e = false;
        p0.f = false;
        p0.g = false;
        p0.h = false;
        p0.i = false;
        p0.j = false;
        this.j0 = p0;
        this.m0 = false;
        this.n0 = false;
        y y0 = new y(this);
        this.o0 = y0;
        this.p0 = false;
        this.r0 = new int[2];
        this.t0 = new int[2];
        this.u0 = new int[2];
        this.v0 = new int[2];
        this.w0 = new ArrayList();
        this.x0 = new B.b(this, 10);
        this.y0 = new x(this);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.a0 = viewConfiguration0.getScaledTouchSlop();
        int v = Build.VERSION.SDK_INT;
        this.d0 = v < 26 ? r.a(viewConfiguration0, context0) : viewConfiguration0.getScaledHorizontalScrollFactor();
        this.e0 = v < 26 ? r.a(viewConfiguration0, context0) : viewConfiguration0.getScaledVerticalScrollFactor();
        this.b0 = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.c0 = viewConfiguration0.getScaledMaximumFlingVelocity();
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.P.a = y0;
        this.l = new f(new x(this));
        this.m = new a(new y(this));
        if((v < 26 ? 0 : this.getImportantForAutofill()) == 0 && v >= 26) {
            C.b.x(this);
        }
        if(this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
        this.F = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new V(this));
        int[] arr_v = M.a.a;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, arr_v, 0x7F020125, 0);  // attr:recyclerViewStyle
        if(v >= 29) {
            k.p(this, context0, arr_v, attributeSet0, typedArray0);
        }
        String s = typedArray0.getString(8);
        if(typedArray0.getInt(2, -1) == -1) {
            this.setDescendantFocusability(0x40000);
        }
        this.o = typedArray0.getBoolean(1, true);
        if(typedArray0.getBoolean(3, false)) {
            Drawable drawable0 = typedArray0.getDrawable(6);
            Drawable drawable1 = typedArray0.getDrawable(7);
            Drawable drawable2 = typedArray0.getDrawable(4);
            Drawable drawable3 = typedArray0.getDrawable(5);
            if(((StateListDrawable)drawable0) == null || drawable1 == null || ((StateListDrawable)drawable2) == null || drawable3 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + this.w());
            }
            Resources resources0 = this.getContext().getResources();
            typedArray1 = typedArray0;
            new m(this, ((StateListDrawable)drawable0), drawable1, ((StateListDrawable)drawable2), drawable3, resources0.getDimensionPixelSize(0x7F05005A), resources0.getDimensionPixelSize(0x7F05005C), resources0.getDimensionPixelOffset(0x7F05005B));  // dimen:fastscroll_default_thickness
        }
        else {
            typedArray1 = typedArray0;
        }
        typedArray1.recycle();
        if(s != null) {
            String s1 = s.trim();
            if(!s1.isEmpty()) {
                if(s1.charAt(0) == 46) {
                    s1 = "com.spears.civilopedia" + s1;
                }
                else if(!s1.contains(".")) {
                    s1 = RecyclerView.class.getPackage().getName() + '.' + s1;
                }
                try {
                    Class class0 = Class.forName(s1, false, (this.isInEditMode() ? this.getClass().getClassLoader() : context0.getClassLoader())).asSubclass(F.class);
                    try {
                        arr_object = null;
                        constructor0 = class0.getConstructor(RecyclerView.C0);
                        arr_object = new Object[]{context0, attributeSet0, 0x7F020125, 0};  // attr:recyclerViewStyle
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        try {
                            constructor0 = class0.getConstructor(null);
                        }
                        catch(NoSuchMethodException noSuchMethodException1) {
                            noSuchMethodException1.initCause(noSuchMethodException0);
                            throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Error creating LayoutManager " + s1, noSuchMethodException1);
                        }
                    }
                    constructor0.setAccessible(true);
                    this.setLayoutManager(((F)constructor0.newInstance(arr_object)));
                    goto label_142;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s1, invocationTargetException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Could not instantiate the LayoutManager: " + s1, instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Cannot access non-public constructor " + s1, illegalAccessException0);
                }
                catch(ClassCastException classCastException0) {
                    throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Class is not a LayoutManager " + s1, classCastException0);
                }
                throw new IllegalStateException(attributeSet0.getPositionDescription() + ": Unable to find LayoutManager " + s1, classNotFoundException0);
            }
        }
    label_142:
        int v1 = Build.VERSION.SDK_INT;
        int[] arr_v1 = RecyclerView.z0;
        TypedArray typedArray2 = context0.obtainStyledAttributes(attributeSet0, arr_v1, 0x7F020125, 0);  // attr:recyclerViewStyle
        if(v1 >= 29) {
            k.p(this, context0, arr_v1, attributeSet0, typedArray2);
        }
        boolean z = typedArray2.getBoolean(0, true);
        typedArray2.recycle();
        this.setNestedScrollingEnabled(z);
    }

    public final boolean A(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        ArrayList arrayList0 = this.v;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            I i0 = (I)arrayList0.get(v2);
            if(i0.a(this, motionEvent0) && v != 3) {
                this.w = i0;
                return true;
            }
        }
        return false;
    }

    public final void B(int[] arr_v) {
        int v = this.m.m();
        if(v == 0) {
            arr_v[0] = -1;
            arr_v[1] = -1;
            return;
        }
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        for(int v3 = 0; v3 < v; ++v3) {
            T t0 = RecyclerView.G(this.m.l(v3));
            if(!t0.o()) {
                int v4 = t0.b();
                if(v4 < v1) {
                    v1 = v4;
                }
                if(v4 > v2) {
                    v2 = v4;
                }
            }
        }
        arr_v[0] = v1;
        arr_v[1] = v2;
    }

    public static RecyclerView C(View view0) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        if(view0 instanceof RecyclerView) {
            return (RecyclerView)view0;
        }
        int v = ((ViewGroup)view0).getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            RecyclerView recyclerView0 = RecyclerView.C(((ViewGroup)view0).getChildAt(v1));
            if(recyclerView0 != null) {
                return recyclerView0;
            }
        }
        return null;
    }

    public final T D(int v) {
        T t0 = null;
        if(this.G) {
            return null;
        }
        int v1 = this.m.v();
        for(int v2 = 0; v2 < v1; ++v2) {
            T t1 = RecyclerView.G(this.m.u(v2));
            if(t1 != null && !t1.h() && this.E(t1) == v) {
                if(((ArrayList)this.m.l).contains(t1.a)) {
                    t0 = t1;
                    continue;
                }
                return t1;
            }
        }
        return t0;
    }

    public final int E(T t0) {
        if(!t0.d(0x20C) && t0.e()) {
            int v = t0.c;
            ArrayList arrayList0 = (ArrayList)this.l.k;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                N.a a0 = (N.a)arrayList0.get(v2);
                switch(a0.a) {
                    case 1: {
                        if(a0.b <= v) {
                            v += a0.c;
                        }
                        break;
                    }
                    case 2: {
                        int v3 = a0.b;
                        if(v3 <= v) {
                            int v4 = a0.c;
                            if(v3 + v4 > v) {
                                return -1;
                            }
                            v -= v4;
                        }
                        break;
                    }
                    case 8: {
                        int v5 = a0.b;
                        if(v5 == v) {
                            v = a0.c;
                        }
                        else {
                            if(v5 < v) {
                                --v;
                            }
                            if(a0.c <= v) {
                                ++v;
                            }
                        }
                    }
                }
            }
            return v;
        }
        return -1;
    }

    public final T F(View view0) {
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null && viewParent0 != this) {
            throw new IllegalArgumentException("View " + view0 + " is not a direct child of " + this);
        }
        return RecyclerView.G(view0);
    }

    public static T G(View view0) {
        return view0 == null ? null : ((G)view0.getLayoutParams()).a;
    }

    public final Rect H(View view0) {
        G g0 = (G)view0.getLayoutParams();
        Rect rect0 = g0.b;
        if(!g0.c) {
            return rect0;
        }
        if(this.j0.f && (g0.a.k() || g0.a.f())) {
            return rect0;
        }
        rect0.set(0, 0, 0, 0);
        ArrayList arrayList0 = this.u;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.p.set(0, 0, 0, 0);
            ((m)arrayList0.get(v1)).getClass();
            ((G)view0.getLayoutParams()).a.getClass();
            this.p.set(0, 0, 0, 0);
            rect0.left += this.p.left;
            rect0.top += this.p.top;
            rect0.right += this.p.right;
            rect0.bottom += this.p.bottom;
        }
        g0.c = false;
        return rect0;
    }

    // 去混淆评级： 低(30)
    public final boolean I() {
        return !this.z || this.G || this.l.r();
    }

    public final boolean J() {
        return this.I > 0;
    }

    public final void K() {
        int v = this.m.v();
        for(int v2 = 0; v2 < v; ++v2) {
            ((G)this.m.u(v2).getLayoutParams()).c = true;
        }
        ArrayList arrayList0 = this.j.c;
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            G g0 = (G)((T)arrayList0.get(v1)).a.getLayoutParams();
            if(g0 != null) {
                g0.c = true;
            }
        }
    }

    public final void L(int v, int v1, boolean z) {
        int v2 = v + v1;
        int v3 = this.m.v();
        for(int v4 = 0; v4 < v3; ++v4) {
            T t0 = RecyclerView.G(this.m.u(v4));
            if(t0 != null && !t0.o()) {
                int v5 = t0.c;
                P p0 = this.j0;
                if(v5 >= v2) {
                    t0.l(-v1, z);
                    p0.e = true;
                }
                else if(v5 >= v) {
                    t0.a(8);
                    t0.l(-v1, z);
                    t0.c = v - 1;
                    p0.e = true;
                }
            }
        }
        M m0 = this.j;
        ArrayList arrayList0 = m0.c;
        for(int v6 = arrayList0.size() - 1; v6 >= 0; --v6) {
            T t1 = (T)arrayList0.get(v6);
            if(t1 != null) {
                int v7 = t1.c;
                if(v7 >= v2) {
                    t1.l(-v1, z);
                }
                else if(v7 >= v) {
                    t1.a(8);
                    m0.e(v6);
                }
            }
        }
        this.requestLayout();
    }

    public final void M() {
        ++this.I;
    }

    public final void N(boolean z) {
        int v = this.I - 1;
        this.I = v;
        if(v < 1) {
            this.I = 0;
            if(z) {
                int v1 = this.E;
                this.E = 0;
                if(v1 != 0 && (this.F != null && this.F.isEnabled())) {
                    AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
                    accessibilityEvent0.setEventType(0x800);
                    accessibilityEvent0.setContentChangeTypes(v1);
                    this.sendAccessibilityEventUnchecked(accessibilityEvent0);
                }
                ArrayList arrayList0 = this.w0;
                for(int v2 = arrayList0.size() - 1; v2 >= 0; --v2) {
                    T t0 = (T)arrayList0.get(v2);
                    if(t0.a.getParent() == this && !t0.o()) {
                        int v3 = t0.p;
                        if(v3 != -1) {
                            t0.a.setImportantForAccessibility(v3);
                            t0.p = -1;
                        }
                    }
                }
                arrayList0.clear();
            }
        }
    }

    public final void O(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionIndex();
        if(motionEvent0.getPointerId(v) == this.R) {
            int v1 = v == 0 ? 1 : 0;
            this.R = motionEvent0.getPointerId(v1);
            float f = motionEvent0.getX(v1);
            this.V = (int)(f + 0.5f);
            this.T = (int)(f + 0.5f);
            float f1 = motionEvent0.getY(v1);
            this.W = (int)(f1 + 0.5f);
            this.U = (int)(f1 + 0.5f);
        }
    }

    public final void P() {
        if(!this.p0 && this.x) {
            this.postOnAnimation(this.x0);
            this.p0 = true;
        }
    }

    public final void Q(boolean z) {
        this.H |= z;
        this.G = true;
        int v = this.m.v();
        for(int v2 = 0; v2 < v; ++v2) {
            T t0 = RecyclerView.G(this.m.u(v2));
            if(t0 != null && !t0.o()) {
                t0.a(6);
            }
        }
        this.K();
        M m0 = this.j;
        ArrayList arrayList0 = m0.c;
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            T t1 = (T)arrayList0.get(v1);
            if(t1 != null) {
                t1.a(6);
                t1.a(0x400);
            }
        }
        m0.d();
    }

    public final void R(T t0, h h0) {
        t0.i &= 0xFFFFDFFF;
        c c0 = this.n;
        if(this.j0.g && t0.k() && !t0.h() && !t0.o()) {
            this.s.getClass();
            ((p.e)c0.k).e(((long)t0.c), t0);
        }
        p.k k0 = (p.k)c0.j;
        b0 b00 = (b0)k0.getOrDefault(t0, null);
        if(b00 == null) {
            b00 = b0.a();
            k0.put(t0, b00);
        }
        b00.b = h0;
        b00.a |= 4;
    }

    public final void S(View view0, View view1) {
        View view2 = view1 == null ? view0 : view1;
        int v = view2.getWidth();
        int v1 = view2.getHeight();
        Rect rect0 = this.p;
        rect0.set(0, 0, v, v1);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view2.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof G && !((G)viewGroup$LayoutParams0).c) {
            rect0.left -= ((G)viewGroup$LayoutParams0).b.left;
            rect0.right += ((G)viewGroup$LayoutParams0).b.right;
            rect0.top -= ((G)viewGroup$LayoutParams0).b.top;
            rect0.bottom += ((G)viewGroup$LayoutParams0).b.bottom;
        }
        if(view1 != null) {
            this.offsetDescendantRectToMyCoords(view1, rect0);
            this.offsetRectIntoDescendantCoords(view0, rect0);
        }
        this.t.e0(this, view0, this.p, !this.z, view1 == null);
    }

    public final void T() {
        VelocityTracker velocityTracker0 = this.S;
        if(velocityTracker0 != null) {
            velocityTracker0.clear();
        }
        boolean z = false;
        this.Z(0);
        EdgeEffect edgeEffect0 = this.L;
        if(edgeEffect0 != null) {
            edgeEffect0.onRelease();
            z = this.L.isFinished();
        }
        EdgeEffect edgeEffect1 = this.M;
        if(edgeEffect1 != null) {
            edgeEffect1.onRelease();
            z |= this.M.isFinished();
        }
        EdgeEffect edgeEffect2 = this.N;
        if(edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.O;
        if(edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.O.isFinished();
        }
        if(z) {
            this.postInvalidateOnAnimation();
        }
    }

    public final boolean U(int v, int v1, MotionEvent motionEvent0) {
        boolean z;
        int v7;
        int v6;
        int v5;
        int v4;
        this.k();
        int[] arr_v = this.v0;
        if(this.s == null) {
            v4 = 0;
            v5 = 0;
            v6 = 0;
            v7 = 0;
        }
        else {
            arr_v[0] = 0;
            arr_v[1] = 0;
            this.V(v, v1, arr_v);
            int v2 = arr_v[0];
            int v3 = v1 - arr_v[1];
            v4 = v2;
            v5 = arr_v[1];
            v6 = v - v2;
            v7 = v3;
        }
        if(!this.u.isEmpty()) {
            this.invalidate();
        }
        this.v0[0] = 0;
        this.v0[1] = 0;
        this.q(v4, v5, v6, v7, this.t0, 0, this.v0);
        int v8 = arr_v[0];
        int v9 = arr_v[1];
        int v10 = this.V;
        int v11 = this.t0[0];
        this.V = v10 - v11;
        int v12 = this.W;
        int v13 = this.t0[1];
        this.W = v12 - v13;
        this.u0[0] += v11;
        this.u0[1] += v13;
        if(this.getOverScrollMode() != 2) {
            if(motionEvent0 != null && (motionEvent0.getSource() & 0x2002) != 0x2002) {
                float f = motionEvent0.getX();
                float f1 = (float)(v6 - v8);
                float f2 = motionEvent0.getY();
                float f3 = (float)(v7 - v9);
                if(f1 < 0.0f) {
                    this.t();
                    this.L.onPull(-f1 / ((float)this.getWidth()), 1.0f - f2 / ((float)this.getHeight()));
                    z = true;
                }
                else if(f1 > 0.0f) {
                    this.u();
                    this.N.onPull(f1 / ((float)this.getWidth()), f2 / ((float)this.getHeight()));
                    z = true;
                }
                else {
                    z = false;
                }
                if(f3 < 0.0f) {
                    this.v();
                    this.M.onPull(-f3 / ((float)this.getHeight()), f / ((float)this.getWidth()));
                    z = true;
                }
                else if(f3 > 0.0f) {
                    this.s();
                    this.O.onPull(f3 / ((float)this.getHeight()), 1.0f - f / ((float)this.getWidth()));
                    z = true;
                }
                if(z || f1 != 0.0f || f3 != 0.0f) {
                    this.postInvalidateOnAnimation();
                }
            }
            this.j(v, v1);
        }
        if(v4 != 0 || v5 != 0) {
            this.r(v4, v5);
        }
        if(!this.awakenScrollBars()) {
            this.invalidate();
        }
        return v8 != 0 || v9 != 0 || v4 != 0 || v5 != 0;
    }

    public final void V(int v, int v1, int[] arr_v) {
        a a0 = this.m;
        this.X();
        this.M();
        Trace.beginSection("RV Scroll");
        this.x(this.j0);
        int v2 = v == 0 ? 0 : this.t.g0(v, this.j, this.j0);
        int v3 = v1 == 0 ? 0 : this.t.h0(v1, this.j, this.j0);
        Trace.endSection();
        int v4 = a0.m();
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = a0.l(v5);
            T t0 = this.F(view0);
            if(t0 != null) {
                T t1 = t0.h;
                if(t1 != null) {
                    int v6 = view0.getLeft();
                    int v7 = view0.getTop();
                    View view1 = t1.a;
                    if(v6 != view1.getLeft() || v7 != view1.getTop()) {
                        view1.layout(v6, v7, view1.getWidth() + v6, view1.getHeight() + v7);
                    }
                }
            }
        }
        this.N(true);
        this.Y(false);
        if(arr_v != null) {
            arr_v[0] = v2;
            arr_v[1] = v3;
        }
    }

    public final void W(int v, int v1, boolean z) {
        F f0 = this.t;
        if(f0 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.C) {
            return;
        }
        int v2 = f0.c() ? v : 0;
        int v3 = this.t.d() ? v1 : 0;
        if(v2 != 0 || v3 != 0) {
            if(z) {
                int v4 = v2 == 0 ? 0 : 1;
                if(v3 != 0) {
                    v4 |= 2;
                }
                this.getScrollingChildHelper().g(v4, 1);
            }
            S s0 = this.g0;
            RecyclerView recyclerView0 = s0.o;
            int v5 = Math.abs(v2);
            int v6 = Math.abs(v3);
            boolean z1 = v5 > v6;
            int v7 = z1 ? recyclerView0.getWidth() : recyclerView0.getHeight();
            float f1 = ((float)Math.sin((Math.min(1.0f, ((float)(((int)Math.sqrt(v3 * v3 + v2 * v2)))) * 1.0f / ((float)v7)) - 0.5f) * 0.471239f)) * ((float)(v7 / 2)) + ((float)(v7 / 2));
            if(!z1) {
                v5 = v6;
            }
            int v8 = Math.min(((int)((((float)v5) / ((float)v7) + 1.0f) * 300.0f)), 2000);
            w w0 = RecyclerView.D0;
            if(s0.l != w0) {
                s0.l = w0;
                s0.k = new OverScroller(recyclerView0.getContext(), w0);
            }
            s0.j = 0;
            s0.i = 0;
            recyclerView0.setScrollState(2);
            s0.k.startScroll(0, 0, v2, v3, v8);
            if(Build.VERSION.SDK_INT < 23) {
                s0.k.computeScrollOffset();
            }
            if(s0.m) {
                s0.n = true;
                return;
            }
            s0.o.removeCallbacks(s0);
            s0.o.postOnAnimation(s0);
        }
    }

    public final void X() {
        int v = this.A + 1;
        this.A = v;
        if(v == 1 && !this.C) {
            this.B = false;
        }
    }

    public final void Y(boolean z) {
        if(this.A < 1) {
            this.A = 1;
        }
        if(!z && !this.C) {
            this.B = false;
        }
        if(this.A == 1) {
            if(z && this.B && !this.C && this.t != null && this.s != null) {
                this.m();
            }
            if(!this.C) {
                this.B = false;
            }
        }
        --this.A;
    }

    public final void Z(int v) {
        this.getScrollingChildHelper().h(v);
    }

    @Override  // android.view.ViewGroup
    public final void addFocusables(ArrayList arrayList0, int v, int v1) {
        F f0 = this.t;
        if(f0 != null) {
            f0.getClass();
        }
        super.addFocusables(arrayList0, v, v1);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof G && this.t.e(((G)viewGroup$LayoutParams0));
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollExtent() {
        F f0 = this.t;
        if(f0 == null) {
            return 0;
        }
        return f0.c() ? this.t.i(this.j0) : 0;
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollOffset() {
        F f0 = this.t;
        if(f0 == null) {
            return 0;
        }
        return f0.c() ? this.t.j(this.j0) : 0;
    }

    @Override  // android.view.View
    public final int computeHorizontalScrollRange() {
        F f0 = this.t;
        if(f0 == null) {
            return 0;
        }
        return f0.c() ? this.t.k(this.j0) : 0;
    }

    @Override  // android.view.View
    public final int computeVerticalScrollExtent() {
        F f0 = this.t;
        if(f0 == null) {
            return 0;
        }
        return f0.d() ? this.t.l(this.j0) : 0;
    }

    @Override  // android.view.View
    public final int computeVerticalScrollOffset() {
        F f0 = this.t;
        if(f0 == null) {
            return 0;
        }
        return f0.d() ? this.t.m(this.j0) : 0;
    }

    @Override  // android.view.View
    public final int computeVerticalScrollRange() {
        F f0 = this.t;
        if(f0 == null) {
            return 0;
        }
        return f0.d() ? this.t.n(this.j0) : 0;
    }

    @Override  // android.view.View
    public final boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.getScrollingChildHelper().a(f, f1, z);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f1) {
        return this.getScrollingChildHelper().b(f, f1);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedPreScroll(int v, int v1, int[] arr_v, int[] arr_v1) {
        return this.getScrollingChildHelper().c(v, v1, 0, arr_v, arr_v1);
    }

    @Override  // android.view.View
    public final boolean dispatchNestedScroll(int v, int v1, int v2, int v3, int[] arr_v) {
        return this.getScrollingChildHelper().d(v, v1, v2, v3, arr_v, 0, null);
    }

    @Override  // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        this.onPopulateAccessibilityEvent(accessibilityEvent0);
        return true;
    }

    @Override  // android.view.ViewGroup
    public final void dispatchRestoreInstanceState(SparseArray sparseArray0) {
        this.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    public final void dispatchSaveInstanceState(SparseArray sparseArray0) {
        this.dispatchFreezeSelfOnly(sparseArray0);
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
        int v11;
        int v = 1;
        super.draw(canvas0);
        ArrayList arrayList0 = this.u;
        int v1 = arrayList0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            m m0 = (m)arrayList0.get(v3);
            if(m0.q != m0.s.getWidth() || m0.r != m0.s.getHeight()) {
                m0.q = m0.s.getWidth();
                m0.r = m0.s.getHeight();
                m0.f(0);
            }
            else if(m0.A != 0) {
                if(m0.t) {
                    int v4 = m0.e;
                    int v5 = m0.q - v4;
                    int v6 = m0.l - m0.k / 2;
                    StateListDrawable stateListDrawable0 = m0.c;
                    stateListDrawable0.setBounds(0, 0, v4, m0.k);
                    Drawable drawable0 = m0.d;
                    drawable0.setBounds(0, 0, m0.f, m0.r);
                    if(m0.s.getLayoutDirection() == 1) {
                        drawable0.draw(canvas0);
                        canvas0.translate(((float)v4), ((float)v6));
                        canvas0.scale(-1.0f, 1.0f);
                        stateListDrawable0.draw(canvas0);
                        canvas0.scale(1.0f, 1.0f);
                        canvas0.translate(((float)(-v4)), ((float)(-v6)));
                    }
                    else {
                        canvas0.translate(((float)v5), 0.0f);
                        drawable0.draw(canvas0);
                        canvas0.translate(0.0f, ((float)v6));
                        stateListDrawable0.draw(canvas0);
                        canvas0.translate(((float)(-v5)), ((float)(-v6)));
                    }
                }
                if(m0.u) {
                    int v7 = m0.r - m0.i;
                    int v8 = m0.o - m0.n / 2;
                    m0.g.setBounds(0, 0, m0.n, m0.i);
                    m0.h.setBounds(0, 0, m0.q, m0.j);
                    canvas0.translate(0.0f, ((float)v7));
                    m0.h.draw(canvas0);
                    canvas0.translate(((float)v8), 0.0f);
                    m0.g.draw(canvas0);
                    canvas0.translate(((float)(-v8)), ((float)(-v7)));
                }
            }
        }
        if(this.L == null || this.L.isFinished()) {
            v11 = 0;
        }
        else {
            int v9 = canvas0.save();
            int v10 = this.o ? this.getPaddingBottom() : 0;
            canvas0.rotate(270.0f);
            canvas0.translate(((float)(v10 - this.getHeight())), 0.0f);
            v11 = this.L == null || !this.L.draw(canvas0) ? 0 : 1;
            canvas0.restoreToCount(v9);
        }
        if(this.M != null && !this.M.isFinished()) {
            int v12 = canvas0.save();
            if(this.o) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            v11 |= (this.M == null || !this.M.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v12);
        }
        if(this.N != null && !this.N.isFinished()) {
            int v13 = canvas0.save();
            int v14 = this.getWidth();
            int v15 = this.o ? this.getPaddingTop() : 0;
            canvas0.rotate(90.0f);
            canvas0.translate(((float)(-v15)), ((float)(-v14)));
            v11 |= (this.N == null || !this.N.draw(canvas0) ? 0 : 1);
            canvas0.restoreToCount(v13);
        }
        if(this.O != null && !this.O.isFinished()) {
            int v16 = canvas0.save();
            canvas0.rotate(180.0f);
            if(this.o) {
                int v17 = this.getWidth();
                int v18 = this.getPaddingRight();
                int v19 = this.getHeight();
                canvas0.translate(((float)(v18 - v17)), ((float)(this.getPaddingBottom() - v19)));
            }
            else {
                canvas0.translate(((float)(-this.getWidth())), ((float)(-this.getHeight())));
            }
            if(this.O != null && this.O.draw(canvas0)) {
                v2 = 1;
            }
            v11 |= v2;
            canvas0.restoreToCount(v16);
        }
        if(v11 != 0 || this.P == null || arrayList0.size() <= 0 || !this.P.f()) {
            v = v11;
        }
        if(v != 0) {
            this.postInvalidateOnAnimation();
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas0, View view0, long v) {
        return super.drawChild(canvas0, view0, v);
    }

    public final void e(T t0) {
        View view0 = t0.a;
        boolean z = view0.getParent() == this;
        T t1 = this.F(view0);
        this.j.j(t1);
        if(t0.j()) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            this.m.c(view0, -1, viewGroup$LayoutParams0, true);
            return;
        }
        if(!z) {
            this.m.a(view0, -1, true);
            return;
        }
        a a0 = this.m;
        int v = ((y)a0.j).a.indexOfChild(view0);
        if(v < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view0);
        }
        ((N.b)a0.k).h(v);
        a0.w(view0);
    }

    public final void f(I i0) {
        this.v.add(i0);
    }

    @Override  // android.view.ViewGroup
    public final View focusSearch(View view0, int v) {
        int v11;
        int v8;
        View view1;
        this.t.getClass();
        boolean z = this.s != null && this.t != null && !this.J() && !this.C;
        FocusFinder focusFinder0 = FocusFinder.getInstance();
        P p0 = this.j0;
        M m0 = this.j;
        if(!z || v != 1 && v != 2) {
            View view2 = focusFinder0.findNextFocus(this, view0, v);
            if(view2 != null || !z) {
                view1 = view2;
            }
            else {
                this.k();
                if(this.z(view0) == null) {
                    return null;
                }
                this.X();
                view1 = this.t.M(view0, v, m0, p0);
                this.Y(false);
            }
        }
        else {
            boolean z1 = this.t.d() && focusFinder0.findNextFocus(this, view0, (v == 2 ? 130 : 33)) == null;
            if(!z1 && this.t.c()) {
                z1 = focusFinder0.findNextFocus(this, view0, (((this.t.b.getLayoutDirection() == 1 ? 1 : 0) ^ (v == 2 ? 1 : 0)) == 0 ? 17 : 66)) == null;
            }
            if(z1) {
                this.k();
                if(this.z(view0) == null) {
                    return null;
                }
                this.X();
                this.t.M(view0, v, m0, p0);
                this.Y(false);
            }
            view1 = focusFinder0.findNextFocus(this, view0, v);
        }
        if(view1 != null && !view1.hasFocusable()) {
            if(this.getFocusedChild() == null) {
                return super.focusSearch(view0, v);
            }
            this.S(view1, null);
            return view0;
        }
        if(view1 == null || view1 == this || this.z(view1) == null) {
            return super.focusSearch(view0, v);
        }
        if(view0 != null && this.z(view0) != null) {
            int v1 = view0.getWidth();
            int v2 = view0.getHeight();
            Rect rect0 = this.p;
            rect0.set(0, 0, v1, v2);
            int v3 = view1.getWidth();
            int v4 = view1.getHeight();
            Rect rect1 = this.q;
            rect1.set(0, 0, v3, v4);
            this.offsetDescendantRectToMyCoords(view0, rect0);
            this.offsetDescendantRectToMyCoords(view1, rect1);
            int v5 = this.t.b.getLayoutDirection() == 1 ? -1 : 1;
            int v6 = rect0.left;
            int v7 = rect1.left;
            if(v6 >= v7 && rect0.right > v7 || rect0.right >= rect1.right) {
                v8 = rect0.right <= rect1.right && v6 < rect1.right || v6 <= v7 ? 0 : -1;
            }
            else {
                v8 = 1;
            }
            int v9 = rect0.top;
            int v10 = rect1.top;
            if(v9 >= v10 && rect0.bottom > v10 || rect0.bottom >= rect1.bottom) {
                v11 = rect0.bottom <= rect1.bottom && v9 < rect1.bottom || v9 <= v10 ? 0 : -1;
            }
            else {
                v11 = 1;
            }
            switch(v) {
                case 1: {
                    return v11 >= 0 && (v11 != 0 || v8 * v5 > 0) ? super.focusSearch(view0, 1) : view1;
                }
                case 2: {
                    return v11 <= 0 && (v11 != 0 || v8 * v5 < 0) ? super.focusSearch(view0, 2) : view1;
                }
                case 17: {
                    return v8 >= 0 ? super.focusSearch(view0, 17) : view1;
                }
                case 33: {
                    return v11 >= 0 ? super.focusSearch(view0, 33) : view1;
                }
                case 66: {
                    return v8 <= 0 ? super.focusSearch(view0, 66) : view1;
                }
                case 130: {
                    return v11 <= 0 ? super.focusSearch(view0, 130) : view1;
                }
                default: {
                    throw new IllegalArgumentException("Invalid direction: " + v + this.w());
                }
            }
        }
        return view1;
    }

    public final void g(String s) {
        if(this.J()) {
            throw s == null ? new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + this.w()) : new IllegalStateException(s);
        }
        if(this.J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + this.w()));
        }
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        F f0 = this.t;
        if(f0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.w());
        }
        return f0.q();
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        F f0 = this.t;
        if(f0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.w());
        }
        return f0.r(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        F f0 = this.t;
        if(f0 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + this.w());
        }
        return f0.s(viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public z getAdapter() {
        return this.s;
    }

    @Override  // android.view.View
    public int getBaseline() {
        F f0 = this.t;
        if(f0 != null) {
            f0.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override  // android.view.ViewGroup
    public final int getChildDrawingOrder(int v, int v1) {
        return super.getChildDrawingOrder(v, v1);
    }

    @Override  // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.o;
    }

    public V getCompatAccessibilityDelegate() {
        return this.q0;
    }

    public C getEdgeEffectFactory() {
        return this.K;
    }

    public D getItemAnimator() {
        return this.P;
    }

    public int getItemDecorationCount() {
        return this.u.size();
    }

    public F getLayoutManager() {
        return this.t;
    }

    public int getMaxFlingVelocity() {
        return this.c0;
    }

    public int getMinFlingVelocity() {
        return this.b0;
    }

    public long getNanoTime() [...] // Potential decryptor

    public H getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f0;
    }

    public L getRecycledViewPool() {
        return this.j.c();
    }

    public int getScrollState() {
        return this.Q;
    }

    private e getScrollingChildHelper() {
        if(this.s0 == null) {
            this.s0 = new e(this);
        }
        return this.s0;
    }

    public static void h(T t0) {
        WeakReference weakReference0 = t0.b;
        if(weakReference0 != null) {
            for(View view0 = (View)weakReference0.get(); view0 != null; view0 = viewParent0 instanceof View ? ((View)viewParent0) : null) {
                if(view0 == t0.a) {
                    return;
                }
                ViewParent viewParent0 = view0.getParent();
            }
            t0.b = null;
        }
    }

    @Override  // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().f(0);
    }

    public final void i() {
        int v = this.m.v();
        for(int v2 = 0; v2 < v; ++v2) {
            T t0 = RecyclerView.G(this.m.u(v2));
            if(!t0.o()) {
                t0.d = -1;
                t0.f = -1;
            }
        }
        M m0 = this.j;
        ArrayList arrayList0 = m0.c;
        int v3 = arrayList0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            T t1 = (T)arrayList0.get(v4);
            t1.d = -1;
            t1.f = -1;
        }
        ArrayList arrayList1 = m0.a;
        int v5 = arrayList1.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            T t2 = (T)arrayList1.get(v6);
            t2.d = -1;
            t2.f = -1;
        }
        ArrayList arrayList2 = m0.b;
        if(arrayList2 != null) {
            int v7 = arrayList2.size();
            for(int v1 = 0; v1 < v7; ++v1) {
                T t3 = (T)m0.b.get(v1);
                t3.d = -1;
                t3.f = -1;
            }
        }
    }

    @Override  // android.view.View
    public final boolean isAttachedToWindow() {
        return this.x;
    }

    @Override  // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.C;
    }

    @Override  // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().d;
    }

    public final void j(int v, int v1) {
        boolean z;
        if(this.L == null || this.L.isFinished() || v <= 0) {
            z = false;
        }
        else {
            this.L.onRelease();
            z = this.L.isFinished();
        }
        if(this.N != null && !this.N.isFinished() && v < 0) {
            this.N.onRelease();
            z |= this.N.isFinished();
        }
        if(this.M != null && !this.M.isFinished() && v1 > 0) {
            this.M.onRelease();
            z |= this.M.isFinished();
        }
        if(this.O != null && !this.O.isFinished() && v1 < 0) {
            this.O.onRelease();
            z |= this.O.isFinished();
        }
        if(z) {
            this.postInvalidateOnAnimation();
        }
    }

    public final void k() {
        f f0 = this.l;
        if(this.z && !this.G) {
            if(!f0.r()) {
                return;
            }
            f0.getClass();
            if(f0.r()) {
                Trace.beginSection("RV FullInvalidate");
                this.m();
                Trace.endSection();
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        this.m();
        Trace.endSection();
    }

    public final void l(int v, int v1) {
        int v2 = this.getPaddingLeft();
        int v3 = F.f(v, this.getPaddingRight() + v2, this.getMinimumWidth());
        int v4 = this.getPaddingTop();
        this.setMeasuredDimension(v3, F.f(v1, this.getPaddingBottom() + v4, this.getMinimumHeight()));
    }

    public final void m() {
        boolean z2;
        if(this.s == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if(this.t == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        P p0 = this.j0;
        p0.h = false;
        if(p0.c == 1) {
            this.n();
            this.t.i0(this);
            this.o();
        }
        else if(!((ArrayList)this.l.l).isEmpty() && !((ArrayList)this.l.k).isEmpty() || this.t.m != this.getWidth() || this.t.n != this.getHeight()) {
            this.t.i0(this);
            this.o();
        }
        else {
            this.t.i0(this);
        }
        p0.a(4);
        this.X();
        this.M();
        p0.c = 1;
        M m0 = this.j;
        c c0 = this.n;
        if(p0.i) {
            for(int v = this.m.m() - 1; v >= 0; --v) {
                T t0 = RecyclerView.G(this.m.l(v));
                if(!t0.o()) {
                    this.s.getClass();
                    long v1 = (long)t0.c;
                    this.P.getClass();
                    h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
                    h0.a(t0);
                    T t1 = (T)((p.e)c0.k).d(v1, null);
                    if(t1 == null || t1.o()) {
                        c0.o(t0, h0);
                    }
                    else {
                        p.k k0 = (p.k)c0.j;
                        b0 b00 = (b0)k0.getOrDefault(t1, null);
                        boolean z = b00 != null && (b00.a & 1) != 0;
                        b0 b01 = (b0)k0.getOrDefault(t0, null);
                        boolean z1 = b01 != null && (b01.a & 1) != 0;
                        if(!z || t1 != t0) {
                            h h1 = c0.F(t1, 4);
                            c0.o(t0, h0);
                            h h2 = c0.F(t0, 8);
                            if(h1 == null) {
                                int v2 = this.m.m();
                                for(int v3 = 0; v3 < v2; ++v3) {
                                    T t2 = RecyclerView.G(this.m.l(v3));
                                    if(t2 != t0) {
                                        this.s.getClass();
                                        if(((long)t2.c) == v1) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + t2 + " \n View Holder 2:" + t0 + this.w());
                                        }
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + t1 + " cannot be found but it is necessary for " + t0 + this.w());
                            }
                            else {
                                t1.n(false);
                                if(z) {
                                    this.e(t1);
                                }
                                if(t1 != t0) {
                                    if(z1) {
                                        this.e(t0);
                                    }
                                    t1.g = t0;
                                    this.e(t1);
                                    m0.j(t1);
                                    t0.n(false);
                                    t0.h = t1;
                                }
                                if(this.P.a(t1, t0, h1, h2)) {
                                    this.P();
                                }
                            }
                        }
                        else {
                            c0.o(t0, h0);
                        }
                    }
                }
            }
            p.k k1 = (p.k)c0.j;
            for(int v4 = k1.k - 1; v4 >= 0; --v4) {
                T t3 = (T)k1.i(v4);
                b0 b02 = (b0)k1.j(v4);
                int v5 = b02.a;
                x x0 = this.y0;
                if((v5 & 3) == 3) {
                    x0.a.t.c0(t3.a, x0.a.j);
                }
                else if((v5 & 1) != 0) {
                    h h3 = b02.b;
                    if(h3 == null) {
                        x0.a.t.c0(t3.a, x0.a.j);
                    }
                    else {
                        x0.g(t3, h3, b02.c);
                    }
                }
                else if((v5 & 14) == 14) {
                    x0.f(t3, b02.b, b02.c);
                }
                else if((v5 & 12) == 12) {
                    h h4 = b02.b;
                    h h5 = b02.c;
                    x0.getClass();
                    t3.n(false);
                    RecyclerView recyclerView0 = x0.a;
                    if(!recyclerView0.G) {
                        i i0 = (i)recyclerView0.P;
                        i0.getClass();
                        int v6 = h4.a;
                        int v7 = h5.a;
                        if(v6 != v7 || h4.b != h5.b) {
                            z2 = i0.g(t3, v6, h4.b, v7, h5.b);
                        }
                        else {
                            i0.c(t3);
                            z2 = false;
                        }
                        if(z2) {
                            recyclerView0.P();
                        }
                    }
                    else if(recyclerView0.P.a(t3, t3, h4, h5)) {
                        recyclerView0.P();
                    }
                }
                else if((v5 & 4) != 0) {
                    x0.g(t3, b02.b, null);
                }
                else if((v5 & 8) != 0) {
                    x0.f(t3, b02.b, b02.c);
                }
                b02.a = 0;
                b02.b = null;
                b02.c = null;
                b0.d.b(b02);
            }
        }
        this.t.b0(m0);
        p0.a = p0.d;
        this.G = false;
        this.H = false;
        p0.i = false;
        p0.j = false;
        this.t.e = false;
        ArrayList arrayList0 = m0.b;
        if(arrayList0 != null) {
            arrayList0.clear();
        }
        F f0 = this.t;
        if(f0.j) {
            f0.i = 0;
            f0.j = false;
            m0.k();
        }
        this.t.W(p0);
        this.N(true);
        this.Y(false);
        ((p.k)c0.j).clear();
        p.e e0 = (p.e)c0.k;
        int v8 = e0.l;
        Object[] arr_object = e0.k;
        for(int v9 = 0; v9 < v8; ++v9) {
            arr_object[v9] = null;
        }
        View view0 = null;
        e0.l = 0;
        e0.i = false;
        int v10 = this.r0[0];
        int v11 = this.r0[1];
        this.B(this.r0);
        if(this.r0[0] != v10 || this.r0[1] != v11) {
            this.r(0, 0);
        }
        if(this.f0 && this.s != null && this.hasFocus() && this.getDescendantFocusability() != 0x60000 && (this.getDescendantFocusability() != 0x20000 || !this.isFocused())) {
            if(this.isFocused()) {
            label_169:
                if(p0.l != -1L) {
                    this.s.getClass();
                }
                if(this.m.m() > 0) {
                    int v12 = p0.k == -1 ? 0 : p0.k;
                    int v13 = p0.b();
                    int v14 = v12;
                    while(v14 < v13) {
                        T t4 = this.D(v14);
                        if(t4 == null) {
                            break;
                        }
                        View view2 = t4.a;
                        if(view2.hasFocusable()) {
                            view0 = view2;
                            goto label_194;
                        }
                        ++v14;
                    }
                    for(int v15 = Math.min(v13, v12) - 1; v15 >= 0; --v15) {
                        T t5 = this.D(v15);
                        if(t5 == null) {
                            break;
                        }
                        View view3 = t5.a;
                        if(view3.hasFocusable()) {
                            view0 = view3;
                            break;
                        }
                    }
                }
            label_194:
                if(view0 != null) {
                    int v16 = p0.m;
                    if(((long)v16) != -1L) {
                        View view4 = view0.findViewById(v16);
                        if(view4 != null && view4.isFocusable()) {
                            view0 = view4;
                        }
                    }
                    view0.requestFocus();
                }
            }
            else {
                View view1 = this.getFocusedChild();
                if(((ArrayList)this.m.l).contains(view1)) {
                    goto label_169;
                }
            }
        }
        p0.l = -1L;
        p0.k = -1;
        p0.m = -1;
    }

    public final void n() {
        int v47;
        T t0;
        boolean z6;
        int v45;
        int v44;
        int v46;
        N.a a3;
        boolean z2;
        boolean z1;
        P p0 = this.j0;
        p0.a(1);
        this.x(p0);
        p0.h = false;
        this.X();
        c c0 = this.n;
        ((p.k)c0.j).clear();
        p.e e0 = (p.e)c0.k;
        int v = e0.l;
        Object[] arr_object = e0.k;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        e0.l = 0;
        e0.i = false;
        this.M();
        if(this.G) {
            this.l.u(((ArrayList)this.l.k));
            this.l.u(((ArrayList)this.l.l));
            if(this.H) {
                this.t.R();
            }
        }
        if(this.P == null || !this.t.q0()) {
            this.l.f();
        }
        else {
            f f0 = this.l;
            ArrayList arrayList0 = (ArrayList)f0.k;
            T1.c c1 = (T1.c)f0.n;
            c1.getClass();
            while(true) {
                int v2 = arrayList0.size() - 1;
                boolean z = false;
                while(true) {
                    if(v2 < 0) {
                        v2 = -1;
                        break;
                    }
                    if(((N.a)arrayList0.get(v2)).a != 8) {
                        z = true;
                    }
                    else if(z) {
                        break;
                    }
                    --v2;
                }
                if(v2 == -1) {
                    break;
                }
                N.a a0 = (N.a)arrayList0.get(v2);
                N.a a1 = (N.a)arrayList0.get(v2 + 1);
                int v3 = a1.a;
                if(v3 == 1) {
                    int v26 = a0.c;
                    int v27 = a1.b;
                    int v28 = v26 >= v27 ? 0 : -1;
                    int v29 = a0.b;
                    if(v29 < v27) {
                        ++v28;
                    }
                    if(v27 <= v29) {
                        a0.b = v29 + a1.c;
                    }
                    int v30 = a1.b;
                    if(v30 <= v26) {
                        a0.c = v26 + a1.c;
                    }
                    a1.b = v30 + v28;
                    arrayList0.set(v2, a1);
                    arrayList0.set(v2 + 1, a0);
                    continue;
                }
                else {
                    N.a a2 = null;
                    f f1 = (f)c1.j;
                    switch(v3) {
                        case 2: {
                            int v4 = a0.b;
                            int v5 = a0.c;
                            if(v4 < v5) {
                                z1 = a1.b == v4 && a1.c == v5 - v4;
                                z2 = false;
                            }
                            else {
                                z1 = a1.b == v5 + 1 && a1.c == v4 - v5;
                                z2 = true;
                            }
                            int v6 = a1.b;
                            if(v5 < v6) {
                                a1.b = v6 - 1;
                            }
                            else {
                                int v7 = a1.c;
                                if(v5 < v6 + v7) {
                                    a1.c = v7 - 1;
                                    a0.a = 2;
                                    a0.c = 1;
                                    if(a1.c != 0) {
                                        continue;
                                    }
                                    arrayList0.remove(v2 + 1);
                                    f1.getClass();
                                    ((D.c)f1.j).b(a1);
                                    continue;
                                }
                            }
                            int v8 = a0.b;
                            int v9 = a1.b;
                            if(v8 <= v9) {
                                a1.b = v9 + 1;
                            }
                            else {
                                int v10 = v9 + a1.c;
                                if(v8 < v10) {
                                    a2 = f1.s(2, v8 + 1, v10 - v8);
                                    a1.c = a0.b - a1.b;
                                }
                            }
                            if(z1) {
                                arrayList0.set(v2, a1);
                                arrayList0.remove(v2 + 1);
                                f1.getClass();
                                ((D.c)f1.j).b(a0);
                            }
                            else {
                                if(z2) {
                                    if(a2 != null) {
                                        int v11 = a0.b;
                                        if(v11 > a2.b) {
                                            a0.b = v11 - a2.c;
                                        }
                                        int v12 = a0.c;
                                        if(v12 > a2.b) {
                                            a0.c = v12 - a2.c;
                                        }
                                    }
                                    int v13 = a0.b;
                                    if(v13 > a1.b) {
                                        a0.b = v13 - a1.c;
                                    }
                                    int v14 = a0.c;
                                    if(v14 > a1.b) {
                                        a0.c = v14 - a1.c;
                                    }
                                }
                                else {
                                    if(a2 != null) {
                                        int v15 = a0.b;
                                        if(v15 >= a2.b) {
                                            a0.b = v15 - a2.c;
                                        }
                                        int v16 = a0.c;
                                        if(v16 >= a2.b) {
                                            a0.c = v16 - a2.c;
                                        }
                                    }
                                    int v17 = a0.b;
                                    if(v17 >= a1.b) {
                                        a0.b = v17 - a1.c;
                                    }
                                    int v18 = a0.c;
                                    if(v18 >= a1.b) {
                                        a0.c = v18 - a1.c;
                                    }
                                }
                                arrayList0.set(v2, a1);
                                if(a0.b == a0.c) {
                                    arrayList0.remove(v2 + 1);
                                }
                                else {
                                    arrayList0.set(v2 + 1, a0);
                                }
                                if(a2 == null) {
                                    continue;
                                }
                                arrayList0.add(v2, a2);
                            }
                            continue;
                        }
                        case 4: {
                            int v19 = a0.c;
                            int v20 = a1.b;
                            if(v19 < v20) {
                                a1.b = v20 - 1;
                            }
                            else {
                                int v21 = a1.c;
                                if(v19 < v20 + v21) {
                                    a1.c = v21 - 1;
                                    a3 = f1.s(4, a0.b, 1);
                                    goto label_132;
                                }
                            }
                            a3 = null;
                        label_132:
                            int v22 = a0.b;
                            int v23 = a1.b;
                            if(v22 <= v23) {
                                a1.b = v23 + 1;
                            }
                            else {
                                int v24 = v23 + a1.c;
                                if(v22 < v24) {
                                    int v25 = v24 - v22;
                                    a2 = f1.s(4, v22 + 1, v25);
                                    a1.c -= v25;
                                }
                            }
                            arrayList0.set(v2 + 1, a0);
                            if(a1.c > 0) {
                                arrayList0.set(v2, a1);
                            }
                            else {
                                arrayList0.remove(v2);
                                f1.getClass();
                                ((D.c)f1.j).b(a1);
                            }
                            if(a3 != null) {
                                arrayList0.add(v2, a3);
                            }
                            if(a2 == null) {
                                continue;
                            }
                            arrayList0.add(v2, a2);
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                goto label_171;
            }
            int v31 = arrayList0.size();
        label_171:
            for(int v32 = 0; v32 < v31; ++v32) {
                N.a a4 = (N.a)arrayList0.get(v32);
                int v33 = a4.a;
                if(v33 == 1) {
                    f0.t(a4);
                }
                else {
                    x x0 = (x)f0.m;
                    if(v33 == 2) {
                        int v39 = a4.b;
                        int v40 = a4.c + v39;
                        int v41 = v39;
                        int v42 = 0;
                        int v43;
                        for(v43 = -1; v41 < v40; v43 = v45) {
                            if(x0.b(v41) != null || f0.e(v41)) {
                                if(v43 == 0) {
                                    f0.h(f0.s(2, v39, v42));
                                    v46 = 1;
                                }
                                else {
                                    v46 = 0;
                                }
                                v44 = v46;
                                v45 = 1;
                            }
                            else {
                                if(v43 == 1) {
                                    f0.t(f0.s(2, v39, v42));
                                    v44 = 1;
                                }
                                else {
                                    v44 = 0;
                                }
                                v45 = 0;
                            }
                            if(v44 == 0) {
                                ++v42;
                            }
                            else {
                                v41 -= v42;
                                v40 -= v42;
                                v42 = 1;
                            }
                            ++v41;
                        }
                        if(v42 != a4.c) {
                            ((D.c)f0.j).b(a4);
                            a4 = f0.s(2, v39, v42);
                        }
                        if(v43 == 0) {
                            f0.h(a4);
                        }
                        else {
                            f0.t(a4);
                        }
                    }
                    else {
                        switch(v33) {
                            case 4: {
                                int v34 = a4.b;
                                int v35 = a4.c + v34;
                                int v36 = v34;
                                int v37 = 0;
                                int v38 = -1;
                                while(v34 < v35) {
                                    if(x0.b(v34) != null || f0.e(v34)) {
                                        if(v38 == 0) {
                                            f0.h(f0.s(4, v36, v37));
                                            v36 = v34;
                                            v37 = 0;
                                        }
                                        v38 = 1;
                                    }
                                    else {
                                        if(v38 == 1) {
                                            f0.t(f0.s(4, v36, v37));
                                            v36 = v34;
                                            v37 = 0;
                                        }
                                        v38 = 0;
                                    }
                                    ++v37;
                                    ++v34;
                                }
                                if(v37 != a4.c) {
                                    ((D.c)f0.j).b(a4);
                                    a4 = f0.s(4, v36, v37);
                                }
                                if(v38 == 0) {
                                    f0.h(a4);
                                }
                                else {
                                    f0.t(a4);
                                }
                                break;
                            }
                            case 8: {
                                f0.t(a4);
                            }
                        }
                    }
                }
            }
            arrayList0.clear();
        }
        boolean z3 = true;
        boolean z4 = this.m0 || this.n0;
        if(!this.z || this.P == null) {
            z6 = false;
        }
        else {
            boolean z5 = this.G;
            if(!z5 && !z4 && !this.t.e) {
                z6 = false;
            }
            else if(z5) {
                this.s.getClass();
                z6 = false;
            }
            else {
                z6 = true;
            }
        }
        P p1 = this.j0;
        p1.i = z6;
        if(!z6 || !z4 || this.G || this.P == null || !this.t.q0()) {
            z3 = false;
        }
        p1.j = z3;
        View view0 = !this.f0 || !this.hasFocus() || this.s == null ? null : this.getFocusedChild();
        if(view0 == null) {
            t0 = null;
        }
        else {
            View view1 = this.z(view0);
            t0 = view1 == null ? null : this.F(view1);
        }
        if(t0 == null) {
            p0.l = -1L;
            p0.k = -1;
            p0.m = -1;
        }
        else {
            this.s.getClass();
            p0.l = -1L;
            if(this.G) {
                v47 = -1;
            }
            else if(t0.h()) {
                v47 = t0.d;
            }
            else {
                RecyclerView recyclerView0 = t0.q;
                v47 = recyclerView0 == null ? -1 : recyclerView0.E(t0);
            }
            p0.k = v47;
            View view2 = t0.a;
            int v48 = view2.getId();
            while(!view2.isFocused() && view2 instanceof ViewGroup && view2.hasFocus()) {
                view2 = ((ViewGroup)view2).getFocusedChild();
                if(view2.getId() != -1) {
                    v48 = view2.getId();
                }
            }
            p0.m = v48;
        }
        p0.g = p0.i && this.n0;
        this.n0 = false;
        this.m0 = false;
        p0.f = p0.j;
        p0.d = this.s.a();
        this.B(this.r0);
        boolean z7 = p0.i;
        p.k k0 = (p.k)c0.j;
        if(z7) {
            int v49 = this.m.m();
            for(int v50 = 0; v50 < v49; ++v50) {
                T t1 = RecyclerView.G(this.m.l(v50));
                if(!t1.o()) {
                    if(t1.f()) {
                        this.s.getClass();
                    }
                    else {
                        D d0 = this.P;
                        D.b(t1);
                        t1.c();
                        d0.getClass();
                        h h0 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
                        h0.a(t1);
                        b0 b00 = (b0)k0.getOrDefault(t1, null);
                        if(b00 == null) {
                            b00 = b0.a();
                            k0.put(t1, b00);
                        }
                        b00.b = h0;
                        b00.a |= 4;
                        if(p0.g && t1.k() && !t1.h() && !t1.o() && !t1.f()) {
                            this.s.getClass();
                            e0.e(((long)t1.c), t1);
                        }
                    }
                }
            }
        }
        if(p0.j) {
            int v51 = this.m.v();
            for(int v52 = 0; v52 < v51; ++v52) {
                T t2 = RecyclerView.G(this.m.u(v52));
                if(!t2.o() && t2.d == -1) {
                    t2.d = t2.c;
                }
            }
            boolean z8 = p0.e;
            p0.e = false;
            this.t.V(this.j, p0);
            p0.e = z8;
            for(int v53 = 0; v53 < this.m.m(); ++v53) {
                T t3 = RecyclerView.G(this.m.l(v53));
                if(!t3.o()) {
                    b0 b01 = (b0)k0.getOrDefault(t3, null);
                    if(b01 == null || (b01.a & 4) == 0) {
                        D.b(t3);
                        boolean z9 = t3.d(0x2000);
                        D d1 = this.P;
                        t3.c();
                        d1.getClass();
                        h h1 = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
                        h1.a(t3);
                        if(z9) {
                            this.R(t3, h1);
                        }
                        else {
                            b0 b02 = (b0)k0.getOrDefault(t3, null);
                            if(b02 == null) {
                                b02 = b0.a();
                                k0.put(t3, b02);
                            }
                            b02.a |= 2;
                            b02.b = h1;
                        }
                    }
                }
            }
        }
        this.i();
        this.N(true);
        this.Y(false);
        p0.c = 2;
    }

    public final void o() {
        this.X();
        this.M();
        this.j0.a(6);
        this.l.f();
        this.j0.d = this.s.a();
        this.j0.b = 0;
        this.j0.f = false;
        this.t.V(this.j, this.j0);
        this.j0.e = false;
        this.k = null;
        this.j0.i = this.j0.i && this.P != null;
        this.j0.c = 4;
        this.N(true);
        this.Y(false);
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        float f1;
        super.onAttachedToWindow();
        this.I = 0;
        this.x = true;
        this.z = this.z && !this.isLayoutRequested();
        F f0 = this.t;
        if(f0 != null) {
            f0.f = true;
        }
        this.p0 = false;
        ThreadLocal threadLocal0 = p.m;
        p p0 = (p)threadLocal0.get();
        this.h0 = p0;
        if(p0 == null) {
            p p1 = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
            p1.i = new ArrayList();
            p1.l = new ArrayList();
            this.h0 = p1;
            Display display0 = this.getDisplay();
            if(this.isInEditMode() || display0 == null) {
                f1 = 60.0f;
            }
            else {
                f1 = display0.getRefreshRate();
                if(f1 < 30.0f) {
                    f1 = 60.0f;
                }
            }
            p p2 = this.h0;
            p2.k = (long)(1000000000.0f / f1);
            threadLocal0.set(p2);
        }
        this.h0.i.add(this);
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        D d0 = this.P;
        if(d0 != null) {
            d0.e();
        }
        this.setScrollState(0);
        this.g0.o.removeCallbacks(this.g0);
        this.g0.k.abortAnimation();
        this.x = false;
        F f0 = this.t;
        if(f0 != null) {
            f0.f = false;
            f0.L(this);
        }
        this.w0.clear();
        this.removeCallbacks(this.x0);
        this.n.getClass();
        while(b0.d.a() != null) {
        }
        p p0 = this.h0;
        if(p0 != null) {
            p0.i.remove(this);
            this.h0 = null;
        }
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        ArrayList arrayList0 = this.u;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((m)arrayList0.get(v1)).getClass();
        }
    }

    @Override  // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        float f1;
        float f;
        if(this.t == null) {
            return false;
        }
        if(this.C) {
            return false;
        }
        if(motionEvent0.getAction() == 8) {
            if((motionEvent0.getSource() & 2) != 0) {
                f = this.t.d() ? -motionEvent0.getAxisValue(9) : 0.0f;
                f1 = this.t.c() ? motionEvent0.getAxisValue(10) : 0.0f;
            }
            else if((motionEvent0.getSource() & 0x400000) == 0) {
                f = 0.0f;
                f1 = 0.0f;
            }
            else {
                float f2 = motionEvent0.getAxisValue(26);
                if(this.t.d()) {
                    f = -f2;
                    f1 = 0.0f;
                }
                else if(this.t.c()) {
                    f1 = f2;
                    f = 0.0f;
                }
                else {
                    f = 0.0f;
                    f1 = 0.0f;
                }
            }
            if(f != 0.0f || f1 != 0.0f) {
                this.U(((int)(f1 * this.d0)), ((int)(f * this.e0)), motionEvent0);
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        if(this.C) {
            return false;
        }
        this.w = null;
        if(this.A(motionEvent0)) {
            this.T();
            this.setScrollState(0);
            return true;
        }
        F f0 = this.t;
        if(f0 == null) {
            return false;
        }
        boolean z = f0.c();
        boolean z1 = this.t.d();
        if(this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        switch(v) {
            case 0: {
                if(this.D) {
                    this.D = false;
                }
                this.R = motionEvent0.getPointerId(0);
                float f1 = motionEvent0.getX();
                this.V = (int)(f1 + 0.5f);
                this.T = (int)(f1 + 0.5f);
                float f2 = motionEvent0.getY();
                this.W = (int)(f2 + 0.5f);
                this.U = (int)(f2 + 0.5f);
                if(this.Q == 2) {
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    this.setScrollState(1);
                    this.Z(1);
                }
                this.u0[1] = 0;
                this.u0[0] = 0;
                if(z1) {
                    z |= 2;
                }
                this.getScrollingChildHelper().g(((int)z), 0);
                return this.Q == 1;
            }
            case 1: {
                this.S.clear();
                this.Z(0);
                return this.Q == 1;
            }
            case 2: {
                int v2 = motionEvent0.findPointerIndex(this.R);
                if(v2 < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float f3 = motionEvent0.getX(v2);
                float f4 = motionEvent0.getY(v2);
                if(this.Q != 1) {
                    int v3 = ((int)(f4 + 0.5f)) - this.U;
                    if(!z || Math.abs(((int)(f3 + 0.5f)) - this.T) <= this.a0) {
                        z2 = false;
                    }
                    else {
                        this.V = (int)(f3 + 0.5f);
                        z2 = true;
                    }
                    if(z1 && Math.abs(v3) > this.a0) {
                        this.W = (int)(f4 + 0.5f);
                        z2 = true;
                    }
                    if(z2) {
                        this.setScrollState(1);
                        return this.Q == 1;
                    }
                }
                return this.Q == 1;
            }
            case 3: {
                this.T();
                this.setScrollState(0);
                return this.Q == 1;
            }
            case 5: {
                this.R = motionEvent0.getPointerId(v1);
                float f5 = motionEvent0.getX(v1);
                this.V = (int)(f5 + 0.5f);
                this.T = (int)(f5 + 0.5f);
                float f6 = motionEvent0.getY(v1);
                this.W = (int)(f6 + 0.5f);
                this.U = (int)(f6 + 0.5f);
                return this.Q == 1;
            }
            case 6: {
                this.O(motionEvent0);
                return this.Q == 1;
            }
            default: {
                return this.Q == 1;
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        Trace.beginSection("RV OnLayout");
        this.m();
        Trace.endSection();
        this.z = true;
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        F f0 = this.t;
        if(f0 == null) {
            this.l(v, v1);
            return;
        }
        boolean z = f0.G();
        P p0 = this.j0;
        if(z) {
            int v2 = View.MeasureSpec.getMode(v);
            int v3 = View.MeasureSpec.getMode(v1);
            this.t.b.l(v, v1);
            if(v2 == 0x40000000 && v3 == 0x40000000 || this.s == null) {
                return;
            }
            if(p0.c == 1) {
                this.n();
            }
            this.t.j0(v, v1);
            p0.h = true;
            this.o();
            this.t.l0(v, v1);
            if(this.t.o0()) {
                this.t.j0(View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000));
                p0.h = true;
                this.o();
                this.t.l0(v, v1);
            }
        }
        else {
            if(this.y) {
                this.t.b.l(v, v1);
                return;
            }
            if(p0.j) {
                this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
                return;
            }
            z z1 = this.s;
            p0.d = z1 == null ? 0 : z1.a();
            this.X();
            this.t.b.l(v, v1);
            this.Y(false);
            p0.f = false;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int v, Rect rect0) {
        return this.J() ? false : super.onRequestFocusInDescendants(v, rect0);
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        this.k = (SavedState)parcelable0;
        super.onRestoreInstanceState(((SavedState)parcelable0).i);
        F f0 = this.t;
        if(f0 != null) {
            Parcelable parcelable1 = this.k.k;
            if(parcelable1 != null) {
                f0.X(parcelable1);
            }
        }
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        SavedState recyclerView$SavedState0 = this.k;
        if(recyclerView$SavedState0 != null) {
            parcelable0.k = recyclerView$SavedState0.k;
            return parcelable0;
        }
        F f0 = this.t;
        if(f0 != null) {
            parcelable0.k = f0.Y();
            return parcelable0;
        }
        parcelable0.k = null;
        return parcelable0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(v != v2 || v1 != v3) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z6;
        boolean z;
        int v = 0;
        if(!this.C && !this.D) {
            I i0 = this.w;
            if(i0 != null) {
                i0.b(motionEvent0);
                switch(motionEvent0.getAction()) {
                    case 1: 
                    case 3: {
                        this.w = null;
                    }
                }
                z = true;
            }
            else if(motionEvent0.getAction() == 0) {
                z = false;
            }
            else {
                z = this.A(motionEvent0);
            }
            if(z) {
                this.T();
                this.setScrollState(0);
                return true;
            }
            F f0 = this.t;
            if(f0 == null) {
                return false;
            }
            boolean z1 = f0.c();
            boolean z2 = this.t.d();
            if(this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            int v1 = motionEvent0.getActionMasked();
            int v2 = motionEvent0.getActionIndex();
            int[] arr_v = this.u0;
            if(v1 == 0) {
                arr_v[1] = 0;
                arr_v[0] = 0;
            }
            MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
            motionEvent1.offsetLocation(((float)arr_v[0]), ((float)arr_v[1]));
            if(v1 == 0) {
                this.R = motionEvent0.getPointerId(0);
                float f8 = motionEvent0.getX();
                this.V = (int)(f8 + 0.5f);
                this.T = (int)(f8 + 0.5f);
                float f9 = motionEvent0.getY();
                this.W = (int)(f9 + 0.5f);
                this.U = (int)(f9 + 0.5f);
                if(z2) {
                    z1 |= 2;
                }
                this.getScrollingChildHelper().g(((int)z1), 0);
                this.S.addMovement(motionEvent1);
            }
            else {
                switch(v1) {
                    case 1: {
                        this.S.addMovement(motionEvent1);
                        int v3 = this.c0;
                        this.S.computeCurrentVelocity(1000, ((float)v3));
                        float f1 = z1 ? -this.S.getXVelocity(this.R) : 0.0f;
                        float f2 = z2 ? -this.S.getYVelocity(this.R) : 0.0f;
                        if(f1 == 0.0f && f2 == 0.0f) {
                            this.setScrollState(0);
                        }
                        else {
                            int v4 = (int)f1;
                            int v5 = (int)f2;
                            F f3 = this.t;
                            if(f3 == null) {
                                Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                this.setScrollState(0);
                            }
                            else if(this.C) {
                                this.setScrollState(0);
                            }
                            else {
                                boolean z3 = f3.c();
                                boolean z4 = this.t.d();
                                int v6 = this.b0;
                                if(!z3 || Math.abs(v4) < v6) {
                                    v4 = 0;
                                }
                                if(!z4 || Math.abs(v5) < v6) {
                                    v5 = 0;
                                }
                                if(v4 == 0 && v5 == 0 || this.dispatchNestedPreFling(((float)v4), ((float)v5))) {
                                    this.setScrollState(0);
                                }
                                else {
                                    boolean z5 = z3 || z4;
                                    this.dispatchNestedFling(((float)v4), ((float)v5), z5);
                                    if(z5) {
                                        if(z4) {
                                            z3 |= 2;
                                        }
                                        this.getScrollingChildHelper().g(((int)z3), 1);
                                        int v7 = Math.max(-v3, Math.min(v4, v3));
                                        int v8 = Math.max(-v3, Math.min(v5, v3));
                                        S s0 = this.g0;
                                        RecyclerView recyclerView0 = s0.o;
                                        recyclerView0.setScrollState(2);
                                        s0.j = 0;
                                        s0.i = 0;
                                        w w0 = RecyclerView.D0;
                                        if(s0.l != w0) {
                                            s0.l = w0;
                                            s0.k = new OverScroller(recyclerView0.getContext(), w0);
                                        }
                                        s0.k.fling(0, 0, v7, v8, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
                                        if(s0.m) {
                                            s0.n = true;
                                        }
                                        else {
                                            s0.o.removeCallbacks(s0);
                                            s0.o.postOnAnimation(s0);
                                        }
                                    }
                                    else {
                                        this.setScrollState(0);
                                    }
                                }
                            }
                        }
                        this.T();
                        break;
                    }
                    case 2: {
                        int v9 = motionEvent0.findPointerIndex(this.R);
                        if(v9 < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.R + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        float f4 = motionEvent0.getX(v9);
                        float f5 = motionEvent0.getY(v9);
                        int v10 = this.V - ((int)(f4 + 0.5f));
                        int v11 = this.W - ((int)(f5 + 0.5f));
                        if(this.Q != 1) {
                            if(z1) {
                                v10 = v10 <= 0 ? Math.min(0, v10 + this.a0) : Math.max(0, v10 - this.a0);
                                z6 = v10 == 0 ? false : true;
                            }
                            else {
                                z6 = false;
                            }
                            if(z2) {
                                v11 = v11 <= 0 ? Math.min(0, v11 + this.a0) : Math.max(0, v11 - this.a0);
                                if(v11 != 0) {
                                    z6 = true;
                                }
                            }
                            if(z6) {
                                this.setScrollState(1);
                            }
                        }
                        int v12 = v10;
                        int v13 = v11;
                        if(this.Q == 1) {
                            int[] arr_v1 = this.v0;
                            arr_v1[0] = 0;
                            arr_v1[1] = 0;
                            boolean z7 = this.p((z1 ? v12 : 0), (z2 ? v13 : 0), 0, arr_v1, this.t0);
                            int[] arr_v2 = this.t0;
                            if(z7) {
                                v12 -= arr_v1[0];
                                v13 -= arr_v1[1];
                                arr_v[0] += arr_v2[0];
                                arr_v[1] += arr_v2[1];
                                this.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            this.V = ((int)(f4 + 0.5f)) - arr_v2[0];
                            this.W = ((int)(f5 + 0.5f)) - arr_v2[1];
                            if(z2) {
                                v = v13;
                            }
                            if(this.U((z1 ? v12 : 0), v, motionEvent0)) {
                                this.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            p p0 = this.h0;
                            if(p0 != null && (v12 != 0 || v13 != 0)) {
                                p0.a(this, v12, v13);
                            }
                        }
                        this.S.addMovement(motionEvent1);
                        break;
                    }
                    case 3: {
                        this.T();
                        this.setScrollState(0);
                        this.S.addMovement(motionEvent1);
                        break;
                    }
                    case 5: {
                        this.R = motionEvent0.getPointerId(v2);
                        float f6 = motionEvent0.getX(v2);
                        this.V = (int)(f6 + 0.5f);
                        this.T = (int)(f6 + 0.5f);
                        float f7 = motionEvent0.getY(v2);
                        this.W = (int)(f7 + 0.5f);
                        this.U = (int)(f7 + 0.5f);
                        this.S.addMovement(motionEvent1);
                        break;
                    }
                    case 6: {
                        this.O(motionEvent0);
                        this.S.addMovement(motionEvent1);
                        break;
                    }
                    default: {
                        this.S.addMovement(motionEvent1);
                    }
                }
            }
            motionEvent1.recycle();
            return true;
        }
        return false;
    }

    public final boolean p(int v, int v1, int v2, int[] arr_v, int[] arr_v1) {
        return this.getScrollingChildHelper().c(v, v1, v2, arr_v, arr_v1);
    }

    public final void q(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        this.getScrollingChildHelper().d(v, v1, v2, v3, arr_v, v4, arr_v1);
    }

    public final void r(int v, int v1) {
        ++this.J;
        int v2 = this.getScrollX();
        int v3 = this.getScrollY();
        this.onScrollChanged(v2, v3, v2 - v, v3 - v1);
        J j0 = this.k0;
        if(j0 != null) {
            j0.a(this);
        }
        ArrayList arrayList0 = this.l0;
        if(arrayList0 != null) {
            for(int v4 = arrayList0.size() - 1; v4 >= 0; --v4) {
                ((J)this.l0.get(v4)).a(this);
            }
        }
        --this.J;
    }

    @Override  // android.view.ViewGroup
    public final void removeDetachedView(View view0, boolean z) {
        T t0 = RecyclerView.G(view0);
        if(t0 != null) {
            if(t0.j()) {
                t0.i &= 0xFFFFFEFF;
            }
            else if(!t0.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + t0 + this.w());
            }
        }
        view0.clearAnimation();
        RecyclerView.G(view0);
        super.removeDetachedView(view0, z);
    }

    @Override  // android.view.ViewGroup
    public final void requestChildFocus(View view0, View view1) {
        this.t.getClass();
        if(!this.J() && view1 != null) {
            this.S(view0, view1);
        }
        super.requestChildFocus(view0, view1);
    }

    @Override  // android.view.ViewGroup
    public final boolean requestChildRectangleOnScreen(View view0, Rect rect0, boolean z) {
        return this.t.e0(this, view0, rect0, z, false);
    }

    @Override  // android.view.ViewGroup
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList0 = this.v;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((I)arrayList0.get(v1)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override  // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if(this.A == 0 && !this.C) {
            super.requestLayout();
            return;
        }
        this.B = true;
    }

    public final void s() {
        if(this.O != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect0 = new EdgeEffect(this.getContext());
        this.O = edgeEffect0;
        if(this.o) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.view.View
    public final void scrollBy(int v, int v1) {
        F f0 = this.t;
        if(f0 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if(this.C) {
            return;
        }
        boolean z = f0.c();
        boolean z1 = this.t.d();
        if(z || z1) {
            if(!z) {
                v = 0;
            }
            if(!z1) {
                v1 = 0;
            }
            this.U(v, v1, null);
        }
    }

    @Override  // android.view.View
    public final void scrollTo(int v, int v1) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override  // android.view.View
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent0) {
        int v = 0;
        if(this.J()) {
            int v1 = accessibilityEvent0 == null ? 0 : accessibilityEvent0.getContentChangeTypes();
            if(v1 != 0) {
                v = v1;
            }
            this.E |= v;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent0);
    }

    public void setAccessibilityDelegateCompat(V v0) {
        this.q0 = v0;
        q.d(this, v0);
    }

    public void setAdapter(z z0) {
        this.setLayoutFrozen(false);
        z z1 = this.s;
        O o0 = this.i;
        if(z1 != null) {
            z1.a.unregisterObserver(o0);
            this.s.getClass();
        }
        D d0 = this.P;
        if(d0 != null) {
            d0.e();
        }
        F f0 = this.t;
        M m0 = this.j;
        if(f0 != null) {
            f0.a0(m0);
            this.t.b0(m0);
        }
        m0.a.clear();
        m0.d();
        this.l.u(((ArrayList)this.l.k));
        this.l.u(((ArrayList)this.l.l));
        z z2 = this.s;
        this.s = z0;
        if(z0 != null) {
            z0.a.registerObserver(o0);
        }
        z z3 = this.s;
        m0.a.clear();
        m0.d();
        L l0 = m0.c();
        if(z2 != null) {
            --l0.b;
        }
        if(l0.b == 0) {
            for(int v = 0; true; ++v) {
                SparseArray sparseArray0 = l0.a;
                if(v >= sparseArray0.size()) {
                    break;
                }
                ((K)sparseArray0.valueAt(v)).a.clear();
            }
        }
        if(z3 != null) {
            ++l0.b;
        }
        this.j0.e = true;
        this.Q(false);
        this.requestLayout();
    }

    public void setChildDrawingOrderCallback(B b0) {
        if(b0 == null) {
            return;
        }
        this.setChildrenDrawingOrderEnabled(false);
    }

    @Override  // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if(z != this.o) {
            this.O = null;
            this.M = null;
            this.N = null;
            this.L = null;
        }
        this.o = z;
        super.setClipToPadding(z);
        if(this.z) {
            this.requestLayout();
        }
    }

    public void setEdgeEffectFactory(C c0) {
        c0.getClass();
        this.K = c0;
        this.O = null;
        this.M = null;
        this.N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z) {
        this.y = z;
    }

    public void setItemAnimator(D d0) {
        D d1 = this.P;
        if(d1 != null) {
            d1.e();
            this.P.a = null;
        }
        this.P = d0;
        if(d0 != null) {
            d0.a = this.o0;
        }
    }

    public void setItemViewCacheSize(int v) {
        this.j.e = v;
        this.j.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        this.suppressLayout(z);
    }

    public void setLayoutManager(F f0) {
        RecyclerView recyclerView0;
        if(f0 == this.t) {
            return;
        }
        this.setScrollState(0);
        this.g0.o.removeCallbacks(this.g0);
        this.g0.k.abortAnimation();
        M m0 = this.j;
        if(this.t == null) {
            m0.a.clear();
            m0.d();
        }
        else {
            D d0 = this.P;
            if(d0 != null) {
                d0.e();
            }
            this.t.a0(m0);
            this.t.b0(m0);
            m0.a.clear();
            m0.d();
            if(this.x) {
                this.t.f = false;
                this.t.L(this);
            }
            this.t.m0(null);
            this.t = null;
        }
        a a0 = this.m;
        ((N.b)a0.k).g();
        ArrayList arrayList0 = (ArrayList)a0.l;
        for(int v1 = arrayList0.size() - 1; true; --v1) {
            recyclerView0 = ((y)a0.j).a;
            if(v1 < 0) {
                break;
            }
            T t0 = RecyclerView.G(((View)arrayList0.get(v1)));
            if(t0 != null) {
                int v2 = t0.o;
                if(recyclerView0.J()) {
                    t0.p = v2;
                    recyclerView0.w0.add(t0);
                }
                else {
                    t0.a.setImportantForAccessibility(v2);
                }
                t0.o = 0;
            }
            arrayList0.remove(v1);
        }
        int v3 = recyclerView0.getChildCount();
        for(int v = 0; v < v3; ++v) {
            View view0 = recyclerView0.getChildAt(v);
            RecyclerView.G(view0);
            view0.clearAnimation();
        }
        recyclerView0.removeAllViews();
        this.t = f0;
        if(f0 != null) {
            if(f0.b != null) {
                throw new IllegalArgumentException("LayoutManager " + f0 + " is already attached to a RecyclerView:" + f0.b.w());
            }
            f0.m0(this);
            if(this.x) {
                this.t.f = true;
            }
        }
        m0.k();
        this.requestLayout();
    }

    @Override  // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition0) {
        if(layoutTransition0 != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override  // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        e e0 = this.getScrollingChildHelper();
        if(e0.d) {
            e0.c.stopNestedScroll();
        }
        e0.d = z;
    }

    public void setOnFlingListener(H h0) {
    }

    @Deprecated
    public void setOnScrollListener(J j0) {
        this.k0 = j0;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f0 = z;
    }

    public void setRecycledViewPool(L l0) {
        M m0 = this.j;
        L l1 = m0.g;
        if(l1 != null) {
            --l1.b;
        }
        m0.g = l0;
        if(l0 != null && m0.h.getAdapter() != null) {
            ++m0.g.b;
        }
    }

    public void setRecyclerListener(N n0) {
    }

    public void setScrollState(int v) {
        if(v == this.Q) {
            return;
        }
        this.Q = v;
        if(v != 2) {
            this.g0.o.removeCallbacks(this.g0);
            this.g0.k.abortAnimation();
        }
        F f0 = this.t;
        if(f0 != null) {
            f0.Z(v);
        }
        ArrayList arrayList0 = this.l0;
        if(arrayList0 != null) {
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                ((J)this.l0.get(v1)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int v) {
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                this.a0 = viewConfiguration0.getScaledPagingTouchSlop();
                return;
            }
            default: {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + v + "; using default value");
                break;
            }
        }
        this.a0 = viewConfiguration0.getScaledTouchSlop();
    }

    public void setViewCacheExtension(Q q0) {
        this.j.getClass();
    }

    @Override  // android.view.View
    public final boolean startNestedScroll(int v) {
        return this.getScrollingChildHelper().g(v, 0);
    }

    @Override  // android.view.View
    public final void stopNestedScroll() {
        this.getScrollingChildHelper().h(0);
    }

    @Override  // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if(z != this.C) {
            this.g("Do not suppressLayout in layout or scroll");
            if(!z) {
                this.C = false;
                if(this.B && this.t != null && this.s != null) {
                    this.requestLayout();
                }
                this.B = false;
                return;
            }
            long v = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0));
            this.C = true;
            this.D = true;
            this.setScrollState(0);
            this.g0.o.removeCallbacks(this.g0);
            this.g0.k.abortAnimation();
        }
    }

    public final void t() {
        if(this.L != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect0 = new EdgeEffect(this.getContext());
        this.L = edgeEffect0;
        if(this.o) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public final void u() {
        if(this.N != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect0 = new EdgeEffect(this.getContext());
        this.N = edgeEffect0;
        if(this.o) {
            edgeEffect0.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public final void v() {
        if(this.M != null) {
            return;
        }
        this.K.getClass();
        EdgeEffect edgeEffect0 = new EdgeEffect(this.getContext());
        this.M = edgeEffect0;
        if(this.o) {
            edgeEffect0.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect0.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public final String w() {
        return " " + super.toString() + ", adapter:" + this.s + ", layout:" + this.t + ", context:" + this.getContext();
    }

    public final void x(P p0) {
        if(this.getScrollState() == 2) {
            OverScroller overScroller0 = this.g0.k;
            overScroller0.getFinalX();
            overScroller0.getCurrX();
            p0.getClass();
            overScroller0.getFinalY();
            overScroller0.getCurrY();
            return;
        }
        p0.getClass();
    }

    public final View y(float f, float f1) {
        for(int v = this.m.m() - 1; v >= 0; --v) {
            View view0 = this.m.l(v);
            float f2 = view0.getTranslationX();
            float f3 = view0.getTranslationY();
            if(f >= ((float)view0.getLeft()) + f2 && f <= ((float)view0.getRight()) + f2 && f1 >= ((float)view0.getTop()) + f3 && f1 <= ((float)view0.getBottom()) + f3) {
                return view0;
            }
        }
        return null;
    }

    public final View z(View view0) {
        ViewParent viewParent0;
        for(viewParent0 = view0.getParent(); viewParent0 != null && viewParent0 != this && viewParent0 instanceof View; viewParent0 = view0.getParent()) {
            view0 = (View)viewParent0;
        }
        return viewParent0 == this ? view0 : null;
    }
}

