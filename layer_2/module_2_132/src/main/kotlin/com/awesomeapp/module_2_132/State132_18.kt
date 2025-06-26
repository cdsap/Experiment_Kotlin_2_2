package com.awesomeapp.module_2_132

sealed class State132_18 {
    data object Loading : State132_18()
    data class Success(val data: String) : State132_18()
    data class Error(val message: String) : State132_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}