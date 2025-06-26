package com.awesomeapp.module_1_52.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_52.Viewmodel52_1
import com.awesomeapp.module_1_52.Activity52_2
import com.awesomeapp.module_1_52.Activity52_3
import com.awesomeapp.module_1_52.Fragment52_4
import com.awesomeapp.module_1_52.Repository52_5
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_1_52.Api52_6
import com.awesomeapp.module_1_52.Model52_8
import com.awesomeapp.module_1_52.Model52_9
import com.awesomeapp.module_1_52.Activity52_10
import com.awesomeapp.module_1_52.Model52_12
import com.awesomeapp.module_1_52.Activity52_13
import com.awesomeapp.module_1_52.Model52_15
import com.awesomeapp.module_1_52.Activity52_16
import com.awesomeapp.module_1_52.Model52_18
import com.awesomeapp.module_1_52.Activity52_19

@Module
@InstallIn(SingletonComponent::class)
object Module_52 {
    @Provides
    @Singleton
    fun provideRepository52_5(
        api0: Api44_6 = Api44_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api24_6 = Api24_6(),
        api3: Api8_6 = Api8_6(),
        api4: Api28_6 = Api28_6(),
        api5: Api32_6 = Api32_6()
    ): Repository52_5 {
        return Repository52_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi52_6(): Api52_6 {
        return Api52_6()
    }
}