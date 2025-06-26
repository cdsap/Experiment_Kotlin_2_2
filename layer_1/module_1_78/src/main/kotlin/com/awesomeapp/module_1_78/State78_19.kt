package com.awesomeapp.module_1_78

sealed class State78_19 {
    data object Loading : State78_19()
    data class Success(val data: String) : State78_19()
    data class Error(val message: String) : State78_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}