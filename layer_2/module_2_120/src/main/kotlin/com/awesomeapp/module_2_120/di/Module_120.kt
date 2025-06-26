package com.awesomeapp.module_2_120.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_120.Viewmodel120_1
import com.awesomeapp.module_2_120.Activity120_2
import com.awesomeapp.module_2_120.Activity120_3
import com.awesomeapp.module_2_120.Fragment120_4
import com.awesomeapp.module_2_120.Repository120_5
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_68.Api68_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_2_120.Api120_6
import com.awesomeapp.module_2_120.Service120_7
import com.awesomeapp.module_2_120.Worker120_8
import com.awesomeapp.module_2_120.Usecase120_9
import com.awesomeapp.module_2_120.Model120_11
import com.awesomeapp.module_2_120.Model120_12
import com.awesomeapp.module_2_120.Activity120_13
import com.awesomeapp.module_2_120.Model120_15
import com.awesomeapp.module_2_120.Activity120_16
import com.awesomeapp.module_2_120.Model120_18
import com.awesomeapp.module_2_120.Activity120_19

@Module
@InstallIn(SingletonComponent::class)
object Module_120 {
    @Provides
    @Singleton
    fun provideRepository120_5(
        api0: Api92_6 = Api92_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api68_6 = Api68_6(),
        api3: Api52_6 = Api52_6(),
        api4: Api84_6 = Api84_6(),
        api5: Api64_6 = Api64_6(),
        api6: Api76_6 = Api76_6(),
        api7: Api56_6 = Api56_6(),
        api8: Api80_6 = Api80_6()
    ): Repository120_5 {
        return Repository120_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi120_6(): Api120_6 {
        return Api120_6()
    }
}