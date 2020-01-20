package canoe.ast.statement;

import canoe.ast.expression.Expression;
import canoe.lexis.Token;

/**
 * @author dawn
 */
public class StatementSelfAddOrSub implements Statement {

    private Expression idExpression;

    private Token rightOp;

    public StatementSelfAddOrSub(Expression idExpression, Token rightOp) {
        this.idExpression = idExpression;
        this.rightOp = rightOp;
    }
}
