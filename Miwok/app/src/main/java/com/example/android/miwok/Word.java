package com.example.android.miwok;

/**
 * Created by denilsonmonteiro on 23/11/16.
 */

public class Word {

    /** Palavra no idioma padrão */
    private String mDefaultTranslation;

    /** Miwok traduzido para o padrão */
    private String mMiwokTranslation;

    /** Recurso de imagem para as palavras */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Criar um novo objeto Word
     * @param defaultTranslation palavra na lingua padrão
     * @param miwokTranslation palavra na lingua miwok
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranlation, String miwokTranslation, int imageResouceId){
        mDefaultTranslation = defaultTranlation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResouceId;
    }

    /**
     * Get default translation of the world
     * @return mDefaultTranslation
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get miwok translation of the world
     * @return mMiwokTranslation
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get o resourceId da imagem
     * @return mImageResourceId
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Retorna false quando não tem imagem
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
