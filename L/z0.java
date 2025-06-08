package l;

import H.a;
import H.b;
import H.c;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import v.j;

public final class z0 extends c implements View.OnClickListener {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public static final int G;
    public final int q;
    public final int r;
    public final LayoutInflater s;
    public final SearchView t;
    public final SearchableInfo u;
    public final Context v;
    public final WeakHashMap w;
    public final int x;
    public int y;
    public ColorStateList z;

    public z0(Context context0, SearchView searchView0, SearchableInfo searchableInfo0, WeakHashMap weakHashMap0) {
        int v = searchView0.getSuggestionRowLayout();
        super();
        this.j = true;
        this.k = null;
        this.i = false;
        this.l = context0;
        this.m = -1;
        this.n = new a(this);
        this.o = new b(this, 0);
        this.r = v;
        this.q = v;
        this.s = (LayoutInflater)context0.getSystemService("layout_inflater");
        this.y = 1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        SearchManager searchManager0 = (SearchManager)this.l.getSystemService("search");
        this.t = searchView0;
        this.u = searchableInfo0;
        this.x = searchView0.getSuggestionCommitIconResId();
        this.v = context0;
        this.w = weakHashMap0;
    }

    @Override  // H.c
    public final void a(View view0, Cursor cursor0) {
        ActivityInfo activityInfo0;
        Drawable drawable0;
        String s2;
        Object object0 = view0.getTag();
        int v = this.F == -1 ? 0 : cursor0.getInt(this.F);
        TextView textView0 = ((y0)object0).a;
        if(textView0 != null) {
            String s = z0.h(cursor0, this.A);
            textView0.setText(s);
            if(TextUtils.isEmpty(s)) {
                textView0.setVisibility(8);
            }
            else {
                textView0.setVisibility(0);
            }
        }
        TextView textView1 = ((y0)object0).b;
        if(textView1 != null) {
            String s1 = z0.h(cursor0, this.C);
            if(s1 == null) {
                s2 = z0.h(cursor0, this.B);
            }
            else {
                if(this.z == null) {
                    TypedValue typedValue0 = new TypedValue();
                    this.l.getTheme().resolveAttribute(0x7F020153, typedValue0, true);  // attr:textColorSearchUrl
                    this.z = this.l.getResources().getColorStateList(typedValue0.resourceId);
                }
                s2 = new SpannableString(s1);
                ((SpannableString)s2).setSpan(new TextAppearanceSpan(null, 0, 0, this.z, null), 0, s1.length(), 33);
            }
            if(!TextUtils.isEmpty(s2)) {
                if(textView0 != null) {
                    textView0.setSingleLine(true);
                    textView0.setMaxLines(1);
                }
            }
            else if(textView0 != null) {
                textView0.setSingleLine(false);
                textView0.setMaxLines(2);
            }
            textView1.setText(s2);
            if(TextUtils.isEmpty(s2)) {
                textView1.setVisibility(8);
            }
            else {
                textView1.setVisibility(0);
            }
        }
        ImageView imageView0 = ((y0)object0).c;
        if(imageView0 != null) {
            int v1 = this.D;
            if(v1 == -1) {
                drawable0 = null;
            }
            else {
                drawable0 = this.f(cursor0.getString(v1));
                if(drawable0 == null) {
                    ComponentName componentName0 = this.u.getSearchActivity();
                    String s3 = componentName0.flattenToShortString();
                    WeakHashMap weakHashMap0 = this.w;
                    if(weakHashMap0.containsKey(s3)) {
                        Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakHashMap0.get(s3);
                        drawable0 = drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable(this.v.getResources());
                    }
                    else {
                        PackageManager packageManager0 = this.l.getPackageManager();
                        try {
                            activityInfo0 = packageManager0.getActivityInfo(componentName0, 0x80);
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            Log.w("SuggestionsAdapter", packageManager$NameNotFoundException0.toString());
                            drawable0 = null;
                            goto label_70;
                        }
                        int v2 = activityInfo0.getIconResource();
                        if(v2 == 0) {
                            drawable0 = null;
                        }
                        else {
                            Drawable drawable1 = packageManager0.getDrawable(componentName0.getPackageName(), v2, activityInfo0.applicationInfo);
                            if(drawable1 == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + v2 + " for " + componentName0.flattenToShortString());
                                drawable0 = null;
                            }
                            else {
                                drawable0 = drawable1;
                            }
                        }
                    label_70:
                        weakHashMap0.put(s3, (drawable0 == null ? null : drawable0.getConstantState()));
                    }
                    if(drawable0 == null) {
                        drawable0 = this.l.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView0.setImageDrawable(drawable0);
            if(drawable0 == null) {
                imageView0.setVisibility(4);
            }
            else {
                imageView0.setVisibility(0);
                drawable0.setVisible(false, false);
                drawable0.setVisible(true, false);
            }
        }
        ImageView imageView1 = ((y0)object0).d;
        if(imageView1 != null) {
            Drawable drawable2 = this.E == -1 ? null : this.f(cursor0.getString(this.E));
            imageView1.setImageDrawable(drawable2);
            if(drawable2 == null) {
                imageView1.setVisibility(8);
            }
            else {
                imageView1.setVisibility(0);
                drawable2.setVisible(false, false);
                drawable2.setVisible(true, false);
            }
        }
        int v3 = this.y;
        ImageView imageView2 = ((y0)object0).e;
        if(v3 != 2 && (v3 != 1 || (v & 1) == 0)) {
            imageView2.setVisibility(8);
            return;
        }
        imageView2.setVisibility(0);
        imageView2.setTag(textView0.getText());
        imageView2.setOnClickListener(this);
    }

    @Override  // H.c
    public final void b(Cursor cursor0) {
        try {
            super.b(cursor0);
            if(cursor0 != null) {
                this.A = cursor0.getColumnIndex("suggest_text_1");
                this.B = cursor0.getColumnIndex("suggest_text_2");
                this.C = cursor0.getColumnIndex("suggest_text_2_url");
                this.D = cursor0.getColumnIndex("suggest_icon_1");
                this.E = cursor0.getColumnIndex("suggest_icon_2");
                this.F = cursor0.getColumnIndex("suggest_flags");
            }
        }
        catch(Exception exception0) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception0);
        }
    }

    @Override  // H.c
    public final String c(Cursor cursor0) {
        if(cursor0 == null) {
            return null;
        }
        String s = z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_query"));
        if(s != null) {
            return s;
        }
        SearchableInfo searchableInfo0 = this.u;
        if(searchableInfo0.shouldRewriteQueryFromData()) {
            String s1 = z0.h(cursor0, cursor0.getColumnIndex("suggest_intent_data"));
            if(s1 != null) {
                return s1;
            }
        }
        if(searchableInfo0.shouldRewriteQueryFromText()) {
            String s2 = z0.h(cursor0, cursor0.getColumnIndex("suggest_text_1"));
            return s2 == null ? null : s2;
        }
        return null;
    }

    @Override  // H.c
    public final View d(ViewGroup viewGroup0) {
        View view0 = this.s.inflate(this.q, viewGroup0, false);
        view0.setTag(new y0(view0));
        ((ImageView)view0.findViewById(0x7F07007D)).setImageResource(this.x);  // id:edit_query
        return view0;
    }

    public final Drawable e(Uri uri0) {
        int v1;
        Resources resources0;
        String s = uri0.getAuthority();
        if(TextUtils.isEmpty(s)) {
            throw new FileNotFoundException("No authority: " + uri0);
        }
        try {
            resources0 = this.l.getPackageManager().getResourcesForApplication(s);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new FileNotFoundException("No package found for authority: " + uri0);
        }
        List list0 = uri0.getPathSegments();
        if(list0 == null) {
            throw new FileNotFoundException("No path: " + uri0);
        }
        int v = list0.size();
        if(v == 1) {
            try {
                v1 = Integer.parseInt(((String)list0.get(0)));
            }
            catch(NumberFormatException unused_ex) {
                throw new FileNotFoundException("Single path segment is not a resource ID: " + uri0);
            }
        }
        else {
            if(v != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri0);
            }
            v1 = resources0.getIdentifier(((String)list0.get(1)), ((String)list0.get(0)), s);
        }
        if(v1 == 0) {
            throw new FileNotFoundException("No resource found for: " + uri0);
        }
        return resources0.getDrawable(v1);
    }

    public final Drawable f(String s) {
        Drawable drawable4;
        WeakHashMap weakHashMap0 = this.w;
        Context context0 = this.v;
        Drawable drawable0 = null;
        if(s != null && !s.isEmpty() && !"0".equals(s)) {
            try {
                int v = Integer.parseInt(s);
                String s1 = "android.resource://com.spears.civilopedia/" + v;
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakHashMap0.get(s1);
                Drawable drawable1 = drawable$ConstantState0 == null ? null : drawable$ConstantState0.newDrawable();
                if(drawable1 != null) {
                    return drawable1;
                }
                Drawable drawable2 = j.getDrawable(context0, v);
                if(drawable2 != null) {
                    weakHashMap0.put(s1, drawable2.getConstantState());
                }
                return drawable2;
            }
            catch(NumberFormatException unused_ex) {
                Drawable.ConstantState drawable$ConstantState1 = (Drawable.ConstantState)weakHashMap0.get(s);
                Drawable drawable3 = drawable$ConstantState1 == null ? null : drawable$ConstantState1.newDrawable();
                if(drawable3 != null) {
                    return drawable3;
                }
                Uri uri0 = Uri.parse(s);
                try {
                    if("android.resource".equals(uri0.getScheme())) {
                        try {
                            drawable0 = this.e(uri0);
                        }
                        catch(Resources.NotFoundException unused_ex) {
                            throw new FileNotFoundException("Resource does not exist: " + uri0);
                        }
                    }
                    else {
                        InputStream inputStream0 = context0.getContentResolver().openInputStream(uri0);
                        if(inputStream0 == null) {
                            throw new FileNotFoundException("Failed to open " + uri0);
                        }
                        try {
                            drawable4 = Drawable.createFromStream(inputStream0, null);
                        }
                        catch(Throwable throwable0) {
                            try {
                                inputStream0.close();
                            }
                            catch(IOException iOException0) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri0, iOException0);
                            }
                            throw throwable0;
                        }
                        try {
                            inputStream0.close();
                        }
                        catch(IOException iOException1) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri0, iOException1);
                        }
                        drawable0 = drawable4;
                    }
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri0 + ", " + fileNotFoundException0.getMessage());
                }
                if(drawable0 != null) {
                    weakHashMap0.put(s, drawable0.getConstantState());
                    return drawable0;
                }
            }
            catch(Resources.NotFoundException unused_ex) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + s);
                return null;
            }
        }
        return drawable0;
    }

    public final Cursor g(SearchableInfo searchableInfo0, String s) {
        String[] arr_s = null;
        if(searchableInfo0 == null) {
            return null;
        }
        String s1 = searchableInfo0.getSuggestAuthority();
        if(s1 == null) {
            return null;
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("content").authority(s1).query("").fragment("");
        String s2 = searchableInfo0.getSuggestPath();
        if(s2 != null) {
            uri$Builder0.appendEncodedPath(s2);
        }
        uri$Builder0.appendPath("search_suggest_query");
        String s3 = searchableInfo0.getSuggestSelection();
        if(s3 == null) {
            uri$Builder0.appendPath(s);
        }
        else {
            arr_s = new String[]{s};
        }
        uri$Builder0.appendQueryParameter("limit", "50");
        Uri uri0 = uri$Builder0.build();
        return this.l.getContentResolver().query(uri0, null, s3, arr_s, null);
    }

    @Override  // H.c
    public final View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
        try {
            return super.getDropDownView(v, view0, viewGroup0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException0);
            View view1 = this.s.inflate(this.r, viewGroup0, false);
            if(view1 != null) {
                ((y0)view1.getTag()).a.setText(runtimeException0.toString());
            }
            return view1;
        }
    }

    @Override  // H.c
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        try {
            return super.getView(v, view0, viewGroup0);
        }
        catch(RuntimeException runtimeException0) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException0);
            View view1 = this.d(viewGroup0);
            ((y0)view1.getTag()).a.setText(runtimeException0.toString());
            return view1;
        }
    }

    public static String h(Cursor cursor0, int v) {
        if(v == -1) {
            return null;
        }
        try {
            return cursor0.getString(v);
        }
        catch(Exception exception0) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception0);
            return null;
        }
    }

    @Override  // android.widget.BaseAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Bundle bundle0 = this.k == null ? null : this.k.getExtras();
        if(bundle0 != null) {
            bundle0.getBoolean("in_progress");
        }
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Bundle bundle0 = this.k == null ? null : this.k.getExtras();
        if(bundle0 != null) {
            bundle0.getBoolean("in_progress");
        }
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = view0.getTag();
        if(object0 instanceof CharSequence) {
            this.t.q(((CharSequence)object0));
        }
    }
}

