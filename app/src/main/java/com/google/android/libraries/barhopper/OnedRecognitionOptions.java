package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public class OnedRecognitionOptions {
    @UsedByNative("jni_common.cc")
    private int ean13UpcaMinConsistentLines = 1;
    @UsedByNative("jni_common.cc")
    private int ean8MinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int upceMinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int code128MinConsistentLines = 1;
    @UsedByNative("jni_common.cc")
    private int code39MinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int code93MinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int itfMinConsistentLines = 3;
    @UsedByNative("jni_common.cc")
    private int codabarMinConsistentLines = 2;
    @UsedByNative("jni_common.cc")
    private int code128MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code39MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int code93MinCodeLength = 2;
    @UsedByNative("jni_common.cc")
    private int itfMinCodeLength = 6;
    @UsedByNative("jni_common.cc")
    private int codabarMinCodeLength = 6;
    @UsedByNative("jni_common.cc")
    private boolean code39UseCheckDigit = false;
    @UsedByNative("jni_common.cc")
    private boolean code39UseExtendedMode = false;

    public int getCodabarMinCodeLength() {
        return this.codabarMinCodeLength;
    }

    public int getCodabarMinConsistentLines() {
        return this.codabarMinConsistentLines;
    }

    public int getCode128MinCodeLength() {
        return this.code128MinCodeLength;
    }

    public int getCode128MinConsistentLines() {
        return this.code128MinConsistentLines;
    }

    public int getCode39MinCodeLength() {
        return this.code39MinCodeLength;
    }

    public int getCode39MinConsistentLines() {
        return this.code39MinConsistentLines;
    }

    public boolean getCode39UseCheckDigit() {
        return this.code39UseCheckDigit;
    }

    public boolean getCode39UseExtendedMode() {
        return this.code39UseExtendedMode;
    }

    public int getCode93MinCodeLength() {
        return this.code93MinCodeLength;
    }

    public int getCode93MinConsistentLines() {
        return this.code93MinConsistentLines;
    }

    public int getEan13UpcaMinConsistentLines() {
        return this.ean13UpcaMinConsistentLines;
    }

    public int getEan8MinConsistentLines() {
        return this.ean8MinConsistentLines;
    }

    public int getItfMinCodeLength() {
        return this.itfMinCodeLength;
    }

    public int getItfMinConsistentLines() {
        return this.itfMinConsistentLines;
    }

    public int getUpceMinConsistentLines() {
        return this.upceMinConsistentLines;
    }

    public OnedRecognitionOptions setCodabarMinCodeLength(int r12) {
        this.codabarMinCodeLength = r12;
        return this;
    }

    public OnedRecognitionOptions setCodabarMinConsistentLines(int r12) {
        this.codabarMinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setCode128MinCodeLength(int r12) {
        this.code128MinCodeLength = r12;
        return this;
    }

    public OnedRecognitionOptions setCode128MinConsistentLines(int r12) {
        this.code128MinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setCode39MinCodeLength(int r12) {
        this.code39MinCodeLength = r12;
        return this;
    }

    public OnedRecognitionOptions setCode39MinConsistentLines(int r12) {
        this.code39MinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setCode39UseCheckDigit(boolean z3) {
        this.code39UseCheckDigit = z3;
        return this;
    }

    public OnedRecognitionOptions setCode39UseExtendedMode(boolean z3) {
        this.code39UseExtendedMode = z3;
        return this;
    }

    public OnedRecognitionOptions setCode93MinCodeLength(int r12) {
        this.code93MinCodeLength = r12;
        return this;
    }

    public OnedRecognitionOptions setCode93MinConsistentLines(int r12) {
        this.code93MinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setEan13UpcaMinConsistentLines(int r12) {
        this.ean13UpcaMinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setEan8MinConsistentLines(int r12) {
        this.ean8MinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setItfMinCodeLength(int r12) {
        this.itfMinCodeLength = r12;
        return this;
    }

    public OnedRecognitionOptions setItfMinConsistentLines(int r12) {
        this.itfMinConsistentLines = r12;
        return this;
    }

    public OnedRecognitionOptions setUpceMinConsistentLines(int r12) {
        this.upceMinConsistentLines = r12;
        return this;
    }
}
