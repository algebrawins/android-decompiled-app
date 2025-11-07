package C2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i extends o {
    public static Object h(List list) {
        N2.g.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void i(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int r7, CharSequence charSequence4, M2.l lVar) {
        N2.g.e(collection, "<this>");
        N2.g.e(charSequence, "separator");
        N2.g.e(charSequence2, "prefix");
        N2.g.e(charSequence3, "postfix");
        N2.g.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int r5 = 0;
        for (Object obj : collection) {
            r5++;
            boolean z3 = true;
            if (r5 > 1) {
                sb.append(charSequence);
            }
            if (r7 >= 0 && r5 > r7) {
                break;
            } else if (lVar != null) {
                sb.append((CharSequence) lVar.h(obj));
            } else {
                if (obj != null) {
                    z3 = obj instanceof CharSequence;
                }
                if (z3) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) obj.toString());
                }
            }
        }
        if (r7 >= 0 && r5 > r7) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String j(Collection collection, String str, String str2, String str3, M2.l lVar, int r15) {
        String str4;
        String str5;
        if ((r15 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((r15 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((r15 & 32) != 0) {
            lVar = null;
        }
        N2.g.e(collection, "<this>");
        N2.g.e(str4, "prefix");
        N2.g.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        i(collection, sb, str, str4, str5, -1, "...", lVar);
        return sb.toString();
    }

    public static final void k(Iterable iterable, AbstractCollection abstractCollection) {
        N2.g.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static List l(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        N2.g.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        q qVar = q.f272J;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return j.b(next);
            }
            return qVar;
        }
        if (z3) {
            arrayList = m((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            k(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return j.b(arrayList.get(0));
        }
        return qVar;
    }

    public static ArrayList m(Collection collection) {
        N2.g.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set n(Iterable iterable) {
        Object next;
        N2.g.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        s sVar = s.f274J;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(t.a(collection.size()));
                    k(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                N2.g.d(singleton, "singleton(...)");
                return singleton;
            }
            return sVar;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        k(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return linkedHashSet2;
            }
            Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
            N2.g.d(singleton2, "singleton(...)");
            return singleton2;
        }
        return sVar;
    }
}
