package N;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C9;
import com.google.android.gms.internal.ads.T9;
import com.google.android.gms.internal.ads.c9;
import com.google.android.gms.internal.ads.o9;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.x9;
import com.google.android.gms.internal.ads.zzgji;
import com.google.android.gms.internal.ads.zzgjq;
import com.google.android.gms.internal.ads.zzgkc;
import com.google.android.gms.internal.ads.zzglc;
import com.google.android.gms.internal.ads.zzgli;
import java.util.Arrays;
import java.util.List;

public final class n {
    public int a;
    public int b;
    public int c;
    public Object d;

    public n(zzgjq zzgjq0) {
        this.c = 0;
        if(zzgjq0 == null) {
            throw new NullPointerException("input");
        }
        this.d = zzgjq0;
        zzgjq0.b = this;
    }

    public void A(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof x9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((x9)list0).zzh(zzgjq0.zzf());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((x9)list0).zzh(zzgjq0.zzf());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzf());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzf());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void B(List list0) {
        int v5;
        int v2;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof x9) {
            switch(this.a & 7) {
                case 2: {
                    int v = zzgjq0.zzn();
                    n.t(v);
                    int v1 = zzgjq0.zzd();
                    do {
                        ((x9)list0).zzh(zzgjq0.zzg());
                    }
                    while(zzgjq0.zzd() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzglc.a();
                }
            }
            do {
                ((x9)list0).zzh(zzgjq0.zzg());
                if(zzgjq0.zzC()) {
                    return;
                }
                v2 = zzgjq0.zzm();
            }
            while(v2 == this.a);
            this.c = v2;
            return;
        }
        switch(this.a & 7) {
            case 2: {
                int v3 = zzgjq0.zzn();
                n.t(v3);
                int v4 = zzgjq0.zzd();
                do {
                    list0.add(zzgjq0.zzg());
                }
                while(zzgjq0.zzd() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzglc.a();
            }
        }
        do {
            list0.add(zzgjq0.zzg());
            if(zzgjq0.zzC()) {
                return;
            }
            v5 = zzgjq0.zzm();
        }
        while(v5 == this.a);
        this.c = v5;
    }

    public void a(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int v2 = this.c;
        int[] arr_v = (int[])this.d;
        if(arr_v == null) {
            int[] arr_v1 = new int[4];
            this.d = arr_v1;
            Arrays.fill(arr_v1, -1);
        }
        else if(v2 * 2 >= arr_v.length) {
            int[] arr_v2 = new int[v2 * 4];
            this.d = arr_v2;
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
        }
        int[] arr_v3 = (int[])this.d;
        arr_v3[v2 * 2] = v;
        arr_v3[v2 * 2 + 1] = v1;
        ++this.c;
    }

    public void b(RecyclerView recyclerView0, boolean z) {
        this.c = 0;
        int[] arr_v = (int[])this.d;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
        F f0 = recyclerView0.t;
        if(recyclerView0.s != null && f0 != null && f0.h) {
            if(!z) {
                if(!recyclerView0.I()) {
                    f0.g(this.a, this.b, recyclerView0.j0, this);
                }
            }
            else if(!recyclerView0.l.r()) {
                f0.h(recyclerView0.s.a(), this);
            }
            int v = this.c;
            if(v > f0.i) {
                f0.i = v;
                f0.j = z;
                recyclerView0.j.k();
            }
        }
    }

    public void c(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof C9) {
            switch(this.a & 7) {
                case 1: {
                    do {
                        ((C9)list0).h(zzgjq0.zzo());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    n.u(v1);
                    int v2 = zzgjq0.zzd();
                    do {
                        ((C9)list0).h(zzgjq0.zzo());
                    }
                    while(zzgjq0.zzd() < v2 + v1);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 1: {
                do {
                    list0.add(zzgjq0.zzo());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                n.u(v4);
                int v5 = zzgjq0.zzd();
                do {
                    list0.add(zzgjq0.zzo());
                }
                while(zzgjq0.zzd() < v5 + v4);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void d(List list0) {
        int v2;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof t9) {
            if(list0 == null) {
                switch(this.a & 7) {
                    case 2: {
                        n.t(zzgjq0.zzn());
                        zzgjq0.zzd();
                        zzgjq0.zzc();
                        throw null;
                    }
                    case 5: {
                        zzgjq0.zzc();
                        throw null;
                    }
                    default: {
                        throw zzglc.a();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.a & 7) {
            case 2: {
                int v = zzgjq0.zzn();
                n.t(v);
                int v1 = zzgjq0.zzd();
                do {
                    list0.add(zzgjq0.zzc());
                }
                while(zzgjq0.zzd() < v1 + v);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzglc.a();
            }
        }
        do {
            list0.add(zzgjq0.zzc());
            if(zzgjq0.zzC()) {
                return;
            }
            v2 = zzgjq0.zzm();
        }
        while(v2 == this.a);
        this.c = v2;
    }

    public void e(List list0, T9 t90, zzgkc zzgkc0) {
        int v = this.a;
        if((v & 7) != 3) {
            throw zzglc.a();
        }
        while(true) {
            list0.add(this.p(t90, zzgkc0));
            zzgjq zzgjq0 = (zzgjq)this.d;
            if(zzgjq0.zzC() || this.c != 0) {
                break;
            }
            int v1 = zzgjq0.zzm();
            if(v1 != v) {
                this.c = v1;
                return;
            }
        }
    }

    public void f(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof x9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((x9)list0).zzh(zzgjq0.zzh());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((x9)list0).zzh(zzgjq0.zzh());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzh());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzh());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void g(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof C9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((C9)list0).h(zzgjq0.zzp());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((C9)list0).h(zzgjq0.zzp());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzp());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzp());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void h(List list0, T9 t90, zzgkc zzgkc0) {
        int v = this.a;
        if((v & 7) != 2) {
            throw zzglc.a();
        }
        while(true) {
            list0.add(this.q(t90, zzgkc0));
            zzgjq zzgjq0 = (zzgjq)this.d;
            if(zzgjq0.zzC() || this.c != 0) {
                break;
            }
            int v1 = zzgjq0.zzm();
            if(v1 != v) {
                this.c = v1;
                return;
            }
        }
    }

    public void i(List list0) {
        int v5;
        int v2;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof x9) {
            switch(this.a & 7) {
                case 2: {
                    int v = zzgjq0.zzn();
                    n.t(v);
                    int v1 = zzgjq0.zzd();
                    do {
                        ((x9)list0).zzh(zzgjq0.zzk());
                    }
                    while(zzgjq0.zzd() < v1 + v);
                    return;
                }
                case 5: {
                    break;
                }
                default: {
                    throw zzglc.a();
                }
            }
            do {
                ((x9)list0).zzh(zzgjq0.zzk());
                if(zzgjq0.zzC()) {
                    return;
                }
                v2 = zzgjq0.zzm();
            }
            while(v2 == this.a);
            this.c = v2;
            return;
        }
        switch(this.a & 7) {
            case 2: {
                int v3 = zzgjq0.zzn();
                n.t(v3);
                int v4 = zzgjq0.zzd();
                do {
                    list0.add(zzgjq0.zzk());
                }
                while(zzgjq0.zzd() < v4 + v3);
                return;
            }
            case 5: {
                break;
            }
            default: {
                throw zzglc.a();
            }
        }
        do {
            list0.add(zzgjq0.zzk());
            if(zzgjq0.zzC()) {
                return;
            }
            v5 = zzgjq0.zzm();
        }
        while(v5 == this.a);
        this.c = v5;
    }

    public void j(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof C9) {
            switch(this.a & 7) {
                case 1: {
                    do {
                        ((C9)list0).h(zzgjq0.zzt());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    n.u(v1);
                    int v2 = zzgjq0.zzd();
                    do {
                        ((C9)list0).h(zzgjq0.zzt());
                    }
                    while(zzgjq0.zzd() < v2 + v1);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 1: {
                do {
                    list0.add(zzgjq0.zzt());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                n.u(v4);
                int v5 = zzgjq0.zzd();
                do {
                    list0.add(zzgjq0.zzt());
                }
                while(zzgjq0.zzd() < v5 + v4);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void k(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof x9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((x9)list0).zzh(zzgjq0.zzl());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((x9)list0).zzh(zzgjq0.zzl());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzl());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzl());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void l(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof C9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((C9)list0).h(zzgjq0.zzu());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((C9)list0).h(zzgjq0.zzu());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzu());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzu());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void m(boolean z, List list0) {
        int v1;
        String s;
        int v;
        if((this.a & 7) != 2) {
            throw zzglc.a();
        }
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof zzgli && !z) {
            do {
                ((zzgli)list0).zzi(this.w());
                if(zzgjq0.zzC()) {
                    return;
                }
                v = zzgjq0.zzm();
            }
            while(v == this.a);
            this.c = v;
            return;
        }
        do {
            if(z) {
                this.s(2);
                s = zzgjq0.zzy();
            }
            else {
                this.s(2);
                s = zzgjq0.zzx();
            }
            list0.add(s);
            if(zzgjq0.zzC()) {
                return;
            }
            v1 = zzgjq0.zzm();
        }
        while(v1 == this.a);
        this.c = v1;
    }

    public void n(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof x9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((x9)list0).zzh(zzgjq0.zzn());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((x9)list0).zzh(zzgjq0.zzn());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzn());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzn());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void o(List list0) {
        int v3;
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof C9) {
            switch(this.a & 7) {
                case 0: {
                    do {
                        ((C9)list0).h(zzgjq0.zzv());
                        if(zzgjq0.zzC()) {
                            return;
                        }
                        v = zzgjq0.zzm();
                    }
                    while(v == this.a);
                    this.c = v;
                    return;
                }
                case 2: {
                    int v1 = zzgjq0.zzn();
                    int v2 = zzgjq0.zzd() + v1;
                    do {
                        ((C9)list0).h(zzgjq0.zzv());
                    }
                    while(zzgjq0.zzd() < v2);
                    this.r(v2);
                    return;
                }
                default: {
                    throw zzglc.a();
                }
            }
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(zzgjq0.zzv());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v3 = zzgjq0.zzm();
                }
                while(v3 == this.a);
                this.c = v3;
                return;
            }
            case 2: {
                int v4 = zzgjq0.zzn();
                int v5 = zzgjq0.zzd() + v4;
                do {
                    list0.add(zzgjq0.zzv());
                }
                while(zzgjq0.zzd() < v5);
                this.r(v5);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public Object p(T9 t90, zzgkc zzgkc0) {
        int v1;
        try {
            v1 = this.b;
            this.b = this.a >>> 3 << 3 | 4;
            Object object0 = t90.zze();
            t90.g(object0, this, zzgkc0);
            t90.zzf(object0);
            if(this.a == this.b) {
                return object0;
            }
        }
        finally {
            this.b = v1;
        }
        throw zzglc.e();
    }

    public Object q(T9 t90, zzgkc zzgkc0) {
        zzgjq zzgjq0 = (zzgjq)this.d;
        int v = zzgjq0.zzn();
        if(zzgjq0.a >= 100) {
            throw new zzglc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int v1 = zzgjq0.zze(v);
        Object object0 = t90.zze();
        ++zzgjq0.a;
        t90.g(object0, this, zzgkc0);
        t90.zzf(object0);
        zzgjq0.zzz(0);
        --zzgjq0.a;
        zzgjq0.zzA(v1);
        return object0;
    }

    public void r(int v) {
        if(((zzgjq)this.d).zzd() != v) {
            throw zzglc.f();
        }
    }

    public void s(int v) {
        if((this.a & 7) != v) {
            throw zzglc.a();
        }
    }

    public static final void t(int v) {
        if((v & 3) != 0) {
            throw zzglc.e();
        }
    }

    public static final void u(int v) {
        if((v & 7) != 0) {
            throw zzglc.e();
        }
    }

    public int v() {
        int v = this.c;
        if(v != 0) {
            this.a = v;
            this.c = 0;
            return v == 0 || v == this.b ? 0x7FFFFFFF : v >>> 3;
        }
        v = ((zzgjq)this.d).zzm();
        this.a = v;
        return v == 0 || v == this.b ? 0x7FFFFFFF : v >>> 3;
    }

    public zzgji w() {
        this.s(2);
        return ((zzgjq)this.d).zzw();
    }

    public void x(List list0) {
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof c9) {
            if(list0 == null) {
                switch(this.a & 7) {
                    case 0: {
                        zzgjq0.zzD();
                        throw null;
                    }
                    case 2: {
                        zzgjq0.zzn();
                        zzgjq0.zzd();
                        zzgjq0.zzD();
                        throw null;
                    }
                    default: {
                        throw zzglc.a();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.a & 7) {
            case 0: {
                do {
                    list0.add(Boolean.valueOf(zzgjq0.zzD()));
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v = zzgjq0.zzm();
                }
                while(v == this.a);
                this.c = v;
                return;
            }
            case 2: {
                int v1 = zzgjq0.zzn();
                int v2 = zzgjq0.zzd() + v1;
                do {
                    list0.add(Boolean.valueOf(zzgjq0.zzD()));
                }
                while(zzgjq0.zzd() < v2);
                this.r(v2);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }

    public void y(List list0) {
        int v;
        if((this.a & 7) != 2) {
            throw zzglc.a();
        }
        do {
            list0.add(this.w());
            zzgjq zzgjq0 = (zzgjq)this.d;
            if(zzgjq0.zzC()) {
                return;
            }
            v = zzgjq0.zzm();
        }
        while(v == this.a);
        this.c = v;
    }

    public void z(List list0) {
        int v;
        zzgjq zzgjq0 = (zzgjq)this.d;
        if(list0 instanceof o9) {
            if(list0 == null) {
                switch(this.a & 7) {
                    case 1: {
                        zzgjq0.zzb();
                        throw null;
                    }
                    case 2: {
                        n.u(zzgjq0.zzn());
                        zzgjq0.zzd();
                        zzgjq0.zzb();
                        throw null;
                    }
                    default: {
                        throw zzglc.a();
                    }
                }
            }
            throw new ClassCastException();
        }
        switch(this.a & 7) {
            case 1: {
                do {
                    list0.add(zzgjq0.zzb());
                    if(zzgjq0.zzC()) {
                        return;
                    }
                    v = zzgjq0.zzm();
                }
                while(v == this.a);
                this.c = v;
                return;
            }
            case 2: {
                int v1 = zzgjq0.zzn();
                n.u(v1);
                int v2 = zzgjq0.zzd();
                do {
                    list0.add(zzgjq0.zzb());
                }
                while(zzgjq0.zzd() < v2 + v1);
                return;
            }
            default: {
                throw zzglc.a();
            }
        }
    }
}

