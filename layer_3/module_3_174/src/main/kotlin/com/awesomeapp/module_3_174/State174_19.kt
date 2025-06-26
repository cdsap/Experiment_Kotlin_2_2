package com.awesomeapp.module_3_174

sealed class State174_19 {
    data object Loading : State174_19()
    data class Success(val data: String) : State174_19()
    data class Error(val message: String) : State174_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}