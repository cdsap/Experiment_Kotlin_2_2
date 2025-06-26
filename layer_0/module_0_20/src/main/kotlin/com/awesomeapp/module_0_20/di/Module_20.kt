package com.awesomeapp.module_0_20.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_20.Viewmodel20_1
import com.awesomeapp.module_0_20.Activity20_2
import com.awesomeapp.module_0_20.Activity20_3
import com.awesomeapp.module_0_20.Fragment20_4
import com.awesomeapp.module_0_20.Repository20_5
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_20.Service20_7
import com.awesomeapp.module_0_20.Worker20_8
import com.awesomeapp.module_0_20.Model20_10
import com.awesomeapp.module_0_20.Model20_11
import com.awesomeapp.module_0_20.Activity20_12
import com.awesomeapp.module_0_20.Model20_14
import com.awesomeapp.module_0_20.Activity20_15
import com.awesomeapp.module_0_20.Model20_17
import com.awesomeapp.module_0_20.Activity20_18
import com.awesomeapp.module_0_20.Model20_20

@Module
@InstallIn(SingletonComponent::class)
object Module_20 {
    @Provides
    @Singleton
    fun provideRepository20_5(): Repository20_5 {
        return Repository20_5()
    }

    @Provides
    @Singleton
    fun provideApi20_6(): Api20_6 {
        return Api20_6()
    }
}