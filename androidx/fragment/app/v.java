package androidx.fragment.app;

import A.f;
import B.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.activity.g;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.savedstate.d;
import f.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jeb.synthetic.FIN;
import p.c;
import q.e;

public final class v extends l implements LayoutInflater.Factory2 {
    public h A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public ArrayList H;
    public ArrayList I;
    public Bundle J;
    public SparseArray K;
    public ArrayList L;
    public x M;
    public final b N;
    public static final DecelerateInterpolator O;
    public static final DecelerateInterpolator P;
    public ArrayList k;
    public boolean l;
    public int m;
    public final ArrayList n;
    public final HashMap o;
    public ArrayList p;
    public ArrayList q;
    public g r;
    public final m s;
    public ArrayList t;
    public ArrayList u;
    public final CopyOnWriteArrayList v;
    public int w;
    public i x;
    public r y;
    public h z;

    static {
        v.O = new DecelerateInterpolator(2.5f);
        v.P = new DecelerateInterpolator(1.5f);
    }

    public v() {
        this.i = null;
        this.m = 0;
        this.n = new ArrayList();
        this.o = new HashMap();
        this.s = new m(this);
        this.v = new CopyOnWriteArrayList();
        this.w = 0;
        this.J = null;
        this.K = null;
        this.N = new b(this, 17);
    }

    public final void A(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).A(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final boolean B(MenuItem menuItem0) {
        if(this.w < 1) {
            return false;
        }
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.n;
            if(v >= arrayList0.size()) {
                break;
            }
            h h0 = (h)arrayList0.get(v);
            if(h0 != null && !h0.G && h0.B.B(menuItem0)) {
                return true;
            }
        }
        return false;
    }

    public final void C(Menu menu0) {
        if(this.w < 1) {
            return;
        }
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.n;
            if(v >= arrayList0.size()) {
                break;
            }
            h h0 = (h)arrayList0.get(v);
            if(h0 != null && !h0.G) {
                h0.B.C(menu0);
            }
        }
    }

    public final void D(h h0) {
        if(h0 != null && this.o.get(h0.m) == h0) {
            h0.z.getClass();
            boolean z = v.R(h0);
            if(h0.r == null || h0.r.booleanValue() != z) {
                h0.r = Boolean.valueOf(z);
                v v0 = h0.B;
                v0.l0();
                v0.D(v0.A);
            }
        }
    }

    public final boolean E(Menu menu0) {
        if(this.w < 1) {
            return false;
        }
        boolean z = false;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.n;
            if(v >= arrayList0.size()) {
                break;
            }
            boolean z1 = false;
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                if(!h0.G) {
                    if(h0.K && h0.L) {
                        z1 = true;
                    }
                    z1 |= h0.B.E(menu0);
                }
                if(z1) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void F(int v) {
        try {
            this.l = true;
            this.X(v, false);
        }
        finally {
            this.l = false;
        }
        this.J();
    }

    public final void G(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        String s2;
        String s1 = e.b(s, "    ");
        if(!this.o.isEmpty()) {
            printWriter0.print(s);
            printWriter0.print("Active Fragments in ");
            printWriter0.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter0.println(":");
            for(Object object0: this.o.values()) {
                h h0 = (h)object0;
                printWriter0.print(s);
                printWriter0.println(h0);
                if(h0 != null) {
                    h0.dump(s1, fileDescriptor0, printWriter0, arr_s);
                }
            }
        }
        int v = this.n.size();
        if(v > 0) {
            printWriter0.print(s);
            printWriter0.println("Added Fragments:");
            for(int v2 = 0; v2 < v; ++v2) {
                h h1 = (h)this.n.get(v2);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(v2);
                printWriter0.print(": ");
                printWriter0.println(h1.toString());
            }
        }
        ArrayList arrayList0 = this.q;
        if(arrayList0 != null) {
            int v3 = arrayList0.size();
            if(v3 > 0) {
                printWriter0.print(s);
                printWriter0.println("Fragments Created Menus:");
                for(int v4 = 0; v4 < v3; ++v4) {
                    h h2 = (h)this.q.get(v4);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v4);
                    printWriter0.print(": ");
                    printWriter0.println(h2.toString());
                }
            }
        }
        ArrayList arrayList1 = this.p;
        if(arrayList1 != null) {
            int v5 = arrayList1.size();
            if(v5 > 0) {
                printWriter0.print(s);
                printWriter0.println("Back Stack:");
                for(int v6 = 0; v6 < v5; ++v6) {
                    a a0 = (a)this.p.get(v6);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v6);
                    printWriter0.print(": ");
                    printWriter0.println(a0.toString());
                    printWriter0.print(s1);
                    printWriter0.print("mName=");
                    printWriter0.print(a0.i);
                    printWriter0.print(" mIndex=");
                    printWriter0.print(a0.s);
                    printWriter0.print(" mCommitted=");
                    printWriter0.println(a0.r);
                    if(a0.f != 0) {
                        printWriter0.print(s1);
                        printWriter0.print("mTransition=#");
                        printWriter0.print(Integer.toHexString(a0.f));
                        printWriter0.print(" mTransitionStyle=#");
                        printWriter0.println(Integer.toHexString(a0.g));
                    }
                    if(a0.b != 0 || a0.c != 0) {
                        printWriter0.print(s1);
                        printWriter0.print("mEnterAnim=#");
                        printWriter0.print(Integer.toHexString(a0.b));
                        printWriter0.print(" mExitAnim=#");
                        printWriter0.println(Integer.toHexString(a0.c));
                    }
                    if(a0.d != 0 || a0.e != 0) {
                        printWriter0.print(s1);
                        printWriter0.print("mPopEnterAnim=#");
                        printWriter0.print(Integer.toHexString(a0.d));
                        printWriter0.print(" mPopExitAnim=#");
                        printWriter0.println(Integer.toHexString(a0.e));
                    }
                    if(a0.j != 0 || a0.k != null) {
                        printWriter0.print(s1);
                        printWriter0.print("mBreadCrumbTitleRes=#");
                        printWriter0.print(Integer.toHexString(a0.j));
                        printWriter0.print(" mBreadCrumbTitleText=");
                        printWriter0.println(a0.k);
                    }
                    if(a0.l != 0 || a0.m != null) {
                        printWriter0.print(s1);
                        printWriter0.print("mBreadCrumbShortTitleRes=#");
                        printWriter0.print(Integer.toHexString(a0.l));
                        printWriter0.print(" mBreadCrumbShortTitleText=");
                        printWriter0.println(a0.m);
                    }
                    ArrayList arrayList2 = a0.a;
                    if(!arrayList2.isEmpty()) {
                        printWriter0.print(s1);
                        printWriter0.println("Operations:");
                        int v7 = arrayList2.size();
                        for(int v8 = 0; v8 < v7; ++v8) {
                            y y0 = (y)arrayList2.get(v8);
                            switch(y0.a) {
                                case 0: {
                                    s2 = "NULL";
                                    break;
                                }
                                case 1: {
                                    s2 = "ADD";
                                    break;
                                }
                                case 2: {
                                    s2 = "REPLACE";
                                    break;
                                }
                                case 3: {
                                    s2 = "REMOVE";
                                    break;
                                }
                                case 4: {
                                    s2 = "HIDE";
                                    break;
                                }
                                case 5: {
                                    s2 = "SHOW";
                                    break;
                                }
                                case 6: {
                                    s2 = "DETACH";
                                    break;
                                }
                                case 7: {
                                    s2 = "ATTACH";
                                    break;
                                }
                                case 8: {
                                    s2 = "SET_PRIMARY_NAV";
                                    break;
                                }
                                case 9: {
                                    s2 = "UNSET_PRIMARY_NAV";
                                    break;
                                }
                                case 10: {
                                    s2 = "OP_SET_MAX_LIFECYCLE";
                                    break;
                                }
                                default: {
                                    s2 = "cmd=" + y0.a;
                                }
                            }
                            printWriter0.print(s1);
                            printWriter0.print("  Op #");
                            printWriter0.print(v8);
                            printWriter0.print(": ");
                            printWriter0.print(s2);
                            printWriter0.print(" ");
                            printWriter0.println(y0.b);
                            if(y0.c != 0 || y0.d != 0) {
                                printWriter0.print(s1);
                                printWriter0.print("enterAnim=#");
                                printWriter0.print(Integer.toHexString(y0.c));
                                printWriter0.print(" exitAnim=#");
                                printWriter0.println(Integer.toHexString(y0.d));
                            }
                            if(y0.e != 0 || y0.f != 0) {
                                printWriter0.print(s1);
                                printWriter0.print("popEnterAnim=#");
                                printWriter0.print(Integer.toHexString(y0.e));
                                printWriter0.print(" popExitAnim=#");
                                printWriter0.println(Integer.toHexString(y0.f));
                            }
                        }
                    }
                }
            }
        }
        synchronized(this) {
            ArrayList arrayList3 = this.t;
            if(arrayList3 != null) {
                int v10 = arrayList3.size();
                if(v10 > 0) {
                    printWriter0.print(s);
                    printWriter0.println("Back Stack Indices:");
                    for(int v11 = 0; v11 < v10; ++v11) {
                        a a1 = (a)this.t.get(v11);
                        printWriter0.print(s);
                        printWriter0.print("  #");
                        printWriter0.print(v11);
                        printWriter0.print(": ");
                        printWriter0.println(a1);
                    }
                }
            }
            if(this.u != null && this.u.size() > 0) {
                printWriter0.print(s);
                printWriter0.print("mAvailBackStackIndices: ");
                printWriter0.println(Arrays.toString(this.u.toArray()));
            }
        }
        ArrayList arrayList4 = this.k;
        if(arrayList4 != null) {
            int v12 = arrayList4.size();
            if(v12 > 0) {
                printWriter0.print(s);
                printWriter0.println("Pending Actions:");
                for(int v1 = 0; v1 < v12; ++v1) {
                    s s3 = (s)this.k.get(v1);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v1);
                    printWriter0.print(": ");
                    printWriter0.println(s3);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("FragmentManager misc state:");
        printWriter0.print(s);
        printWriter0.print("  mHost=");
        printWriter0.println(this.x);
        printWriter0.print(s);
        printWriter0.print("  mContainer=");
        printWriter0.println(this.y);
        if(this.z != null) {
            printWriter0.print(s);
            printWriter0.print("  mParent=");
            printWriter0.println(this.z);
        }
        printWriter0.print(s);
        printWriter0.print("  mCurState=");
        printWriter0.print(this.w);
        printWriter0.print(" mStateSaved=");
        printWriter0.print(this.C);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.D);
        printWriter0.print(" mDestroyed=");
        printWriter0.println(this.E);
        if(this.B) {
            printWriter0.print(s);
            printWriter0.print("  mNeedMenuInvalidate=");
            printWriter0.println(this.B);
        }
    }

    public final void H(s s0, boolean z) {
        if(!z && this.S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        synchronized(this) {
            if(!this.E && this.x != null) {
                if(this.k == null) {
                    this.k = new ArrayList();
                }
                this.k.add(s0);
                this.g0();
                return;
            }
            if(z) {
                return;
            }
        }
        throw new IllegalStateException("Activity has been destroyed");
    }

    public final void I(boolean z) {
        if(this.l) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if(this.x == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if(Looper.myLooper() == this.x.l.getLooper()) {
            if(!z && this.S()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
            if(this.G == null) {
                this.G = new ArrayList();
                this.H = new ArrayList();
            }
            try {
                this.l = true;
                this.L(null, null);
                this.l = false;
                return;
            }
            catch(Throwable throwable0) {
                this.l = false;
                throw throwable0;
            }
        }
        throw new IllegalStateException("Must be called from main thread of fragment host");
    }

    public final boolean J() {
        boolean z1;
        this.I(true);
        boolean z;
        for(z = false; true; z = true) {
            ArrayList arrayList0 = this.G;
            ArrayList arrayList1 = this.H;
            __monitor_enter(this);
            int v = FIN.finallyOpen$NT();
            if(this.k == null || this.k.size() == 0) {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
                z1 = false;
            }
            else {
                int v1 = this.k.size();
                z1 = false;
                for(int v2 = 0; v2 < v1; ++v2) {
                    z1 |= ((s)this.k.get(v2)).a(arrayList0, arrayList1);
                }
                this.k.clear();
                this.x.l.removeCallbacks(this.N);
                FIN.finallyExec$NT(v);
            }
            if(!z1) {
                break;
            }
            try {
                this.l = true;
                this.c0(this.G, this.H);
            }
            finally {
                this.f();
            }
        }
        this.l0();
        if(this.F) {
            this.F = false;
            for(Object object0: this.o.values()) {
                h h0 = (h)object0;
                if(h0 == null || !h0.Q) {
                }
                else if(this.l) {
                    this.F = true;
                }
                else {
                    h0.Q = false;
                    this.Y(h0, this.w, 0, 0, false);
                }
            }
        }
        this.o.values().removeAll(Collections.singleton(null));
        return z;
    }

    public final void K(ArrayList arrayList0, ArrayList arrayList1, int v, int v1) {
        int v15;
        int v9;
        boolean z = ((a)arrayList0.get(v)).p;
        ArrayList arrayList2 = this.I;
        if(arrayList2 == null) {
            this.I = new ArrayList();
        }
        else {
            arrayList2.clear();
        }
        this.I.addAll(this.n);
        h h0 = this.A;
        int v2 = v;
        boolean z1 = false;
        while(v2 < v1) {
            a a0 = (a)arrayList0.get(v2);
            if(((Boolean)arrayList1.get(v2)).booleanValue()) {
                ArrayList arrayList5 = this.I;
                ArrayList arrayList6 = a0.a;
                for(int v6 = arrayList6.size() - 1; v6 >= 0; --v6) {
                    y y2 = (y)arrayList6.get(v6);
                    switch(y2.a) {
                        case 3: 
                        case 6: {
                            arrayList5.add(y2.b);
                            break;
                        }
                        case 1: 
                        case 7: {
                            arrayList5.remove(y2.b);
                            break;
                        }
                        case 8: {
                            h0 = null;
                            break;
                        }
                        case 9: {
                            h0 = y2.b;
                            break;
                        }
                        case 10: {
                            y2.h = y2.g;
                        }
                    }
                }
            }
            else {
                ArrayList arrayList3 = this.I;
                for(int v3 = 0; true; ++v3) {
                    ArrayList arrayList4 = a0.a;
                    if(v3 >= arrayList4.size()) {
                        break;
                    }
                    y y0 = (y)arrayList4.get(v3);
                    switch(y0.a) {
                        case 2: {
                            h h1 = y0.b;
                            int v4 = h1.E;
                            int v5 = arrayList3.size() - 1;
                            boolean z2 = false;
                            while(v5 >= 0) {
                                h h2 = (h)arrayList3.get(v5);
                                if(h2.E == v4) {
                                    if(h2 == h1) {
                                        z2 = true;
                                    }
                                    else {
                                        if(h2 == h0) {
                                            arrayList4.add(v3, new y(h2, 9));
                                            ++v3;
                                            h0 = null;
                                        }
                                        y y1 = new y(h2, 3);
                                        y1.c = y0.c;
                                        y1.e = y0.e;
                                        y1.d = y0.d;
                                        y1.f = y0.f;
                                        arrayList4.add(v3, y1);
                                        arrayList3.remove(h2);
                                        ++v3;
                                    }
                                }
                                --v5;
                            }
                            if(z2) {
                                arrayList4.remove(v3);
                                --v3;
                            }
                            else {
                                y0.a = 1;
                                arrayList3.add(h1);
                            }
                            break;
                        }
                        case 3: 
                        case 6: {
                            arrayList3.remove(y0.b);
                            h h3 = y0.b;
                            if(h3 == h0) {
                                arrayList4.add(v3, new y(h3, 9));
                                ++v3;
                                h0 = null;
                            }
                            break;
                        }
                        case 1: 
                        case 7: {
                            arrayList3.add(y0.b);
                            break;
                        }
                        case 8: {
                            arrayList4.add(v3, new y(h0, 9));
                            ++v3;
                            h0 = y0.b;
                        }
                    }
                }
            }
            z1 = z1 || a0.h;
            ++v2;
        }
        this.I.clear();
        if(!z) {
            E.l(this, arrayList0, arrayList1, v, v1, false);
        }
        for(int v7 = v; v7 < v1; ++v7) {
            a a1 = (a)arrayList0.get(v7);
            if(((Boolean)arrayList1.get(v7)).booleanValue()) {
                a1.d(-1);
                a1.g(v7 == v1 - 1);
            }
            else {
                a1.d(1);
                a1.f();
            }
        }
        if(z) {
            c c0 = new c(0);
            this.b(c0);
            int v8 = v1 - 1;
            v9 = v;
            int v10 = v1;
            while(v8 >= v9) {
                a a2 = (a)arrayList0.get(v8);
                boolean z3 = ((Boolean)arrayList1.get(v8)).booleanValue();
                for(int v11 = 0; true; ++v11) {
                    ArrayList arrayList7 = a2.a;
                    if(v11 >= arrayList7.size()) {
                        break;
                    }
                    if(a.j(((y)arrayList7.get(v11)))) {
                        if(!a2.i(arrayList0, v8 + 1, v1)) {
                            if(this.L == null) {
                                this.L = new ArrayList();
                            }
                            u u0 = new u(a2, z3);
                            this.L.add(u0);
                            for(int v12 = 0; true; ++v12) {
                                ArrayList arrayList8 = a2.a;
                                if(v12 >= arrayList8.size()) {
                                    break;
                                }
                                y y3 = (y)arrayList8.get(v12);
                                if(a.j(y3)) {
                                    y3.b.j(u0);
                                }
                            }
                            if(z3) {
                                a2.f();
                            }
                            else {
                                a2.g(false);
                            }
                            --v10;
                            if(v8 != v10) {
                                arrayList0.remove(v8);
                                arrayList0.add(v10, a2);
                            }
                            this.b(c0);
                        }
                        break;
                    }
                }
                --v8;
            }
            int v14 = c0.k;
            for(int v13 = 0; v13 < v14; ++v13) {
                h h4 = (h)c0.j[v13];
                if(!h4.s) {
                    View view0 = h4.requireView();
                    h4.W = view0.getAlpha();
                    view0.setAlpha(0.0f);
                }
            }
            v15 = v10;
        }
        else {
            v9 = v;
            v15 = v1;
        }
        if(v15 != v9 && z) {
            E.l(this, arrayList0, arrayList1, v, v15, true);
            this.X(this.w, true);
        }
        while(v9 < v1) {
            a a3 = (a)arrayList0.get(v9);
            if(((Boolean)arrayList1.get(v9)).booleanValue()) {
                int v16 = a3.s;
                if(v16 >= 0) {
                    synchronized(this) {
                        this.t.set(v16, null);
                        if(this.u == null) {
                            this.u = new ArrayList();
                        }
                        this.u.add(v16);
                    }
                    a3.s = -1;
                }
            }
            a3.getClass();
            ++v9;
        }
    }

    public final void L(ArrayList arrayList0, ArrayList arrayList1) {
        int v = this.L == null ? 0 : this.L.size();
        for(int v1 = 0; v1 < v; ++v1) {
            u u0 = (u)this.L.get(v1);
            if(arrayList0 == null || u0.a) {
                a a1 = u0.b;
                if(u0.c == 0 || arrayList0 != null && a1.i(arrayList0, 0, arrayList0.size())) {
                    this.L.remove(v1);
                    --v1;
                    --v;
                    if(arrayList0 != null && !u0.a) {
                        int v3 = arrayList0.indexOf(a1);
                        if(v3 != -1 && ((Boolean)arrayList1.get(v3)).booleanValue()) {
                            a1.q.g(a1, false, false, false);
                            continue;
                        }
                    }
                    u0.a();
                }
            }
            else {
                a a0 = u0.b;
                int v2 = arrayList0.indexOf(a0);
                if(v2 != -1 && ((Boolean)arrayList1.get(v2)).booleanValue()) {
                    this.L.remove(v1);
                    --v1;
                    --v;
                    a0.q.g(a0, u0.a, false, false);
                }
            }
        }
    }

    public final h M(int v) {
        ArrayList arrayList0 = this.n;
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            h h0 = (h)arrayList0.get(v1);
            if(h0 != null && h0.D == v) {
                return h0;
            }
        }
        for(Object object0: this.o.values()) {
            h h1 = (h)object0;
            if(h1 != null && h1.D == v) {
                return h1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final h N(String s) {
        ArrayList arrayList0 = this.n;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            h h0 = (h)arrayList0.get(v);
            if(h0 != null && s.equals(h0.F)) {
                return h0;
            }
        }
        for(Object object0: this.o.values()) {
            h h1 = (h)object0;
            if(h1 != null && s.equals(h1.F)) {
                return h1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final h O(String s) {
        for(Object object0: this.o.values()) {
            h h0 = (h)object0;
            if(h0 != null) {
                if(!s.equals(h0.m)) {
                    h0 = h0.B.O(s);
                }
                if(h0 != null) {
                    return h0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public final k P() {
        k k0 = l.j;
        if(this.i == null) {
            this.i = k0;
        }
        if(this.i == k0) {
            h h0 = this.z;
            if(h0 != null) {
                return h0.z.P();
            }
            this.i = new p(this);
        }
        if(this.i == null) {
            this.i = k0;
        }
        return this.i;
    }

    public static boolean Q(h h0) {
        if(!h0.K || !h0.L) {
            boolean z = false;
            for(Object object0: h0.B.o.values()) {
                h h1 = (h)object0;
                if(h1 != null) {
                    z = v.Q(h1);
                }
                if(!z) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    // 去混淆评级： 低(30)
    public static boolean R(h h0) {
        return h0 == null ? true : h0 == h0.z.A && v.R(h0.z.z);
    }

    // 去混淆评级： 低(20)
    public final boolean S() {
        return this.C || this.D;
    }

    public final B.c T(h h0, int v, boolean z, int v1) {
        int v3;
        int v2 = h0.S == null ? 0 : h0.S.d;
        h0.i(0);
        if(h0.N != null && h0.N.getLayoutTransition() != null) {
            return null;
        }
        if(v2 != 0) {
            boolean z1 = "anim".equals(this.x.k.getResources().getResourceTypeName(v2));
            if(z1) {
                try {
                    Animation animation0 = AnimationUtils.loadAnimation(this.x.k, v2);
                    if(animation0 != null) {
                        return new B.c(animation0);
                    }
                    goto label_21;
                }
                catch(Resources.NotFoundException resources$NotFoundException0) {
                }
                catch(RuntimeException unused_ex) {
                    goto label_12;
                }
                throw resources$NotFoundException0;
            }
            else {
                try {
                label_12:
                    Animator animator0 = AnimatorInflater.loadAnimator(this.x.k, v2);
                    if(animator0 != null) {
                        return new B.c(animator0);
                    }
                }
                catch(RuntimeException runtimeException0) {
                    if(z1) {
                        throw runtimeException0;
                    }
                    Animation animation1 = AnimationUtils.loadAnimation(this.x.k, v2);
                    if(animation1 != null) {
                        return new B.c(animation1);
                    }
                }
            }
        }
    label_21:
        if(v == 0) {
            return null;
        }
        switch(v) {
            case 0x1001: {
                v3 = z ? 1 : 2;
                break;
            }
            case 0x1003: {
                v3 = z ? 5 : 6;
                break;
            }
            case 0x2002: {
                v3 = z ? 3 : 4;
                break;
            }
            default: {
                v3 = -1;
            }
        }
        if(v3 < 0) {
            return null;
        }
        DecelerateInterpolator decelerateInterpolator0 = v.P;
        switch(v3) {
            case 1: {
                return v.V(1.125f, 1.0f, 0.0f, 1.0f);
            }
            case 2: {
                return v.V(1.0f, 0.975f, 1.0f, 0.0f);
            }
            case 3: {
                return v.V(0.975f, 1.0f, 0.0f, 1.0f);
            }
            case 4: {
                return v.V(1.0f, 1.075f, 1.0f, 0.0f);
            }
            case 5: {
                AlphaAnimation alphaAnimation0 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation0.setInterpolator(decelerateInterpolator0);
                alphaAnimation0.setDuration(220L);
                return new B.c(alphaAnimation0);
            }
            case 6: {
                AlphaAnimation alphaAnimation1 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation1.setInterpolator(decelerateInterpolator0);
                alphaAnimation1.setDuration(220L);
                return new B.c(alphaAnimation1);
            }
            default: {
                if(v1 == 0 && this.x.n.getWindow() != null) {
                    Window window0 = this.x.n.getWindow();
                    if(window0 != null) {
                        window0.getAttributes();
                    }
                }
                return null;
            }
        }
    }

    public final void U(h h0) {
        HashMap hashMap0 = this.o;
        if(hashMap0.get(h0.m) != null) {
            return;
        }
        hashMap0.put(h0.m, h0);
        if(h0.J) {
            if(!h0.I) {
                if(!this.S()) {
                    this.M.b.remove(h0);
                }
            }
            else if(!this.S()) {
                this.M.b.add(h0);
            }
            h0.J = false;
        }
    }

    public static B.c V(float f, float f1, float f2, float f3) {
        AnimationSet animationSet0 = new AnimationSet(false);
        ScaleAnimation scaleAnimation0 = new ScaleAnimation(f, f1, f, f1, 1, 0.5f, 1, 0.5f);
        scaleAnimation0.setInterpolator(v.O);
        scaleAnimation0.setDuration(220L);
        animationSet0.addAnimation(scaleAnimation0);
        AlphaAnimation alphaAnimation0 = new AlphaAnimation(f2, f3);
        alphaAnimation0.setInterpolator(v.P);
        alphaAnimation0.setDuration(220L);
        animationSet0.addAnimation(alphaAnimation0);
        return new B.c(animationSet0);
    }

    public final void W(h h0) {
        if(h0 == null) {
            return;
        }
        if(!this.o.containsKey(h0.m)) {
            return;
        }
        int v = this.w;
        if(h0.t) {
            v = h0.y <= 0 ? Math.min(v, 0) : Math.min(v, 1);
        }
        this.Y(h0, v, (h0.S == null ? 0 : h0.S.e), (h0.S == null ? 0 : h0.S.f), false);
        if(h0.O != null) {
            ViewGroup viewGroup0 = h0.N;
            h h1 = null;
            if(viewGroup0 != null) {
                ArrayList arrayList0 = this.n;
                for(int v1 = arrayList0.indexOf(h0) - 1; v1 >= 0; --v1) {
                    h h2 = (h)arrayList0.get(v1);
                    if(h2.N == viewGroup0 && h2.O != null) {
                        h1 = h2;
                        break;
                    }
                }
            }
            if(h1 != null) {
                ViewGroup viewGroup1 = h0.N;
                int v2 = viewGroup1.indexOfChild(h1.O);
                int v3 = viewGroup1.indexOfChild(h0.O);
                if(v3 < v2) {
                    viewGroup1.removeViewAt(v3);
                    viewGroup1.addView(h0.O, v2);
                }
            }
            if(h0.U && h0.N != null) {
                float f = h0.W;
                if(f > 0.0f) {
                    h0.O.setAlpha(f);
                }
                h0.W = 0.0f;
                h0.U = false;
                B.c c0 = this.T(h0, (h0.S == null ? 0 : h0.S.e), true, (h0.S == null ? 0 : h0.S.f));
                if(c0 != null) {
                    Animation animation0 = (Animation)c0.j;
                    if(animation0 == null) {
                        View view0 = h0.O;
                        Animator animator0 = (Animator)c0.k;
                        animator0.setTarget(view0);
                        animator0.start();
                    }
                    else {
                        h0.O.startAnimation(animation0);
                    }
                }
            }
        }
        if(h0.V) {
            if(h0.O != null) {
                B.c c1 = this.T(h0, (h0.S == null ? 0 : h0.S.e), !h0.G, (h0.S == null ? 0 : h0.S.f));
                if(c1 == null) {
                label_63:
                    if(c1 != null) {
                        View view2 = h0.O;
                        Animation animation1 = (Animation)c1.j;
                        view2.startAnimation(animation1);
                        animation1.start();
                    }
                    h0.O.setVisibility((!h0.G || (h0.S == null ? false : h0.S.q) ? 0 : 8));
                    if((h0.S == null ? false : h0.S.q)) {
                        h0.b().q = false;
                    }
                }
                else {
                    Animator animator1 = (Animator)c1.k;
                    if(animator1 != null) {
                        animator1.setTarget(h0.O);
                        if(!h0.G) {
                            h0.O.setVisibility(0);
                        }
                        else if((h0.S == null ? false : h0.S.q)) {
                            h0.b().q = false;
                        }
                        else {
                            ViewGroup viewGroup2 = h0.N;
                            View view1 = h0.O;
                            viewGroup2.startViewTransition(view1);
                            animator1.addListener(new o(viewGroup2, view1, h0));
                        }
                        animator1.start();
                        goto label_71;
                    }
                    goto label_63;
                }
            }
        label_71:
            if(h0.s && v.Q(h0)) {
                this.B = true;
            }
            h0.V = false;
        }
    }

    public final void X(int v, boolean z) {
        if(this.x == null && v != 0) {
            throw new IllegalStateException("No activity");
        }
        if(!z && v == this.w) {
            return;
        }
        this.w = v;
        ArrayList arrayList0 = this.n;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            this.W(((h)arrayList0.get(v2)));
        }
        HashMap hashMap0 = this.o;
        for(Object object0: hashMap0.values()) {
            h h0 = (h)object0;
            if(h0 != null && (h0.t || h0.H) && !h0.U) {
                this.W(h0);
            }
        }
        for(Object object1: hashMap0.values()) {
            h h1 = (h)object1;
            if(h1 == null || !h1.Q) {
            }
            else if(this.l) {
                this.F = true;
            }
            else {
                h1.Q = false;
                this.Y(h1, this.w, 0, 0, false);
            }
        }
        if(this.B) {
            i i0 = this.x;
            if(i0 != null && this.w == 4) {
                t t0 = (t)((f.h)i0.n).i();
                t0.t();
                t0.u(0);
                this.B = false;
            }
        }
    }

    public final void Y(h h0, int v, int v1, int v2, boolean z) {
        boolean z2;
        boolean z3;
        String s3;
        ViewGroup viewGroup0;
        h h1;
        int v4;
        int v3 = 1;
        if(h0.s && !h0.H) {
            v4 = v;
        }
        else {
            v4 = v;
            if(v4 > 1) {
                v4 = 1;
            }
        }
        if(h0.t) {
            int v5 = h0.i;
            if(v4 > v5) {
                v4 = v5 != 0 || h0.y <= 0 ? v5 : 1;
            }
        }
        if(h0.Q && h0.i < 3 && v4 > 2) {
            v4 = 2;
        }
        int v6 = h0.Z == androidx.lifecycle.h.k ? Math.min(v4, 1) : Math.min(v4, h0.Z.ordinal());
        int v7 = h0.i;
        HashMap hashMap0 = this.o;
        if(v7 <= v6) {
            if(h0.u && !h0.v) {
                return;
            }
            if(h0.c() != null || h0.d() != null) {
                h0.b().a = null;
                h0.b().b = null;
                this.Y(h0, (h0.S == null ? 0 : h0.S.c), 0, 0, true);
            }
            switch(h0.i) {
                case 0: {
                    if(v6 > 0) {
                        Bundle bundle0 = h0.j;
                        if(bundle0 != null) {
                            bundle0.setClassLoader(this.x.k.getClassLoader());
                            h0.k = h0.j.getSparseParcelableArray("android:view_state");
                            String s = h0.j.getString("android:target_state");
                            if(s == null) {
                                h1 = null;
                            }
                            else {
                                h1 = (h)hashMap0.get(s);
                                if(h1 != null) {
                                    goto label_36;
                                }
                                this.k0(new IllegalStateException("Fragment no longer exists for key android:target_state: unique id " + s));
                                throw null;
                            }
                        label_36:
                            String s1 = h1 == null ? null : h1.m;
                            h0.p = s1;
                            if(s1 != null) {
                                h0.q = h0.j.getInt("android:target_req_state", 0);
                            }
                            Boolean boolean0 = h0.l;
                            if(boolean0 == null) {
                                h0.R = h0.j.getBoolean("android:user_visible_hint", true);
                            }
                            else {
                                h0.R = boolean0.booleanValue();
                                h0.l = null;
                            }
                            if(!h0.R) {
                                h0.Q = true;
                                if(v6 > 2) {
                                    v6 = 2;
                                }
                            }
                        }
                        h0.A = this.x;
                        h0.C = this.z;
                        h0.z = this.z == null ? this.x.m : this.z.B;
                        h h2 = h0.o;
                        if(h2 != null) {
                            Object object0 = hashMap0.get(h2.m);
                            h h3 = h0.o;
                            if(object0 != h3) {
                                throw new IllegalStateException("Fragment " + h0 + " declared target fragment " + h0.o + " that does not belong to this FragmentManager!");
                            }
                            if(h3.i < 1) {
                                this.Y(h3, 1, 0, 0, true);
                            }
                            h0.p = h0.o.m;
                            h0.o = null;
                        }
                        String s2 = h0.p;
                        if(s2 != null) {
                            Object object1 = hashMap0.get(s2);
                            if(((h)object1) == null) {
                                StringBuilder stringBuilder0 = new StringBuilder("Fragment ");
                                stringBuilder0.append(h0);
                                stringBuilder0.append(" declared target fragment ");
                                throw new IllegalStateException(i3.e.h(stringBuilder0, h0.p, " that does not belong to this FragmentManager!"));
                            }
                            else if(((h)object1).i < 1) {
                                this.Y(((h)object1), 1, 0, 0, true);
                            }
                        }
                        this.t(false);
                        h0.B.d(h0.A, new androidx.fragment.app.e(h0), h0);
                        h0.M = false;
                        h0.onAttach(h0.A.k);
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onAttach()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        if(h0.C == null) {
                            this.x.n.getClass();
                        }
                        this.o(false);
                        if(h0.Y) {
                            Bundle bundle2 = h0.j;
                            if(bundle2 != null) {
                                Parcelable parcelable0 = bundle2.getParcelable("android:support:fragments");
                                if(parcelable0 != null) {
                                    h0.B.d0(parcelable0);
                                    h0.B.k();
                                }
                            }
                            h0.i = 1;
                        }
                        else {
                            this.u(false);
                            Bundle bundle1 = h0.j;
                            h0.B.Z();
                            h0.i = 1;
                            h0.M = false;
                            h0.d0.a(bundle1);
                            h0.onCreate(bundle1);
                            h0.Y = true;
                            if(!h0.M) {
                                throw new M(f.g("Fragment ", h0, " did not call through to super.onCreate()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                            }
                            h0.a0.e(androidx.lifecycle.g.ON_CREATE);
                            this.p(false);
                        }
                    }
                    goto label_109;
                }
                case 1: {
                label_109:
                    if(v6 > 0 && h0.u && !h0.x) {
                        LayoutInflater layoutInflater0 = h0.onGetLayoutInflater(h0.j);
                        h0.X = layoutInflater0;
                        h0.e(layoutInflater0, null, h0.j);
                        View view0 = h0.O;
                        if(view0 == null) {
                            h0.P = null;
                        }
                        else {
                            h0.P = view0;
                            view0.setSaveFromParentEnabled(false);
                            if(h0.G) {
                                h0.O.setVisibility(8);
                            }
                            this.z(false);
                        }
                    }
                    if(v6 > 1) {
                        if(!h0.u) {
                            int v8 = h0.E;
                            switch(v8) {
                                case -1: {
                                    this.k0(new IllegalArgumentException(f.g("Cannot create fragment ", h0, " for a container view with no id")));
                                    throw null;
                                label_129:
                                    viewGroup0 = (ViewGroup)this.y.a(v8);
                                    if(viewGroup0 == null && !h0.w) {
                                        try {
                                            s3 = "unknown";
                                            s3 = h0.getResources().getResourceName(h0.E);
                                        }
                                        catch(Resources.NotFoundException unused_ex) {
                                        }
                                        this.k0(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(h0.E) + " (" + s3 + ") for fragment " + h0));
                                        throw null;
                                    }
                                    break;
                                }
                                case 0: {
                                    viewGroup0 = null;
                                    break;
                                }
                                default: {
                                    goto label_129;
                                }
                            }
                            h0.N = viewGroup0;
                            LayoutInflater layoutInflater1 = h0.onGetLayoutInflater(h0.j);
                            h0.X = layoutInflater1;
                            h0.e(layoutInflater1, viewGroup0, h0.j);
                            View view1 = h0.O;
                            if(view1 == null) {
                                h0.P = null;
                            }
                            else {
                                h0.P = view1;
                                view1.setSaveFromParentEnabled(false);
                                if(viewGroup0 != null) {
                                    viewGroup0.addView(h0.O);
                                }
                                if(h0.G) {
                                    h0.O.setVisibility(8);
                                }
                                this.z(false);
                                if(h0.O.getVisibility() != 0 || h0.N == null) {
                                    v3 = 0;
                                }
                                h0.U = v3;
                            }
                        }
                        Bundle bundle3 = h0.j;
                        h0.B.Z();
                        h0.i = 2;
                        h0.M = false;
                        h0.onActivityCreated(bundle3);
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onActivityCreated()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        h0.B.C = false;
                        h0.B.D = false;
                        h0.B.F(2);
                        this.n(false);
                        if(h0.O != null) {
                            Bundle bundle4 = h0.j;
                            SparseArray sparseArray0 = h0.k;
                            if(sparseArray0 != null) {
                                h0.P.restoreHierarchyState(sparseArray0);
                                h0.k = null;
                            }
                            h0.M = false;
                            h0.onViewStateRestored(bundle4);
                            if(!h0.M) {
                                throw new M(f.g("Fragment ", h0, " did not call through to super.onViewStateRestored()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                            }
                            if(h0.O != null) {
                                h0.b0.a(androidx.lifecycle.g.ON_CREATE);
                            }
                        }
                        h0.j = null;
                    }
                    goto label_180;
                }
                case 2: {
                label_180:
                    if(v6 > 2) {
                        h0.B.Z();
                        h0.B.J();
                        h0.i = 3;
                        h0.M = false;
                        h0.onStart();
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onStart()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        androidx.lifecycle.g g0 = androidx.lifecycle.g.ON_START;
                        h0.a0.e(g0);
                        if(h0.O != null) {
                            h0.b0.a(g0);
                        }
                        h0.B.C = false;
                        h0.B.D = false;
                        h0.B.F(3);
                        this.x(false);
                    }
                    goto label_197;
                }
                case 3: {
                label_197:
                    if(v6 > 3) {
                        h0.B.Z();
                        h0.B.J();
                        h0.i = 4;
                        h0.M = false;
                        h0.onResume();
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onResume()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        androidx.lifecycle.g g1 = androidx.lifecycle.g.ON_RESUME;
                        h0.a0.e(g1);
                        if(h0.O != null) {
                            h0.b0.a(g1);
                        }
                        h0.B.C = false;
                        h0.B.D = false;
                        h0.B.F(4);
                        h0.B.J();
                        this.v(false);
                        h0.j = null;
                        h0.k = null;
                        break;
                    }
                }
            }
            v3 = v6;
        }
        else if(v7 > v6) {
            switch(v7) {
                case 1: {
                label_311:
                    if(v6 < 1) {
                        if(this.E) {
                            if(h0.c() != null) {
                                View view4 = h0.c();
                                h0.b().a = null;
                                view4.clearAnimation();
                            }
                            else if(h0.d() != null) {
                                Animator animator1 = h0.d();
                                h0.b().b = null;
                                animator1.cancel();
                            }
                        }
                        if(h0.c() != null || h0.d() != null) {
                            h0.b().c = v6;
                        }
                        else {
                            boolean z1 = h0.t && h0.y <= 0;
                            if(z1) {
                            label_336:
                                i i0 = this.x;
                                if(i0 instanceof C) {
                                    z3 = this.M.f;
                                }
                                else {
                                    z3 = i0.k instanceof Activity ? !i0.k.isChangingConfigurations() : true;
                                }
                                if(z1 || z3) {
                                    x x1 = this.M;
                                    x1.getClass();
                                    HashMap hashMap1 = x1.c;
                                    x x2 = (x)hashMap1.get(h0.m);
                                    if(x2 != null) {
                                        x2.a();
                                        hashMap1.remove(h0.m);
                                    }
                                    HashMap hashMap2 = x1.d;
                                    B b1 = (B)hashMap2.get(h0.m);
                                    if(b1 != null) {
                                        b1.a();
                                        hashMap2.remove(h0.m);
                                    }
                                }
                                h0.B.m();
                                h0.a0.e(androidx.lifecycle.g.ON_DESTROY);
                                h0.i = 0;
                                h0.M = false;
                                h0.Y = false;
                                h0.onDestroy();
                                if(!h0.M) {
                                    throw new M(f.g("Fragment ", h0, " did not call through to super.onDestroy()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                                }
                                this.q(false);
                            label_362:
                                h0.M = false;
                                h0.onDetach();
                                h0.X = null;
                                if(!h0.M) {
                                    throw new M(f.g("Fragment ", h0, " did not call through to super.onDetach()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                                }
                                v v9 = h0.B;
                                if(!v9.E) {
                                    v9.m();
                                    h0.B = new v();
                                }
                                this.r(false);
                                if(!z) {
                                    if(z1) {
                                    label_386:
                                        if(hashMap0.get(h0.m) != null) {
                                            for(Object object2: hashMap0.values()) {
                                                h h5 = (h)object2;
                                                if(h5 != null && h0.m.equals(h5.p)) {
                                                    h5.o = h0;
                                                    h5.p = null;
                                                }
                                            }
                                            hashMap0.put(h0.m, null);
                                            if(!this.S()) {
                                                this.M.b.remove(h0);
                                            }
                                            String s6 = h0.p;
                                            if(s6 != null) {
                                                h0.o = (h)hashMap0.get(s6);
                                            }
                                            h0.a0 = new androidx.lifecycle.p(h0);
                                            h0.d0 = new d(h0);
                                            h0.a0.a(new Fragment.2(h0));
                                            h0.m = "7b6c5111-7b98-4a6a-988c-e95fea944466";
                                            h0.s = false;
                                            h0.t = false;
                                            h0.u = false;
                                            h0.v = false;
                                            h0.w = false;
                                            h0.y = 0;
                                            h0.z = null;
                                            h0.B = new v();
                                            h0.A = null;
                                            h0.D = 0;
                                            h0.E = 0;
                                            h0.F = null;
                                            h0.G = false;
                                            h0.H = false;
                                        }
                                    }
                                    else {
                                        x x3 = this.M;
                                        if(x3.b.contains(h0) && x3.e) {
                                            v3 = x3.f;
                                        }
                                        if(v3 == 0) {
                                            h0.A = null;
                                            h0.C = null;
                                            h0.z = null;
                                            String s5 = h0.p;
                                            if(s5 != null) {
                                                h h4 = (h)hashMap0.get(s5);
                                                if(h4 != null && h4.getRetainInstance()) {
                                                    h0.o = h4;
                                                }
                                            }
                                        }
                                        else {
                                            goto label_386;
                                        }
                                    }
                                }
                                v3 = v6;
                                break;
                            }
                            else {
                                x x0 = this.M;
                                if(!x0.b.contains(h0)) {
                                    z2 = true;
                                }
                                else if(x0.e) {
                                    z2 = x0.f;
                                }
                                else {
                                    z2 = true;
                                }
                                if(!z2) {
                                    h0.i = 0;
                                    goto label_362;
                                }
                                goto label_336;
                            }
                        }
                    }
                    else {
                        v3 = v6;
                    }
                    break;
                }
                case 2: {
                label_248:
                    if(v6 < 2) {
                        if(h0.O != null && !this.x.n.isFinishing() && h0.k == null) {
                            this.f0(h0);
                        }
                        h0.B.F(1);
                        if(h0.O != null) {
                            h0.b0.a(androidx.lifecycle.g.ON_DESTROY);
                        }
                        h0.i = 1;
                        h0.M = false;
                        h0.onDestroyView();
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onDestroyView()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        B b0 = h0.getViewModelStore();
                        Class class0 = K.b.class;
                        String s4 = class0.getCanonicalName();
                        if(s4 == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        A a0 = (A)b0.a.get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s4);
                        if(!class0.isInstance(a0)) {
                            a0 = new K.b();
                            A a1 = (A)b0.a.put("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s4, a0);
                            if(a1 != null) {
                                a1.a();
                            }
                        }
                        p.l l0 = ((K.b)a0).b;
                        if(l0.f() <= 0) {
                            h0.x = false;
                            this.A(false);
                            View view2 = h0.O;
                            if(view2 != null) {
                                ViewGroup viewGroup1 = h0.N;
                                if(viewGroup1 != null) {
                                    viewGroup1.endViewTransition(view2);
                                    h0.O.clearAnimation();
                                    if(h0.getParentFragment() == null || !h0.getParentFragment().t) {
                                        B.c c0 = this.w <= 0 || this.E || h0.O.getVisibility() != 0 || h0.W < 0.0f ? null : this.T(h0, v1, false, v2);
                                        h0.W = 0.0f;
                                        if(c0 != null) {
                                            View view3 = h0.O;
                                            ViewGroup viewGroup2 = h0.N;
                                            viewGroup2.startViewTransition(view3);
                                            h0.b().c = v6;
                                            Animation animation0 = (Animation)c0.j;
                                            if(animation0 == null) {
                                                androidx.fragment.app.f f0 = h0.b();
                                                Animator animator0 = (Animator)c0.k;
                                                f0.b = animator0;
                                                animator0.addListener(new N.d(this, viewGroup2, view3, h0, 2));
                                                animator0.setTarget(h0.O);
                                                animator0.start();
                                            }
                                            else {
                                                q q0 = new q(animation0, viewGroup2, view3);
                                                h0.b().a = h0.O;
                                                q0.setAnimationListener(new n(this, viewGroup2, h0));
                                                h0.O.startAnimation(q0);
                                            }
                                        }
                                        h0.N.removeView(h0.O);
                                    }
                                }
                            }
                            h0.N = null;
                            h0.O = null;
                            h0.b0 = null;
                            h0.c0.e(null);
                            h0.P = null;
                            h0.v = false;
                            goto label_311;
                        }
                        l0.g(0).getClass();
                        throw new ClassCastException();
                    }
                    goto label_311;
                }
                case 3: {
                label_235:
                    if(v6 < 3) {
                        h0.B.D = true;
                        h0.B.F(2);
                        if(h0.O != null) {
                            h0.b0.a(androidx.lifecycle.g.ON_STOP);
                        }
                        h0.a0.e(androidx.lifecycle.g.ON_STOP);
                        h0.i = 2;
                        h0.M = false;
                        h0.onStop();
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onStop()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        this.y(false);
                    }
                    goto label_248;
                }
                case 4: {
                    if(v6 < 4) {
                        h0.B.F(3);
                        if(h0.O != null) {
                            h0.b0.a(androidx.lifecycle.g.ON_PAUSE);
                        }
                        h0.a0.e(androidx.lifecycle.g.ON_PAUSE);
                        h0.i = 3;
                        h0.M = false;
                        h0.onPause();
                        if(!h0.M) {
                            throw new M(f.g("Fragment ", h0, " did not call through to super.onPause()"));  // 初始化器: Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        this.s(false);
                    }
                    goto label_235;
                }
                default: {
                    v3 = v6;
                }
            }
        }
        else {
            v3 = v6;
        }
        if(h0.i != v3) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + h0 + " not updated inline; expected state " + v3 + " found " + h0.i);
            h0.i = v3;
        }
    }

    public final void Z() {
        this.C = false;
        this.D = false;
        ArrayList arrayList0 = this.n;
        int v1 = arrayList0.size();
        for(int v = 0; v < v1; ++v) {
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.B.Z();
            }
        }
    }

    @Override  // androidx.fragment.app.l
    public final boolean a() {
        if(this.S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        this.J();
        this.I(true);
        if(this.A == null || !this.A.getChildFragmentManager().a()) {
            boolean z = this.a0(this.G, this.H, -1, 0);
            if(z) {
                try {
                    this.l = true;
                    this.c0(this.G, this.H);
                }
                finally {
                    this.f();
                }
            }
            this.l0();
            HashMap hashMap0 = this.o;
            if(this.F) {
                this.F = false;
                for(Object object0: hashMap0.values()) {
                    h h0 = (h)object0;
                    if(h0 == null || !h0.Q) {
                    }
                    else if(this.l) {
                        this.F = true;
                    }
                    else {
                        h0.Q = false;
                        this.Y(h0, this.w, 0, 0, false);
                    }
                }
            }
            hashMap0.values().removeAll(Collections.singleton(null));
            return z;
        }
        return true;
    }

    public final boolean a0(ArrayList arrayList0, ArrayList arrayList1, int v, int v1) {
        ArrayList arrayList2 = this.p;
        if(arrayList2 == null) {
            return false;
        }
        if(v < 0 && (v1 & 1) == 0) {
            int v2 = arrayList2.size();
            if(v2 - 1 < 0) {
                return false;
            }
            arrayList0.add(this.p.remove(v2 - 1));
            arrayList1.add(Boolean.TRUE);
            return true;
        }
        if(v >= 0) {
            int v3;
            for(v3 = arrayList2.size() - 1; v3 >= 0 && (v < 0 || v != ((a)this.p.get(v3)).s); --v3) {
            }
            if(v3 < 0) {
                return false;
            }
            if((v1 & 1) != 0) {
                while(true) {
                    --v3;
                    if(v3 < 0 || (v < 0 || v != ((a)this.p.get(v3)).s)) {
                        break;
                    }
                }
            }
        }
        else {
            v3 = -1;
        }
        if(v3 == this.p.size() - 1) {
            return false;
        }
        for(int v4 = this.p.size() - 1; v4 > v3; --v4) {
            arrayList0.add(this.p.remove(v4));
            arrayList1.add(Boolean.TRUE);
        }
        return true;
    }

    public final void b(c c0) {
        int v = this.w;
        if(v < 1) {
            return;
        }
        int v1 = Math.min(v, 3);
        ArrayList arrayList0 = this.n;
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            h h0 = (h)arrayList0.get(v3);
            if(h0.i < v1) {
                this.Y(h0, v1, (h0.S == null ? 0 : h0.S.d), (h0.S == null ? 0 : h0.S.e), false);
                if(h0.O != null && !h0.G && h0.U) {
                    c0.add(h0);
                }
            }
        }
    }

    public final void b0(h h0) {
        if(!h0.H || h0.y <= 0) {
            synchronized(this.n) {
                this.n.remove(h0);
            }
            if(v.Q(h0)) {
                this.B = true;
            }
            h0.s = false;
            h0.t = true;
        }
    }

    public final void c(h h0, boolean z) {
        this.U(h0);
        if(!h0.H) {
            if(this.n.contains(h0)) {
                throw new IllegalStateException("Fragment already added: " + h0);
            }
            synchronized(this.n) {
                this.n.add(h0);
            }
            h0.s = true;
            h0.t = false;
            if(h0.O == null) {
                h0.V = false;
            }
            if(v.Q(h0)) {
                this.B = true;
            }
            if(z) {
                this.Y(h0, this.w, 0, 0, false);
            }
        }
    }

    public final void c0(ArrayList arrayList0, ArrayList arrayList1) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            if(arrayList1 == null || arrayList0.size() != arrayList1.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            this.L(arrayList0, arrayList1);
            int v = arrayList0.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                if(!((a)arrayList0.get(v1)).p) {
                    if(v2 != v1) {
                        this.K(arrayList0, arrayList1, v2, v1);
                    }
                    v2 = v1 + 1;
                    if(((Boolean)arrayList1.get(v1)).booleanValue()) {
                        while(v2 < v && ((Boolean)arrayList1.get(v2)).booleanValue() && !((a)arrayList0.get(v2)).p) {
                            ++v2;
                        }
                    }
                    this.K(arrayList0, arrayList1, v1, v2);
                    v1 = v2 - 1;
                }
            }
            if(v2 != v) {
                this.K(arrayList0, arrayList1, v2, v);
            }
        }
    }

    public final void d(i i0, r r0, h h0) {
        if(this.x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.x = i0;
        this.y = r0;
        this.z = h0;
        if(h0 != null) {
            this.l0();
        }
        if(i0 instanceof androidx.activity.h) {
            g g0 = i0.n.n;
            this.r = g0;
            h h1 = h0 == null ? i0 : h0;
            g0.a(h1, this.s);
        }
        if(h0 != null) {
            x x0 = h0.z.M;
            HashMap hashMap0 = x0.c;
            x x1 = (x)hashMap0.get(h0.m);
            if(x1 == null) {
                x1 = new x(x0.e);
                hashMap0.put(h0.m, x1);
            }
            this.M = x1;
            return;
        }
        if(i0 instanceof C) {
            B b0 = i0.n.getViewModelStore();
            Class class0 = x.class;
            String s = class0.getCanonicalName();
            if(s == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            A a0 = (A)b0.a.get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s);
            if(!class0.isInstance(a0)) {
                a0 = new x(true);
                A a1 = (A)b0.a.put("androidx.lifecycle.ViewModelProvider.DefaultKey:" + s, a0);
                if(a1 != null) {
                    a1.a();
                }
            }
            this.M = (x)a0;
            return;
        }
        this.M = new x(false);
    }

    public final void d0(Parcelable parcelable0) {
        FragmentState fragmentState0;
        if(parcelable0 == null) {
            return;
        }
        if(((FragmentManagerState)parcelable0).i == null) {
            return;
        }
        for(Object object0: this.M.b) {
            h h0 = (h)object0;
            for(Object object1: ((FragmentManagerState)parcelable0).i) {
                fragmentState0 = (FragmentState)object1;
                if(!fragmentState0.j.equals(h0.m)) {
                    continue;
                }
                goto label_15;
            }
            fragmentState0 = null;
        label_15:
            if(fragmentState0 == null) {
                this.Y(h0, 1, 0, 0, false);
                h0.t = true;
                this.Y(h0, 0, 0, 0, false);
            }
            else {
                fragmentState0.v = h0;
                h0.k = null;
                h0.y = 0;
                h0.v = false;
                h0.s = false;
                h0.p = h0.o == null ? null : h0.o.m;
                h0.o = null;
                Bundle bundle0 = fragmentState0.u;
                if(bundle0 == null) {
                    continue;
                }
                bundle0.setClassLoader(this.x.k.getClassLoader());
                h0.k = fragmentState0.u.getSparseParcelableArray("android:view_state");
                h0.j = fragmentState0.u;
            }
        }
        this.o.clear();
        for(Object object2: ((FragmentManagerState)parcelable0).i) {
            FragmentState fragmentState1 = (FragmentState)object2;
            if(fragmentState1 != null) {
                ClassLoader classLoader0 = this.x.k.getClassLoader();
                k k0 = this.P();
                if(fragmentState1.v == null) {
                    Bundle bundle1 = fragmentState1.r;
                    if(bundle1 != null) {
                        bundle1.setClassLoader(classLoader0);
                    }
                    h h1 = k0.a(classLoader0, fragmentState1.i);
                    fragmentState1.v = h1;
                    h1.setArguments(bundle1);
                    Bundle bundle2 = fragmentState1.u;
                    if(bundle2 == null) {
                        h h2 = fragmentState1.v;
                        h2.j = new Bundle();
                    }
                    else {
                        bundle2.setClassLoader(classLoader0);
                        fragmentState1.v.j = fragmentState1.u;
                    }
                    h h3 = fragmentState1.v;
                    h3.m = fragmentState1.j;
                    h3.u = fragmentState1.k;
                    h3.w = true;
                    h3.D = fragmentState1.l;
                    h3.E = fragmentState1.m;
                    h3.F = fragmentState1.n;
                    h3.I = fragmentState1.o;
                    h3.t = fragmentState1.p;
                    h3.H = fragmentState1.q;
                    h3.G = fragmentState1.s;
                    androidx.lifecycle.h[] arr_h = androidx.lifecycle.h.values();
                    h3.Z = arr_h[fragmentState1.t];
                }
                fragmentState1.v.z = this;
                this.o.put(fragmentState1.v.m, fragmentState1.v);
                fragmentState1.v = null;
            }
        }
        this.n.clear();
        ArrayList arrayList0 = ((FragmentManagerState)parcelable0).j;
        if(arrayList0 != null) {
            for(Object object3: arrayList0) {
                String s = (String)object3;
                h h4 = (h)this.o.get(s);
                if(h4 != null) {
                    h4.s = true;
                    if(this.n.contains(h4)) {
                        throw new IllegalStateException("Already added " + h4);
                    }
                    synchronized(this.n) {
                        this.n.add(h4);
                    }
                    continue;
                }
                this.k0(new IllegalStateException(i3.e.f("No instantiated fragment for (", s, ")")));
                throw null;
            }
        }
        if(((FragmentManagerState)parcelable0).k == null) {
            this.p = null;
        }
        else {
            this.p = new ArrayList(((FragmentManagerState)parcelable0).k.length);
            for(int v1 = 0; true; ++v1) {
                BackStackState[] arr_backStackState = ((FragmentManagerState)parcelable0).k;
                if(v1 >= arr_backStackState.length) {
                    break;
                }
                BackStackState backStackState0 = arr_backStackState[v1];
                backStackState0.getClass();
                a a0 = new a(this);
                int v2 = 0;
                for(int v3 = 0; true; ++v3) {
                    int[] arr_v = backStackState0.i;
                    if(v2 >= arr_v.length) {
                        break;
                    }
                    y y0 = new y();  // 初始化器: Ljava/lang/Object;-><init>()V
                    y0.a = arr_v[v2];
                    String s1 = (String)backStackState0.j.get(v3);
                    y0.b = s1 == null ? null : ((h)this.o.get(s1));
                    androidx.lifecycle.h[] arr_h1 = androidx.lifecycle.h.values();
                    y0.g = arr_h1[backStackState0.k[v3]];
                    androidx.lifecycle.h[] arr_h2 = androidx.lifecycle.h.values();
                    y0.h = arr_h2[backStackState0.l[v3]];
                    int v4 = arr_v[v2 + 1];
                    y0.c = v4;
                    int v5 = arr_v[v2 + 2];
                    y0.d = v5;
                    int v6 = v2 + 4;
                    int v7 = arr_v[v2 + 3];
                    y0.e = v7;
                    v2 += 5;
                    int v8 = arr_v[v6];
                    y0.f = v8;
                    a0.b = v4;
                    a0.c = v5;
                    a0.d = v7;
                    a0.e = v8;
                    a0.c(y0);
                }
                a0.f = backStackState0.m;
                a0.g = backStackState0.n;
                a0.i = backStackState0.o;
                a0.s = backStackState0.p;
                a0.h = true;
                a0.j = backStackState0.q;
                a0.k = backStackState0.r;
                a0.l = backStackState0.s;
                a0.m = backStackState0.t;
                a0.n = backStackState0.u;
                a0.o = backStackState0.v;
                a0.p = backStackState0.w;
                a0.d(1);
                this.p.add(a0);
                int v9 = a0.s;
                if(v9 >= 0) {
                    this.h0(v9, a0);
                }
            }
        }
        String s2 = ((FragmentManagerState)parcelable0).l;
        if(s2 != null) {
            h h5 = (h)this.o.get(s2);
            this.A = h5;
            this.D(h5);
        }
        this.m = ((FragmentManagerState)parcelable0).m;
    }

    public final void e(h h0) {
        if(h0.H) {
            h0.H = false;
            if(!h0.s) {
                if(this.n.contains(h0)) {
                    throw new IllegalStateException("Fragment already added: " + h0);
                }
                synchronized(this.n) {
                    this.n.add(h0);
                }
                h0.s = true;
                if(v.Q(h0)) {
                    this.B = true;
                }
            }
        }
    }

    public final Parcelable e0() {
        BackStackState[] arr_backStackState;
        ArrayList arrayList2;
        Bundle bundle1;
        if(this.L != null) {
            while(!this.L.isEmpty()) {
                ((u)this.L.remove(0)).a();
            }
        }
        HashMap hashMap0 = this.o;
        for(Object object0: hashMap0.values()) {
            h h0 = (h)object0;
            if(h0 == null) {
            }
            else if(h0.c() != null) {
                int v1 = h0.S == null ? 0 : h0.S.c;
                View view0 = h0.c();
                Animation animation0 = view0.getAnimation();
                if(animation0 != null) {
                    animation0.cancel();
                    view0.clearAnimation();
                }
                h0.b().a = null;
                this.Y(h0, v1, 0, 0, false);
            }
            else if(h0.d() != null) {
                h0.d().end();
            }
        }
        this.J();
        this.C = true;
        if(hashMap0.isEmpty()) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList(hashMap0.size());
        boolean z = false;
        for(Object object1: hashMap0.values()) {
            h h1 = (h)object1;
            if(h1 == null) {
                continue;
            }
            if(h1.z == this) {
                FragmentState fragmentState0 = new FragmentState(h1);
                arrayList0.add(fragmentState0);
                if(h1.i <= 0 || fragmentState0.u != null) {
                    fragmentState0.u = h1.j;
                }
                else {
                    if(this.J == null) {
                        this.J = new Bundle();
                    }
                    Bundle bundle0 = this.J;
                    h1.onSaveInstanceState(bundle0);
                    h1.d0.b(bundle0);
                    Parcelable parcelable0 = h1.B.e0();
                    if(parcelable0 != null) {
                        bundle0.putParcelable("android:support:fragments", parcelable0);
                    }
                    this.w(false);
                    if(this.J.isEmpty()) {
                        bundle1 = null;
                    }
                    else {
                        bundle1 = this.J;
                        this.J = null;
                    }
                    if(h1.O != null) {
                        this.f0(h1);
                    }
                    if(h1.k != null) {
                        if(bundle1 == null) {
                            bundle1 = new Bundle();
                        }
                        bundle1.putSparseParcelableArray("android:view_state", h1.k);
                    }
                    if(!h1.R) {
                        if(bundle1 == null) {
                            bundle1 = new Bundle();
                        }
                        bundle1.putBoolean("android:user_visible_hint", h1.R);
                    }
                    fragmentState0.u = bundle1;
                    String s = h1.p;
                    if(s != null) {
                        h h2 = (h)hashMap0.get(s);
                        if(h2 == null) {
                            this.k0(new IllegalStateException("Failure saving state: " + h1 + " has target not in fragment manager: " + h1.p));
                            throw null;
                        }
                        if(fragmentState0.u == null) {
                            fragmentState0.u = new Bundle();
                        }
                        Bundle bundle2 = fragmentState0.u;
                        if(h2.z != this) {
                            this.k0(new IllegalStateException(f.g("Fragment ", h2, " is not currently in the FragmentManager")));
                            throw null;
                        }
                        bundle2.putString("android:target_state", h2.m);
                        int v2 = h1.q;
                        if(v2 != 0) {
                            fragmentState0.u.putInt("android:target_req_state", v2);
                            z = true;
                            continue;
                        }
                    }
                }
                z = true;
                continue;
            }
            this.k0(new IllegalStateException(f.g("Failure saving state: active ", h1, " was removed from the FragmentManager")));
            throw null;
        }
        if(!z) {
            return null;
        }
        ArrayList arrayList1 = this.n;
        int v3 = arrayList1.size();
        if(v3 > 0) {
            arrayList2 = new ArrayList(v3);
            for(Object object2: arrayList1) {
                h h3 = (h)object2;
                arrayList2.add(h3.m);
                if(h3.z == this) {
                    continue;
                }
                this.k0(new IllegalStateException(f.g("Failure saving state: active ", h3, " was removed from the FragmentManager")));
                throw null;
            }
        }
        else {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.p;
        if(arrayList3 == null) {
            arr_backStackState = null;
        }
        else {
            int v4 = arrayList3.size();
            if(v4 > 0) {
                arr_backStackState = new BackStackState[v4];
                for(int v = 0; v < v4; ++v) {
                    arr_backStackState[v] = new BackStackState(((a)this.p.get(v)));
                }
            }
            else {
                arr_backStackState = null;
            }
        }
        Parcelable parcelable1 = new FragmentManagerState();  // 初始化器: Ljava/lang/Object;-><init>()V
        parcelable1.l = null;
        parcelable1.i = arrayList0;
        parcelable1.j = arrayList2;
        parcelable1.k = arr_backStackState;
        h h4 = this.A;
        if(h4 != null) {
            parcelable1.l = h4.m;
        }
        parcelable1.m = this.m;
        return parcelable1;
    }

    public final void f() {
        this.l = false;
        this.H.clear();
        this.G.clear();
    }

    public final void f0(h h0) {
        if(h0.P == null) {
            return;
        }
        SparseArray sparseArray0 = this.K;
        if(sparseArray0 == null) {
            this.K = new SparseArray();
        }
        else {
            sparseArray0.clear();
        }
        h0.P.saveHierarchyState(this.K);
        if(this.K.size() > 0) {
            h0.k = this.K;
            this.K = null;
        }
    }

    public final void g(a a0, boolean z, boolean z1, boolean z2) {
        if(z) {
            a0.g(z2);
        }
        else {
            a0.f();
        }
        ArrayList arrayList0 = new ArrayList(1);
        ArrayList arrayList1 = new ArrayList(1);
        arrayList0.add(a0);
        arrayList1.add(Boolean.valueOf(z));
        if(z1) {
            E.l(this, arrayList0, arrayList1, 0, 1, true);
        }
        if(z2) {
            this.X(this.w, true);
        }
        for(Object object0: this.o.values()) {
            h h0 = (h)object0;
            if(h0 != null && h0.O != null && h0.U && a0.h(h0.E)) {
                float f = h0.W;
                if(f > 0.0f) {
                    h0.O.setAlpha(f);
                }
                if(z2) {
                    h0.W = 0.0f;
                }
                else {
                    h0.W = -1.0f;
                    h0.U = false;
                }
            }
        }
    }

    public final void g0() {
        boolean z = false;
        synchronized(this) {
            boolean z1 = this.L != null && !this.L.isEmpty();
            if(this.k != null && this.k.size() == 1) {
                z = true;
            }
            if(z1 || z) {
                this.x.l.removeCallbacks(this.N);
                this.x.l.post(this.N);
                this.l0();
            }
        }
    }

    public final void h(h h0) {
        if(!h0.H) {
            h0.H = true;
            if(h0.s) {
                synchronized(this.n) {
                    this.n.remove(h0);
                }
                if(v.Q(h0)) {
                    this.B = true;
                }
                h0.s = false;
            }
        }
    }

    public final void h0(int v, a a0) {
        synchronized(this) {
            if(this.t == null) {
                this.t = new ArrayList();
            }
            int v2 = this.t.size();
            if(v < v2) {
                this.t.set(v, a0);
            }
            else {
                while(v2 < v) {
                    this.t.add(null);
                    if(this.u == null) {
                        this.u = new ArrayList();
                    }
                    this.u.add(v2);
                    ++v2;
                }
                this.t.add(a0);
            }
        }
    }

    public final void i(Configuration configuration0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.n;
            if(v >= arrayList0.size()) {
                break;
            }
            h h0 = (h)arrayList0.get(v);
            if(h0 != null) {
                h0.onConfigurationChanged(configuration0);
                h0.B.i(configuration0);
            }
        }
    }

    public final void i0(h h0, androidx.lifecycle.h h1) {
        if(this.o.get(h0.m) != h0 || h0.A != null && h0.getFragmentManager() != this) {
            throw new IllegalArgumentException("Fragment " + h0 + " is not an active fragment of FragmentManager " + this);
        }
        h0.Z = h1;
    }

    public final boolean j(MenuItem menuItem0) {
        if(this.w < 1) {
            return false;
        }
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.n;
            if(v >= arrayList0.size()) {
                break;
            }
            h h0 = (h)arrayList0.get(v);
            if(h0 != null && !h0.G && h0.B.j(menuItem0)) {
                return true;
            }
        }
        return false;
    }

    public final void j0(h h0) {
        if(h0 != null && (this.o.get(h0.m) != h0 || h0.A != null && h0.getFragmentManager() != this)) {
            throw new IllegalArgumentException("Fragment " + h0 + " is not an active fragment of FragmentManager " + this);
        }
        h h1 = this.A;
        this.A = h0;
        this.D(h1);
        this.D(this.A);
    }

    public final void k() {
        this.C = false;
        this.D = false;
        this.F(1);
    }

    public final void k0(RuntimeException runtimeException0) {
        Log.e("FragmentManager", runtimeException0.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter0 = new PrintWriter(new D.a());
        i i0 = this.x;
        if(i0 == null) {
            try {
                this.G("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception1) {
                Log.e("FragmentManager", "Failed dumping state", exception1);
            }
        }
        else {
            try {
                i0.n.dump("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception0) {
                Log.e("FragmentManager", "Failed dumping state", exception0);
            }
        }
        throw runtimeException0;
    }

    public final boolean l(Menu menu0, MenuInflater menuInflater0) {
        if(this.w < 1) {
            return false;
        }
        ArrayList arrayList0 = null;
        boolean z = false;
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList1 = this.n;
            if(v1 >= arrayList1.size()) {
                break;
            }
            h h0 = (h)arrayList1.get(v1);
            if(h0 != null && (h0.G ? 0 : (h0.K && h0.L) | h0.B.l(menu0, menuInflater0)) != 0) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(h0);
                z = true;
            }
        }
        if(this.q != null) {
            for(int v = 0; v < this.q.size(); ++v) {
                boolean z1 = arrayList0 != null && arrayList0.contains(((h)this.q.get(v)));
            }
        }
        this.q = arrayList0;
        return z;
    }

    public final void l0() {
        boolean z = true;
        m m0 = this.s;
        if(this.k != null && !this.k.isEmpty()) {
            m0.a = true;
            return;
        }
        if((this.p == null ? 0 : this.p.size()) <= 0 || !v.R(this.z)) {
            z = false;
        }
        m0.a = z;
    }

    public final void m() {
        this.E = true;
        this.J();
        this.F(0);
        this.x = null;
        this.y = null;
        this.z = null;
        if(this.r != null) {
            for(Object object0: this.s.b) {
                ((androidx.activity.a)object0).cancel();
            }
            this.r = null;
        }
    }

    public final void n(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).n(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void o(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).o(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        boolean z;
        h h0 = null;
        if(!"fragment".equals(s)) {
            return null;
        }
        String s1 = attributeSet0.getAttributeValue(null, "class");
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, r.i);
        int v = 0;
        if(s1 == null) {
            s1 = typedArray0.getString(0);
        }
        int v1 = typedArray0.getResourceId(1, -1);
        String s2 = typedArray0.getString(2);
        typedArray0.recycle();
        if(s1 != null) {
            ClassLoader classLoader0 = context0.getClassLoader();
            try {
                p.k k0 = k.a;
                Class class0 = (Class)k0.getOrDefault(s1, null);
                if(class0 == null) {
                    class0 = Class.forName(s1, false, classLoader0);
                    k0.put(s1, class0);
                }
                z = h.class.isAssignableFrom(class0);
            }
            catch(ClassNotFoundException unused_ex) {
                z = false;
            }
            if(z) {
                if(view0 != null) {
                    v = view0.getId();
                }
                if(v == -1 && v1 == -1 && s2 == null) {
                    throw new IllegalArgumentException(attributeSet0.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + s1);
                }
                if(v1 != -1) {
                    h0 = this.M(v1);
                }
                if(h0 == null && s2 != null) {
                    h0 = this.N(s2);
                }
                if(h0 == null && v != -1) {
                    h0 = this.M(v);
                }
                if(h0 == null) {
                    h0 = this.P().a(context0.getClassLoader(), s1);
                    h0.u = true;
                    h0.D = v1 == 0 ? v : v1;
                    h0.E = v;
                    h0.F = s2;
                    h0.v = true;
                    h0.z = this;
                    h0.A = this.x;
                    h0.onInflate(this.x.k, attributeSet0, h0.j);
                    this.c(h0, true);
                }
                else if(!h0.v) {
                    h0.v = true;
                    h0.A = this.x;
                    h0.onInflate(this.x.k, attributeSet0, h0.j);
                }
                else {
                    throw new IllegalArgumentException(attributeSet0.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(v1) + ", tag " + s2 + ", or parent id 0x" + Integer.toHexString(v) + " with another fragment for " + s1);
                }
                int v2 = this.w;
                if(v2 >= 1 || !h0.u) {
                    this.Y(h0, v2, 0, 0, false);
                }
                else {
                    this.Y(h0, 1, 0, 0, false);
                }
                View view1 = h0.O;
                if(view1 == null) {
                    throw new IllegalStateException(i3.e.f("Fragment ", s1, " did not create a view."));
                }
                if(v1 != 0) {
                    view1.setId(v1);
                }
                if(h0.O.getTag() == null) {
                    h0.O.setTag(s2);
                }
                return h0.O;
            }
        }
        return null;
    }

    @Override  // android.view.LayoutInflater$Factory
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.onCreateView(null, s, context0, attributeSet0);
    }

    public final void p(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).p(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void q(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).q(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void r(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).r(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void s(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).s(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void t(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).t(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        h h0 = this.z;
        if(h0 == null) {
            android.support.v4.media.session.a.f(this.x, stringBuilder0);
        }
        else {
            android.support.v4.media.session.a.f(h0, stringBuilder0);
        }
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }

    public final void u(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).u(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void v(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).v(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void w(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).w(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void x(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).x(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void y(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).y(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }

    public final void z(boolean z) {
        h h0 = this.z;
        if(h0 != null) {
            l l0 = h0.getFragmentManager();
            if(l0 instanceof v) {
                ((v)l0).z(true);
            }
        }
        Iterator iterator0 = this.v.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        return;
    }
}

