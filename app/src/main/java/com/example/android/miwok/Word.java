package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation.
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;

    public Word(String default_word, String miwok_word) {
        mDefaultWord = default_word;
        mMiwokWord = miwok_word;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

}
