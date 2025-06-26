package com.awesomeapp.module_4_188

sealed class State188_7 {
    data object Loading : State188_7()
    data class Success(val data: String) : State188_7()
    data class Error(val message: String) : State188_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}