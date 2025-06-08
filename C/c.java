package C;

import android.os.Build.VERSION;
import android.text.PrecomputedText.Params;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

public final class c {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public c(PrecomputedText.Params precomputedText$Params0) {
        this.a = precomputedText$Params0.getTextPaint();
        this.b = precomputedText$Params0.getTextDirection();
        this.c = precomputedText$Params0.getBreakStrategy();
        this.d = precomputedText$Params0.getHyphenationFrequency();
    }

    public c(TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 29) {
            a.g(textPaint0).setBreakStrategy(v).setHyphenationFrequency(v1).setTextDirection(textDirectionHeuristic0).build();
        }
        this.a = textPaint0;
        this.b = textDirectionHeuristic0;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        int v = Build.VERSION.SDK_INT;
        if(v < 23 || this.c == ((c)object0).c && this.d == ((c)object0).d) {
            TextPaint textPaint0 = this.a;
            if(textPaint0.getTextSize() == ((c)object0).a.getTextSize()) {
                float f = textPaint0.getTextScaleX();
                TextPaint textPaint1 = ((c)object0).a;
                if(f == textPaint1.getTextScaleX() && textPaint0.getTextSkewX() == textPaint1.getTextSkewX() && textPaint0.getLetterSpacing() == textPaint1.getLetterSpacing() && TextUtils.equals(textPaint0.getFontFeatureSettings(), textPaint1.getFontFeatureSettings()) && textPaint0.getFlags() == textPaint1.getFlags()) {
                    if(v >= 24) {
                        if(textPaint0.getTextLocales().equals(textPaint1.getTextLocales())) {
                            goto label_15;
                        }
                        return false;
                    }
                    if(textPaint0.getTextLocale().equals(textPaint1.getTextLocale())) {
                    label_15:
                        if(textPaint0.getTypeface() == null) {
                            return textPaint1.getTypeface() == null ? this.b == ((c)object0).b : false;
                        }
                        return textPaint0.getTypeface().equals(textPaint1.getTypeface()) ? this.b == ((c)object0).b : false;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Build.VERSION.SDK_INT < 24 ? Objects.hash(new Object[]{this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, this.c, this.d}) : Objects.hash(new Object[]{this.a.getTextSize(), this.a.getTextScaleX(), this.a.getTextSkewX(), this.a.getLetterSpacing(), this.a.getFlags(), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("{");
        TextPaint textPaint0 = this.a;
        stringBuilder0.append("textSize=" + textPaint0.getTextSize());
        stringBuilder0.append(", textScaleX=" + textPaint0.getTextScaleX());
        stringBuilder0.append(", textSkewX=" + textPaint0.getTextSkewX());
        int v = Build.VERSION.SDK_INT;
        stringBuilder0.append(", letterSpacing=" + textPaint0.getLetterSpacing());
        stringBuilder0.append(", elegantTextHeight=" + textPaint0.isElegantTextHeight());
        if(v >= 24) {
            stringBuilder0.append(", textLocale=" + textPaint0.getTextLocales());
        }
        else {
            stringBuilder0.append(", textLocale=" + textPaint0.getTextLocale());
        }
        stringBuilder0.append(", typeface=" + textPaint0.getTypeface());
        if(v >= 26) {
            stringBuilder0.append(", variationSettings=" + textPaint0.getFontVariationSettings());
        }
        stringBuilder0.append(", textDir=" + this.b);
        stringBuilder0.append(", breakStrategy=" + this.c);
        stringBuilder0.append(", hyphenationFrequency=" + this.d);
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

