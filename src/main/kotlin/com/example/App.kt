@file:JvmName("App")
package com.example

import sz.scaffold.Application
import sz.scaffold.tools.logger.Logger

//
// Created by kk on 2018/5/30.
//

object App {

    @JvmStatic
    fun main(args: Array<String>) {
        Application.setupVertx()

        Logger.debug("Vertx is running...")
    }
}