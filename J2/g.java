package j2;

import J2.j;
import O2.A;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spears.civilopedia.db.tables.CivilopediaPageLayoutChapters;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import o1.a;
import o2.f;
import o2.h;
import o2.q;
import o2.x;

public abstract class g {
    public LinearLayout a;
    public LinearLayout b;
    public LinearLayout c;
    public q d;
    public x e;
    public f f;
    public o2.g g;
    public h h;

    public void a() {
        for(Object object0: this.q().i(this.p().d)) {
            x x0 = this.q();
            q q0 = this.p();
            q q1 = this.p();
            String s = ((CivilopediaPageLayoutChapters)object0).getChapterId();
            String s1 = x0.g(q0.a, q1.b, s);
            x x1 = this.q();
            q q2 = this.p();
            q q3 = this.p();
            String s2 = ((CivilopediaPageLayoutChapters)object0).getChapterId();
            ArrayList arrayList0 = x1.f(q2.a, q3.b, s2);
            j.c(s1);
            this.b(s1, arrayList0);
        }
    }

    public final void b(String s, List list0) {
        j.f(s, "header");
        if(list0.isEmpty()) {
            return;
        }
        View view0 = this.r(0x7F0A004A);  // layout:page_chapter
        TextView textView0 = (TextView)view0.findViewById(0x7F070116);  // id:title
        TextView textView1 = (TextView)view0.findViewById(0x7F0700BD);  // id:paragraph
        j.c(textView0);
        a.U(textView0, s);
        CharSequence charSequence0 = "";
        int v = 0;
        for(Object object0: list0) {
            if(v >= 0) {
                Context context0 = view0.getContext();
                j.e(context0, "getContext(...)");
                charSequence0 = TextUtils.concat(new CharSequence[]{charSequence0, a.O(context0, ((String)object0), false)});
                j.e(charSequence0, "concat(...)");
                if(v != list0.size() - 1) {
                    charSequence0 = TextUtils.concat(new CharSequence[]{charSequence0, "\n\n"});
                    j.e(charSequence0, "concat(...)");
                }
                ++v;
                continue;
            }
            x2.j.D();
            throw null;
        }
        textView1.setText(charSequence0);
        this.i(view0);
    }

    public final void c(String s) {
        View view0 = this.r(0x7F0A004B);  // layout:page_chapter_header
        TextView textView0 = (TextView)view0.findViewById(0x7F070116);  // id:title
        j.c(textView0);
        a.U(textView0, s);
        this.i(view0);
    }

    public final void d(String s, String s1) {
        View view0 = this.r(0x7F0A0055);  // layout:page_stat_box_header_body
        TextView textView0 = (TextView)view0.findViewById(0x7F07008B);  // id:header
        TextView textView1 = (TextView)view0.findViewById(0x7F07004B);  // id:body
        j.c(textView0);
        a.U(textView0, s);
        j.c(textView1);
        a.V(textView1, s1);
        this.i(view0);
    }

    public final void e(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            TextView textView0 = (TextView)this.r(0x7F0A004E);  // layout:page_paragraph
            a.V(textView0, ((String)object0));
            this.i(textView0);
        }
    }

    public final void f(String s) {
        j.f(s, "imageName");
        View view0 = this.r(0x7F0A004F);  // layout:page_portrait
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0700C4);  // id:portrait_frame
        ImageView imageView1 = (ImageView)view0.findViewById(0x7F07008E);  // id:icon
        imageView0.setVisibility((A.I().c() ? 0 : 8));
        String s1 = A.I().c() ? "civ5_" : "";
        j.c(imageView1);
        a.Q(imageView1, s1 + s + "_256");
        this.j(view0);
    }

    public static void g(g g0, String s, int v) {
        g0.getClass();
        j.f(s, "quote");
        View view0 = g0.r(0x7F0A0051);  // layout:page_quote
        TextView textView0 = (TextView)view0.findViewById(0x7F0700CB);  // id:quote_text
        Context context0 = textView0.getContext();
        j.e(context0, "getContext(...)");
        textView0.setText(a.O(context0, s, (v & 4) == 0));
        g0.j(view0);
    }

    public final void h(String s) {
        j.f(s, "portraitName");
        View view0 = this.r(0x7F0A0050);  // layout:page_portrait_tall
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0700C3);  // id:portrait
        j.c(imageView0);
        a.Q(imageView0, s + "_256");
        this.j(view0);
    }

    public final void i(View view0) {
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 != null) {
            linearLayout0.addView(view0);
            return;
        }
        j.l("leftBox");
        throw null;
    }

    public final void j(View view0) {
        LinearLayout linearLayout0 = this.c;
        if(linearLayout0 != null) {
            linearLayout0.addView(view0);
            return;
        }
        j.l("rightBox");
        throw null;
    }

    public abstract void k();

    public final LinearLayout l() {
        LinearLayout linearLayout0 = this.a;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        j.l("container");
        throw null;
    }

    public final f m() {
        f f0 = this.f;
        if(f0 != null) {
            return f0;
        }
        j.l("gameInfo");
        throw null;
    }

    public final o2.g n() {
        o2.g g0 = this.g;
        if(g0 != null) {
            return g0;
        }
        j.l("gameInfoCiv5");
        throw null;
    }

    public final h o() {
        h h0 = this.h;
        if(h0 != null) {
            return h0;
        }
        j.l("gameInfoCiv7");
        throw null;
    }

    public final q p() {
        q q0 = this.d;
        if(q0 != null) {
            return q0;
        }
        j.l("page");
        throw null;
    }

    public final x q() {
        x x0 = this.e;
        if(x0 != null) {
            return x0;
        }
        j.l("support");
        throw null;
    }

    public final View r(int v) {
        View view0 = LayoutInflater.from(this.l().getContext()).inflate(v, this.l(), false);
        j.e(view0, "inflate(...)");
        return view0;
    }

    public final void s(String s) {
        if(s == null) {
            this.l().removeViewAt(0);
            return;
        }
        View view0 = this.l().findViewById(0x7F070116);  // id:title
        j.e(view0, "findViewById(...)");
        Pattern pattern0 = Pattern.compile("\\[icon_(\\w+?)\\]", 66);
        j.e(pattern0, "compile(...)");
        String s1 = pattern0.matcher(s).replaceAll("");
        j.e(s1, "replaceAll(...)");
        ((TextView)view0).setText(s1);
    }
}

