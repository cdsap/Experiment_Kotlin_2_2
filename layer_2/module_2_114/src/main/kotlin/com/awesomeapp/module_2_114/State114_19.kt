package com.awesomeapp.module_2_114

sealed class State114_19 {
    data object Loading : State114_19()
    data class Success(val data: String) : State114_19()
    data class Error(val message: String) : State114_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}