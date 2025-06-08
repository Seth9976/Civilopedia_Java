package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;

public final class f implements Runnable {
    public final SearchAutoComplete i;

    public f(SearchAutoComplete searchView$SearchAutoComplete0) {
        this.i = searchView$SearchAutoComplete0;
    }

    @Override
    public final void run() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.i;
        if(searchView$SearchAutoComplete0.n) {
            ((InputMethodManager)searchView$SearchAutoComplete0.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete0, 0);
            searchView$SearchAutoComplete0.n = false;
        }
    }
}

