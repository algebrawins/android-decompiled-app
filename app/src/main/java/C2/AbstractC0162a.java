package c2;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: c2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0162a {
    public static /* bridge */ /* synthetic */ Intent a(Intent intent, IntentSender intentSender) {
        return Intent.createChooser(intent, null, intentSender);
    }
}
