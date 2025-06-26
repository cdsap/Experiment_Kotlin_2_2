package com.awesomeapp.module_3_152.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.module_3_152.Viewmodel152_1
import com.awesomeapp.module_3_152.Activity152_2
import com.awesomeapp.module_3_152.Activity152_3
import com.awesomeapp.module_3_152.Fragment152_4
import com.awesomeapp.module_3_152.Repository152_5
import com.awesomeapp.module_2_96.Api96_6
import com.awesomeapp.module_2_112.Api112_6
import com.awesomeapp.module_2_108.Api108_6
import com.awesomeapp.module_2_116.Api116_6
import com.awesomeapp.module_3_152.Api152_6
import com.awesomeapp.module_3_152.Model152_8
import com.awesomeapp.module_3_152.Model152_9
import com.awesomeapp.module_3_152.Activity152_10
import com.awesomeapp.module_3_152.Model152_12
import com.awesomeapp.module_3_152.Activity152_13
import com.awesomeapp.module_3_152.Model152_15
import com.awesomeapp.module_3_152.Activity152_16
import com.awesomeapp.module_3_152.Model152_18
import com.awesomeapp.module_3_152.Activity152_19

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api96_6 = Api96_6(),
        api1: Api112_6 = Api112_6(),
        api2: Api108_6 = Api108_6(),
        api3: Api116_6 = Api116_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}