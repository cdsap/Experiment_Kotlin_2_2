package com.awesomeapp.module_1_72.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_72.Viewmodel72_1
import com.awesomeapp.module_1_72.Activity72_2
import com.awesomeapp.module_1_72.Activity72_3
import com.awesomeapp.module_1_72.Fragment72_4
import com.awesomeapp.module_1_72.Repository72_5
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_40.Api40_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_1_72.Api72_6
import com.awesomeapp.module_1_72.Usecase72_7
import com.awesomeapp.module_1_72.Model72_9
import com.awesomeapp.module_1_72.Model72_10
import com.awesomeapp.module_1_72.Activity72_11
import com.awesomeapp.module_1_72.Model72_13
import com.awesomeapp.module_1_72.Activity72_14
import com.awesomeapp.module_1_72.Model72_16
import com.awesomeapp.module_1_72.Activity72_17
import com.awesomeapp.module_1_72.Model72_19
import com.awesomeapp.module_1_72.Activity72_20

@Module
@InstallIn(SingletonComponent::class)
object Module_72 {
    @Provides
    @Singleton
    fun provideRepository72_5(
        api0: Api32_6 = Api32_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api4_6 = Api4_6(),
        api4: Api20_6 = Api20_6(),
        api5: Api40_6 = Api40_6(),
        api6: Api28_6 = Api28_6(),
        api7: Api24_6 = Api24_6(),
        api8: Api12_6 = Api12_6()
    ): Repository72_5 {
        return Repository72_5(api0, 
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
    fun provideApi72_6(): Api72_6 {
        return Api72_6()
    }
}