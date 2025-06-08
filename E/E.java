package E;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class e {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public e(ViewGroup viewGroup0) {
        this.c = viewGroup0;
    }

    public final boolean a(float f, float f1, boolean z) {
        if(this.d) {
            ViewParent viewParent0 = this.e(0);
            if(viewParent0 != null) {
                try {
                    return viewParent0.onNestedFling(this.c, f, f1, z);
                }
                catch(AbstractMethodError abstractMethodError0) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedFling", abstractMethodError0);
                }
            }
        }
        return false;
    }

    public final boolean b(float f, float f1) {
        if(this.d) {
            ViewParent viewParent0 = this.e(0);
            if(viewParent0 != null) {
                try {
                    return viewParent0.onNestedPreFling(this.c, f, f1);
                }
                catch(AbstractMethodError abstractMethodError0) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedPreFling", abstractMethodError0);
                }
            }
        }
        return false;
    }

    public final boolean c(int v, int v1, int v2, int[] arr_v, int[] arr_v1) {
        int v4;
        int v3;
        if(this.d) {
            ViewParent viewParent0 = this.e(v2);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0 || v1 != 0) {
                ViewGroup viewGroup0 = this.c;
                if(arr_v1 == null) {
                    v3 = 0;
                    v4 = 0;
                }
                else {
                    viewGroup0.getLocationInWindow(arr_v1);
                    v3 = arr_v1[0];
                    v4 = arr_v1[1];
                }
                if(arr_v == null) {
                    if(this.e == null) {
                        this.e = new int[2];
                    }
                    arr_v = this.e;
                }
                arr_v[0] = 0;
                arr_v[1] = 0;
                if(viewParent0 instanceof f) {
                    ((f)viewParent0).d(v, v1, arr_v, v2);
                }
                else if(v2 == 0) {
                    try {
                        viewParent0.onNestedPreScroll(viewGroup0, v, v1, arr_v);
                    }
                    catch(AbstractMethodError abstractMethodError0) {
                        Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedPreScroll", abstractMethodError0);
                    }
                }
                if(arr_v1 != null) {
                    viewGroup0.getLocationInWindow(arr_v1);
                    arr_v1[0] -= v3;
                    arr_v1[1] -= v4;
                }
                return arr_v[0] != 0 || arr_v[1] != 0;
            }
            else if(arr_v1 != null) {
                arr_v1[0] = 0;
                arr_v1[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean d(int v, int v1, int v2, int v3, int[] arr_v, int v4, int[] arr_v1) {
        int[] arr_v3;
        int v6;
        int v5;
        if(this.d) {
            ViewParent viewParent0 = this.e(v4);
            if(viewParent0 == null) {
                return false;
            }
            if(v != 0 || v1 != 0 || v2 != 0 || v3 != 0) {
                ViewGroup viewGroup0 = this.c;
                if(arr_v == null) {
                    v5 = 0;
                    v6 = 0;
                }
                else {
                    viewGroup0.getLocationInWindow(arr_v);
                    v5 = arr_v[0];
                    v6 = arr_v[1];
                }
                if(arr_v1 == null) {
                    if(this.e == null) {
                        this.e = new int[2];
                    }
                    int[] arr_v2 = this.e;
                    arr_v2[0] = 0;
                    arr_v2[1] = 0;
                    arr_v3 = arr_v2;
                }
                else {
                    arr_v3 = arr_v1;
                }
                if(viewParent0 instanceof g) {
                    ((g)viewParent0).e(viewGroup0, v, v1, v2, v3, v4, arr_v3);
                }
                else {
                    arr_v3[0] += v2;
                    arr_v3[1] += v3;
                    if(viewParent0 instanceof f) {
                        ((f)viewParent0).b(viewGroup0, v, v1, v2, v3, v4);
                    }
                    else if(v4 == 0) {
                        try {
                            viewParent0.onNestedScroll(viewGroup0, v, v1, v2, v3);
                        }
                        catch(AbstractMethodError abstractMethodError0) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedScroll", abstractMethodError0);
                        }
                    }
                }
                if(arr_v != null) {
                    viewGroup0.getLocationInWindow(arr_v);
                    arr_v[0] -= v5;
                    arr_v[1] -= v6;
                }
                return true;
            }
            else if(arr_v != null) {
                arr_v[0] = 0;
                arr_v[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int v) {
        switch(v) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
            default: {
                return null;
            }
        }
    }

    public final boolean f(int v) {
        return this.e(v) != null;
    }

    public final boolean g(int v, int v1) {
        boolean z;
        if(this.f(v1)) {
            return true;
        }
        if(this.d) {
            ViewGroup viewGroup0 = this.c;
            ViewParent viewParent0 = viewGroup0.getParent();
            View view0 = viewGroup0;
            while(viewParent0 != null) {
                if(viewParent0 instanceof f) {
                    z = ((f)viewParent0).f(view0, viewGroup0, v, v1);
                }
                else if(v1 == 0) {
                    try {
                        z = viewParent0.onStartNestedScroll(view0, viewGroup0, v);
                    }
                    catch(AbstractMethodError abstractMethodError0) {
                        Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onStartNestedScroll", abstractMethodError0);
                        z = false;
                    }
                }
                else {
                    z = false;
                }
                if(z) {
                    switch(v1) {
                        case 0: {
                            this.a = viewParent0;
                            break;
                        }
                        case 1: {
                            this.b = viewParent0;
                        }
                    }
                    if(viewParent0 instanceof f) {
                        ((f)viewParent0).a(view0, viewGroup0, v, v1);
                        return true;
                    }
                    if(v1 == 0) {
                        try {
                            viewParent0.onNestedScrollAccepted(view0, viewGroup0, v);
                            return true;
                        }
                        catch(AbstractMethodError abstractMethodError1) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onNestedScrollAccepted", abstractMethodError1);
                        }
                    }
                    return true;
                }
                if(viewParent0 instanceof View) {
                    view0 = (View)viewParent0;
                }
                viewParent0 = viewParent0.getParent();
            }
        }
        return false;
    }

    public final void h(int v) {
        ViewParent viewParent0 = this.e(v);
        if(viewParent0 != null) {
            ViewGroup viewGroup0 = this.c;
            if(viewParent0 instanceof f) {
                ((f)viewParent0).c(viewGroup0, v);
            }
            else if(v == 0) {
                try {
                    viewParent0.onStopNestedScroll(viewGroup0);
                }
                catch(AbstractMethodError abstractMethodError0) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent0 + " does not implement interface method onStopNestedScroll", abstractMethodError0);
                }
            }
            switch(v) {
                case 0: {
                    this.a = null;
                    break;
                }
                case 1: {
                    this.b = null;
                }
            }
        }
    }
}

