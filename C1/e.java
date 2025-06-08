package c1;

import T1.c;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzs;
import com.google.android.gms.internal.common.zzx;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator {
    public String i;
    public int j;
    public final CharSequence k;
    public final boolean l;
    public int m;
    public int n;
    public final c o;

    public e(c c0, zzx zzx0, CharSequence charSequence0) {
        this.o = c0;
        this.j = 2;
        this.m = 0;
        zzx0.getClass();
        this.l = zzx0.a;
        this.n = 0x7FFFFFFF;
        this.k = charSequence0;
    }

    @Override
    public final boolean hasNext() {
        int v5;
        CharSequence charSequence0;
        int v2;
        String s = null;
        int v = this.j;
        switch(v) {
            case 0: {
                throw null;
            }
            case 4: {
                throw new IllegalStateException();
            }
            default: {
                switch(v - 1) {
                    case 0: {
                        return true;
                    label_6:
                        this.j = 4;
                        int v1 = this.m;
                        while(true) {
                            v2 = this.m;
                            if(v2 == -1) {
                                goto label_49;
                            }
                            charSequence0 = this.k;
                            int v3 = charSequence0.length();
                            zzs.zzb(v2, v3, "index");
                            while(true) {
                                if(v2 < v3) {
                                    int v4 = charSequence0.charAt(v2);
                                    if(((zzo)this.o.j).zza(((char)v4))) {
                                        break;
                                    }
                                    else {
                                        ++v2;
                                        continue;
                                    }
                                }
                                v2 = -1;
                                break;
                            }
                            if(v2 == -1) {
                                v2 = charSequence0.length();
                                this.m = -1;
                                v5 = -1;
                            }
                            else {
                                v5 = v2 + 1;
                                this.m = v5;
                            }
                            if(v5 == v1) {
                                this.m = v5 + 1;
                                if(v5 + 1 <= charSequence0.length()) {
                                    continue;
                                }
                                this.m = -1;
                                continue;
                            }
                            else {
                                if(v1 < v2) {
                                    charSequence0.charAt(v1);
                                }
                                if(v1 < v2) {
                                    charSequence0.charAt(v2 - 1);
                                }
                                if(this.l && v1 == v2) {
                                    v1 = this.m;
                                    continue;
                                }
                                break;
                            }
                            goto label_50;
                        }
                        int v6 = this.n;
                        if(v6 == 1) {
                            v2 = charSequence0.length();
                            this.m = -1;
                            if(v2 > v1) {
                                charSequence0.charAt(v2 - 1);
                            }
                        }
                        else {
                            this.n = v6 - 1;
                        }
                        s = charSequence0.subSequence(v1, v2).toString();
                        goto label_50;
                    label_49:
                        this.j = 3;
                    label_50:
                        this.i = s;
                        if(this.j != 3) {
                            this.j = 1;
                            return true;
                        }
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        goto label_6;
                    }
                }
                return false;
            }
        }
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.j = 2;
        String s = this.i;
        this.i = null;
        return s;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

