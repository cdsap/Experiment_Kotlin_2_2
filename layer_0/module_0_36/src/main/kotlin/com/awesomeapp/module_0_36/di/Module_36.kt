package com.awesomeapp.module_0_36.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_36.Viewmodel36_1
import com.awesomeapp.module_0_36.Activity36_2
import com.awesomeapp.module_0_36.Activity36_3
import com.awesomeapp.module_0_36.Fragment36_4
import com.awesomeapp.module_0_36.Repository36_5
import com.awesomeapp.module_0_36.Api36_6
import com.awesomeapp.module_0_36.Usecase36_7
import com.awesomeapp.module_0_36.Model36_9
import com.awesomeapp.module_0_36.Model36_10
import com.awesomeapp.module_0_36.Activity36_11
import com.awesomeapp.module_0_36.Model36_13
import com.awesomeapp.module_0_36.Activity36_14
import com.awesomeapp.module_0_36.Model36_16
import com.awesomeapp.module_0_36.Activity36_17
import com.awesomeapp.module_0_36.Model36_19
import com.awesomeapp.module_0_36.Activity36_20

@Module
@InstallIn(SingletonComponent::class)
object Module_36 {
    @Provides
    @Singleton
    fun provideRepository36_5(): Repository36_5 {
        return Repository36_5()
    }

    @Provides
    @Singleton
    fun provideApi36_6(): Api36_6 {
        return Api36_6()
    }
}