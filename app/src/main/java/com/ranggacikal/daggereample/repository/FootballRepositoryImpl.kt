package com.ranggacikal.daggereample.repository

import com.ranggacikal.daggereample.model.FootbalClub
import com.ranggacikal.daggereample.util.Constants.AC_MILAN
import com.ranggacikal.daggereample.util.Constants.BAYERN
import com.ranggacikal.daggereample.util.Constants.CHELSEA
import com.ranggacikal.daggereample.util.Constants.IMAGE_AC_MILAN
import com.ranggacikal.daggereample.util.Constants.IMAGE_BAYERN_MUNICH
import com.ranggacikal.daggereample.util.Constants.IMAGE_CHELSEA
import com.ranggacikal.daggereample.util.Constants.IMAGE_JUVENTUS
import com.ranggacikal.daggereample.util.Constants.IMAGE_MAN_CITY
import com.ranggacikal.daggereample.util.Constants.IMAGE_MAN_UTD
import com.ranggacikal.daggereample.util.Constants.IMAGE_PSG
import com.ranggacikal.daggereample.util.Constants.IMAGE_REAL_MADRID
import com.ranggacikal.daggereample.util.Constants.IMAGE_TOTTENHAM
import com.ranggacikal.daggereample.util.Constants.JUVENTUS
import com.ranggacikal.daggereample.util.Constants.MAN_CITY
import com.ranggacikal.daggereample.util.Constants.MAN_UTD
import com.ranggacikal.daggereample.util.Constants.PSG
import com.ranggacikal.daggereample.util.Constants.REAL_MADRID
import com.ranggacikal.daggereample.util.Constants.TOTTENHAM

class FootballRepositoryImpl: FootballRepository {
    override fun getFootballClub() = listOf(
        FootbalClub(IMAGE_MAN_UTD, MAN_UTD),
        FootbalClub(IMAGE_MAN_CITY, MAN_CITY),
        FootbalClub(IMAGE_TOTTENHAM, TOTTENHAM),
        FootbalClub(IMAGE_PSG, PSG),
        FootbalClub(IMAGE_AC_MILAN, AC_MILAN),
        FootbalClub(IMAGE_REAL_MADRID, REAL_MADRID),
        FootbalClub(IMAGE_BAYERN_MUNICH, BAYERN),
        FootbalClub(IMAGE_JUVENTUS, JUVENTUS),
        FootbalClub(IMAGE_CHELSEA, CHELSEA)
    )
}