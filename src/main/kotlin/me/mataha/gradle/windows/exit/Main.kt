@file:JvmName("Main")

package me.mataha.gradle.windows.exit

import kotlin.system.exitProcess

fun main(vararg args: String) {
    val status: Int = args.firstOrNull()?.toIntOrNull() ?: 9001
    exitProcess(status)
}
