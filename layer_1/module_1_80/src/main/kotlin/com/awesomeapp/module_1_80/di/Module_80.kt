package com.awesomeapp.module_1_80.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_80.Viewmodel80_1
import com.awesomeapp.module_1_80.Activity80_2
import com.awesomeapp.module_1_80.Activity80_3
import com.awesomeapp.module_1_80.Fragment80_4
import com.awesomeapp.module_1_80.Repository80_5
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_80.Service80_7
import com.awesomeapp.module_1_80.Worker80_8
import com.awesomeapp.module_1_80.Model80_10
import com.awesomeapp.module_1_80.Model80_11
import com.awesomeapp.module_1_80.Activity80_12
import com.awesomeapp.module_1_80.Model80_14
import com.awesomeapp.module_1_80.Activity80_15
import com.awesomeapp.module_1_80.Model80_17
import com.awesomeapp.module_1_80.Activity80_18
import com.awesomeapp.module_1_80.Model80_20

@Module
@InstallIn(SingletonComponent::class)
object Module_80 {
    @Provides
    @Singleton
    fun provideRepository80_5(
        api0: Api12_6 = Api12_6(),
        api1: Api28_6 = Api28_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api20_6 = Api20_6(),
        api5: Api8_6 = Api8_6(),
        api6: Api32_6 = Api32_6(),
        api7: Api40_6 = Api40_6(),
        api8: Api44_6 = Api44_6()
    ): Repository80_5 {
        return Repository80_5(api0, 
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
    fun provideApi80_6(): Api80_6 {
        return Api80_6()
    }
}