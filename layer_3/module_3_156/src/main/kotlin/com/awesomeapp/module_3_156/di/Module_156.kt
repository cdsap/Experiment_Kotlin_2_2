package com.awesomeapp.module_3_156.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_156.Viewmodel156_1
import com.awesomeapp.module_3_156.Activity156_2
import com.awesomeapp.module_3_156.Activity156_3
import com.awesomeapp.module_3_156.Fragment156_4
import com.awesomeapp.module_3_156.Repository156_5
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_2_128.Api128_6
import com.awesomeapp.module_2_124.Api124_6
import com.awesomeapp.module_2_132.Api132_6
import com.awesomeapp.module_3_156.Api156_6
import com.awesomeapp.module_3_156.Usecase156_7
import com.awesomeapp.module_3_156.Model156_9
import com.awesomeapp.module_3_156.Model156_10
import com.awesomeapp.module_3_156.Activity156_11
import com.awesomeapp.module_3_156.Model156_13
import com.awesomeapp.module_3_156.Activity156_14
import com.awesomeapp.module_3_156.Model156_16
import com.awesomeapp.module_3_156.Activity156_17
import com.awesomeapp.module_3_156.Model156_19
import com.awesomeapp.module_3_156.Activity156_20

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api112_6 = Api112_6(),
        api1: Api128_6 = Api128_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api132_6 = Api132_6()
    ): Repository156_5 {
        return Repository156_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}