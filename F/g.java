package f;

import A.k;
import B.o;
import O2.A;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.core.widget.NestedScrollView;

public final class g extends Dialog implements DialogInterface, i {
    public t i;
    public final u j;
    public final f k;

    public g(ContextThemeWrapper contextThemeWrapper0, int v) {
        int v2;
        int v1 = g.c(contextThemeWrapper0, v);
        if(v1 == 0) {
            TypedValue typedValue0 = new TypedValue();
            contextThemeWrapper0.getTheme().resolveAttribute(0x7F020073, typedValue0, true);  // attr:dialogTheme
            v2 = typedValue0.resourceId;
        }
        else {
            v2 = v1;
        }
        super(contextThemeWrapper0, v2);
        this.j = new u(this);
        j j0 = this.a();
        if(v1 == 0) {
            TypedValue typedValue1 = new TypedValue();
            contextThemeWrapper0.getTheme().resolveAttribute(0x7F020073, typedValue1, true);  // attr:dialogTheme
            v1 = typedValue1.resourceId;
        }
        ((t)j0).T = v1;
        j0.b();
        this.k = new f(this.getContext(), this, this.getWindow());
    }

    public final j a() {
        if(this.i == null) {
            this.i = new t(this.getContext(), this.getWindow(), this, this);
        }
        return this.i;
    }

    @Override  // android.app.Dialog
    public final void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        t t0 = (t)this.a();
        t0.p();
        ((ViewGroup)t0.B.findViewById(0x1020002)).addView(view0, viewGroup$LayoutParams0);
        t0.n.i.onContentChanged();
    }

    public final void b(Bundle bundle0) {
        this.a().a();
        super.onCreate(bundle0);
        this.a().b();
    }

    public static int c(Context context0, int v) {
        if((v >>> 24 & 0xFF) >= 1) {
            return v;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x7F020028, typedValue0, true);  // attr:alertDialogTheme
        return typedValue0.resourceId;
    }

    public final void d(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.a().h(charSequence0);
    }

    @Override  // android.app.Dialog
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        View view0 = this.getWindow().getDecorView();
        return A.s(this.j, view0, this, keyEvent0);
    }

    public final boolean e(KeyEvent keyEvent0) {
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.app.Dialog
    public final View findViewById(int v) {
        t t0 = (t)this.a();
        t0.p();
        return t0.m.findViewById(v);
    }

    @Override  // android.app.Dialog
    public final void invalidateOptionsMenu() {
        t t0 = (t)this.a();
        t0.t();
        t0.u(0);
    }

    @Override  // android.app.Dialog
    public final void onCreate(Bundle bundle0) {
        View view12;
        int v1;
        this.b(bundle0);
        f f0 = this.k;
        f0.b.setContentView(f0.q);
        Window window0 = f0.c;
        View view0 = window0.findViewById(0x7F0700BF);  // id:parentPanel
        View view1 = view0.findViewById(0x7F07011A);  // id:topPanel
        View view2 = view0.findViewById(0x7F070069);  // id:contentPanel
        View view3 = view0.findViewById(0x7F070056);  // id:buttonPanel
        ViewGroup viewGroup0 = (ViewGroup)view0.findViewById(0x7F07006D);  // id:customPanel
        window0.setFlags(0x20000, 0x20000);
        viewGroup0.setVisibility(8);
        View view4 = viewGroup0.findViewById(0x7F07011A);  // id:topPanel
        View view5 = viewGroup0.findViewById(0x7F070069);  // id:contentPanel
        View view6 = viewGroup0.findViewById(0x7F070056);  // id:buttonPanel
        ViewGroup viewGroup1 = f.b(view4, view1);
        ViewGroup viewGroup2 = f.b(view5, view2);
        ViewGroup viewGroup3 = f.b(view6, view3);
        NestedScrollView nestedScrollView0 = (NestedScrollView)window0.findViewById(0x7F0700DA);  // id:scrollView
        f0.i = nestedScrollView0;
        nestedScrollView0.setFocusable(false);
        f0.i.setNestedScrollingEnabled(false);
        TextView textView0 = (TextView)viewGroup2.findViewById(0x102000B);
        f0.m = textView0;
        if(textView0 != null) {
            textView0.setVisibility(8);
            f0.i.removeView(f0.m);
            if(f0.e == null) {
                viewGroup2.setVisibility(8);
            }
            else {
                ViewGroup viewGroup4 = (ViewGroup)f0.i.getParent();
                int v = viewGroup4.indexOfChild(f0.i);
                viewGroup4.removeViewAt(v);
                viewGroup4.addView(f0.e, v, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        Button button0 = (Button)viewGroup3.findViewById(0x1020019);
        f0.f = button0;
        a a0 = f0.w;
        button0.setOnClickListener(a0);
        if(TextUtils.isEmpty(null)) {
            f0.f.setVisibility(8);
            v1 = 0;
        }
        else {
            f0.f.setText(null);
            f0.f.setVisibility(0);
            v1 = 1;
        }
        Button button1 = (Button)viewGroup3.findViewById(0x102001A);
        f0.g = button1;
        button1.setOnClickListener(a0);
        if(TextUtils.isEmpty(null)) {
            f0.g.setVisibility(8);
        }
        else {
            f0.g.setText(null);
            f0.g.setVisibility(0);
            v1 |= 2;
        }
        Button button2 = (Button)viewGroup3.findViewById(0x102001B);
        f0.h = button2;
        button2.setOnClickListener(a0);
        if(TextUtils.isEmpty(null)) {
            f0.h.setVisibility(8);
        }
        else {
            f0.h.setText(null);
            f0.h.setVisibility(0);
            v1 |= 4;
        }
        TypedValue typedValue0 = new TypedValue();
        f0.a.getTheme().resolveAttribute(0x7F020026, typedValue0, true);  // attr:alertDialogCenterButtons
        if(typedValue0.data != 0) {
            switch(v1) {
                case 1: {
                    Button button3 = f0.f;
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)button3.getLayoutParams();
                    linearLayout$LayoutParams0.gravity = 1;
                    linearLayout$LayoutParams0.weight = 0.5f;
                    button3.setLayoutParams(linearLayout$LayoutParams0);
                    break;
                }
                case 2: {
                    Button button4 = f0.g;
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)button4.getLayoutParams();
                    linearLayout$LayoutParams1.gravity = 1;
                    linearLayout$LayoutParams1.weight = 0.5f;
                    button4.setLayoutParams(linearLayout$LayoutParams1);
                    break;
                }
                case 4: {
                    Button button5 = f0.h;
                    LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)button5.getLayoutParams();
                    linearLayout$LayoutParams2.gravity = 1;
                    linearLayout$LayoutParams2.weight = 0.5f;
                    button5.setLayoutParams(linearLayout$LayoutParams2);
                }
            }
        }
        if(v1 == 0) {
            viewGroup3.setVisibility(8);
        }
        if(f0.n == null) {
            f0.k = (ImageView)window0.findViewById(0x1020006);
            if(TextUtils.isEmpty(f0.d) || !f0.u) {
                window0.findViewById(0x7F070118).setVisibility(8);  // id:title_template
                f0.k.setVisibility(8);
                viewGroup1.setVisibility(8);
            }
            else {
                TextView textView1 = (TextView)window0.findViewById(0x7F070041);  // id:alertTitle
                f0.l = textView1;
                textView1.setText(f0.d);
                Drawable drawable0 = f0.j;
                if(drawable0 == null) {
                    f0.l.setPadding(f0.k.getPaddingLeft(), f0.k.getPaddingTop(), f0.k.getPaddingRight(), f0.k.getPaddingBottom());
                    f0.k.setVisibility(8);
                }
                else {
                    f0.k.setImageDrawable(drawable0);
                }
            }
        }
        else {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            viewGroup1.addView(f0.n, 0, viewGroup$LayoutParams0);
            window0.findViewById(0x7F070118).setVisibility(8);  // id:title_template
        }
        boolean z = viewGroup0.getVisibility() != 8;
        int v2 = viewGroup1 == null || viewGroup1.getVisibility() == 8 ? 0 : 1;
        boolean z1 = viewGroup3.getVisibility() != 8;
        if(!z1) {
            View view7 = viewGroup2.findViewById(0x7F070111);  // id:textSpacerNoButtons
            if(view7 != null) {
                view7.setVisibility(0);
            }
        }
        if(v2 == 0) {
            View view9 = viewGroup2.findViewById(0x7F070112);  // id:textSpacerNoTitle
            if(view9 != null) {
                view9.setVisibility(0);
            }
        }
        else {
            NestedScrollView nestedScrollView1 = f0.i;
            if(nestedScrollView1 != null) {
                nestedScrollView1.setClipToPadding(true);
            }
            View view8 = f0.e == null ? null : viewGroup1.findViewById(0x7F070117);  // id:titleDividerNoCustom
            if(view8 != null) {
                view8.setVisibility(0);
            }
        }
        AlertController.RecycleListView alertController$RecycleListView0 = f0.e;
        if(alertController$RecycleListView0 instanceof AlertController.RecycleListView) {
            alertController$RecycleListView0.getClass();
            if(!z1 || v2 == 0) {
                alertController$RecycleListView0.setPadding(alertController$RecycleListView0.getPaddingLeft(), (v2 == 0 ? alertController$RecycleListView0.i : alertController$RecycleListView0.getPaddingTop()), alertController$RecycleListView0.getPaddingRight(), (z1 ? alertController$RecycleListView0.getPaddingBottom() : alertController$RecycleListView0.j));
            }
        }
        if(!z) {
            AlertController.RecycleListView alertController$RecycleListView1 = f0.e;
            if(alertController$RecycleListView1 == null) {
                alertController$RecycleListView1 = f0.i;
            }
            if(alertController$RecycleListView1 != null) {
                int v3 = v2 | (z1 ? 2 : 0);
                View view10 = window0.findViewById(0x7F0700D9);  // id:scrollIndicatorUp
                View view11 = window0.findViewById(0x7F0700D8);  // id:scrollIndicatorDown
                if(Build.VERSION.SDK_INT >= 23) {
                    k.m(alertController$RecycleListView1, v3);
                    if(view10 != null) {
                        viewGroup2.removeView(view10);
                    }
                    if(view11 != null) {
                        viewGroup2.removeView(view11);
                    }
                }
                else {
                    if(view10 != null && (v3 & 1) == 0) {
                        viewGroup2.removeView(view10);
                        view10 = null;
                    }
                    if(view11 == null || (v3 & 2) != 0) {
                        view12 = view11;
                    }
                    else {
                        viewGroup2.removeView(view11);
                        view12 = null;
                    }
                    if(view10 != null || view12 != null) {
                        AlertController.RecycleListView alertController$RecycleListView2 = f0.e;
                        if(alertController$RecycleListView2 == null) {
                            if(view10 != null) {
                                viewGroup2.removeView(view10);
                            }
                            if(view12 != null) {
                                viewGroup2.removeView(view12);
                            }
                        }
                        else {
                            alertController$RecycleListView2.setOnScrollListener(new b(view10, view12));
                            f0.e.post(new o(f0, view10, view12, 9));
                        }
                    }
                }
            }
        }
        AlertController.RecycleListView alertController$RecycleListView3 = f0.e;
        if(alertController$RecycleListView3 != null) {
            ListAdapter listAdapter0 = f0.o;
            if(listAdapter0 != null) {
                alertController$RecycleListView3.setAdapter(listAdapter0);
                int v4 = f0.p;
                if(v4 > -1) {
                    alertController$RecycleListView3.setItemChecked(v4, true);
                    alertController$RecycleListView3.setSelection(v4);
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.k.i;
        return nestedScrollView0 == null || !nestedScrollView0.k(keyEvent0) ? super.onKeyDown(v, keyEvent0) : true;
    }

    @Override  // android.app.Dialog
    public final boolean onKeyUp(int v, KeyEvent keyEvent0) {
        NestedScrollView nestedScrollView0 = this.k.i;
        return nestedScrollView0 == null || !nestedScrollView0.k(keyEvent0) ? super.onKeyUp(v, keyEvent0) : true;
    }

    @Override  // android.app.Dialog
    public final void onStop() {
        super.onStop();
        t t0 = (t)this.a();
        t0.Q = false;
        synchronized(j.j) {
            j.c(t0);
        }
        t0.t();
        f.A a0 = t0.p;
        if(a0 != null) {
            a0.w = false;
            j.i i0 = a0.v;
            if(i0 != null) {
                i0.a();
            }
        }
        if(t0.k instanceof Dialog) {
            p p0 = t0.W;
            if(p0 != null) {
                p0.c();
            }
            p p1 = t0.X;
            if(p1 != null) {
                p1.c();
            }
        }
    }

    @Override  // android.app.Dialog
    public final void setContentView(int v) {
        this.a().g(v);
    }

    @Override  // android.app.Dialog
    public final void setContentView(View view0) {
        t t0 = (t)this.a();
        t0.p();
        ViewGroup viewGroup0 = (ViewGroup)t0.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0);
        t0.n.i.onContentChanged();
    }

    @Override  // android.app.Dialog
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        t t0 = (t)this.a();
        t0.p();
        ViewGroup viewGroup0 = (ViewGroup)t0.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0, viewGroup$LayoutParams0);
        t0.n.i.onContentChanged();
    }

    @Override  // android.app.Dialog
    public final void setTitle(int v) {
        super.setTitle(v);
        this.a().h(this.getContext().getString(v));
    }

    @Override  // android.app.Dialog
    public final void setTitle(CharSequence charSequence0) {
        this.d(charSequence0);
        this.k.d = charSequence0;
        TextView textView0 = this.k.l;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }
}

