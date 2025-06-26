package com.awesomeapp.module_0_8.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_8.Viewmodel8_1
import com.awesomeapp.module_0_8.Activity8_2
import com.awesomeapp.module_0_8.Activity8_3
import com.awesomeapp.module_0_8.Fragment8_4
import com.awesomeapp.module_0_8.Repository8_5
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_8.Model8_8
import com.awesomeapp.module_0_8.Model8_9
import com.awesomeapp.module_0_8.Activity8_10
import com.awesomeapp.module_0_8.Model8_12
import com.awesomeapp.module_0_8.Activity8_13
import com.awesomeapp.module_0_8.Model8_15
import com.awesomeapp.module_0_8.Activity8_16
import com.awesomeapp.module_0_8.Model8_18
import com.awesomeapp.module_0_8.Activity8_19

@Module
@InstallIn(SingletonComponent::class)
object Module_8 {
    @Provides
    @Singleton
    fun provideRepository8_5(): Repository8_5 {
        return Repository8_5()
    }

    @Provides
    @Singleton
    fun provideApi8_6(): Api8_6 {
        return Api8_6()
    }
}