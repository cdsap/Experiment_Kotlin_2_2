package com.awesomeapp.module_1_64.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_64.Viewmodel64_1
import com.awesomeapp.module_1_64.Activity64_2
import com.awesomeapp.module_1_64.Activity64_3
import com.awesomeapp.module_1_64.Fragment64_4
import com.awesomeapp.module_1_64.Repository64_5
import com.awesomeapp.module_0_4.Api4_6
import com.awesomeapp.module_0_8.Api8_6
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_0_16.Api16_6
import com.awesomeapp.module_0_24.Api24_6
import com.awesomeapp.module_0_28.Api28_6
import com.awesomeapp.module_0_32.Api32_6
import com.awesomeapp.module_0_12.Api12_6
import com.awesomeapp.module_1_64.Api64_6
import com.awesomeapp.module_1_64.Model64_8
import com.awesomeapp.module_1_64.Model64_9
import com.awesomeapp.module_1_64.Activity64_10
import com.awesomeapp.module_1_64.Model64_12
import com.awesomeapp.module_1_64.Activity64_13
import com.awesomeapp.module_1_64.Model64_15
import com.awesomeapp.module_1_64.Activity64_16
import com.awesomeapp.module_1_64.Model64_18
import com.awesomeapp.module_1_64.Activity64_19

@Module
@InstallIn(SingletonComponent::class)
object Module_64 {
    @Provides
    @Singleton
    fun provideRepository64_5(
        api0: Api4_6 = Api4_6(),
        api1: Api8_6 = Api8_6(),
        api2: Api44_6 = Api44_6(),
        api3: Api16_6 = Api16_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api28_6 = Api28_6(),
        api6: Api32_6 = Api32_6(),
        api7: Api12_6 = Api12_6()
    ): Repository64_5 {
        return Repository64_5(api0, 
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
    fun provideApi64_6(): Api64_6 {
        return Api64_6()
    }
}