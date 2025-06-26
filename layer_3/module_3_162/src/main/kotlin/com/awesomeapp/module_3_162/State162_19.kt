package com.awesomeapp.module_3_162

sealed class State162_19 {
    data object Loading : State162_19()
    data class Success(val data: String) : State162_19()
    data class Error(val message: String) : State162_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}