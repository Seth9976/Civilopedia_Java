package s;

public final class a extends b {
    public int m;
    public int n;
    public r.a o;

    public int getType() {
        return this.m;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.m0 = z;
    }

    public void setType(int v) {
        this.m = v;
        this.n = v;
        if(1 == this.getResources().getConfiguration().getLayoutDirection()) {
            int v1 = this.m;
            if(v1 == 5) {
                this.n = 1;
            }
            else if(v1 == 6) {
                this.n = 0;
            }
        }
        else {
            int v2 = this.m;
            if(v2 == 5) {
                this.n = 0;
            }
            else if(v2 == 6) {
                this.n = 1;
            }
        }
        this.o.k0 = this.n;
    }
}

