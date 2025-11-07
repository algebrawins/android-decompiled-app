package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import x1.S4;

/* renamed from: v.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480b {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f5043a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v.b] */
    public static C0480b a() {
        ?? obj = new Object();
        obj.f5043a = new HashSet();
        obj.f5043a.addAll(Arrays.asList(new S4[0]));
        return obj;
    }

    public final Object clone() {
        C0480b a4 = a();
        a4.f5043a.addAll(Collections.unmodifiableList(new ArrayList(this.f5043a)));
        return a4;
    }
}
