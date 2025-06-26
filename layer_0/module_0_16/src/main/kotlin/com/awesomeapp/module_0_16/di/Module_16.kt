package com.awesomeapp.module_0_16.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_16.Viewmodel16_1
import com.awesomeapp.module_0_16.Activity16_2
import com.awesomeapp.module_0_16.Activity16_3
import com.awesomeapp.module_0_16.Fragment16_4
import com.awesomeapp.module_0_16.Repository16_5
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_16.Model16_8
import com.awesomeapp.module_0_16.Model16_9
import com.awesomeapp.module_0_16.Activity16_10
import com.awesomeapp.module_0_16.Model16_12
import com.awesomeapp.module_0_16.Activity16_13
import com.awesomeapp.module_0_16.Model16_15
import com.awesomeapp.module_0_16.Activity16_16
import com.awesomeapp.module_0_16.Model16_18
import com.awesomeapp.module_0_16.Activity16_19

@Module
@InstallIn(SingletonComponent::class)
object Module_16 {
    @Provides
    @Singleton
    fun provideRepository16_5(): Repository16_5 {
        return Repository16_5()
    }

    @Provides
    @Singleton
    fun provideApi16_6(): Api16_6 {
        return Api16_6()
    }
}