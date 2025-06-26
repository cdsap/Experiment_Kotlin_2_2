package com.awesomeapp.module_3_164.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_164.Viewmodel164_1
import com.awesomeapp.module_3_164.Activity164_2
import com.awesomeapp.module_3_164.Activity164_3
import com.awesomeapp.module_3_164.Fragment164_4
import com.awesomeapp.module_3_164.Repository164_5
import com.awesomeapp.module_2_120.Api120_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_3_164.Api164_6
import com.awesomeapp.module_3_164.Model164_8
import com.awesomeapp.module_3_164.Model164_9
import com.awesomeapp.module_3_164.Activity164_10
import com.awesomeapp.module_3_164.Model164_12
import com.awesomeapp.module_3_164.Activity164_13
import com.awesomeapp.module_3_164.Model164_15
import com.awesomeapp.module_3_164.Activity164_16
import com.awesomeapp.module_3_164.Model164_18
import com.awesomeapp.module_3_164.Activity164_19

@Module
@InstallIn(SingletonComponent::class)
object Module_164 {
    @Provides
    @Singleton
    fun provideRepository164_5(
        api0: Api120_6 = Api120_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api128_6 = Api128_6(),
        api3: Api108_6 = Api108_6()
    ): Repository164_5 {
        return Repository164_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi164_6(): Api164_6 {
        return Api164_6()
    }
}