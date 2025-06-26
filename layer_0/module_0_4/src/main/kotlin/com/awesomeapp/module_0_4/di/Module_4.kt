package com.awesomeapp.module_0_4.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_4.Viewmodel4_1
import com.awesomeapp.module_0_4.Activity4_2
import com.awesomeapp.module_0_4.Activity4_3
import com.awesomeapp.module_0_4.Fragment4_4
import com.awesomeapp.module_0_4.Repository4_5
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_4.Model4_8
import com.awesomeapp.module_0_4.Model4_9
import com.awesomeapp.module_0_4.Activity4_10
import com.awesomeapp.module_0_4.Model4_12
import com.awesomeapp.module_0_4.Activity4_13
import com.awesomeapp.module_0_4.Model4_15
import com.awesomeapp.module_0_4.Activity4_16
import com.awesomeapp.module_0_4.Model4_18
import com.awesomeapp.module_0_4.Activity4_19

@Module
@InstallIn(SingletonComponent::class)
object Module_4 {
    @Provides
    @Singleton
    fun provideRepository4_5(): Repository4_5 {
        return Repository4_5()
    }

    @Provides
    @Singleton
    fun provideApi4_6(): Api4_6 {
        return Api4_6()
    }
}