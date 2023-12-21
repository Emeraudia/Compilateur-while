package tlc.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stack {
  private int functionLine;

  private String functionName;
  private List<String> parameters;
  private Map<String, Integer> symbols;
  private List<String> returns;

  public Stack(String name, int line) {
    this.functionLine = line;
    this.functionName = name;
    this.symbols = new HashMap<>();
    this.parameters = new ArrayList<>();
    this.returns = new ArrayList<>();
  }

  public void addParameter(String symbol) {
    this.parameters.add(symbol);
  }

  public void addReturn(String symbol) {
    this.returns.add(symbol);
  }

  public void addSymbol(String symbol, int line) {
    this.symbols.put(symbol, line);
  }

  public int getSymbolLine(String symbol) {
    return this.symbols.get(symbol);
  }

  public String getFunctionName() {
    return functionName;
  }

  public List<String> getParameters() {
    return parameters;
  }

  public Map<String, Integer> getSymbols() {
    return symbols;
  }

  public List<String> getReturns() {
    return returns;
  }

  public int getFunctionLine() {
    return functionLine;
  }

  @Override
  public String toString() {
    String s = functionName + ": ";
    for (String k : symbols.keySet()) {
      s += "(" + k + " , " + symbols.get(k) + ")";
    }
    return s;
  }
}
