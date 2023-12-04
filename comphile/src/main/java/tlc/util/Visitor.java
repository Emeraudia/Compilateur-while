package tlc.util;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.antlr.runtime.tree.CommonTree;

public class Visitor {
  private Map<Integer, Consumer<CommonTree>> functions;

  public Visitor() {
    this.functions = new HashMap<>();
  }

  public void visit(CommonTree tree) {
    int tokenID = tree.getToken().getType();
    if (functions.containsKey(tokenID)) {
      functions.get(tokenID).accept(tree);
    }
  }

  public void assign(Integer tokenID, Consumer<CommonTree> consumer) {
    functions.put(tokenID, consumer);
  }
}