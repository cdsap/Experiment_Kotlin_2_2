package com.awesomeapp.module_4_224

sealed class State224_11 {
    data object Loading : State224_11()
    data class Success(val data: String) : State224_11()
    data class Error(val message: String) : State224_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}