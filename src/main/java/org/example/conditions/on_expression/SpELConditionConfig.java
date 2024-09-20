package org.example.conditions.on_expression;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

@Configuration
public class SpELConditionConfig {
    private static final SpelExpressionParser parser = new SpelExpressionParser();

    @Bean
    @Conditional(SpELCondition.class)
    public SpELBean spELBean() {
        return new SpELBean();
    }

    public static class SpELCondition implements Condition {
        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            StandardEvaluationContext evalContext = new StandardEvaluationContext();
            evalContext.setBeanResolver(new BeanFactoryResolver(context.getBeanFactory()));
            return parser.parseExpression("'someValue'.equals(environment.getProperty('property.key'))")
                    .getValue(evalContext, Boolean.class);
        }
    }
}
