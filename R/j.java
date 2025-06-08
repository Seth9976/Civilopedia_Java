package r;

public final class j extends k {
    public float c;

    public j() {
        this.c = 0.0f;
    }

    public final void f() {
        this.b = 0;
        this.a.clear();
        this.c = 0.0f;
    }

    public final void g(int v) {
        int v1 = this.b;
        if(v1 == 0 || this.c != ((float)v)) {
            this.c = (float)v;
            if(v1 == 1) {
                this.c();
            }
            this.b();
        }
    }
}

