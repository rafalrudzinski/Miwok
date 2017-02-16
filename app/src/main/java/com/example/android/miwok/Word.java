package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation.
 */

public class Word {

    private String mDefaultWord;
    private String mMiwokWord;
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param default_word word in english or default app language
     * @param miwok_word word in Miwok language
     */
    public Word(String default_word, String miwok_word) {
        mDefaultWord = default_word;
        mMiwokWord = miwok_word;
    }

    /**
     * Create a new Word object
     *
     * @param default_word word in english or default app language
     * @param miwok_word word in Miwok language
     * @param image_id the drawable resource id for the image asset
     */
    public Word(String default_word, String miwok_word, int image_id) {
        mDefaultWord = default_word;
        mMiwokWord = miwok_word;
        mImageResourceId = image_id;
    }

    /**
     * Default word string
     *
     * @return the default word
     */
    public String getDefaultWord() {
        return mDefaultWord;
    }

    /**
     * Miwok word string
     *
     * @return Miwok word
     */
    public String getMiwokWord() {
        return mMiwokWord;
    }

    /**
     * Resource ID for image
     *
     * @return image resource id
     */
    public int getImageResourceId() { return mImageResourceId; }

}
