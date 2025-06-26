package com.awesomeapp.module_3_157

sealed class State157_18 {
    data object Loading : State157_18()
    data class Success(val data: String) : State157_18()
    data class Error(val message: String) : State157_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}