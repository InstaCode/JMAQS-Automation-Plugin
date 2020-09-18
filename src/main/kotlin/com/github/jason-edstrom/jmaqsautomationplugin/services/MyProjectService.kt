package com.github.jason-edstrom.jmaqsautomationplugin.services

import com.intellij.openapi.project.Project
import com.github.jason-edstrom.jmaqsautomationplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
