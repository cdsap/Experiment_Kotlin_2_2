package com.awesomeapp.module_2_128.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_128.Viewmodel128_1
import com.awesomeapp.module_2_128.Activity128_2
import com.awesomeapp.module_2_128.Activity128_3
import com.awesomeapp.module_2_128.Fragment128_4
import com.awesomeapp.module_2_128.Repository128_5
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_48.Api48_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_2_128.Model128_8
import com.awesomeapp.module_2_128.Model128_9
import com.awesomeapp.module_2_128.Activity128_10
import com.awesomeapp.module_2_128.Model128_12
import com.awesomeapp.module_2_128.Activity128_13
import com.awesomeapp.module_2_128.Model128_15
import com.awesomeapp.module_2_128.Activity128_16
import com.awesomeapp.module_2_128.Model128_18
import com.awesomeapp.module_2_128.Activity128_19

@Module
@InstallIn(SingletonComponent::class)
object Module_128 {
    @Provides
    @Singleton
    fun provideRepository128_5(
        api0: Api64_6 = Api64_6(),
        api1: Api84_6 = Api84_6(),
        api2: Api80_6 = Api80_6(),
        api3: Api76_6 = Api76_6(),
        api4: Api56_6 = Api56_6(),
        api5: Api52_6 = Api52_6(),
        api6: Api88_6 = Api88_6(),
        api7: Api48_6 = Api48_6()
    ): Repository128_5 {
        return Repository128_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi128_6(): Api128_6 {
        return Api128_6()
    }
}