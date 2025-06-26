package com.awesomeapp.module_1_48.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_1_48.Viewmodel48_1
import com.awesomeapp.module_1_48.Activity48_2
import com.awesomeapp.module_1_48.Activity48_3
import com.awesomeapp.module_1_48.Fragment48_4
import com.awesomeapp.module_1_48.Repository48_5
import com.awesomeapp.module_1_48.Api48_6
import com.awesomeapp.module_1_48.Usecase48_7
import com.awesomeapp.module_1_48.Model48_9
import com.awesomeapp.module_1_48.Model48_10
import com.awesomeapp.module_1_48.Activity48_11
import com.awesomeapp.module_1_48.Model48_13
import com.awesomeapp.module_1_48.Activity48_14
import com.awesomeapp.module_1_48.Model48_16
import com.awesomeapp.module_1_48.Activity48_17
import com.awesomeapp.module_1_48.Model48_19
import com.awesomeapp.module_1_48.Activity48_20

@Module
@InstallIn(SingletonComponent::class)
object Module_48 {
    @Provides
    @Singleton
    fun provideRepository48_5(): Repository48_5 {
        return Repository48_5()
    }

    @Provides
    @Singleton
    fun provideApi48_6(): Api48_6 {
        return Api48_6()
    }
}