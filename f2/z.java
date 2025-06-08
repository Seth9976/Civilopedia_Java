package f2;

import J2.j;
import android.app.AlertDialog.Builder;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.spears.civilopedia.MyApplication;
import o1.a;
import o2.q;

public final class z extends c {
    public final int q0;
    public Object r0;

    public z(int v) {
        this.q0 = v;
        super();
    }

    @Override  // androidx.fragment.app.c
    public void onAttach(Context context0) {
        if(this.q0 != 0) {
            super.onAttach(context0);
            return;
        }
        j.f(context0, "context");
        super.onAttach(context0);
        if(context0 instanceof A) {
            this.r0 = (A)context0;
        }
    }

    @Override  // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle0) {
        if(this.q0 != 0) {
            return super.onCreateDialog(bundle0);
        }
        new AlertDialog.Builder(this.getActivity());
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(this.getActivity(), 0x7F0F0002));  // style:AlertDialogTheme
        androidx.fragment.app.j j0 = this.getActivity();
        j.c(j0);
        LayoutInflater layoutInflater0 = j0.getLayoutInflater();
        j.e(layoutInflater0, "getLayoutInflater(...)");
        View view0 = layoutInflater0.inflate(0x7F0A0031, null, false);  // layout:dialog_premium_intro
        if(view0 == null) {
            throw new NullPointerException("rootView");
        }
        Bundle bundle1 = this.getArguments();
        j.c(bundle1);
        boolean z = bundle1.getBoolean("PURCHASED");
        alertDialog$Builder0.setTitle(0x7F0E0019).setView(((LinearLayout)view0));  // string:PREMIUM_TITLE "Premium"
        if(z) {
            alertDialog$Builder0.setPositiveButton(0x104000A, new f2.c(0));
        }
        else {
            alertDialog$Builder0.setPositiveButton(0x7F0E0016, new b(this, 1)).setNegativeButton(0x1040000, new f2.c(0));  // string:PREMIUM_BUY "Buy"
        }
        Dialog dialog0 = alertDialog$Builder0.create();
        j.e(dialog0, "create(...)");
        return dialog0;
    }

    @Override  // androidx.fragment.app.h
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(this.q0 != 1) {
            return super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        }
        j.f(layoutInflater0, "inflater");
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        View view0 = layoutInflater0.inflate(0x7F0A0070, viewGroup0, false);  // layout:tree_node_tooltip_view
        TextView textView0 = (TextView)view0.findViewById(0x7F07010F);  // id:text
        j.c(textView0);
        Bundle bundle1 = this.getArguments();
        j.c(bundle1);
        a.V(textView0, bundle1.getString("TITLE"));
        Bundle bundle2 = this.getArguments();
        j.c(bundle2);
        String s = bundle2.getString("TYPE_NAME");
        if(s != null) {
            androidx.fragment.app.j j0 = this.getActivity();
            Object object0 = null;
            Application application0 = j0 == null ? null : j0.getApplication();
            if(application0 instanceof MyApplication) {
                for(Object object1: ((l)((MyApplication)application0).c().k.get()).b.d().d.values()) {
                    if(j.a(((q)object1).b, s)) {
                        object0 = object1;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                this.r0 = (q)object0;
            }
        }
        ImageButton imageButton0 = (ImageButton)view0.findViewById(0x7F070072);  // id:detail
        if(((q)this.r0) != null) {
            imageButton0.setVisibility(0);
        }
        imageButton0.setOnClickListener(new r2.a(this, 1));
        return view0;
    }
}

