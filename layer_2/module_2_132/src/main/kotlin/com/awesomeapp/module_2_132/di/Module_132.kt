package com.awesomeapp.module_2_132.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_2_132.Viewmodel132_1
import com.awesomeapp.module_2_132.Activity132_2
import com.awesomeapp.module_2_132.Activity132_3
import com.awesomeapp.module_2_132.Fragment132_4
import com.awesomeapp.module_2_132.Repository132_5
import com.awesomeapp.module_1_80.Api80_6
import com.awesomeapp.module_1_84.Api84_6
import com.awesomeapp.module_1_68.Api68_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_2_132.Usecase132_7
import com.awesomeapp.module_2_132.Model132_9
import com.awesomeapp.module_2_132.Model132_10
import com.awesomeapp.module_2_132.Activity132_11
import com.awesomeapp.module_2_132.Model132_13
import com.awesomeapp.module_2_132.Activity132_14
import com.awesomeapp.module_2_132.Model132_16
import com.awesomeapp.module_2_132.Activity132_17
import com.awesomeapp.module_2_132.Model132_19
import com.awesomeapp.module_2_132.Activity132_20

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(
        api0: Api80_6 = Api80_6(),
        api1: Api84_6 = Api84_6(),
        api2: Api68_6 = Api68_6()
    ): Repository132_5 {
        return Repository132_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}