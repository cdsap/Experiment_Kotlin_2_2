package com.awesomeapp.module_4_220

sealed class State220_13 {
    data object Loading : State220_13()
    data class Success(val data: String) : State220_13()
    data class Error(val message: String) : State220_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}