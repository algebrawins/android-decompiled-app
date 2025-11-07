package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f1561a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f1562b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1563c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f1561a = colorStateList;
        this.f1562b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f1563c = hashCode;
    }
}
