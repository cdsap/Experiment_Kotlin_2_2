package com.awesomeapp.module_4_229

sealed class State229_18 {
    data object Loading : State229_18()
    data class Success(val data: String) : State229_18()
    data class Error(val message: String) : State229_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}