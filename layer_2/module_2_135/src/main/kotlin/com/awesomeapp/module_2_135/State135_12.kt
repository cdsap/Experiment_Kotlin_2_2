package com.awesomeapp.module_2_135

sealed class State135_12 {
    data object Loading : State135_12()
    data class Success(val data: String) : State135_12()
    data class Error(val message: String) : State135_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}