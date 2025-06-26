package com.awesomeapp.module_3_166

sealed class State166_18 {
    data object Loading : State166_18()
    data class Success(val data: String) : State166_18()
    data class Error(val message: String) : State166_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}