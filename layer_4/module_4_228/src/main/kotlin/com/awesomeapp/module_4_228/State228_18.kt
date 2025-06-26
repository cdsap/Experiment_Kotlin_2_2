package com.awesomeapp.module_4_228

sealed class State228_18 {
    data object Loading : State228_18()
    data class Success(val data: String) : State228_18()
    data class Error(val message: String) : State228_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}