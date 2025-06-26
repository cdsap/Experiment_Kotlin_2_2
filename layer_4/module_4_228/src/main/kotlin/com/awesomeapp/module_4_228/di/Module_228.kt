package com.awesomeapp.module_4_228.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_4_228.Viewmodel228_1
import com.awesomeapp.module_4_228.Activity228_2
import com.awesomeapp.module_4_228.Activity228_3
import com.awesomeapp.module_4_228.Fragment228_4
import com.awesomeapp.module_4_228.Repository228_5
import com.awesomeapp.module_3_148.Api148_6
import com.awesomeapp.module_4_228.Api228_6
import com.awesomeapp.module_4_228.Usecase228_7
import com.awesomeapp.module_4_228.Model228_9
import com.awesomeapp.module_4_228.Model228_10
import com.awesomeapp.module_4_228.Activity228_11
import com.awesomeapp.module_4_228.Model228_13
import com.awesomeapp.module_4_228.Activity228_14
import com.awesomeapp.module_4_228.Model228_16
import com.awesomeapp.module_4_228.Activity228_17
import com.awesomeapp.module_4_228.Model228_19
import com.awesomeapp.module_4_228.Activity228_20

@Module
@InstallIn(SingletonComponent::class)
object Module_228 {
    @Provides
    @Singleton
    fun provideRepository228_5(
        api0: Api148_6 = Api148_6()
    ): Repository228_5 {
        return Repository228_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi228_6(): Api228_6 {
        return Api228_6()
    }
}