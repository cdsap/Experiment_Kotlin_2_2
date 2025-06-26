package com.awesomeapp.module_4_229

sealed class State229_15 {
    data object Loading : State229_15()
    data class Success(val data: String) : State229_15()
    data class Error(val message: String) : State229_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}