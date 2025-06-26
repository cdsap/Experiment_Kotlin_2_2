package com.awesomeapp.module_0_44.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_0_44.Viewmodel44_1
import com.awesomeapp.module_0_44.Activity44_2
import com.awesomeapp.module_0_44.Activity44_3
import com.awesomeapp.module_0_44.Fragment44_4
import com.awesomeapp.module_0_44.Repository44_5
import com.awesomeapp.module_0_44.Api44_6
import com.awesomeapp.module_0_44.Model44_8
import com.awesomeapp.module_0_44.Model44_9
import com.awesomeapp.module_0_44.Activity44_10
import com.awesomeapp.module_0_44.Model44_12
import com.awesomeapp.module_0_44.Activity44_13
import com.awesomeapp.module_0_44.Model44_15
import com.awesomeapp.module_0_44.Activity44_16
import com.awesomeapp.module_0_44.Model44_18
import com.awesomeapp.module_0_44.Activity44_19

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideRepository44_5(): Repository44_5 {
        return Repository44_5()
    }

    @Provides
    @Singleton
    fun provideApi44_6(): Api44_6 {
        return Api44_6()
    }
}