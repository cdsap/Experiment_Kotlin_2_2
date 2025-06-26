package com.awesomeapp.module_3_171

sealed class State171_10 {
    data object Loading : State171_10()
    data class Success(val data: String) : State171_10()
    data class Error(val message: String) : State171_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}