package com.ekoc.detekt.rules.provider

import com.ekoc.detekt.rules.ContextOrder
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class RuleProvider : RuleSetProvider {

    override val ruleSetId: String = "extra-rules"
    override fun instance(config: Config): RuleSet  {


        return RuleSet(ruleSetId, listOf(ContextOrder(config)))

    }
}
