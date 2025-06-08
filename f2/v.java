package f2;

import J2.j;
import N.T;
import N.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import o1.a;
import o2.t;

public final class v extends z {
    public Object b;

    @Override  // N.z
    public final int a() {
        return ((List)this.b).size();
    }

    @Override  // N.z
    public final void c(T t0, int v) {
        t t1 = (t)((List)this.b).get(v);
        TextView textView0 = (TextView)((u)t0).s.findViewById(0x7F07010F);  // id:text
        ImageView imageView0 = (ImageView)((u)t0).s.findViewById(0x7F070092);  // id:image
        j.c(textView0);
        a.U(textView0, t1.b);
        j.c(imageView0);
        a.Q(imageView0, t1.c);
        ((u)t0).s.setContentDescription(t1.a);
    }

    @Override  // N.z
    public final T d(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0A003A, viewGroup0, false);  // layout:item_single_line_list
        j.d(view0, "null cannot be cast to non-null type android.widget.LinearLayout");
        return new u(((LinearLayout)view0));
    }
}

