package l2;

import J2.j;
import O2.A;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.spears.civilopedia.planning.PlanningActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n2.c;
import n2.m;
import o2.s;
import x2.k;
import z1.a0;

public final class b extends View {
    public final String i;
    public final Paint j;
    public final Paint k;
    public final Path l;
    public final Path m;

    public b(PlanningActivity planningActivity0, String s, c c0) {
        j.f(s, "leaderType");
        j.f(c0, "cityMap");
        super(planningActivity0);
        this.i = s;
        Paint paint0 = new Paint();
        this.j = paint0;
        Paint paint1 = new Paint();
        this.k = paint1;
        this.l = this.a(a0.e(c0, null));
        this.m = this.a(a0.e(c0, 6.0f));
        s s1 = (s)((Map)m.e).get(s);
        if(s1 == null) {
            throw new IllegalStateException("");
        }
        Paint.Style paint$Style0 = Paint.Style.STROKE;
        paint0.setStyle(paint$Style0);
        paint0.setColor(s1.a);
        paint0.setStrokeWidth(this.getResources().getDisplayMetrics().density * 6.0f);
        Paint.Cap paint$Cap0 = Paint.Cap.ROUND;
        paint0.setStrokeCap(paint$Cap0);
        Paint.Join paint$Join0 = Paint.Join.ROUND;
        paint0.setStrokeJoin(paint$Join0);
        paint1.setStyle(paint$Style0);
        paint1.setColor(s1.b);
        paint1.setStrokeWidth(6.0f * this.getResources().getDisplayMetrics().density);
        paint1.setStrokeCap(paint$Cap0);
        paint1.setStrokeJoin(paint$Join0);
        paint1.setShadowLayer(5.0f * this.getResources().getDisplayMetrics().density, 0.0f, 0.0f, s1.b);
    }

    public final Path a(ArrayList arrayList0) {
        Path path0 = new Path();
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object0: arrayList0) {
            Resources resources0 = this.getResources();
            j.e(resources0, "getResources(...)");
            arrayList1.add(A.e(((List)object0), resources0));
        }
        for(Object object1: arrayList1) {
            path0.addPath(((Path)object1));
        }
        return path0;
    }

    public final String getLeaderType() {
        return this.i;
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        j.f(canvas0, "canvas");
        super.onDraw(canvas0);
        canvas0.drawPath(this.l, this.j);
        canvas0.drawPath(this.m, this.k);
    }
}

