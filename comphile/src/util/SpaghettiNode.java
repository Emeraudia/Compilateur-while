package util;

public class SpaghettiNode {
  private String symbol;
  private int line;
  private SpaghettiNode parent;

  /**
   * Implementation of a spaghetti stack.
   * 
   * @param symbol a String representing the symbol
   * @param line   the line where is the symbol
   * @param parent the node's parent in the spaghetti stack
   */
  public SpaghettiNode(String symbol, int line, SpaghettiNode parent) {
    this.symbol = symbol;
    this.line = line;
    this.parent = parent;
  }

  /**
   * Implementation of a spaghetti stack.
   * 
   * @param symbol a String representing the symbol
   * @param line   the line where is the symbol
   */
  public SpaghettiNode(String symbol, int line) {
    this(symbol, line, null);
  }

  /**
   * Setter for the parent node of this node in the Spaghetti stack.
   * 
   * @param parent a SpaghettiNode representing the new parent node
   */
  public void setParent(SpaghettiNode parent) {
    this.parent = parent;
  }

  /**
   * Setter for the symbol of the node.
   * 
   * @param symbol a String representing the new symbol of the node
   */
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * Setter for the line of the symbol.
   * 
   * @param line an int representing the new line of the symbol
   */
  public void setLine(int line) {
    this.line = line;
  }

  /**
   * Getter for the parent of the node in the Spaghetti stack.
   * 
   * @return a SpaghettiNode representing the node's parent, or null if there is
   *         no parent
   */
  public SpaghettiNode getParent() {
    return this.parent;
  }

  /**
   * Getter for the symbol of the node.
   *
   * @return a String representing the symbol of the node
   */
  public String getSymbol() {
    return this.symbol;
  }

  /**
   * Getter for the line of the symbol.
   * 
   * @return an int representing the line of the symbol.
   */
  public int getLine() {
    return this.line;
  }

  @Override
  public String toString() {
    return "Symbol " + symbol + " at line " + line + ".";
  }
}