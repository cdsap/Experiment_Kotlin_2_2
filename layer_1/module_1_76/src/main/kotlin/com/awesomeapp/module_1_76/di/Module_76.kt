package com.awesomeapp.module_1_76.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_76.Viewmodel76_1
import com.awesomeapp.module_1_76.Activity76_2
import com.awesomeapp.module_1_76.Activity76_3
import com.awesomeapp.module_1_76.Fragment76_4
import com.awesomeapp.module_1_76.Repository76_5
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_1_76.Api76_6
import com.awesomeapp.module_1_76.Model76_8
import com.awesomeapp.module_1_76.Model76_9
import com.awesomeapp.module_1_76.Activity76_10
import com.awesomeapp.module_1_76.Model76_12
import com.awesomeapp.module_1_76.Activity76_13
import com.awesomeapp.module_1_76.Model76_15
import com.awesomeapp.module_1_76.Activity76_16
import com.awesomeapp.module_1_76.Model76_18
import com.awesomeapp.module_1_76.Activity76_19

@Module
@InstallIn(SingletonComponent::class)
object Module_76 {
    @Provides
    @Singleton
    fun provideRepository76_5(
        api0: Api32_6 = Api32_6(),
        api1: Api4_6 = Api4_6(),
        api2: Api20_6 = Api20_6(),
        api3: Api12_6 = Api12_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api8_6 = Api8_6()
    ): Repository76_5 {
        return Repository76_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi76_6(): Api76_6 {
        return Api76_6()
    }
}