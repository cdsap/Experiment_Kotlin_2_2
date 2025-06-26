package com.awesomeapp.module_1_78

sealed class State78_13 {
    data object Loading : State78_13()
    data class Success(val data: String) : State78_13()
    data class Error(val message: String) : State78_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}