package com.awesomeapp.module_3_181

sealed class State181_18 {
    data object Loading : State181_18()
    data class Success(val data: String) : State181_18()
    data class Error(val message: String) : State181_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}