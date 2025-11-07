package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import d2.C0235c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import q2.n;
import s2.C0454a;

/* loaded from: classes.dex */
public final class h implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0235c f3532a;

    /* renamed from: b  reason: collision with root package name */
    public final TextServicesManager f3533b;

    /* renamed from: c  reason: collision with root package name */
    public SpellCheckerSession f3534c;

    /* renamed from: d  reason: collision with root package name */
    public n f3535d;

    public h(TextServicesManager textServicesManager, C0235c c0235c) {
        this.f3533b = textServicesManager;
        this.f3532a = c0235c;
        c0235c.f3003K = this;
    }

    public final void a(String str, String str2, n nVar) {
        if (this.f3535d != null) {
            nVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f3535d = nVar;
        Locale a4 = C0454a.a(str);
        if (this.f3534c == null) {
            this.f3534c = this.f3533b.newSpellCheckerSession(null, a4, this, true);
        }
        this.f3534c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f3535d.c(new ArrayList());
            this.f3535d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f3535d.c(new ArrayList());
            this.f3535d = null;
            return;
        }
        for (int r3 = 0; r3 < sentenceSuggestionsInfo.getSuggestionsCount(); r3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(r3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(r3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(r3) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int r8 = 0; r8 < suggestionsCount; r8++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(r8);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z3 = true;
                    }
                }
                if (z3) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f3535d.c(arrayList);
        this.f3535d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
