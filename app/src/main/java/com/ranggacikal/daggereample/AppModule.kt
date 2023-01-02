package com.ranggacikal.daggereample

import com.ranggacikal.daggereample.repository.FootballRepository
import com.ranggacikal.daggereample.repository.FootballRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideFootballRepository(): FootballRepository = FootballRepositoryImpl()
}