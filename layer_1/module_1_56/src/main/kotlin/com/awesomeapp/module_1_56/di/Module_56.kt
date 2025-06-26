package com.awesomeapp.module_1_56.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_56.Viewmodel56_1
import com.awesomeapp.module_1_56.Activity56_2
import com.awesomeapp.module_1_56.Activity56_3
import com.awesomeapp.module_1_56.Fragment56_4
import com.awesomeapp.module_1_56.Repository56_5
import com.awesomeapp.module_0_20.Api20_6
import com.awesomeapp.module_1_56.Api56_6
import com.awesomeapp.module_1_56.Model56_8
import com.awesomeapp.module_1_56.Model56_9
import com.awesomeapp.module_1_56.Activity56_10
import com.awesomeapp.module_1_56.Model56_12
import com.awesomeapp.module_1_56.Activity56_13
import com.awesomeapp.module_1_56.Model56_15
import com.awesomeapp.module_1_56.Activity56_16
import com.awesomeapp.module_1_56.Model56_18
import com.awesomeapp.module_1_56.Activity56_19

@Module
@InstallIn(SingletonComponent::class)
object Module_56 {
    @Provides
    @Singleton
    fun provideRepository56_5(
        api0: Api20_6 = Api20_6()
    ): Repository56_5 {
        return Repository56_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi56_6(): Api56_6 {
        return Api56_6()
    }
}