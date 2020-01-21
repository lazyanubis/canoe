package canoe2.ast.statement;

import canoe2.ast.expression.Expression;
import canoe2.lexis.Token;

/**
 * @author dawn
 */
public class StatementMatchClause {

    private Token op;

    private Expression expression;

    private Token colon;

    private Token lb;

    private Statements statements;

    private Token rb;

    public StatementMatchClause(Token op, Expression expression, Token colon, Token lb, Statements statements, Token rb) {
        this.op = op;
        this.expression = expression;
        this.colon = colon;
        this.lb = lb;
        this.statements = statements;
        this.rb = rb;
    }
}