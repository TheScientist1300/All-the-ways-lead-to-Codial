
import java.util.Scanner;

public class Game {
int choise;
Scanner s = new Scanner(System.in);
public int getchoise(int choise) {
return this.choise;
}
public void setchoise(int choise) {
  this.choise = choise;
}
// public void printCharByChar(String promt) {
//   for (int i = 0; i < promt.length(); i++) {
//       System.out.print(promt.charAt(i));
//       try {
//           Thread.sleep(100);
//       } catch (InterruptedException e) {
//           e.printStackTrace();
//       }
//   }
// }
public void run() {
Level l1 = new Level("Hello fellow travaller, welcome to Codial! Here we live in peace and harmony with each other, ints and Strings, trues and falses, static with voids and more! We are known for our various trading routs going through our land. This is why so many people say 'All the ways lead to Codial', ah...You don't know this sentence...Well now you know! So the reason we called for your help was to get something we lost in one of our main trading route, it seems emptey today so I don't think it will be a problem to go and check. Oh! I almost forgot, so that we will be in touch take this wierd communication device, the people here decided to call it '01110111 01100001 01101100 01101011 01111001 0001110100 01100001 01101100 01101011 01100101 01111001'...They are Codials they always name stuff in binaric language, for example house they call '01101000 01101111 01110101 01110011 01100101'. So anyway, I will guide you twoards your adventure, and good luck!...(an hour later)...So, I see you are coming close to the middle of the road, it's really close to you! (about an hour later) So maybe I was wrong and the road changes his length each time 'THE PROGRAMMER!' changes the length of it, Wait, DO YOU NOT KNOW WHO THE PROGRAMMER IS?!!! Okay relax sysout, yes this is my name, I was acually named after my father syserr from the Cody Cidle, it's pretty much our belith in Codial, in which we belive that our world was made by the programmer in a month, making all of the classes in our programm. Okay, back to the main thing, it seems you are between two sideways, the one on the left is the way to 'Virsudial', a place where all of the viruses live in, and the way to the right is to the 'Defendial', which they are our protectors. Which way will you like to go through? (1 to Defendial and 2 to Virsudial", null, null);
Level l2l = new Level("Wait...You tell me you will prefer to go through a place full of viruses instead of going...Okay you know what? I don't care, I don't care! As long and you will find the 'gem of dot' I don't care, oh I didn't tell you about the 'gem of dot'? Well the gem of dot is a gem that can grant an infinte life span. Cool right? It was sent here by a waggon but when it got to here, it wasn't there! And don't think of using it! It is beyond your power! Okay so I will contact you when I will dedtect a signal of the gem....(an hour later)...Wait! I read a signal, I am not sure it's that gem but it's worth to find out... Oh they are two sideways again well I can't see them on my map, take a wild guess. (1 for left and 2 for right)", null, null);
Level l2r = new Level("Great...Probably the best option to choose, now let's go and find the 'gem of dot'! Oh I didn't tell you about the 'gem of dot'? Well the gem of dot is a gem that can grant an infinte life span. Cool right? It was sent here by a waggon but when it got to here, it wasn't there! And don't think of using it! It is beyond your power! Okay so I will contact you when I will dedtect a signal of the gem...(2 hours later)...Ok I see you got to 'defendial', go to the big sign were it says 'Chip's chips'...(after 10 minutes)...Okay now go behind the sign, Great! There is the wagon! Go and see if a blue gem is over there! YOU FOUNT IT?! GREAT! NOW BRING IT BACK TO TOWN AND DON'T THINK OF USING THE GEM...(After 3 hours) Oh here is my adventurer! Where's the gem? Oh great now let me put it in the hall of fame...(after 20 minutes) thank you very much adventurer! Your award of 1000 bitcoin will be sent to your home.", null, null);
Level l3l = new Level("Oh...Maybe you chose the right way, I detect big radation signals close to your location...(a half a hour later)...Hey do you see a gem infront of you? Blue? NO DON'T TOUCH THAT!!!! It's the gem of // which can lead to the distrauction of all the kingdom. So whatever you think of DON'T TOUCH THAT!!! (1 to touch and 2 to go and leave)", null, null);
Level l4l = new Level("NO NO NO!!! (an explotion was made twoards all of the kingdom boudries killing all of it's citysens) Hey I am the narratour and it seems that you got to the baddest ending of them all. Congrats!", null, null);
Level l4r = new Level("Great, I think we can give you something on that too...Come back to get an award...(after 3 hours)...Great you are here! I will go to put the gem in the hall of fame...(after 20 minutes)...So I talked with the mayor and he said he won't have a problem to bring you 500 bitcoin, Is that Okay? Great, thank you adventurer. Just bring us the location of it and you will get the prise.", null, null);
l1.setLeft(l2l);
l1.setLeft(l2r);
l2l.setLeft(l3l);
l3l.setLeft(l4l);
l3l.setRight(l4r); 
 Level currentLevel = l1;
while (l1.getLeft() != null || l1.getRight() != null) {
  System.out.println(l1.getPrompt());
  System.out.println("Enter your choise:");
  this.choise = s.nextInt();
    setchoise(choise);
    if (choise == 1) {
      System.out.println(l2l.getPrompt());
      currentLevel = l2l;
      System.out.println("Enter your choise:");
      this.choise = s.nextInt();
      if (choise == 1) {
        System.out.println(l3l.getPrompt());
        currentLevel = l3l;
        System.out.println("Enter your choise:");
        this.choise = s.nextInt();
      }
      if (choise == 1) {
        System.out.println(l4l.getPrompt());
        currentLevel = l4l;
      }
      else {
        System.out.println(l4r.getPrompt());
        currentLevel = l4r;
      }
    }
     if (choise == 2) {
      System.out.println(l2r.getPrompt());
         currentLevel = currentLevel.getRight();
     }
     System.out.println("Thank you for playing!");
     break;
}
}
}

