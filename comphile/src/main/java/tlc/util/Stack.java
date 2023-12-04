package tlc.util;

import java.util.HashMap;
import java.util.Map;

public class Stack {
  private Map<String, Integer> symbols;

  public Stack() {
    this.symbols = new HashMap<>();
  }

  public void addSymbol(String symbol, int line) {
    this.symbols.put(symbol, line);
  }

  public int getSymbolLine(String symbol) {
    return this.symbols.get(symbol);
  }

  @Override
  public String toString() {
    String s = "";
    for (String k : symbols.keySet()) {
      s += "(" + k + " , " + symbols.get(k) + ")";
    }
    return s;
  }
}
