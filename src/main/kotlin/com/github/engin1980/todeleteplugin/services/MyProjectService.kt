package com.github.engin1980.todeleteplugin.services

import com.intellij.openapi.project.Project
import com.github.engin1980.todeleteplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
