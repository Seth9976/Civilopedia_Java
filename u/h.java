package u;

import android.app.Notification.Action.Builder;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c0.b;
import c0.e;
import com.google.android.gms.internal.ads.y8;
import g1.n;
import java.util.ArrayList;
import java.util.Iterator;
import l.O;
import l.S;
import p.c;

public final class h {
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public final boolean i;
    public n j;
    public boolean k;
    public Bundle l;
    public String m;
    public final boolean n;
    public final Notification o;
    public final ArrayList p;

    public h(Context context0, String s) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.i = true;
        this.k = false;
        Notification notification0 = new Notification();
        this.o = notification0;
        this.a = context0;
        this.m = s;
        notification0.when = System.currentTimeMillis();
        notification0.audioStreamType = -1;
        this.h = 0;
        this.p = new ArrayList();
        this.n = true;
    }

    public final Notification a() {
        Notification notification1;
        Iterator iterator2;
        ArrayList arrayList2;
        Notification.Action.Builder notification$Action$Builder0;
        Icon icon0;
        Iterator iterator1;
        new ArrayList();
        Bundle bundle0 = new Bundle();
        Notification.Builder notification$Builder0 = Build.VERSION.SDK_INT < 26 ? new Notification.Builder(this.a) : b.d(this.a, this.m);
        Notification notification0 = this.o;
        boolean z = true;
        Notification.Builder notification$Builder1 = notification$Builder0.setWhen(notification0.when).setSmallIcon(notification0.icon, notification0.iconLevel).setContent(notification0.contentView).setTicker(notification0.tickerText, null).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setOngoing((notification0.flags & 2) != 0).setOnlyAlertOnce((notification0.flags & 8) != 0).setAutoCancel((notification0.flags & 16) != 0).setDefaults(notification0.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification0.deleteIntent);
        if((notification0.flags & 0x80) == 0) {
            z = false;
        }
        notification$Builder1.setFullScreenIntent(null, z).setLargeIcon(null).setNumber(0).setProgress(0, 0, false);
        notification$Builder0.setSubText(null).setUsesChronometer(false).setPriority(this.h);
        Iterator iterator0 = this.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            g g0 = (g)object0;
            int v = Build.VERSION.SDK_INT;
            if(g0.b == null) {
                int v1 = g0.e;
                if(v1 != 0) {
                    g0.b = IconCompat.a(v1);
                }
            }
            IconCompat iconCompat0 = g0.b;
            PendingIntent pendingIntent0 = g0.g;
            CharSequence charSequence0 = g0.f;
            if(v >= 23) {
                if(iconCompat0 == null) {
                    iterator1 = iterator0;
                    icon0 = null;
                }
                else {
                    switch(iconCompat0.a) {
                        case -1: {
                            iterator1 = iterator0;
                            icon0 = (Icon)iconCompat0.b;
                            goto label_75;
                        }
                        case 1: {
                            iterator1 = iterator0;
                            icon0 = Icon.createWithBitmap(((Bitmap)iconCompat0.b));
                            break;
                        }
                        case 2: {
                            iterator1 = iterator0;
                            String s = TextUtils.isEmpty(iconCompat0.j) ? ((String)iconCompat0.b).split(":", -1)[0] : iconCompat0.j;
                            icon0 = O.f(iconCompat0.e, s);
                            break;
                        }
                        case 3: {
                            iterator1 = iterator0;
                            icon0 = Icon.createWithData(((byte[])iconCompat0.b), iconCompat0.e, iconCompat0.f);
                            break;
                        }
                        case 4: {
                            iterator1 = iterator0;
                            icon0 = Icon.createWithContentUri(((String)iconCompat0.b));
                            break;
                        }
                        case 5: {
                            if(v >= 26) {
                                icon0 = Icon.createWithAdaptiveBitmap(((Bitmap)iconCompat0.b));
                                iterator1 = iterator0;
                            }
                            else {
                                Bitmap bitmap0 = (Bitmap)iconCompat0.b;
                                int v2 = (int)(((float)Math.min(bitmap0.getWidth(), bitmap0.getHeight())) * 0.666667f);
                                Bitmap bitmap1 = Bitmap.createBitmap(v2, v2, Bitmap.Config.ARGB_8888);
                                Canvas canvas0 = new Canvas(bitmap1);
                                iterator1 = iterator0;
                                Paint paint0 = new Paint(3);
                                float f = ((float)v2) * 0.5f;
                                paint0.setColor(0xFF000000);
                                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                                Matrix matrix0 = new Matrix();
                                matrix0.setTranslate(((float)(-(bitmap0.getWidth() - v2) / 2)), ((float)(-(bitmap0.getHeight() - v2) / 2)));
                                bitmapShader0.setLocalMatrix(matrix0);
                                paint0.setShader(bitmapShader0);
                                canvas0.drawCircle(f, f, f * 0.916667f, paint0);
                                canvas0.setBitmap(null);
                                icon0 = Icon.createWithBitmap(bitmap1);
                            }
                            break;
                        }
                        case 6: {
                            if(v < 30) {
                                throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat0.c());
                            }
                            icon0 = Icon.createWithAdaptiveBitmapContentUri(iconCompat0.c());
                            iterator1 = iterator0;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown type");
                        }
                    }
                    ColorStateList colorStateList0 = iconCompat0.g;
                    if(colorStateList0 != null) {
                        icon0.setTintList(colorStateList0);
                    }
                    PorterDuff.Mode porterDuff$Mode0 = iconCompat0.h;
                    if(porterDuff$Mode0 != IconCompat.k) {
                        icon0.setTintMode(porterDuff$Mode0);
                    }
                }
            label_75:
                notification$Action$Builder0 = O.d(icon0, charSequence0, pendingIntent0);
            }
            else {
                iterator1 = iterator0;
                notification$Action$Builder0 = new Notification.Action.Builder((iconCompat0 == null ? 0 : iconCompat0.b()), charSequence0, pendingIntent0);
            }
            Bundle bundle1 = g0.a == null ? new Bundle() : new Bundle(g0.a);
            boolean z1 = g0.c;
            bundle1.putBoolean("android.support.allowGeneratedReplies", z1);
            if(v >= 24) {
                notification$Action$Builder0.setAllowGeneratedReplies(z1);
            }
            bundle1.putInt("android.support.action.semanticAction", 0);
            if(v >= 28) {
                e.i(notification$Action$Builder0);
            }
            if(v >= 29) {
                S.b(notification$Action$Builder0);
            }
            bundle1.putBoolean("android.support.action.showsUserInterface", g0.d);
            notification$Action$Builder0.addExtras(bundle1);
            notification$Builder0.addAction(notification$Action$Builder0.build());
            iterator0 = iterator1;
        }
        Bundle bundle2 = this.l;
        if(bundle2 != null) {
            bundle0.putAll(bundle2);
        }
        int v3 = Build.VERSION.SDK_INT;
        notification$Builder0.setShowWhen(this.i);
        notification$Builder0.setLocalOnly(this.k).setGroup(null).setGroupSummary(false).setSortKey(null);
        notification$Builder0.setCategory(null).setColor(0).setVisibility(0).setPublicVersion(null).setSound(notification0.sound, notification0.audioAttributes);
        ArrayList arrayList0 = this.p;
        ArrayList arrayList1 = this.c;
        if(v3 < 28) {
            if(arrayList1 == null) {
                arrayList2 = null;
            }
            else {
                arrayList2 = new ArrayList(arrayList1.size());
                iterator2 = arrayList1.iterator();
                if(!iterator2.hasNext()) {
                    goto label_110;
                }
                goto label_119;
            }
        label_110:
            if(arrayList2 != null) {
                if(arrayList0 == null) {
                    arrayList0 = arrayList2;
                }
                else {
                    c c0 = new c(arrayList0.size() + arrayList2.size());
                    c0.addAll(arrayList2);
                    c0.addAll(arrayList0);
                    arrayList0 = new ArrayList(c0);
                    goto label_122;
                label_119:
                    Object object1 = iterator2.next();
                    object1.getClass();
                    throw new ClassCastException();
                }
            }
        }
    label_122:
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object2: arrayList0) {
                notification$Builder0.addPerson(((String)object2));
            }
        }
        ArrayList arrayList3 = this.d;
        if(arrayList3.size() > 0) {
            if(this.l == null) {
                this.l = new Bundle();
            }
            Bundle bundle3 = this.l.getBundle("android.car.EXTENSIONS");
            if(bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for(int v4 = 0; v4 < arrayList3.size(); ++v4) {
                String s1 = Integer.toString(v4);
                g g1 = (g)arrayList3.get(v4);
                Bundle bundle6 = new Bundle();
                if(g1.b == null) {
                    int v5 = g1.e;
                    if(v5 != 0) {
                        g1.b = IconCompat.a(v5);
                    }
                }
                bundle6.putInt("icon", (g1.b == null ? 0 : g1.b.b()));
                bundle6.putCharSequence("title", g1.f);
                bundle6.putParcelable("actionIntent", g1.g);
                Bundle bundle7 = g1.a == null ? new Bundle() : new Bundle(g1.a);
                bundle7.putBoolean("android.support.allowGeneratedReplies", g1.c);
                bundle6.putBundle("extras", bundle7);
                bundle6.putParcelableArray("remoteInputs", null);
                bundle6.putBoolean("showsUserInterface", g1.d);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(s1, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if(this.l == null) {
                this.l = new Bundle();
            }
            this.l.putBundle("android.car.EXTENSIONS", bundle3);
            bundle0.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int v6 = Build.VERSION.SDK_INT;
        if(v6 >= 24) {
            y8.n(notification$Builder0.setExtras(this.l));
        }
        if(v6 >= 26) {
            b.k(b.y(b.x(b.v(b.c(notification$Builder0)))));
            if(!TextUtils.isEmpty(this.m)) {
                notification$Builder0.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if(v6 >= 28) {
            Iterator iterator4 = arrayList1.iterator();
            if(iterator4.hasNext()) {
                Object object3 = iterator4.next();
                object3.getClass();
                throw new ClassCastException();
            }
        }
        if(v6 >= 29) {
            notification$Builder0.setAllowSystemGeneratedContextualActions(this.n);
            S.c(notification$Builder0);
        }
        n n0 = this.j;
        if(n0 != null) {
            new Notification.BigTextStyle(notification$Builder0).setBigContentTitle(null).bigText(((CharSequence)n0.k));
        }
        if(v6 >= 26) {
        }
        else if(v6 < 24) {
            notification$Builder0.setExtras(bundle0);
        }
        notification1 = notification$Builder0.build();
        if(n0 != null) {
            this.j.getClass();
        }
        if(n0 != null) {
            Bundle bundle8 = notification1.extras;
            if(bundle8 != null) {
                bundle8.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
            }
        }
        return notification1;
    }

    public static CharSequence b(String s) {
        if(s == null) {
            return null;
        }
        return s.length() > 0x1400 ? s.subSequence(0, 0x1400) : s;
    }
}

