package com.awesomeapp.module_3_180.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_180.Viewmodel180_1
import com.awesomeapp.module_3_180.Activity180_2
import com.awesomeapp.module_3_180.Activity180_3
import com.awesomeapp.module_3_180.Fragment180_4
import com.awesomeapp.module_3_180.Repository180_5
import com.awesomeapp.module_3_180.Api180_6
import com.awesomeapp.module_3_180.Service180_7
import com.awesomeapp.module_3_180.Worker180_8
import com.awesomeapp.module_3_180.Usecase180_9
import com.awesomeapp.module_3_180.Model180_11
import com.awesomeapp.module_3_180.Model180_12
import com.awesomeapp.module_3_180.Activity180_13
import com.awesomeapp.module_3_180.Model180_15
import com.awesomeapp.module_3_180.Activity180_16
import com.awesomeapp.module_3_180.Model180_18
import com.awesomeapp.module_3_180.Activity180_19

@Module
@InstallIn(SingletonComponent::class)
object Module_180 {
    @Provides
    @Singleton
    fun provideRepository180_5(): Repository180_5 {
        return Repository180_5()
    }

    @Provides
    @Singleton
    fun provideApi180_6(): Api180_6 {
        return Api180_6()
    }
}