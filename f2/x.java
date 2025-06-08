package f2;

import J2.j;
import N.T;
import N.z;
import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import o1.a;

public final class x extends z {
    public Object b;

    @Override  // N.z
    public final int a() {
        return ((List)this.b).size();
    }

    @Override  // N.z
    public final int b(int v) {
        return ((q)((List)this.b).get(v)).getType();
    }

    @Override  // N.z
    public final void c(T t0, int v) {
        q q0 = (q)((List)this.b).get(v);
        SpannableString spannableString0 = null;
        o o0 = q0 instanceof o ? ((o)q0) : null;
        TextView textView0 = ((w)t0).t;
        if(o0 != null) {
            textView0.setText(o0.a.g);
        }
        y y0 = q0 instanceof y ? ((y)q0) : null;
        if(y0 != null) {
            o2.q q1 = y0.a;
            String s = q1.i;
            if(s != null) {
                Context context0 = textView0.getContext();
                j.e(context0, "getContext(...)");
                spannableString0 = a.O(context0, s, false);
            }
            textView0.setText(spannableString0);
            ((w)t0).s.setContentDescription(q1.b);
        }
    }

    @Override  // N.z
    public final T d(ViewGroup viewGroup0, int v) {
        if(v == 0) {
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A0034, viewGroup0, false);  // layout:item_page_header
            j.d(view0, "null cannot be cast to non-null type android.widget.LinearLayout");
            return new w(((LinearLayout)view0));
        }
        View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A0035, viewGroup0, false);  // layout:item_page_list
        j.d(view1, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new w(((LinearLayout)view1));
    }
}

