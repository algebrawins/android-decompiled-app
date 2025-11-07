package c3;

import android.content.Context;
import android.view.KeyCharacterMap;

/* loaded from: classes.dex */
public final class k implements t1.c {

    /* renamed from: J  reason: collision with root package name */
    public int f2693J;

    public Character a(int r3) {
        char c4 = (char) r3;
        if ((Integer.MIN_VALUE & r3) != 0) {
            int r32 = r3 & Integer.MAX_VALUE;
            int r12 = this.f2693J;
            if (r12 != 0) {
                this.f2693J = KeyCharacterMap.getDeadChar(r12, r32);
            } else {
                this.f2693J = r32;
            }
        } else {
            int r13 = this.f2693J;
            if (r13 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(r13, r3);
                if (deadChar > 0) {
                    c4 = (char) deadChar;
                }
                this.f2693J = 0;
            }
        }
        return Character.valueOf(c4);
    }

    @Override // t1.c
    public int d(Context context, String str) {
        return this.f2693J;
    }

    @Override // t1.c
    public int h(Context context, String str, boolean z3) {
        return 0;
    }

    public k() {
        this.f2693J = 0;
    }
}
