package com.awesomeapp.module_4_213

sealed class State213_10 {
    data object Loading : State213_10()
    data class Success(val data: String) : State213_10()
    data class Error(val message: String) : State213_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}