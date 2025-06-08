package k;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class l implements Menu {
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public j e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public int l;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final ArrayList t;
    public final CopyOnWriteArrayList u;
    public n v;
    public boolean w;
    public boolean x;
    public static final int[] y;

    static {
        l.y = new int[]{1, 4, 5, 3, 2, 0};
    }

    public l(Context context0) {
        boolean z1;
        boolean z = false;
        this.l = 0;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = new ArrayList();
        this.u = new CopyOnWriteArrayList();
        this.w = false;
        this.a = context0;
        Resources resources0 = context0.getResources();
        this.b = resources0;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if(resources0.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
            if(Build.VERSION.SDK_INT >= 28) {
                z1 = viewConfiguration0.shouldShowMenuShortcutsWhenKeyboardPresent();
            }
            else {
                Resources resources1 = context0.getResources();
                int v = resources1.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z1 = v != 0 && resources1.getBoolean(v);
            }
            if(z1) {
                z = true;
            }
        }
        this.d = z;
    }

    public final n a(int v, int v1, int v2, CharSequence charSequence0) {
        int v6;
        int v3 = (0xFFFF0000 & v2) >> 16;
        if(v3 < 0 || v3 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int v4 = l.y[v3] << 16 | 0xFFFF & v2;
        n n0 = new n(this, v, v1, v2, v4, charSequence0, this.l);
        ArrayList arrayList0 = this.f;
        for(int v5 = arrayList0.size() - 1; true; --v5) {
            v6 = 0;
            if(v5 < 0) {
                break;
            }
            if(((n)arrayList0.get(v5)).d <= v4) {
                v6 = v5 + 1;
                break;
            }
        }
        arrayList0.add(v6, n0);
        this.p(true);
        return n0;
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v) {
        return this.a(0, 0, 0, this.b.getString(v));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, int v3) {
        return this.a(v, v1, v2, this.b.getString(v3));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.a(v, v1, v2, charSequence0);
    }

    @Override  // android.view.Menu
    public final MenuItem add(CharSequence charSequence0) {
        return this.a(0, 0, 0, charSequence0);
    }

    @Override  // android.view.Menu
    public final int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        PackageManager packageManager0 = this.a.getPackageManager();
        List list0 = packageManager0.queryIntentActivityOptions(componentName0, arr_intent, intent0, 0);
        int v5 = list0 == null ? 0 : list0.size();
        if((v3 & 1) == 0) {
            this.removeGroup(v);
        }
        for(int v4 = 0; v4 < v5; ++v4) {
            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v4);
            Intent intent1 = new Intent((resolveInfo0.specificIndex >= 0 ? arr_intent[resolveInfo0.specificIndex] : intent0));
            intent1.setComponent(new ComponentName(resolveInfo0.activityInfo.applicationInfo.packageName, resolveInfo0.activityInfo.name));
            n n0 = this.a(v, v1, v2, resolveInfo0.loadLabel(packageManager0));
            n0.setIcon(resolveInfo0.loadIcon(packageManager0));
            n0.g = intent1;
            if(arr_menuItem != null) {
                int v6 = resolveInfo0.specificIndex;
                if(v6 >= 0) {
                    arr_menuItem[v6] = n0;
                }
            }
        }
        return v5;
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v) {
        return this.addSubMenu(0, 0, 0, this.b.getString(v));
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.addSubMenu(v, v1, v2, this.b.getString(v3));
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        n n0 = this.a(v, v1, v2, charSequence0);
        D d0 = new D(this.a, this, n0);
        n0.o = d0;
        d0.setHeaderTitle(n0.e);
        return d0;
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence0) {
        return this.addSubMenu(0, 0, 0, charSequence0);
    }

    public final void b(x x0, Context context0) {
        WeakReference weakReference0 = new WeakReference(x0);
        this.u.add(weakReference0);
        x0.j(context0, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if(this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            x x0 = (x)weakReference0.get();
            if(x0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                x0.a(this, z);
            }
        }
        this.s = false;
    }

    @Override  // android.view.Menu
    public final void clear() {
        n n0 = this.v;
        if(n0 != null) {
            this.d(n0);
        }
        this.f.clear();
        this.p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        this.p(false);
    }

    @Override  // android.view.Menu
    public final void close() {
        this.c(true);
    }

    public boolean d(n n0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
        boolean z = false;
        if(!copyOnWriteArrayList0.isEmpty() && this.v == n0) {
            this.w();
            for(Object object0: copyOnWriteArrayList0) {
                WeakReference weakReference0 = (WeakReference)object0;
                x x0 = (x)weakReference0.get();
                if(x0 == null) {
                    copyOnWriteArrayList0.remove(weakReference0);
                }
                else {
                    z = x0.f(n0);
                    if(z) {
                        break;
                    }
                }
            }
            this.v();
            if(z) {
                this.v = null;
            }
        }
        return z;
    }

    public boolean e(l l0, MenuItem menuItem0) {
        return this.e != null && this.e.d(l0, menuItem0);
    }

    public boolean f(n n0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
        boolean z = false;
        if(copyOnWriteArrayList0.isEmpty()) {
            return false;
        }
        this.w();
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            x x0 = (x)weakReference0.get();
            if(x0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                z = x0.c(n0);
                if(z) {
                    break;
                }
            }
        }
        this.v();
        if(z) {
            this.v = n0;
        }
        return z;
    }

    @Override  // android.view.Menu
    public final MenuItem findItem(int v) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = (n)arrayList0.get(v2);
            if(menuItem0.a == v) {
                return menuItem0;
            }
            if(((n)menuItem0).hasSubMenu()) {
                MenuItem menuItem1 = menuItem0.o.findItem(v);
                if(menuItem1 != null) {
                    return menuItem1;
                }
            }
        }
        return null;
    }

    public final n g(int v, KeyEvent keyEvent0) {
        ArrayList arrayList0 = this.t;
        arrayList0.clear();
        this.h(arrayList0, v, keyEvent0);
        if(arrayList0.isEmpty()) {
            return null;
        }
        int v1 = keyEvent0.getMetaState();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        keyEvent0.getKeyData(keyCharacterMap$KeyData0);
        int v2 = arrayList0.size();
        if(v2 == 1) {
            return (n)arrayList0.get(0);
        }
        boolean z = this.n();
        for(int v3 = 0; v3 < v2; ++v3) {
            n n0 = (n)arrayList0.get(v3);
            int v4 = z ? n0.j : n0.h;
            if(v4 == keyCharacterMap$KeyData0.meta[0] && (v1 & 2) == 0 || v4 == keyCharacterMap$KeyData0.meta[2] && (v1 & 2) != 0 || z && v4 == 8 && v == 67) {
                return n0;
            }
        }
        return null;
    }

    @Override  // android.view.Menu
    public final MenuItem getItem(int v) {
        return (MenuItem)this.f.get(v);
    }

    public final void h(ArrayList arrayList0, int v, KeyEvent keyEvent0) {
        boolean z = this.n();
        int v1 = keyEvent0.getModifiers();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        if(!keyEvent0.getKeyData(keyCharacterMap$KeyData0) && v != 67) {
            return;
        }
        ArrayList arrayList1 = this.f;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            n n0 = (n)arrayList1.get(v3);
            if(n0.hasSubMenu()) {
                n0.o.h(arrayList0, v, keyEvent0);
            }
            int v4 = z ? n0.j : n0.h;
            if((v1 & 0x1100F) == ((z ? n0.k : n0.i) & 0x1100F) && v4 != 0 && ((v4 == keyCharacterMap$KeyData0.meta[0] || v4 == keyCharacterMap$KeyData0.meta[2] || z && v4 == 8 && v == 67) && n0.isEnabled())) {
                arrayList0.add(n0);
            }
        }
    }

    @Override  // android.view.Menu
    public final boolean hasVisibleItems() {
        if(this.x) {
            return true;
        }
        ArrayList arrayList0 = this.f;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((n)arrayList0.get(v1)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayList0 = this.l();
        if(!this.k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
        boolean z = false;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            x x0 = (x)weakReference0.get();
            if(x0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                z |= x0.k();
            }
        }
        ArrayList arrayList1 = this.i;
        ArrayList arrayList2 = this.j;
        if(z) {
            arrayList1.clear();
            arrayList2.clear();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                n n0 = (n)arrayList0.get(v1);
                if(n0.f()) {
                    arrayList1.add(n0);
                }
                else {
                    arrayList2.add(n0);
                }
            }
        }
        else {
            arrayList1.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l());
        }
        this.k = false;
    }

    @Override  // android.view.Menu
    public final boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.g(v, keyEvent0) != null;
    }

    public String j() [...] // Potential decryptor

    public l k() {
        return this;
    }

    public final ArrayList l() {
        ArrayList arrayList0 = this.g;
        if(!this.h) {
            return arrayList0;
        }
        arrayList0.clear();
        ArrayList arrayList1 = this.f;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            n n0 = (n)arrayList1.get(v1);
            if(n0.isVisible()) {
                arrayList0.add(n0);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList0;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if(this.p) {
            this.q = true;
            if(z) {
                this.r = true;
            }
        }
        else {
            if(z) {
                this.h = true;
                this.k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
            if(!copyOnWriteArrayList0.isEmpty()) {
                this.w();
                for(Object object0: copyOnWriteArrayList0) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    x x0 = (x)weakReference0.get();
                    if(x0 == null) {
                        copyOnWriteArrayList0.remove(weakReference0);
                    }
                    else {
                        x0.g();
                    }
                }
                this.v();
            }
        }
    }

    @Override  // android.view.Menu
    public final boolean performIdentifierAction(int v, int v1) {
        return this.q(this.findItem(v), null, v1);
    }

    @Override  // android.view.Menu
    public final boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        n n0 = this.g(v, keyEvent0);
        boolean z = n0 == null ? false : this.q(n0, null, v1);
        if((v1 & 2) != 0) {
            this.c(true);
        }
        return z;
    }

    public final boolean q(MenuItem menuItem0, x x0, int v) {
        boolean z1;
        boolean z = false;
        if(((n)menuItem0) != null && ((n)menuItem0).isEnabled()) {
            MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0 = ((n)menuItem0).p;
            if(menuItem$OnMenuItemClickListener0 == null || !menuItem$OnMenuItemClickListener0.onMenuItemClick(((n)menuItem0))) {
                l l0 = ((n)menuItem0).n;
                if(l0.e(l0, ((n)menuItem0))) {
                    z1 = true;
                }
                else {
                    Intent intent0 = ((n)menuItem0).g;
                    if(intent0 == null) {
                    label_12:
                        o o0 = ((n)menuItem0).A;
                        z1 = o0 != null && o0.a.onPerformDefaultAction();
                    }
                    else {
                        try {
                            l0.a.startActivity(intent0);
                            z1 = true;
                        }
                        catch(ActivityNotFoundException activityNotFoundException0) {
                            Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", activityNotFoundException0);
                            goto label_12;
                        }
                    }
                }
            }
            else {
                z1 = true;
            }
            o o1 = ((n)menuItem0).A;
            boolean z2 = o1 != null && o1.a.hasSubMenu();
            if(((n)menuItem0).e()) {
                z1 |= ((n)menuItem0).expandActionView();
                if(z1) {
                    this.c(true);
                    return true;
                }
            }
            else if(((n)menuItem0).hasSubMenu() || z2) {
                if((v & 4) == 0) {
                    this.c(false);
                }
                if(!((n)menuItem0).hasSubMenu()) {
                    D d0 = new D(this.a, this, ((n)menuItem0));
                    ((n)menuItem0).o = d0;
                    d0.setHeaderTitle(((n)menuItem0).e);
                }
                D d1 = ((n)menuItem0).o;
                if(z2) {
                    o1.a.onPrepareSubMenu(d1);
                }
                CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
                if(!copyOnWriteArrayList0.isEmpty()) {
                    if(x0 != null) {
                        z = x0.d(d1);
                    }
                    for(Object object0: copyOnWriteArrayList0) {
                        WeakReference weakReference0 = (WeakReference)object0;
                        x x1 = (x)weakReference0.get();
                        if(x1 == null) {
                            copyOnWriteArrayList0.remove(weakReference0);
                        }
                        else if(!z) {
                            z = x1.d(d1);
                        }
                    }
                }
                z1 |= z;
                if(!z1) {
                    this.c(true);
                }
            }
            else if((v & 1) == 0) {
                this.c(true);
                return z1;
            }
            return z1;
        }
        return false;
    }

    public final void r(x x0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.u;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            x x1 = (x)weakReference0.get();
            if(x1 == null || x1 == x0) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
        }
    }

    @Override  // android.view.Menu
    public final void removeGroup(int v) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        int v3;
        for(v3 = 0; true; ++v3) {
            if(v3 >= v1) {
                v3 = -1;
                break;
            }
            if(((n)arrayList0.get(v3)).b == v) {
                break;
            }
        }
        if(v3 >= 0) {
            int v4 = arrayList0.size();
            for(int v2 = 0; v2 < v4 - v3 && ((n)arrayList0.get(v3)).b == v; ++v2) {
                ArrayList arrayList1 = this.f;
                if(v3 < arrayList1.size()) {
                    arrayList1.remove(v3);
                }
            }
            this.p(true);
        }
    }

    @Override  // android.view.Menu
    public final void removeItem(int v) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            if(((n)arrayList0.get(v2)).a == v) {
                break;
            }
        }
        if(v2 >= 0) {
            ArrayList arrayList1 = this.f;
            if(v2 < arrayList1.size()) {
                arrayList1.remove(v2);
                this.p(true);
            }
        }
    }

    public final void s(Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:actionviewstates");
        int v = this.f.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                view0.restoreHierarchyState(sparseArray0);
            }
            if(menuItem0.hasSubMenu()) {
                ((D)menuItem0.getSubMenu()).s(bundle0);
            }
        }
        int v2 = bundle0.getInt("android:menu:expandedactionview");
        if(v2 > 0) {
            MenuItem menuItem1 = this.findItem(v2);
            if(menuItem1 != null) {
                menuItem1.expandActionView();
            }
        }
    }

    @Override  // android.view.Menu
    public final void setGroupCheckable(int v, boolean z, boolean z1) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            n n0 = (n)arrayList0.get(v2);
            if(n0.b == v) {
                n0.x = n0.x & -5 | (z1 ? 4 : 0);
                n0.setCheckable(z);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override  // android.view.Menu
    public final void setGroupEnabled(int v, boolean z) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            n n0 = (n)arrayList0.get(v2);
            if(n0.b == v) {
                n0.setEnabled(z);
            }
        }
    }

    @Override  // android.view.Menu
    public final void setGroupVisible(int v, boolean z) {
        ArrayList arrayList0 = this.f;
        int v1 = arrayList0.size();
        boolean z1 = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            n n0 = (n)arrayList0.get(v2);
            if(n0.b == v) {
                int v3 = n0.x;
                int v4 = v3 & -9 | (z ? 0 : 8);
                n0.x = v4;
                if(v3 != v4) {
                    z1 = true;
                }
            }
        }
        if(z1) {
            this.p(true);
        }
    }

    @Override  // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        this.p(false);
    }

    @Override  // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle0) {
        int v = this.f.size();
        SparseArray sparseArray0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                if(sparseArray0 == null) {
                    sparseArray0 = new SparseArray();
                }
                view0.saveHierarchyState(sparseArray0);
                if(menuItem0.isActionViewExpanded()) {
                    bundle0.putInt("android:menu:expandedactionview", menuItem0.getItemId());
                }
            }
            if(menuItem0.hasSubMenu()) {
                ((D)menuItem0.getSubMenu()).t(bundle0);
            }
        }
        if(sparseArray0 != null) {
            bundle0.putSparseParcelableArray("android:menu:actionviewstates", sparseArray0);
        }
    }

    public final void u(int v, CharSequence charSequence0, int v1, Drawable drawable0, View view0) {
        if(view0 == null) {
            if(v > 0) {
                this.m = this.b.getText(v);
            }
            else if(charSequence0 != null) {
                this.m = charSequence0;
            }
            if(v1 > 0) {
                this.n = v.j.getDrawable(this.a, v1);
            }
            else if(drawable0 != null) {
                this.n = drawable0;
            }
            this.o = null;
        }
        else {
            this.o = view0;
            this.m = null;
            this.n = null;
        }
        this.p(false);
    }

    public final void v() {
        this.p = false;
        if(this.q) {
            this.q = false;
            this.p(this.r);
        }
    }

    public final void w() {
        if(!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }
}

