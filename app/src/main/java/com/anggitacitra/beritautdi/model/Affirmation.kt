package com.anggitacitra.beritautdi.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
//memanggil data pada class string.xml dan drawble pada resource
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
