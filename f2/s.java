package f2;

import J2.j;
import android.widget.SearchView.OnCloseListener;
import android.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.spears.civilopedia.MainActivity;

public final class s implements SearchView.OnCloseListener {
    public final SearchView a;
    public final MainActivity b;

    public s(SearchView searchView0, MainActivity mainActivity0) {
        this.a = searchView0;
        this.b = mainActivity0;
    }

    @Override  // android.widget.SearchView$OnCloseListener
    public final boolean onClose() {
        j.f(this.a, "$searchView");
        MainActivity mainActivity0 = this.b;
        j.f(mainActivity0, "this$0");
        this.a.clearFocus();
        RecyclerView recyclerView0 = mainActivity0.B;
        if(recyclerView0 != null) {
            v v0 = mainActivity0.C;
            if(v0 != null) {
                recyclerView0.setAdapter(v0);
                return false;
            }
            j.l("viewAdapter");
            throw null;
        }
        j.l("listView");
        throw null;
    }
}

