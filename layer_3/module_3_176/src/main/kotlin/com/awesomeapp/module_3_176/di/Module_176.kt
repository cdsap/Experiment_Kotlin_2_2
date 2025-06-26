package com.awesomeapp.module_3_176.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_176.Viewmodel176_1
import com.awesomeapp.module_3_176.Activity176_2
import com.awesomeapp.module_3_176.Activity176_3
import com.awesomeapp.module_3_176.Fragment176_4
import com.awesomeapp.module_3_176.Repository176_5
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_2_100.Api100_6
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_136.Api136_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_3_176.Api176_6
import com.awesomeapp.module_3_176.Model176_8
import com.awesomeapp.module_3_176.Model176_9
import com.awesomeapp.module_3_176.Activity176_10
import com.awesomeapp.module_3_176.Model176_12
import com.awesomeapp.module_3_176.Activity176_13
import com.awesomeapp.module_3_176.Model176_15
import com.awesomeapp.module_3_176.Activity176_16
import com.awesomeapp.module_3_176.Model176_18
import com.awesomeapp.module_3_176.Activity176_19

@Module
@InstallIn(SingletonComponent::class)
object Module_176 {
    @Provides
    @Singleton
    fun provideRepository176_5(
        api0: Api112_6 = Api112_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api136_6 = Api136_6(),
        api4: Api128_6 = Api128_6()
    ): Repository176_5 {
        return Repository176_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi176_6(): Api176_6 {
        return Api176_6()
    }
}