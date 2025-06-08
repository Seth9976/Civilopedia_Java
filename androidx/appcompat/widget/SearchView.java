package androidx.appcompat.widget;

import H.c;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.internal.ads.u9;
import j.a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.H;
import l.d0;
import l.n;
import l.p0;
import l.q0;
import l.r0;
import l.s0;
import l.t0;
import l.u0;
import l.v0;
import l.w0;
import l.x0;
import l.z0;
import z1.a0;

public class SearchView extends LinearLayoutCompat implements a {
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR;
        public boolean k;

        static {
            SavedState.CREATOR = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.k = ((Boolean)parcel0.readValue(null)).booleanValue();
        }

        @Override
        public final String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("SearchView.SavedState{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder0.append(" isIconified=");
            return u9.g(stringBuilder0, this.k, "}");
        }

        @Override  // androidx.customview.view.AbsSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeValue(Boolean.valueOf(this.k));
        }
    }

    public static class SearchAutoComplete extends n {
        public int l;
        public SearchView m;
        public boolean n;
        public final f o;

        public SearchAutoComplete(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.o = new f(this);
            this.l = this.getThreshold();
        }

        @Override  // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.l <= 0 || super.enoughToFilter();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration0 = this.getResources().getConfiguration();
            int v = configuration0.screenWidthDp;
            int v1 = configuration0.screenHeightDp;
            if(v >= 960 && v1 >= 720 && configuration0.orientation == 2) {
                return 0x100;
            }
            return v >= 600 || v >= 640 && v1 >= 480 ? 0xC0 : 0xA0;
        }

        @Override  // l.n
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
            InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
            if(this.n) {
                this.removeCallbacks(this.o);
                this.post(this.o);
            }
            return inputConnection0;
        }

        @Override  // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
            this.setMinWidth(((int)TypedValue.applyDimension(1, ((float)this.getSearchViewTextMinWidthDp()), displayMetrics0)));
        }

        @Override  // android.widget.AutoCompleteTextView
        public final void onFocusChanged(boolean z, int v, Rect rect0) {
            super.onFocusChanged(z, v, rect0);
            SearchView searchView0 = this.m;
            searchView0.x(searchView0.V);
            searchView0.post(searchView0.l0);
            if(searchView0.x.hasFocus()) {
                searchView0.m();
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public final boolean onKeyPreIme(int v, KeyEvent keyEvent0) {
            if(v == 4) {
                if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState0 != null) {
                        keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                    }
                    return true;
                }
                if(keyEvent0.getAction() == 1) {
                    KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
                    if(keyEvent$DispatcherState1 != null) {
                        keyEvent$DispatcherState1.handleUpEvent(keyEvent0);
                    }
                    if(keyEvent0.isTracking() && !keyEvent0.isCanceled()) {
                        this.m.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(v, keyEvent0);
        }

        @Override  // android.widget.AutoCompleteTextView
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if(z && this.m.hasFocus() && this.getVisibility() == 0) {
                this.n = true;
                if(this.getContext().getResources().getConfiguration().orientation == 2) {
                    Method method0 = (Method)SearchView.o0.l;
                    if(method0 != null) {
                        try {
                            method0.invoke(this, Boolean.TRUE);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }
            }
        }

        @Override  // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override  // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence0) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager0 = (InputMethodManager)this.getContext().getSystemService("input_method");
            f f0 = this.o;
            if(!z) {
                this.n = false;
                this.removeCallbacks(f0);
                inputMethodManager0.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if(inputMethodManager0.isActive(this)) {
                this.n = false;
                this.removeCallbacks(f0);
                inputMethodManager0.showSoftInput(this, 0);
                return;
            }
            this.n = true;
        }

        public void setSearchView(SearchView searchView0) {
            this.m = searchView0;
        }

        @Override  // android.widget.AutoCompleteTextView
        public void setThreshold(int v) {
            super.setThreshold(v);
            this.l = v;
        }
    }

    public final View A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final View F;
    public x0 G;
    public final Rect H;
    public final Rect I;
    public final int[] J;
    public final int[] K;
    public final ImageView L;
    public final Drawable M;
    public final int N;
    public final int O;
    public final Intent P;
    public final Intent Q;
    public final CharSequence R;
    public View.OnFocusChangeListener S;
    public View.OnClickListener T;
    public boolean U;
    public boolean V;
    public c W;
    public boolean a0;
    public CharSequence b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public CharSequence g0;
    public boolean h0;
    public int i0;
    public SearchableInfo j0;
    public Bundle k0;
    public final q0 l0;
    public final q0 m0;
    public final WeakHashMap n0;
    public static final B1.a o0;
    public final SearchAutoComplete x;
    public final View y;
    public final View z;

    static {
        Class class0 = AutoCompleteTextView.class;
        B1.a a0 = new B1.a(23);
        try {
            Method method0 = class0.getDeclaredMethod("doBeforeTextChanged", null);
            a0.j = method0;
            method0.setAccessible(true);
        }
        catch(NoSuchMethodException unused_ex) {
        }
        try {
            Method method1 = class0.getDeclaredMethod("doAfterTextChanged", null);
            a0.k = method1;
            method1.setAccessible(true);
        }
        catch(NoSuchMethodException unused_ex) {
        }
        try {
            Method method2 = class0.getMethod("ensureImeVisible", Boolean.TYPE);
            a0.l = method2;
            method2.setAccessible(true);
        }
        catch(NoSuchMethodException unused_ex) {
        }
        SearchView.o0 = a0;
    }

    public SearchView(Context context0) {
        this(context0, null);
    }

    public SearchView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x7F02012B);  // attr:searchViewStyle
    }

    public SearchView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.H = new Rect();
        this.I = new Rect();
        this.J = new int[2];
        this.K = new int[2];
        this.l0 = new q0(this, 0);
        this.m0 = new q0(this, 1);
        this.n0 = new WeakHashMap();
        androidx.appcompat.widget.c c0 = new androidx.appcompat.widget.c(this);
        d d0 = new d(this);
        t0 t00 = new t0(this);
        H h0 = new H(this, 1);
        d0 d00 = new d0(this, 1);
        p0 p00 = new p0(this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, e.a.u, v, 0);
        B1.a a0 = new B1.a(context0, typedArray0);
        LayoutInflater.from(context0).inflate(typedArray0.getResourceId(9, 0x7F0A0019), this, true);  // layout:abc_search_view
        SearchAutoComplete searchView$SearchAutoComplete0 = (SearchAutoComplete)this.findViewById(0x7F0700E4);  // id:search_src_text
        this.x = searchView$SearchAutoComplete0;
        searchView$SearchAutoComplete0.setSearchView(this);
        this.y = this.findViewById(0x7F0700E0);  // id:search_edit_frame
        View view0 = this.findViewById(0x7F0700E3);  // id:search_plate
        this.z = view0;
        View view1 = this.findViewById(0x7F0700FB);  // id:submit_area
        this.A = view1;
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0700DE);  // id:search_button
        this.B = imageView0;
        ImageView imageView1 = (ImageView)this.findViewById(0x7F0700E1);  // id:search_go_btn
        this.C = imageView1;
        ImageView imageView2 = (ImageView)this.findViewById(0x7F0700DF);  // id:search_close_btn
        this.D = imageView2;
        ImageView imageView3 = (ImageView)this.findViewById(0x7F0700E5);  // id:search_voice_btn
        this.E = imageView3;
        ImageView imageView4 = (ImageView)this.findViewById(0x7F0700E2);  // id:search_mag_icon
        this.L = imageView4;
        view0.setBackground(a0.o(10));
        view1.setBackground(a0.o(14));
        imageView0.setImageDrawable(a0.o(13));
        imageView1.setImageDrawable(a0.o(7));
        imageView2.setImageDrawable(a0.o(4));
        imageView3.setImageDrawable(a0.o(16));
        imageView4.setImageDrawable(a0.o(13));
        this.M = a0.o(12);
        a0.M(imageView0, "Search");
        this.N = typedArray0.getResourceId(15, 0x7F0A0018);  // layout:abc_search_dropdown_item_icons_2line
        this.O = typedArray0.getResourceId(5, 0);
        imageView0.setOnClickListener(c0);
        imageView2.setOnClickListener(c0);
        imageView1.setOnClickListener(c0);
        imageView3.setOnClickListener(c0);
        searchView$SearchAutoComplete0.setOnClickListener(c0);
        searchView$SearchAutoComplete0.addTextChangedListener(p00);
        searchView$SearchAutoComplete0.setOnEditorActionListener(t00);
        searchView$SearchAutoComplete0.setOnItemClickListener(h0);
        searchView$SearchAutoComplete0.setOnItemSelectedListener(d00);
        searchView$SearchAutoComplete0.setOnKeyListener(d0);
        searchView$SearchAutoComplete0.setOnFocusChangeListener(new r0(this));
        this.setIconifiedByDefault(typedArray0.getBoolean(8, true));
        int v1 = typedArray0.getDimensionPixelSize(1, -1);
        if(v1 != -1) {
            this.setMaxWidth(v1);
        }
        this.R = typedArray0.getText(6);
        this.b0 = typedArray0.getText(11);
        int v2 = typedArray0.getInt(3, -1);
        if(v2 != -1) {
            this.setImeOptions(v2);
        }
        int v3 = typedArray0.getInt(2, -1);
        if(v3 != -1) {
            this.setInputType(v3);
        }
        this.setFocusable(typedArray0.getBoolean(0, true));
        a0.C();
        Intent intent0 = new Intent("android.speech.action.WEB_SEARCH");
        this.P = intent0;
        intent0.addFlags(0x10000000);
        intent0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent1 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.Q = intent1;
        intent1.addFlags(0x10000000);
        View view2 = this.findViewById(searchView$SearchAutoComplete0.getDropDownAnchor());
        this.F = view2;
        if(view2 != null) {
            view2.addOnLayoutChangeListener(new s0(this));
        }
        this.x(this.U);
        this.u();
    }

    @Override  // j.a
    public final void b() {
        if(this.h0) {
            return;
        }
        this.h0 = true;
        int v = this.x.getImeOptions();
        this.i0 = v;
        this.x.setImeOptions(v | 0x2000000);
        this.x.setText("");
        this.setIconified(false);
    }

    @Override  // android.view.ViewGroup
    public final void clearFocus() {
        this.d0 = true;
        super.clearFocus();
        this.x.clearFocus();
        this.x.setImeVisibility(false);
        this.d0 = false;
    }

    @Override  // j.a
    public final void d() {
        this.x.setText("");
        int v = this.x.length();
        this.x.setSelection(v);
        this.g0 = "";
        this.clearFocus();
        this.x(true);
        this.x.setImeOptions(this.i0);
        this.h0 = false;
    }

    public int getImeOptions() {
        return this.x.getImeOptions();
    }

    public int getInputType() {
        return this.x.getInputType();
    }

    public int getMaxWidth() {
        return this.e0;
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(0x7F050036);  // dimen:abc_search_view_preferred_height
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(0x7F050037);  // dimen:abc_search_view_preferred_width
    }

    public CharSequence getQuery() {
        return this.x.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence0 = this.b0;
        if(charSequence0 == null) {
            return this.j0 == null || this.j0.getHintId() == 0 ? this.R : this.getContext().getText(this.j0.getHintId());
        }
        return charSequence0;
    }

    public int getSuggestionCommitIconResId() {
        return this.O;
    }

    public int getSuggestionRowLayout() {
        return this.N;
    }

    public c getSuggestionsAdapter() {
        return this.W;
    }

    public final Intent k(Uri uri0, String s, String s1, String s2) {
        Intent intent0 = new Intent(s);
        intent0.addFlags(0x10000000);
        if(uri0 != null) {
            intent0.setData(uri0);
        }
        intent0.putExtra("user_query", this.g0);
        if(s2 != null) {
            intent0.putExtra("query", s2);
        }
        if(s1 != null) {
            intent0.putExtra("intent_extra_data_key", s1);
        }
        Bundle bundle0 = this.k0;
        if(bundle0 != null) {
            intent0.putExtra("app_data", bundle0);
        }
        intent0.setComponent(this.j0.getSearchActivity());
        return intent0;
    }

    public final Intent l(Intent intent0, SearchableInfo searchableInfo0) {
        ComponentName componentName0 = searchableInfo0.getSearchActivity();
        Intent intent1 = new Intent("android.intent.action.SEARCH");
        intent1.setComponent(componentName0);
        PendingIntent pendingIntent0 = PendingIntent.getActivity(this.getContext(), 0, intent1, 0x40000000);
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.k0;
        if(bundle1 != null) {
            bundle0.putParcelable("app_data", bundle1);
        }
        Intent intent2 = new Intent(intent0);
        Resources resources0 = this.getResources();
        String s = searchableInfo0.getVoiceLanguageModeId() == 0 ? "free_form" : resources0.getString(searchableInfo0.getVoiceLanguageModeId());
        String s1 = null;
        String s2 = searchableInfo0.getVoicePromptTextId() == 0 ? null : resources0.getString(searchableInfo0.getVoicePromptTextId());
        String s3 = searchableInfo0.getVoiceLanguageId() == 0 ? null : resources0.getString(searchableInfo0.getVoiceLanguageId());
        int v = searchableInfo0.getVoiceMaxResults() == 0 ? 1 : searchableInfo0.getVoiceMaxResults();
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", s);
        intent2.putExtra("android.speech.extra.PROMPT", s2);
        intent2.putExtra("android.speech.extra.LANGUAGE", s3);
        intent2.putExtra("android.speech.extra.MAX_RESULTS", v);
        if(componentName0 != null) {
            s1 = componentName0.flattenToShortString();
        }
        intent2.putExtra("calling_package", s1);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", pendingIntent0);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle0);
        return intent2;
    }

    public final void m() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.x;
        if(Build.VERSION.SDK_INT >= 29) {
            searchView$SearchAutoComplete0.refreshAutoCompleteResults();
            return;
        }
        B1.a a0 = SearchView.o0;
        Method method0 = (Method)a0.j;
        if(method0 != null) {
            try {
                method0.invoke(searchView$SearchAutoComplete0, null);
            }
            catch(Exception unused_ex) {
            }
        }
        Method method1 = (Method)a0.k;
        if(method1 != null) {
            try {
                method1.invoke(searchView$SearchAutoComplete0, null);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public final void n() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.x;
        if(!TextUtils.isEmpty(searchView$SearchAutoComplete0.getText())) {
            searchView$SearchAutoComplete0.setText("");
            searchView$SearchAutoComplete0.requestFocus();
            searchView$SearchAutoComplete0.setImeVisibility(true);
        }
        else if(this.U) {
            this.clearFocus();
            this.x(true);
        }
    }

    public final void o(int v) {
        int v1;
        Intent intent0;
        Cursor cursor0 = this.W.k;
        if(cursor0 != null && cursor0.moveToPosition(v)) {
            try {
                intent0 = null;
                String s = z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_action"));
                if(s == null) {
                    s = this.j0.getSuggestIntentAction();
                }
                if(s == null) {
                    s = "android.intent.action.SEARCH";
                }
                String s1 = z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_data"));
                if(s1 == null) {
                    s1 = this.j0.getSuggestIntentData();
                }
                if(s1 != null) {
                    String s2 = z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_data_id"));
                    if(s2 != null) {
                        s1 = s1 + "/" + Uri.encode(s2);
                    }
                }
                Uri uri0 = s1 == null ? null : Uri.parse(s1);
                String s3 = z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_query"));
                intent0 = this.k(uri0, s, z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_extra_data")), s3);
                goto label_23;
            }
            catch(RuntimeException runtimeException0) {
            }
            try {
                v1 = -1;
                v1 = cursor0.getPosition();
            }
            catch(RuntimeException unused_ex) {
            }
            Log.w("SearchView", "Search suggestions cursor at row " + v1 + " returned exception.", runtimeException0);
        label_23:
            if(intent0 != null) {
                try {
                    this.getContext().startActivity(intent0);
                }
                catch(RuntimeException runtimeException1) {
                    Log.e("SearchView", "Failed launch activity: " + intent0, runtimeException1);
                }
            }
        }
        this.x.setImeVisibility(false);
        this.x.dismissDropDown();
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        this.removeCallbacks(this.l0);
        this.post(this.m0);
        super.onDetachedFromWindow();
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(z) {
            SearchAutoComplete searchView$SearchAutoComplete0 = this.x;
            searchView$SearchAutoComplete0.getLocationInWindow(this.J);
            this.getLocationInWindow(this.K);
            int v4 = this.J[1] - this.K[1];
            int v5 = this.J[0] - this.K[0];
            int v6 = searchView$SearchAutoComplete0.getWidth();
            int v7 = searchView$SearchAutoComplete0.getHeight();
            Rect rect0 = this.H;
            rect0.set(v5, v4, v6 + v5, v7 + v4);
            Rect rect1 = this.I;
            rect1.set(rect0.left, 0, rect0.right, v3 - v1);
            x0 x00 = this.G;
            if(x00 == null) {
                x0 x01 = new x0(rect1, rect0, searchView$SearchAutoComplete0);
                this.G = x01;
                this.setTouchDelegate(x01);
                return;
            }
            x00.b.set(rect1);
            x00.d.set(rect1);
            int v8 = -x00.e;
            x00.d.inset(v8, v8);
            x00.c.set(rect0);
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public final void onMeasure(int v, int v1) {
        if(this.V) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        switch(v2) {
            case 0x80000000: {
                int v4 = this.e0;
                v3 = v4 <= 0 ? Math.min(this.getPreferredWidth(), v3) : Math.min(v4, v3);
                break;
            }
            case 0: {
                v3 = this.e0;
                if(v3 <= 0) {
                    v3 = this.getPreferredWidth();
                }
                break;
            }
            case 0x40000000: {
                int v5 = this.e0;
                if(v5 > 0) {
                    v3 = Math.min(v5, v3);
                }
            }
        }
        int v6 = View.MeasureSpec.getMode(v1);
        int v7 = View.MeasureSpec.getSize(v1);
        switch(v6) {
            case 0x80000000: {
                v7 = Math.min(this.getPreferredHeight(), v7);
                break;
            }
            case 0: {
                v7 = this.getPreferredHeight();
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, 0x40000000), View.MeasureSpec.makeMeasureSpec(v7, 0x40000000));
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).i);
        this.x(((SavedState)parcelable0).k);
        this.requestLayout();
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.k = this.V;
        return parcelable0;
    }

    @Override  // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.post(this.l0);
    }

    public final void p(int v) {
        Editable editable0 = this.x.getText();
        Cursor cursor0 = this.W.k;
        if(cursor0 != null) {
            if(cursor0.moveToPosition(v)) {
                String s = this.W.c(cursor0);
                if(s != null) {
                    this.setQuery(s);
                    return;
                }
                this.setQuery(editable0);
                return;
            }
            this.setQuery(editable0);
        }
    }

    public final void q(CharSequence charSequence0) {
        this.setQuery(charSequence0);
    }

    public final void r() {
        SearchAutoComplete searchView$SearchAutoComplete0 = this.x;
        Editable editable0 = searchView$SearchAutoComplete0.getText();
        if(editable0 != null && TextUtils.getTrimmedLength(editable0) > 0) {
            if(this.j0 != null) {
                Intent intent0 = this.k(null, "android.intent.action.SEARCH", null, editable0.toString());
                this.getContext().startActivity(intent0);
            }
            searchView$SearchAutoComplete0.setImeVisibility(false);
            searchView$SearchAutoComplete0.dismissDropDown();
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean requestFocus(int v, Rect rect0) {
        if(this.d0) {
            return false;
        }
        if(!this.isFocusable()) {
            return false;
        }
        if(!this.V) {
            boolean z = this.x.requestFocus(v, rect0);
            if(z) {
                this.x(false);
            }
            return z;
        }
        return super.requestFocus(v, rect0);
    }

    public final void s() {
        boolean z = TextUtils.isEmpty(this.x.getText());
        this.D.setVisibility((!z || this.U && !this.h0 ? 0 : 8));
        Drawable drawable0 = this.D.getDrawable();
        if(drawable0 != null) {
            drawable0.setState((z ? ViewGroup.EMPTY_STATE_SET : ViewGroup.ENABLED_STATE_SET));
        }
    }

    public void setAppSearchData(Bundle bundle0) {
        this.k0 = bundle0;
    }

    public void setIconified(boolean z) {
        if(z) {
            this.n();
            return;
        }
        this.x(false);
        this.x.requestFocus();
        this.x.setImeVisibility(true);
        View.OnClickListener view$OnClickListener0 = this.T;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if(this.U == z) {
            return;
        }
        this.U = z;
        this.x(z);
        this.u();
    }

    public void setImeOptions(int v) {
        this.x.setImeOptions(v);
    }

    public void setInputType(int v) {
        this.x.setInputType(v);
    }

    public void setMaxWidth(int v) {
        this.e0 = v;
        this.requestLayout();
    }

    public void setOnCloseListener(u0 u00) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener view$OnFocusChangeListener0) {
        this.S = view$OnFocusChangeListener0;
    }

    public void setOnQueryTextListener(v0 v00) {
    }

    public void setOnSearchClickListener(View.OnClickListener view$OnClickListener0) {
        this.T = view$OnClickListener0;
    }

    public void setOnSuggestionListener(w0 w00) {
    }

    private void setQuery(CharSequence charSequence0) {
        this.x.setText(charSequence0);
        int v = TextUtils.isEmpty(charSequence0) ? 0 : charSequence0.length();
        this.x.setSelection(v);
    }

    public void setQueryHint(CharSequence charSequence0) {
        this.b0 = charSequence0;
        this.u();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.c0 = z;
        c c0 = this.W;
        if(c0 instanceof z0) {
            ((z0)c0).y = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo0) {
        this.j0 = searchableInfo0;
        Intent intent0 = null;
        boolean z = true;
        SearchAutoComplete searchView$SearchAutoComplete0 = this.x;
        if(searchableInfo0 != null) {
            searchView$SearchAutoComplete0.setThreshold(searchableInfo0.getSuggestThreshold());
            searchView$SearchAutoComplete0.setImeOptions(this.j0.getImeOptions());
            int v = this.j0.getInputType();
            if((v & 15) == 1) {
                v &= 0xFFFEFFFF;
                if(this.j0.getSuggestAuthority() != null) {
                    v |= 0x90000;
                }
            }
            searchView$SearchAutoComplete0.setInputType(v);
            c c0 = this.W;
            if(c0 != null) {
                c0.b(null);
            }
            if(this.j0.getSuggestAuthority() != null) {
                z0 z00 = new z0(this.getContext(), this, this.j0, this.n0);
                this.W = z00;
                searchView$SearchAutoComplete0.setAdapter(z00);
                ((z0)this.W).y = this.c0 ? 2 : 1;
            }
            this.u();
        }
        boolean z1 = false;
        if(this.j0 != null && this.j0.getVoiceSearchEnabled()) {
            if(this.j0.getVoiceSearchLaunchWebSearch()) {
                intent0 = this.P;
            }
            else if(this.j0.getVoiceSearchLaunchRecognizer()) {
                intent0 = this.Q;
            }
            if(intent0 != null) {
                if(this.getContext().getPackageManager().resolveActivity(intent0, 0x10000) == null) {
                    z = false;
                }
                z1 = z;
            }
        }
        this.f0 = z1;
        if(z1) {
            searchView$SearchAutoComplete0.setPrivateImeOptions("nm");
        }
        this.x(this.V);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.a0 = z;
        this.x(this.V);
    }

    public void setSuggestionsAdapter(c c0) {
        this.W = c0;
        this.x.setAdapter(c0);
    }

    public final void t() {
        int[] arr_v = this.x.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable drawable0 = this.z.getBackground();
        if(drawable0 != null) {
            drawable0.setState(arr_v);
        }
        Drawable drawable1 = this.A.getBackground();
        if(drawable1 != null) {
            drawable1.setState(arr_v);
        }
        this.invalidate();
    }

    public final void u() {
        CharSequence charSequence0 = this.getQueryHint();
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        SearchAutoComplete searchView$SearchAutoComplete0 = this.x;
        if(this.U) {
            Drawable drawable0 = this.M;
            if(drawable0 != null) {
                int v = (int)(((double)searchView$SearchAutoComplete0.getTextSize()) * 1.25);
                drawable0.setBounds(0, 0, v, v);
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder("   ");
                spannableStringBuilder0.setSpan(new ImageSpan(drawable0), 1, 2, 33);
                spannableStringBuilder0.append(charSequence0);
                charSequence0 = spannableStringBuilder0;
            }
        }
        searchView$SearchAutoComplete0.setHint(charSequence0);
    }

    public final void v() {
        int v = !this.a0 && !this.f0 || this.V || this.C.getVisibility() != 0 && this.E.getVisibility() != 0 ? 8 : 0;
        this.A.setVisibility(v);
    }

    // 去混淆评级： 低(23)
    public final void w(boolean z) {
        int v = !this.a0 || this.V || !this.hasFocus() || !z && this.f0 ? 8 : 0;
        this.C.setVisibility(v);
    }

    public final void x(boolean z) {
        this.V = z;
        int v = 8;
        boolean z1 = TextUtils.isEmpty(this.x.getText());
        this.B.setVisibility((z ? 0 : 8));
        this.w(!z1);
        this.y.setVisibility((z ? 8 : 0));
        int v1 = this.L.getDrawable() == null || this.U ? 8 : 0;
        this.L.setVisibility(v1);
        this.s();
        if(this.f0 && !this.V && z1) {
            this.C.setVisibility(8);
            v = 0;
        }
        this.E.setVisibility(v);
        this.v();
    }
}

