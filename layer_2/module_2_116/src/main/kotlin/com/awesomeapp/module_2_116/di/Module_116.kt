package com.awesomeapp.module_2_116.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_116.Viewmodel116_1
import com.awesomeapp.module_2_116.Activity116_2
import com.awesomeapp.module_2_116.Activity116_3
import com.awesomeapp.module_2_116.Fragment116_4
import com.awesomeapp.module_2_116.Repository116_5
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_60.Api60_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_88.Api88_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_48.Api48_6
import com.awesomeapp.module_1_92.Api92_6
import com.awesomeapp.module_2_116.Api116_6
import com.awesomeapp.module_2_116.Model116_8
import com.awesomeapp.module_2_116.Model116_9
import com.awesomeapp.module_2_116.Activity116_10
import com.awesomeapp.module_2_116.Model116_12
import com.awesomeapp.module_2_116.Activity116_13
import com.awesomeapp.module_2_116.Model116_15
import com.awesomeapp.module_2_116.Activity116_16
import com.awesomeapp.module_2_116.Model116_18
import com.awesomeapp.module_2_116.Activity116_19

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api64_6 = Api64_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api84_6 = Api84_6(),
        api3: Api60_6 = Api60_6(),
        api4: Api76_6 = Api76_6(),
        api5: Api52_6 = Api52_6(),
        api6: Api88_6 = Api88_6(),
        api7: Api72_6 = Api72_6(),
        api8: Api48_6 = Api48_6(),
        api9: Api92_6 = Api92_6()
    ): Repository116_5 {
        return Repository116_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}