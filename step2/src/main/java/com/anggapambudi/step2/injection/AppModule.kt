package com.anggapambudi.step2.injection

import android.content.Context
import com.anggapambudi.step2.data.SaveCounter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Provides
    fun provideSaveCounter(@ApplicationContext context: Context) = SaveCounter(context)
}