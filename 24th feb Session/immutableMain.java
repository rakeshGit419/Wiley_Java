final class Immutable {
    private final String content;
  
    Immutable(String content) {
      this.content = content;
    }

    public String getContent() {
      return content;
    }
  }
  
  public class immutableMain {
    public static void main(String[] args) {
  
      Immutable obj = new Immutable("ShowBot");
      System.out.println(obj.getContent());

      obj = new Immutable("rakesh");
      System.out.println(obj.getContent());
    }
  }