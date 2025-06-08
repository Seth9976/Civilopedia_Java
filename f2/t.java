package f2;

import J2.j;
import Y3.n;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.spears.civilopedia.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import o1.a;
import o2.q;
import o2.x;

public final class t implements SearchView.OnQueryTextListener {
    public final MainActivity a;
    public final SearchView b;

    public t(SearchView searchView0, MainActivity mainActivity0) {
        this.a = mainActivity0;
        this.b = searchView0;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextChange(String s) {
        ArrayList arrayList0;
        MainActivity mainActivity0 = this.a;
        v v0 = mainActivity0.C;
        if(v0 != null) {
            Object object0 = v0.b;
            x x0 = mainActivity0.l().b.d();
            if(s == null || s.length() == 0) {
                arrayList0 = new ArrayList();
            }
            else {
                arrayList0 = new ArrayList();
                Locale locale0 = Locale.getDefault();
                for(Object object1: x0.c.entrySet()) {
                    for(Object object2: ((List)((Map.Entry)object1).getValue())) {
                        q q0 = (q)object2;
                        String s1 = q0.i;
                        if(s1 != null) {
                            j.c(locale0);
                            String s2 = s1.toLowerCase(locale0);
                            j.e(s2, "toLowerCase(...)");
                            String s3 = a.Z(s2);
                            String s4 = s.toLowerCase(locale0);
                            j.e(s4, "toLowerCase(...)");
                            if(n.t0(s3, a.Z(s4))) {
                                arrayList0.add(q0);
                            }
                        }
                    }
                }
            }
            G g0 = new G(((List)object0), arrayList0);
            mainActivity0.D = g0;
            RecyclerView recyclerView0 = mainActivity0.B;
            if(recyclerView0 != null) {
                recyclerView0.setAdapter(g0);
                return true;
            }
            j.l("listView");
            throw null;
        }
        j.l("viewAdapter");
        throw null;
    }

    @Override  // android.widget.SearchView$OnQueryTextListener
    public final boolean onQueryTextSubmit(String s) {
        this.b.clearFocus();
        return true;
    }
}

