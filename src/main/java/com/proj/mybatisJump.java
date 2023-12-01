package com.proj;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.diagnostic.Logger;

public class mybatisJump extends AnAction {
    private static final Logger LOG = Logger.getInstance(mybatisJump.class);

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(project, "What is your name?", "Question", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + txt + "!\nI am glad to see you.", "Information", Messages.getInformationIcon());
    }
}

