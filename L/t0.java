package l;

import android.view.KeyEvent;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

public final class t0 implements TextView.OnEditorActionListener {
    public final SearchView a;

    public t0(SearchView searchView0) {
        this.a = searchView0;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        this.a.r();
        return true;
    }
}

