package com.awesomeapp.module_2_127

sealed class State127_18 {
    data object Loading : State127_18()
    data class Success(val data: String) : State127_18()
    data class Error(val message: String) : State127_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}