package com.awesomeapp.module_1_92.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_92.Viewmodel92_1
import com.awesomeapp.module_1_92.Activity92_2
import com.awesomeapp.module_1_92.Activity92_3
import com.awesomeapp.module_1_92.Fragment92_4
import com.awesomeapp.module_1_92.Repository92_5
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_92.Model92_8
import com.awesomeapp.module_1_92.Model92_9
import com.awesomeapp.module_1_92.Activity92_10
import com.awesomeapp.module_1_92.Model92_12
import com.awesomeapp.module_1_92.Activity92_13
import com.awesomeapp.module_1_92.Model92_15
import com.awesomeapp.module_1_92.Activity92_16
import com.awesomeapp.module_1_92.Model92_18
import com.awesomeapp.module_1_92.Activity92_19

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(): Repository92_5 {
        return Repository92_5()
    }

    @Provides
    @Singleton
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}