package com.github.veroz1.xposedtemplatepluginforas.services

import com.github.veroz1.xposedtemplatepluginforas.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
