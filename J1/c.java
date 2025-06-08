package J1;

import H1.e;
import H1.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class c implements e {
    public static final SimpleDateFormat a;

    static {
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", Locale.US);
        c.a = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override  // H1.a
    public final void a(Object object0, Object object1) {
        ((f)object1).d(c.a.format(((Date)object0)));
    }
}

