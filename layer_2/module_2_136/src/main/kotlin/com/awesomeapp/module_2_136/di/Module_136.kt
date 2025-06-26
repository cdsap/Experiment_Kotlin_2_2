package com.awesomeapp.module_2_136.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_136.Viewmodel136_1
import com.awesomeapp.module_2_136.Activity136_2
import com.awesomeapp.module_2_136.Activity136_3
import com.awesomeapp.module_2_136.Fragment136_4
import com.awesomeapp.module_2_136.Repository136_5
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_68.Api68_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_48.Api48_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_2_136.Api136_6
import com.awesomeapp.module_2_136.Model136_8
import com.awesomeapp.module_2_136.Model136_9
import com.awesomeapp.module_2_136.Activity136_10
import com.awesomeapp.module_2_136.Model136_12
import com.awesomeapp.module_2_136.Activity136_13
import com.awesomeapp.module_2_136.Model136_15
import com.awesomeapp.module_2_136.Activity136_16
import com.awesomeapp.module_2_136.Model136_18
import com.awesomeapp.module_2_136.Activity136_19

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api88_6 = Api88_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api52_6 = Api52_6(),
        api3: Api68_6 = Api68_6(),
        api4: Api84_6 = Api84_6(),
        api5: Api48_6 = Api48_6(),
        api6: Api72_6 = Api72_6(),
        api7: Api60_6 = Api60_6(),
        api8: Api92_6 = Api92_6(),
        api9: Api64_6 = Api64_6(),
        api10: Api76_6 = Api76_6(),
        api11: Api56_6 = Api56_6()
    ): Repository136_5 {
        return Repository136_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11)
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}