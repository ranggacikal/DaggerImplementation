package com.ranggacikal.daggereample.repository

import com.ranggacikal.daggereample.model.FootbalClub

interface FootballRepository {
    fun getFootballClub(): List<FootbalClub>
}