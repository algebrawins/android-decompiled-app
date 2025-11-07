package p1;

import android.content.Context;
import java.util.NoSuchElementException;
import k1.E;

/* renamed from: p1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4787a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile C0427a f4788b;

    public final void a(Context context, E e4) {
        try {
            context.unbindService(e4);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }
}
