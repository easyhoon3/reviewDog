package com.ekoc.detekt.rules

import io.gitlab.arturbosch.detekt.api.CodeSmell
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Entity
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Rule
import io.gitlab.arturbosch.detekt.api.Severity
import org.jetbrains.kotlin.psi.KtNamedFunction

class ContextOrder(config: Config) : Rule(config) {

    companion object {

        const val REPORT_MESSAGE = "The function name starts with save"
        const val ISSUE_DESCRIPTION = "This is a description of the rule"
    }

    override val issue = Issue(javaClass.simpleName, Severity.Minor, ISSUE_DESCRIPTION, Debt.FIVE_MINS)

    //Triggers for every function
    override fun visitNamedFunction(function: KtNamedFunction) {
        System.out.println("############################################$$$$$$$$$$$$$$$$$$$$$$$$$**" + function.name )
        super.visitNamedFunction(function)

        if (function.name == "save") {
            report(CodeSmell(issue, Entity.from(function), REPORT_MESSAGE))
        }
    }
}
