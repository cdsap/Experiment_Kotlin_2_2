package com.awesomeapp.module_4_224

sealed class State224_17 {
    data object Loading : State224_17()
    data class Success(val data: String) : State224_17()
    data class Error(val message: String) : State224_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}