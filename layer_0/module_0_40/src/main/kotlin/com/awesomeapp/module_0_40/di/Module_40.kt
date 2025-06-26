package com.awesomeapp.module_0_40.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_40.Viewmodel40_1
import com.awesomeapp.module_0_40.Activity40_2
import com.awesomeapp.module_0_40.Activity40_3
import com.awesomeapp.module_0_40.Fragment40_4
import com.awesomeapp.module_0_40.Repository40_5
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_40.Service40_7
import com.awesomeapp.module_0_40.Worker40_8
import com.awesomeapp.module_0_40.Model40_10
import com.awesomeapp.module_0_40.Model40_11
import com.awesomeapp.module_0_40.Activity40_12
import com.awesomeapp.module_0_40.Model40_14
import com.awesomeapp.module_0_40.Activity40_15
import com.awesomeapp.module_0_40.Model40_17
import com.awesomeapp.module_0_40.Activity40_18
import com.awesomeapp.module_0_40.Model40_20

@Module
@InstallIn(SingletonComponent::class)
object Module_40 {
    @Provides
    @Singleton
    fun provideRepository40_5(): Repository40_5 {
        return Repository40_5()
    }

    @Provides
    @Singleton
    fun provideApi40_6(): Api40_6 {
        return Api40_6()
    }
}