package com.awesomeapp.module_3_157

sealed class State157_15 {
    data object Loading : State157_15()
    data class Success(val data: String) : State157_15()
    data class Error(val message: String) : State157_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}