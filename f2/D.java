package f2;

import J2.j;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.c;

public final class d extends c {
    public String q0;
    public int r0;
    public String[] s0;
    public e t0;

    @Override  // androidx.fragment.app.c
    public final void onAttach(Context context0) {
        j.f(context0, "context");
        super.onAttach(context0);
        if(context0 instanceof e) {
            this.t0 = (e)context0;
        }
    }

    @Override  // androidx.fragment.app.c
    public final Dialog onCreateDialog(Bundle bundle0) {
        new AlertDialog.Builder(this.getActivity());
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(this.getActivity(), 0x7F0F0002));  // style:AlertDialogTheme
        if(this.getArguments() == null) {
            Dialog dialog0 = alertDialog$Builder0.create();
            j.e(dialog0, "create(...)");
            return dialog0;
        }
        Bundle bundle1 = this.getArguments();
        j.c(bundle1);
        String[] arr_s = bundle1.getStringArray("ITEMS");
        j.c(arr_s);
        this.s0 = arr_s;
        Bundle bundle2 = this.getArguments();
        j.c(bundle2);
        String s = bundle2.getString("TITLE");
        j.c(s);
        this.q0 = s;
        Bundle bundle3 = this.getArguments();
        j.c(bundle3);
        this.r0 = bundle3.getInt("SELECTED");
        androidx.fragment.app.j j0 = this.getActivity();
        j.c(j0);
        LayoutInflater layoutInflater0 = j0.getLayoutInflater();
        j.e(layoutInflater0, "getLayoutInflater(...)");
        View view0 = layoutInflater0.inflate(0x7F0A0032, null);  // layout:dialog_radiobutton
        RadioGroup radioGroup0 = (RadioGroup)view0.findViewById(0x7F0700CD);  // id:radio_group
        float f = this.getResources().getDisplayMetrics().density;
        String[] arr_s1 = this.s0;
        if(arr_s1 != null) {
            int v = 0;
            for(int v1 = 0; v < arr_s1.length; ++v1) {
                String s1 = arr_s1[v];
                RadioButton radioButton0 = new RadioButton(this.getActivity());
                radioButton0.setLayoutParams(new ViewGroup.LayoutParams(-1, ((int)(48.0f * f))));
                radioButton0.setText(s1);
                radioButton0.setButtonTintList(new ColorStateList(new int[][]{new int[]{0xFEFEFF60}, new int[]{0x10100A0}}, new int[]{Color.argb(0x89, 0, 0, 0), this.getResources().getColor(0x7F04002A)}));  // color:button
                radioButton0.setOnClickListener(new a(this, v1));
                radioGroup0.addView(radioButton0);
                if(this.r0 == v1) {
                    radioGroup0.check(radioButton0.getId());
                }
                ++v;
            }
            alertDialog$Builder0.setTitle(this.q0).setView(view0).setPositiveButton(0x104000A, new b(this, 0)).setNegativeButton(0x1040000, new f2.c(0));
            Dialog dialog1 = alertDialog$Builder0.create();
            j.e(dialog1, "create(...)");
            return dialog1;
        }
        j.l("items");
        throw null;
    }
}

