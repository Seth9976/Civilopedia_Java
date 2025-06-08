package B;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import com.google.android.gms.internal.ads.Ab;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzcw;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zztk;
import com.google.android.gms.internal.ads.zzyl;
import com.google.android.gms.internal.ads.zzys;
import f.c;
import f.d;
import f.e;
import f.f;
import f.g;
import java.util.ArrayList;
import k.m;

public final class k implements zzaxa {
    public int i;
    public final Object j;

    public k(int v) {
        if(v != 2) {
            super();
            this.j = new zzdy(8);
            return;
        }
        super();
        this.j = new zzazh(8);
    }

    public k(int v, l[] arr_l) {
        this.i = v;
        this.j = arr_l;
    }

    public k(Context context0) {
        int v = g.c(context0, 0);
        super();
        this.j = new d(new ContextThemeWrapper(context0, g.c(context0, v)));
        this.i = v;
    }

    public k(zztk zztk0) {
        this.j = new SparseArray();
        this.i = -1;
    }

    public k(Object object0, int v) {
        this.j = object0;
        this.i = v;
        super();
    }

    public g a() {
        d d0 = (d)this.j;
        g g0 = new g(d0.a, this.i);
        View view0 = d0.e;
        f f0 = g0.k;
        if(view0 == null) {
            CharSequence charSequence0 = d0.d;
            if(charSequence0 != null) {
                f0.d = charSequence0;
                TextView textView0 = f0.l;
                if(textView0 != null) {
                    textView0.setText(charSequence0);
                }
            }
            Drawable drawable0 = d0.c;
            if(drawable0 != null) {
                f0.j = drawable0;
                ImageView imageView0 = f0.k;
                if(imageView0 != null) {
                    imageView0.setVisibility(0);
                    f0.k.setImageDrawable(drawable0);
                }
            }
        }
        else {
            f0.n = view0;
        }
        if(d0.g != null) {
            AlertController.RecycleListView alertController$RecycleListView0 = (AlertController.RecycleListView)d0.b.inflate(f0.r, null);
            int v = d0.i ? f0.s : f0.t;
            e e0 = d0.g;
            if(e0 == null) {
                e0 = new e(d0.a, v, 0x1020014, null);  // 初始化器: Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V
            }
            f0.o = e0;
            f0.p = d0.j;
            if(d0.h != null) {
                alertController$RecycleListView0.setOnItemClickListener(new c(d0, f0));
            }
            if(d0.i) {
                alertController$RecycleListView0.setChoiceMode(1);
            }
            f0.e = alertController$RecycleListView0;
        }
        g0.setCancelable(true);
        g0.setCanceledOnTouchOutside(true);
        g0.setOnCancelListener(null);
        g0.setOnDismissListener(null);
        m m0 = d0.f;
        if(m0 != null) {
            g0.setOnKeyListener(m0);
        }
        return g0;
    }

    public Object b(int v) {
        SparseArray sparseArray0;
        int v1;
        if(this.i == -1) {
            v1 = 0;
            this.i = v1;
        }
        while(true) {
            int v2 = this.i;
            sparseArray0 = (SparseArray)this.j;
            if(v2 <= 0 || v >= sparseArray0.keyAt(v2)) {
                break;
            }
            v1 = this.i - 1;
            this.i = v1;
        }
        while(this.i < sparseArray0.size() - 1 && v >= sparseArray0.keyAt(this.i + 1)) {
            ++this.i;
        }
        return sparseArray0.valueAt(this.i);
    }

    public long c(zzatv zzatv0) {
        zzazh zzazh0 = (zzazh)this.j;
        int v = 0;
        zzatv0.zzg(zzazh0.zza, 0, 1, false);
        int v1 = zzazh0.zza[0] & 0xFF;
        if(v1 != 0) {
            int v2 = 0x80;
            int v3;
            for(v3 = 0; (v1 & v2) == 0; ++v3) {
                v2 >>= 1;
            }
            int v4 = v1 & ~v2;
            zzatv0.zzg(zzazh0.zza, 1, v3, false);
            while(v < v3) {
                ++v;
                v4 = (zzazh0.zza[v] & 0xFF) + (v4 << 8);
            }
            this.i = v3 + 1 + this.i;
            return (long)v4;
        }
        return 0x8000000000000000L;
    }

    public long d(zzys zzys0) {
        zzdy zzdy0 = (zzdy)this.j;
        int v = 0;
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 1, false);
        int v1 = zzdy0.zzH()[0] & 0xFF;
        if(v1 != 0) {
            int v2 = 0x80;
            int v3;
            for(v3 = 0; (v1 & v2) == 0; ++v3) {
                v2 >>= 1;
            }
            int v4 = v1 & ~v2;
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 1, v3, false);
            while(v < v3) {
                ++v;
                v4 = (zzdy0.zzH()[v] & 0xFF) + (v4 << 8);
            }
            this.i = v3 + 1 + this.i;
            return (long)v4;
        }
        return 0x8000000000000000L;
    }

    public void e(int v, Ab ab0) {
        int v1 = this.i;
        SparseArray sparseArray0 = (SparseArray)this.j;
        boolean z = true;
        if(v1 == -1) {
            zzcw.zzf(sparseArray0.size() == 0);
            this.i = 0;
        }
        if(sparseArray0.size() > 0) {
            int v2 = sparseArray0.keyAt(sparseArray0.size() - 1);
            if(v < v2) {
                z = false;
            }
            zzcw.zzd(z);
            if(v2 == v) {
                Ab ab1 = (Ab)sparseArray0.valueAt(sparseArray0.size() - 1);
            }
        }
        sparseArray0.append(v, ab0);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxa
    public void zzg(zzase zzase0, Object object0) {
        zzaxe zzaxe0;
        zzaxf zzaxf0 = (zzaxf)this.j;
        if(zzaxf0.o == null) {
            for(int v = 0; v <= 0; ++v) {
                zzase0.zzg(v, zzaxf0.k, false);
            }
            int v1 = zzaxf0.n;
            if(v1 == -1) {
                zzaxf0.n = 1;
                zzaxe0 = null;
            }
            else {
                zzaxe0 = v1 == 1 ? null : new zzaxe(1);
            }
            zzaxf0.o = zzaxe0;
        }
        if(zzaxf0.o == null) {
            ArrayList arrayList0 = zzaxf0.j;
            int v2 = this.i;
            arrayList0.remove(zzaxf0.i[v2]);
            if(v2 == 0) {
                zzaxf0.m = zzase0;
            }
            if(arrayList0.isEmpty()) {
                zzaxf0.l.zzg(zzaxf0.m, null);
            }
        }
    }
}

