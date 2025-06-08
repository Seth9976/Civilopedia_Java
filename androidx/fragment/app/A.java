package androidx.fragment.app;

import java.util.ArrayList;

public final class a extends z implements s {
    public final v q;
    public boolean r;
    public int s;

    public a(v v0) {
        this.a = new ArrayList();
        this.p = false;
        this.s = -1;
        this.q = v0;
    }

    @Override  // androidx.fragment.app.s
    public final boolean a(ArrayList arrayList0, ArrayList arrayList1) {
        arrayList0.add(this);
        arrayList1.add(Boolean.FALSE);
        if(this.h) {
            v v0 = this.q;
            if(v0.p == null) {
                v0.p = new ArrayList();
            }
            v0.p.add(this);
        }
        return true;
    }

    public final void d(int v) {
        if(!this.h) {
            return;
        }
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            h h0 = ((y)arrayList0.get(v2)).b;
            if(h0 != null) {
                h0.y += v;
            }
        }
    }

    public final int e(boolean z) {
        int v2;
        if(this.r) {
            throw new IllegalStateException("commit already called");
        }
        this.r = true;
        if(this.h) {
            v v0 = this.q;
            synchronized(v0) {
                if(v0.u == null || v0.u.size() <= 0) {
                    if(v0.t == null) {
                        v0.t = new ArrayList();
                    }
                    v2 = v0.t.size();
                    v0.t.add(this);
                }
                else {
                    v2 = (int)(((Integer)v0.u.remove(v0.u.size() - 1)));
                    v0.t.set(v2, this);
                }
            }
            this.s = v2;
        }
        else {
            this.s = -1;
        }
        this.q.H(this, z);
        return this.s;
    }

    public final void f() {
        v v2;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            v2 = this.q;
            if(v1 >= v) {
                break;
            }
            y y0 = (y)arrayList0.get(v1);
            h h0 = y0.b;
            if(h0 != null) {
                int v3 = this.f;
                int v4 = this.g;
                if(h0.S != null || v3 != 0 || v4 != 0) {
                    h0.b();
                    h0.S.e = v3;
                    h0.S.f = v4;
                }
            }
            switch(y0.a) {
                case 1: {
                    h0.i(y0.c);
                    v2.c(h0, false);
                    break;
                }
                case 3: {
                    h0.i(y0.d);
                    v2.b0(h0);
                    break;
                }
                case 4: {
                    h0.i(y0.d);
                    v2.getClass();
                    if(!h0.G) {
                        h0.G = true;
                        h0.V = !h0.V;
                    }
                    break;
                }
                case 5: {
                    h0.i(y0.c);
                    v2.getClass();
                    if(h0.G) {
                        h0.G = false;
                        h0.V = !h0.V;
                    }
                    break;
                }
                case 6: {
                    h0.i(y0.d);
                    v2.h(h0);
                    break;
                }
                case 7: {
                    h0.i(y0.c);
                    v2.e(h0);
                    break;
                }
                case 8: {
                    v2.j0(h0);
                    break;
                }
                case 9: {
                    v2.j0(null);
                    break;
                }
                case 10: {
                    v2.i0(h0, y0.h);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + y0.a);
                }
            }
            if(!this.p && y0.a != 1 && h0 != null) {
                v2.W(h0);
            }
        }
        if(!this.p) {
            v2.X(v2.w, true);
        }
    }

    public final void g(boolean z) {
        v v1;
        ArrayList arrayList0 = this.a;
        for(int v = arrayList0.size() - 1; true; --v) {
            v1 = this.q;
            if(v < 0) {
                break;
            }
            y y0 = (y)arrayList0.get(v);
            h h0 = y0.b;
            if(h0 != null) {
                int v2 = this.f;
                int v3 = 0x2002;
                if(v2 != 0x1001) {
                    switch(v2) {
                        case 0x1003: {
                            v3 = 0x1003;
                            break;
                        }
                        case 0x2002: {
                            v3 = 0x1001;
                            break;
                        }
                        default: {
                            v3 = 0;
                        }
                    }
                }
                int v4 = this.g;
                if(h0.S != null || v3 != 0 || v4 != 0) {
                    h0.b();
                    h0.S.e = v3;
                    h0.S.f = v4;
                }
            }
            switch(y0.a) {
                case 1: {
                    h0.i(y0.f);
                    v1.b0(h0);
                    break;
                }
                case 3: {
                    h0.i(y0.e);
                    v1.c(h0, false);
                    break;
                }
                case 4: {
                    h0.i(y0.e);
                    v1.getClass();
                    if(h0.G) {
                        h0.G = false;
                        h0.V = !h0.V;
                    }
                    break;
                }
                case 5: {
                    h0.i(y0.f);
                    v1.getClass();
                    if(!h0.G) {
                        h0.G = true;
                        h0.V = !h0.V;
                    }
                    break;
                }
                case 6: {
                    h0.i(y0.e);
                    v1.e(h0);
                    break;
                }
                case 7: {
                    h0.i(y0.f);
                    v1.h(h0);
                    break;
                }
                case 8: {
                    v1.j0(null);
                    break;
                }
                case 9: {
                    v1.j0(h0);
                    break;
                }
                case 10: {
                    v1.i0(h0, y0.g);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + y0.a);
                }
            }
            if(!this.p && y0.a != 3 && h0 != null) {
                v1.W(h0);
            }
        }
        if(!this.p && z) {
            v1.X(v1.w, true);
        }
    }

    public final boolean h(int v) {
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            h h0 = ((y)arrayList0.get(v2)).b;
            int v3 = h0 == null ? 0 : h0.E;
            if(v3 != 0 && v3 == v) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(ArrayList arrayList0, int v, int v1) {
        if(v1 == v) {
            return false;
        }
        ArrayList arrayList1 = this.a;
        int v2 = arrayList1.size();
        int v3 = -1;
        for(int v4 = 0; v4 < v2; ++v4) {
            h h0 = ((y)arrayList1.get(v4)).b;
            int v5 = h0 == null ? 0 : h0.E;
            if(v5 != 0 && v5 != v3) {
                for(int v6 = v; v6 < v1; ++v6) {
                    a a0 = (a)arrayList0.get(v6);
                    int v7 = a0.a.size();
                    for(int v8 = 0; v8 < v7; ++v8) {
                        h h1 = ((y)a0.a.get(v8)).b;
                        if((h1 == null ? 0 : h1.E) == v5) {
                            return true;
                        }
                    }
                }
                v3 = v5;
            }
        }
        return false;
    }

    public static boolean j(y y0) {
        h h0 = y0.b;
        if(h0 != null && h0.s && h0.O != null && !h0.H && !h0.G) {
            return h0.S == null ? false : h0.S.o;
        }
        return false;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.s >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.s);
        }
        if(this.i != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.i);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

