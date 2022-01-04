package com.github.xiaoxiaosama.myarmsmvp.services

import com.intellij.openapi.project.Project
import com.github.xiaoxiaosama.myarmsmvp.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
