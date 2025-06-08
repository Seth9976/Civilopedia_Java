package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

public final class d {
    public int[] a;
    public ArrayList b;

    public final void a(int v) {
        int[] arr_v = this.a;
        if(arr_v == null) {
            int[] arr_v1 = new int[Math.max(v, 10) + 1];
            this.a = arr_v1;
            Arrays.fill(arr_v1, -1);
            return;
        }
        if(v >= arr_v.length) {
            int v1;
            for(v1 = arr_v.length; v1 <= v; v1 *= 2) {
            }
            int[] arr_v2 = new int[v1];
            this.a = arr_v2;
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
            Arrays.fill(this.a, arr_v.length, this.a.length, -1);
        }
    }

    public final void b(int v, int v1) {
        if(this.a != null && v < this.a.length) {
            int v2 = v + v1;
            this.a(v2);
            System.arraycopy(this.a, v, this.a, v2, this.a.length - v - v1);
            Arrays.fill(this.a, v, v2, -1);
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(v3);
                    int v4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.i;
                    if(v4 >= v) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.i = v4 + v1;
                    }
                }
            }
        }
    }

    public final void c(int v, int v1) {
        if(this.a != null && v < this.a.length) {
            int v2 = v + v1;
            this.a(v2);
            System.arraycopy(this.a, v2, this.a, v, this.a.length - v - v1);
            Arrays.fill(this.a, this.a.length - v1, this.a.length, -1);
            ArrayList arrayList0 = this.b;
            if(arrayList0 != null) {
                for(int v3 = arrayList0.size() - 1; v3 >= 0; --v3) {
                    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = (StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)this.b.get(v3);
                    int v4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.i;
                    if(v4 >= v) {
                        if(v4 < v2) {
                            this.b.remove(v3);
                        }
                        else {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.i = v4 - v1;
                        }
                    }
                }
            }
        }
    }
}

