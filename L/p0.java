package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

public final class p0 implements TextWatcher {
    public final SearchView i;

    public p0(SearchView searchView0) {
        this.i = searchView0;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        SearchView searchView0 = this.i;
        Editable editable0 = searchView0.x.getText();
        searchView0.g0 = editable0;
        boolean z = TextUtils.isEmpty(editable0);
        searchView0.w(!z);
        int v3 = 8;
        if(searchView0.f0 && !searchView0.V && z) {
            searchView0.C.setVisibility(8);
            v3 = 0;
        }
        searchView0.E.setVisibility(v3);
        searchView0.s();
        searchView0.v();
        charSequence0.toString();
    }
}

