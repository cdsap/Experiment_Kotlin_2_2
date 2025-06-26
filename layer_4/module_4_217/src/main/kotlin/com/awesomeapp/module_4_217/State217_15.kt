package com.awesomeapp.module_4_217

sealed class State217_15 {
    data object Loading : State217_15()
    data class Success(val data: String) : State217_15()
    data class Error(val message: String) : State217_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}