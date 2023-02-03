
public class Level {
 private String prompt;
 private Level left;
 private Level right;
 public Level(String prompt, Level left, Level right) {
    this.prompt = prompt;  
    this.left = left;
    this.right = right;
 }  

 public void setLeft(Level left) {
    this.left = left;

 }
 public void setRight(Level right) {
    this.right = right;

 }
 public void setPrompt(String prompt) {
    this.prompt = prompt; 
 }

 public Level getLeft() {
    return this.left;
    
 }
 public Level getRight() {
    return this.right;

 }
 public String getPrompt() {
    return this.prompt;
 }
}
