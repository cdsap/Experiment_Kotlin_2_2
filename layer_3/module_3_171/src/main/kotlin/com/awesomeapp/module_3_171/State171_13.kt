package com.awesomeapp.module_3_171

sealed class State171_13 {
    data object Loading : State171_13()
    data class Success(val data: String) : State171_13()
    data class Error(val message: String) : State171_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}